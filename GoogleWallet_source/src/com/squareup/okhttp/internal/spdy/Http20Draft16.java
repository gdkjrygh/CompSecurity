// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import okio.Timeout;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            Variant, FrameReader, FrameWriter, ErrorCode, 
//            HeadersMode, Settings

public final class Http20Draft16
    implements Variant
{
    static final class ContinuationSource
        implements Source
    {

        byte flags;
        int left;
        int length;
        short padding;
        private final BufferedSource source;
        int streamId;

        private void readContinuationHeader()
            throws IOException
        {
            int i = streamId;
            int j = Http20Draft16.readMedium(source);
            left = j;
            length = j;
            byte byte0 = source.readByte();
            flags = source.readByte();
            if (Http20Draft16.logger.isLoggable(Level.FINE))
            {
                Http20Draft16.logger.fine(FrameLogger.formatHeader(true, streamId, length, byte0, flags));
            }
            streamId = source.readInt() & 0x7fffffff;
            if (byte0 != 9)
            {
                throw Http20Draft16.ioException("%s != TYPE_CONTINUATION", new Object[] {
                    Byte.valueOf(byte0)
                });
            }
            if (streamId != i)
            {
                throw Http20Draft16.ioException("TYPE_CONTINUATION streamId changed", new Object[0]);
            } else
            {
                return;
            }
        }

        public final void close()
            throws IOException
        {
        }

        public final long read(Buffer buffer, long l)
            throws IOException
        {
            while (left == 0) 
            {
                source.skip(padding);
                padding = 0;
                if ((flags & 4) != 0)
                {
                    return -1L;
                }
                readContinuationHeader();
            }
            l = source.read(buffer, Math.min(l, left));
            if (l == -1L)
            {
                return -1L;
            } else
            {
                left = (int)((long)left - l);
                return l;
            }
        }

        public final Timeout timeout()
        {
            return source.timeout();
        }

        public ContinuationSource(BufferedSource bufferedsource)
        {
            source = bufferedsource;
        }
    }

    static final class FrameLogger
    {

        private static final String BINARY[];
        private static final String FLAGS[];
        private static final String TYPES[] = {
            "DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"
        };

        private static String formatFlags(byte byte0, byte byte1)
        {
            String s1;
            if (byte1 == 0)
            {
                s1 = "";
            } else
            {
                String s;
                switch (byte0)
                {
                case 5: // '\005'
                default:
                    if (byte1 < FLAGS.length)
                    {
                        s = FLAGS[byte1];
                    } else
                    {
                        s = BINARY[byte1];
                    }
                    if (byte0 == 5 && (byte1 & 4) != 0)
                    {
                        return s.replace("HEADERS", "PUSH_PROMISE");
                    }
                    break;

                case 4: // '\004'
                case 6: // '\006'
                    if (byte1 == 1)
                    {
                        return "ACK";
                    } else
                    {
                        return BINARY[byte1];
                    }

                case 2: // '\002'
                case 3: // '\003'
                case 7: // '\007'
                case 8: // '\b'
                    return BINARY[byte1];
                }
                s1 = s;
                if (byte0 == 0)
                {
                    s1 = s;
                    if ((byte1 & 0x20) != 0)
                    {
                        return s.replace("PRIORITY", "COMPRESSED");
                    }
                }
            }
            return s1;
        }

        static String formatHeader(boolean flag, int i, int j, byte byte0, byte byte1)
        {
            String s;
            String s1;
            String s2;
            if (byte0 < TYPES.length)
            {
                s = TYPES[byte0];
            } else
            {
                s = String.format("0x%02x", new Object[] {
                    Byte.valueOf(byte0)
                });
            }
            s2 = formatFlags(byte0, byte1);
            if (flag)
            {
                s1 = "<<";
            } else
            {
                s1 = ">>";
            }
            return String.format("%s 0x%08x %5d %-13s %s", new Object[] {
                s1, Integer.valueOf(i), Integer.valueOf(j), s, s2
            });
        }

        static 
        {
            FLAGS = new String[64];
            BINARY = new String[256];
            for (int i = 0; i < BINARY.length; i++)
            {
                BINARY[i] = String.format("%8s", new Object[] {
                    Integer.toBinaryString(i)
                }).replace(' ', '0');
            }

            FLAGS[0] = "";
            FLAGS[1] = "END_STREAM";
            int ai[] = new int[1];
            ai[0] = 1;
            FLAGS[8] = "PADDED";
            for (int j = 0; j <= 0; j++)
            {
                int i1 = ai[j];
                FLAGS[i1 | 8] = (new StringBuilder()).append(FLAGS[i1]).append("|PADDED").toString();
            }

            FLAGS[4] = "END_HEADERS";
            FLAGS[32] = "PRIORITY";
            FLAGS[36] = "END_HEADERS|PRIORITY";
            for (int k = 0; k < 3; k++)
            {
                int k1 = (new int[] {
                    4, 32, 36
                })[k];
                for (int j1 = 0; j1 <= 0; j1++)
                {
                    int l1 = ai[j1];
                    FLAGS[l1 | k1] = (new StringBuilder()).append(FLAGS[l1]).append('|').append(FLAGS[k1]).toString();
                    FLAGS[l1 | k1 | 8] = (new StringBuilder()).append(FLAGS[l1]).append('|').append(FLAGS[k1]).append("|PADDED").toString();
                }

            }

            for (int l = 0; l < FLAGS.length; l++)
            {
                if (FLAGS[l] == null)
                {
                    FLAGS[l] = BINARY[l];
                }
            }

        }

        FrameLogger()
        {
        }
    }

    static final class Reader
        implements FrameReader
    {

        private final boolean client;
        private final ContinuationSource continuation;
        final HpackDraft10.Reader hpackReader;
        private final BufferedSource source;

        private void readData(FrameReader.Handler handler, int i, byte byte0, int j)
            throws IOException
        {
            boolean flag = true;
            int k = 0;
            boolean flag1;
            if ((byte0 & 1) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if ((byte0 & 0x20) == 0)
            {
                flag = false;
            }
            if (flag)
            {
                throw Http20Draft16.ioException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            }
            if ((byte0 & 8) != 0)
            {
                k = (short)(source.readByte() & 0xff);
            }
            i = Http20Draft16.lengthWithoutPadding(i, byte0, k);
            handler.data(flag1, j, source, i);
            source.skip(k);
        }

        private void readGoAway(FrameReader.Handler handler, int i, byte byte0, int j)
            throws IOException
        {
            if (i < 8)
            {
                throw Http20Draft16.ioException("TYPE_GOAWAY length < 8: %s", new Object[] {
                    Integer.valueOf(i)
                });
            }
            if (j != 0)
            {
                throw Http20Draft16.ioException("TYPE_GOAWAY streamId != 0", new Object[0]);
            }
            byte0 = source.readInt();
            j = source.readInt();
            i -= 8;
            ErrorCode errorcode = ErrorCode.fromHttp2(j);
            if (errorcode == null)
            {
                throw Http20Draft16.ioException("TYPE_GOAWAY unexpected error code: %d", new Object[] {
                    Integer.valueOf(j)
                });
            }
            ByteString bytestring = ByteString.EMPTY;
            if (i > 0)
            {
                bytestring = source.readByteString(i);
            }
            handler.goAway(byte0, errorcode, bytestring);
        }

        private List readHeaderBlock(int i, short word0, byte byte0, int j)
            throws IOException
        {
            ContinuationSource continuationsource = continuation;
            continuation.left = i;
            continuationsource.length = i;
            continuation.padding = word0;
            continuation.flags = byte0;
            continuation.streamId = j;
            hpackReader.readHeaders();
            return hpackReader.getAndResetHeaderList();
        }

        private void readHeaders(FrameReader.Handler handler, int i, byte byte0, int j)
            throws IOException
        {
            if (j == 0)
            {
                throw Http20Draft16.ioException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            }
            short word0;
            int k;
            boolean flag;
            if ((byte0 & 1) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if ((byte0 & 8) != 0)
            {
                word0 = (short)(source.readByte() & 0xff);
            } else
            {
                word0 = 0;
            }
            k = i;
            if ((byte0 & 0x20) != 0)
            {
                readPriority(handler, j);
                k = i - 5;
            }
            handler.headers(false, flag, j, -1, readHeaderBlock(Http20Draft16.lengthWithoutPadding(k, byte0, word0), word0, byte0, j), HeadersMode.HTTP_20_HEADERS);
        }

        private void readPing(FrameReader.Handler handler, int i, byte byte0, int j)
            throws IOException
        {
            boolean flag = true;
            if (i != 8)
            {
                throw Http20Draft16.ioException("TYPE_PING length != 8: %s", new Object[] {
                    Integer.valueOf(i)
                });
            }
            if (j != 0)
            {
                throw Http20Draft16.ioException("TYPE_PING streamId != 0", new Object[0]);
            }
            i = source.readInt();
            j = source.readInt();
            if ((byte0 & 1) == 0)
            {
                flag = false;
            }
            handler.ping(flag, i, j);
        }

        private void readPriority(FrameReader.Handler handler, int i)
            throws IOException
        {
            source.readInt();
            source.readByte();
        }

        private void readPriority(FrameReader.Handler handler, int i, byte byte0, int j)
            throws IOException
        {
            if (i != 5)
            {
                throw Http20Draft16.ioException("TYPE_PRIORITY length: %d != 5", new Object[] {
                    Integer.valueOf(i)
                });
            }
            if (j == 0)
            {
                throw Http20Draft16.ioException("TYPE_PRIORITY streamId == 0", new Object[0]);
            } else
            {
                readPriority(handler, j);
                return;
            }
        }

        private void readPushPromise(FrameReader.Handler handler, int i, byte byte0, int j)
            throws IOException
        {
            short word0 = 0;
            if (j == 0)
            {
                throw Http20Draft16.ioException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            }
            if ((byte0 & 8) != 0)
            {
                word0 = (short)(source.readByte() & 0xff);
            }
            handler.pushPromise(j, source.readInt() & 0x7fffffff, readHeaderBlock(Http20Draft16.lengthWithoutPadding(i - 4, byte0, word0), word0, byte0, j));
        }

        private void readRstStream(FrameReader.Handler handler, int i, byte byte0, int j)
            throws IOException
        {
            if (i != 4)
            {
                throw Http20Draft16.ioException("TYPE_RST_STREAM length: %d != 4", new Object[] {
                    Integer.valueOf(i)
                });
            }
            if (j == 0)
            {
                throw Http20Draft16.ioException("TYPE_RST_STREAM streamId == 0", new Object[0]);
            }
            i = source.readInt();
            ErrorCode errorcode = ErrorCode.fromHttp2(i);
            if (errorcode == null)
            {
                throw Http20Draft16.ioException("TYPE_RST_STREAM unexpected error code: %d", new Object[] {
                    Integer.valueOf(i)
                });
            } else
            {
                handler.rstStream(j, errorcode);
                return;
            }
        }

        private void readSettings(FrameReader.Handler handler, int i, byte byte0, int j)
            throws IOException
        {
            Settings settings;
            if (j != 0)
            {
                throw Http20Draft16.ioException("TYPE_SETTINGS streamId != 0", new Object[0]);
            }
            if ((byte0 & 1) != 0)
            {
                if (i != 0)
                {
                    throw Http20Draft16.ioException("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                }
                break MISSING_BLOCK_LABEL_294;
            }
            if (i % 6 != 0)
            {
                throw Http20Draft16.ioException("TYPE_SETTINGS length %% 6 != 0: %s", new Object[] {
                    Integer.valueOf(i)
                });
            }
            settings = new Settings();
            byte0 = 0;
_L8:
            short word0;
            int k;
            if (byte0 >= i)
            {
                break MISSING_BLOCK_LABEL_265;
            }
            word0 = source.readShort();
            k = source.readInt();
            j = word0;
            word0;
            JVM INSTR tableswitch 1 6: default 140
        //                       1 190
        //                       2 158
        //                       3 187
        //                       4 209
        //                       5 228
        //                       6 190;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L2
_L5:
            break; /* Loop/switch isn't completed */
_L2:
            break; /* Loop/switch isn't completed */
_L1:
            throw Http20Draft16.ioException("PROTOCOL_ERROR invalid settings id: %s", new Object[] {
                Short.valueOf(word0)
            });
_L3:
            j = word0;
            if (k != 0)
            {
                j = word0;
                if (k != 1)
                {
                    throw Http20Draft16.ioException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                }
            }
            break; /* Loop/switch isn't completed */
_L4:
            j = 4;
_L10:
            settings.set(j, 0, k);
            byte0 += 6;
            if (true) goto _L8; else goto _L7
_L7:
            j = 7;
            if (k >= 0) goto _L10; else goto _L9
_L9:
            throw Http20Draft16.ioException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
_L6:
            if (k < 16384)
            {
                break; /* Loop/switch isn't completed */
            }
            j = word0;
            if (k <= 0xffffff) goto _L10; else goto _L11
_L11:
            throw Http20Draft16.ioException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", new Object[] {
                Integer.valueOf(k)
            });
            handler.settings(false, settings);
            if (settings.getHeaderTableSize() >= 0)
            {
                hpackReader.headerTableSizeSetting(settings.getHeaderTableSize());
            }
        }

        private void readWindowUpdate(FrameReader.Handler handler, int i, byte byte0, int j)
            throws IOException
        {
            if (i != 4)
            {
                throw Http20Draft16.ioException("TYPE_WINDOW_UPDATE length !=4: %s", new Object[] {
                    Integer.valueOf(i)
                });
            }
            long l = (long)source.readInt() & 0x7fffffffL;
            if (l == 0L)
            {
                throw Http20Draft16.ioException("windowSizeIncrement was 0", new Object[] {
                    Long.valueOf(l)
                });
            } else
            {
                handler.windowUpdate(j, l);
                return;
            }
        }

        public final void close()
            throws IOException
        {
            source.close();
        }

        public final boolean nextFrame(FrameReader.Handler handler)
            throws IOException
        {
            int i;
            try
            {
                source.require(9L);
            }
            // Misplaced declaration of an exception variable
            catch (FrameReader.Handler handler)
            {
                return false;
            }
            i = Http20Draft16.readMedium(source);
            if (i < 0 || i > 16384)
            {
                throw Http20Draft16.ioException("FRAME_SIZE_ERROR: %s", new Object[] {
                    Integer.valueOf(i)
                });
            }
            byte byte0 = source.readByte();
            byte byte1 = source.readByte();
            int j = source.readInt() & 0x7fffffff;
            if (Http20Draft16.logger.isLoggable(Level.FINE))
            {
                Http20Draft16.logger.fine(FrameLogger.formatHeader(true, j, i, byte0, byte1));
            }
            switch (byte0)
            {
            default:
                source.skip(i);
                return true;

            case 0: // '\0'
                readData(handler, i, byte1, j);
                return true;

            case 1: // '\001'
                readHeaders(handler, i, byte1, j);
                return true;

            case 2: // '\002'
                readPriority(handler, i, byte1, j);
                return true;

            case 3: // '\003'
                readRstStream(handler, i, byte1, j);
                return true;

            case 4: // '\004'
                readSettings(handler, i, byte1, j);
                return true;

            case 5: // '\005'
                readPushPromise(handler, i, byte1, j);
                return true;

            case 6: // '\006'
                readPing(handler, i, byte1, j);
                return true;

            case 7: // '\007'
                readGoAway(handler, i, byte1, j);
                return true;

            case 8: // '\b'
                readWindowUpdate(handler, i, byte1, j);
                break;
            }
            return true;
        }

        public final void readConnectionPreface()
            throws IOException
        {
            if (!client)
            {
                ByteString bytestring = source.readByteString(Http20Draft16.CONNECTION_PREFACE.size());
                if (Http20Draft16.logger.isLoggable(Level.FINE))
                {
                    Http20Draft16.logger.fine(String.format("<< CONNECTION %s", new Object[] {
                        bytestring.hex()
                    }));
                }
                if (!Http20Draft16.CONNECTION_PREFACE.equals(bytestring))
                {
                    throw Http20Draft16.ioException("Expected a connection header but was %s", new Object[] {
                        bytestring.utf8()
                    });
                }
            }
        }

        Reader(BufferedSource bufferedsource, int i, boolean flag)
        {
            source = bufferedsource;
            client = flag;
            continuation = new ContinuationSource(source);
            hpackReader = new HpackDraft10.Reader(i, continuation);
        }
    }

    static final class Writer
        implements FrameWriter
    {

        private final boolean client;
        private boolean closed;
        private final Buffer hpackBuffer = new Buffer();
        private final HpackDraft10.Writer hpackWriter;
        private int maxFrameSize;
        private final BufferedSink sink;

        private void dataFrame(int i, byte byte0, Buffer buffer, int j)
            throws IOException
        {
            frameHeader(i, j, (byte)0, byte0);
            if (j > 0)
            {
                sink.write(buffer, j);
            }
        }

        private void frameHeader(int i, int j, byte byte0, byte byte1)
            throws IOException
        {
            if (Http20Draft16.logger.isLoggable(Level.FINE))
            {
                Http20Draft16.logger.fine(FrameLogger.formatHeader(false, i, j, byte0, byte1));
            }
            if (j > maxFrameSize)
            {
                throw Http20Draft16.illegalArgument("FRAME_SIZE_ERROR length > %d: %d", new Object[] {
                    Integer.valueOf(maxFrameSize), Integer.valueOf(j)
                });
            }
            if ((0x80000000 & i) != 0)
            {
                throw Http20Draft16.illegalArgument("reserved bit set: %s", new Object[] {
                    Integer.valueOf(i)
                });
            } else
            {
                Http20Draft16.writeMedium(sink, j);
                sink.writeByte(byte0 & 0xff);
                sink.writeByte(byte1 & 0xff);
                sink.writeInt(0x7fffffff & i);
                return;
            }
        }

        private void headers(boolean flag, int i, List list)
            throws IOException
        {
            if (closed)
            {
                throw new IOException("closed");
            }
            if (hpackBuffer.size() != 0L)
            {
                throw new IllegalStateException();
            }
            hpackWriter.writeHeaders(list);
            long l = hpackBuffer.size();
            int j = (int)Math.min(maxFrameSize, l);
            byte byte0;
            byte byte1;
            if (l == (long)j)
            {
                byte0 = 4;
            } else
            {
                byte0 = 0;
            }
            byte1 = byte0;
            if (flag)
            {
                byte1 = (byte)(byte0 | 1);
            }
            frameHeader(i, j, (byte)1, byte1);
            sink.write(hpackBuffer, j);
            if (l > (long)j)
            {
                writeContinuationFrames(i, l - (long)j);
            }
        }

        private void writeContinuationFrames(int i, long l)
            throws IOException
        {
            while (l > 0L) 
            {
                int j = (int)Math.min(maxFrameSize, l);
                l -= j;
                byte byte0;
                if (l == 0L)
                {
                    byte0 = 4;
                } else
                {
                    byte0 = 0;
                }
                frameHeader(i, j, (byte)9, byte0);
                sink.write(hpackBuffer, j);
            }
        }

        public final void ackSettings(Settings settings1)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (closed)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_24;
            settings1;
            this;
            JVM INSTR monitorexit ;
            throw settings1;
            maxFrameSize = settings1.getMaxFrameSize(maxFrameSize);
            frameHeader(0, 0, (byte)4, (byte)1);
            sink.flush();
            this;
            JVM INSTR monitorexit ;
        }

        public final void close()
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            closed = true;
            sink.close();
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        public final void connectionPreface()
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (closed)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_24;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
            boolean flag = client;
            if (flag)
            {
                break MISSING_BLOCK_LABEL_36;
            }
_L1:
            this;
            JVM INSTR monitorexit ;
            return;
            if (Http20Draft16.logger.isLoggable(Level.FINE))
            {
                Http20Draft16.logger.fine(String.format(">> CONNECTION %s", new Object[] {
                    Http20Draft16.CONNECTION_PREFACE.hex()
                }));
            }
            sink.write(Http20Draft16.CONNECTION_PREFACE.toByteArray());
            sink.flush();
              goto _L1
        }

        public final void data(boolean flag, int i, Buffer buffer, int j)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (closed)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_24;
            buffer;
            this;
            JVM INSTR monitorexit ;
            throw buffer;
            byte byte0;
            byte0 = 0;
            if (flag)
            {
                byte0 = 1;
            }
            dataFrame(i, byte0, buffer, j);
            this;
            JVM INSTR monitorexit ;
        }

        public final void flush()
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (closed)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_24;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
            sink.flush();
            this;
            JVM INSTR monitorexit ;
        }

        public final void goAway(int i, ErrorCode errorcode, byte abyte0[])
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (closed)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_24;
            errorcode;
            this;
            JVM INSTR monitorexit ;
            throw errorcode;
            if (errorcode.httpCode == -1)
            {
                throw Http20Draft16.illegalArgument("errorCode.httpCode == -1", new Object[0]);
            }
            frameHeader(0, abyte0.length + 8, (byte)7, (byte)0);
            sink.writeInt(i);
            sink.writeInt(errorcode.httpCode);
            if (abyte0.length > 0)
            {
                sink.write(abyte0);
            }
            sink.flush();
            this;
            JVM INSTR monitorexit ;
        }

        public final int maxDataLength()
        {
            return maxFrameSize;
        }

        public final void ping(boolean flag, int i, int j)
            throws IOException
        {
            byte byte0 = 0;
            this;
            JVM INSTR monitorenter ;
            if (closed)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_29;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
            if (flag)
            {
                byte0 = 1;
            }
            frameHeader(0, 8, (byte)6, byte0);
            sink.writeInt(i);
            sink.writeInt(j);
            sink.flush();
            this;
            JVM INSTR monitorexit ;
        }

        public final void pushPromise(int i, int j, List list)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (closed)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_24;
            list;
            this;
            JVM INSTR monitorexit ;
            throw list;
            int k;
            long l;
            if (hpackBuffer.size() != 0L)
            {
                throw new IllegalStateException();
            }
            hpackWriter.writeHeaders(list);
            l = hpackBuffer.size();
            k = (int)Math.min(maxFrameSize - 4, l);
            byte byte0;
            if (l == (long)k)
            {
                byte0 = 4;
            } else
            {
                byte0 = 0;
            }
            frameHeader(i, k + 4, (byte)5, byte0);
            sink.writeInt(0x7fffffff & j);
            sink.write(hpackBuffer, k);
            if (l <= (long)k)
            {
                break MISSING_BLOCK_LABEL_150;
            }
            writeContinuationFrames(i, l - (long)k);
            this;
            JVM INSTR monitorexit ;
        }

        public final void rstStream(int i, ErrorCode errorcode)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (closed)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_24;
            errorcode;
            this;
            JVM INSTR monitorexit ;
            throw errorcode;
            if (errorcode.spdyRstCode == -1)
            {
                throw new IllegalArgumentException();
            }
            frameHeader(i, 4, (byte)3, (byte)0);
            sink.writeInt(errorcode.httpCode);
            sink.flush();
            this;
            JVM INSTR monitorexit ;
        }

        public final void settings(Settings settings1)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (closed)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_24;
            settings1;
            this;
            JVM INSTR monitorexit ;
            throw settings1;
            frameHeader(0, settings1.size() * 6, (byte)4, (byte)0);
            int i = 0;
_L2:
            if (i >= 10)
            {
                break MISSING_BLOCK_LABEL_93;
            }
            if (!settings1.isSet(i))
            {
                break MISSING_BLOCK_LABEL_105;
            }
            int k = i;
            int j;
            if (i == 4)
            {
                j = 3;
            } else
            {
                j = k;
                if (k == 7)
                {
                    j = 4;
                }
            }
            sink.writeShort(j);
            sink.writeInt(settings1.get(i));
            break MISSING_BLOCK_LABEL_105;
            sink.flush();
            this;
            JVM INSTR monitorexit ;
            return;
            i++;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public final void synStream(boolean flag, boolean flag1, int i, int j, List list)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (!flag1)
            {
                break MISSING_BLOCK_LABEL_21;
            }
            throw new UnsupportedOperationException();
            list;
            this;
            JVM INSTR monitorexit ;
            throw list;
            if (closed)
            {
                throw new IOException("closed");
            }
            headers(flag, i, list);
            this;
            JVM INSTR monitorexit ;
        }

        public final void windowUpdate(int i, long l)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (closed)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_26;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
            if (l != 0L && l <= 0x7fffffffL)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            throw Http20Draft16.illegalArgument("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", new Object[] {
                Long.valueOf(l)
            });
            frameHeader(i, 4, (byte)8, (byte)0);
            sink.writeInt((int)l);
            sink.flush();
            this;
            JVM INSTR monitorexit ;
        }

        Writer(BufferedSink bufferedsink, boolean flag)
        {
            sink = bufferedsink;
            client = flag;
            hpackWriter = new HpackDraft10.Writer(hpackBuffer);
            maxFrameSize = 16384;
        }
    }


    private static final ByteString CONNECTION_PREFACE = ByteString.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    private static final Logger logger = Logger.getLogger(com/squareup/okhttp/internal/spdy/Http20Draft16$FrameLogger.getName());

    public Http20Draft16()
    {
    }

    private static transient IllegalArgumentException illegalArgument(String s, Object aobj[])
    {
        throw new IllegalArgumentException(String.format(s, aobj));
    }

    private static transient IOException ioException(String s, Object aobj[])
        throws IOException
    {
        throw new IOException(String.format(s, aobj));
    }

    private static int lengthWithoutPadding(int i, byte byte0, short word0)
        throws IOException
    {
        int j = i;
        if ((byte0 & 8) != 0)
        {
            j = i - 1;
        }
        if (word0 > j)
        {
            throw ioException("PROTOCOL_ERROR padding %s > remaining length %s", new Object[] {
                Short.valueOf(word0), Integer.valueOf(j)
            });
        } else
        {
            return (short)(j - word0);
        }
    }

    private static int readMedium(BufferedSource bufferedsource)
        throws IOException
    {
        return (bufferedsource.readByte() & 0xff) << 16 | (bufferedsource.readByte() & 0xff) << 8 | bufferedsource.readByte() & 0xff;
    }

    private static void writeMedium(BufferedSink bufferedsink, int i)
        throws IOException
    {
        bufferedsink.writeByte(i >>> 16 & 0xff);
        bufferedsink.writeByte(i >>> 8 & 0xff);
        bufferedsink.writeByte(i & 0xff);
    }

    public final FrameReader newReader(BufferedSource bufferedsource, boolean flag)
    {
        return new Reader(bufferedsource, 4096, flag);
    }

    public final FrameWriter newWriter(BufferedSink bufferedsink, boolean flag)
    {
        return new Writer(bufferedsink, flag);
    }








}
