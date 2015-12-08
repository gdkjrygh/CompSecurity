// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import c.i;
import c.j;
import c.k;
import com.squareup.okhttp.Protocol;
import java.io.IOException;
import java.util.logging.Logger;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            Variant, FrameReader, FrameWriter

public final class Http2
    implements Variant
{

    private static final k CONNECTION_PREFACE = k.a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    static final byte FLAG_ACK = 1;
    static final byte FLAG_COMPRESSED = 32;
    static final byte FLAG_END_HEADERS = 4;
    static final byte FLAG_END_PUSH_PROMISE = 4;
    static final byte FLAG_END_STREAM = 1;
    static final byte FLAG_NONE = 0;
    static final byte FLAG_PADDED = 8;
    static final byte FLAG_PRIORITY = 32;
    static final int INITIAL_MAX_FRAME_SIZE = 16384;
    static final byte TYPE_CONTINUATION = 9;
    static final byte TYPE_DATA = 0;
    static final byte TYPE_GOAWAY = 7;
    static final byte TYPE_HEADERS = 1;
    static final byte TYPE_PING = 6;
    static final byte TYPE_PRIORITY = 2;
    static final byte TYPE_PUSH_PROMISE = 5;
    static final byte TYPE_RST_STREAM = 3;
    static final byte TYPE_SETTINGS = 4;
    static final byte TYPE_WINDOW_UPDATE = 8;
    private static final Logger logger = Logger.getLogger(com/squareup/okhttp/internal/framed/Http2$FrameLogger.getName());

    public Http2()
    {
    }

    private static transient IllegalArgumentException illegalArgument(String s, Object aobj[])
    {
        throw new IllegalArgumentException(String.format(s, aobj));
    }

    private static transient IOException ioException(String s, Object aobj[])
    {
        throw new IOException(String.format(s, aobj));
    }

    private static int lengthWithoutPadding(int l, byte byte0, short word0)
    {
        int i1 = l;
        if ((byte0 & 8) != 0)
        {
            i1 = l - 1;
        }
        if (word0 > i1)
        {
            throw ioException("PROTOCOL_ERROR padding %s > remaining length %s", new Object[] {
                Short.valueOf(word0), Integer.valueOf(i1)
            });
        } else
        {
            return (short)(i1 - word0);
        }
    }

    private static int readMedium(j j1)
    {
        return (j1.i() & 0xff) << 16 | (j1.i() & 0xff) << 8 | j1.i() & 0xff;
    }

    private static void writeMedium(i l, int i1)
    {
        l.i(i1 >>> 16 & 0xff);
        l.i(i1 >>> 8 & 0xff);
        l.i(i1 & 0xff);
    }

    public Protocol getProtocol()
    {
        return Protocol.HTTP_2;
    }

    public FrameReader newReader(j j1, boolean flag)
    {
        return new Reader(j1, 4096, flag);
    }

    public FrameWriter newWriter(i l, boolean flag)
    {
        return new Writer(l, flag);
    }









    private class Reader
        implements FrameReader
    {
        private class ContinuationSource
            implements ad
        {

            byte flags;
            int left;
            int length;
            short padding;
            private final j source;
            int streamId;

            private void readContinuationHeader()
            {
                int l = streamId;
                int i1 = Http2.readMedium(source);
                left = i1;
                length = i1;
                byte byte0 = (byte)(source.i() & 0xff);
                flags = (byte)(source.i() & 0xff);
                if (Http2.logger.isLoggable(Level.FINE))
                {
                    Http2.logger.fine(FrameLogger.formatHeader(true, streamId, length, byte0, flags));
                }
                streamId = source.k() & 0x7fffffff;
                if (byte0 != 9)
                {
                    throw Http2.ioException("%s != TYPE_CONTINUATION", new Object[] {
                        Byte.valueOf(byte0)
                    });
                }
                if (streamId != l)
                {
                    throw Http2.ioException("TYPE_CONTINUATION streamId changed", new Object[0]);
                } else
                {
                    return;
                }
            }

            public void close()
            {
            }

            public long read(f f, long l)
            {
_L7:
                if (left != 0) goto _L2; else goto _L1
_L1:
                source.g(padding);
                padding = 0;
                if ((flags & 4) == 0) goto _L4; else goto _L3
_L3:
                return -1L;
_L4:
                readContinuationHeader();
                continue; /* Loop/switch isn't completed */
_L2:
                l = source.read(f, Math.min(l, left));
                if (l == -1L) goto _L3; else goto _L5
_L5:
                left = (int)((long)left - l);
                return l;
                if (true) goto _L7; else goto _L6
_L6:
            }

            public ae timeout()
            {
                return source.timeout();
            }

            public ContinuationSource(j j1)
            {
                source = j1;
            }

            private class FrameLogger
            {

                private static final String BINARY[];
                private static final String FLAGS[];
                private static final String TYPES[] = {
                    "DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"
                };

                static String formatFlags(byte byte0, byte byte1)
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

                static String formatHeader(boolean flag, int l, int i1, byte byte0, byte byte1)
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
                        s1, Integer.valueOf(l), Integer.valueOf(i1), s, s2
                    });
                }

                static 
                {
                    boolean flag = false;
                    FLAGS = new String[64];
                    BINARY = new String[256];
                    for (int l = 0; l < BINARY.length; l++)
                    {
                        BINARY[l] = String.format("%8s", new Object[] {
                            Integer.toBinaryString(l)
                        }).replace(' ', '0');
                    }

                    FLAGS[0] = "";
                    FLAGS[1] = "END_STREAM";
                    int ai[] = new int[1];
                    ai[0] = 1;
                    FLAGS[8] = "PADDED";
                    int k1 = ai.length;
                    for (int i1 = 0; i1 < k1; i1++)
                    {
                        int l1 = ai[i1];
                        FLAGS[l1 | 8] = (new StringBuilder()).append(FLAGS[l1]).append("|PADDED").toString();
                    }

                    FLAGS[4] = "END_HEADERS";
                    FLAGS[32] = "PRIORITY";
                    FLAGS[36] = "END_HEADERS|PRIORITY";
                    int ai1[] = new int[3];
                    int[] _tmp = ai1;
                    ai1[0] = 4;
                    ai1[1] = 32;
                    ai1[2] = 36;
                    int i2 = ai1.length;
                    int j1 = 0;
                    do
                    {
                        k1 = ((flag) ? 1 : 0);
                        if (j1 >= i2)
                        {
                            break;
                        }
                        int j2 = ai1[j1];
                        int k2 = ai.length;
                        for (k1 = 0; k1 < k2; k1++)
                        {
                            int l2 = ai[k1];
                            FLAGS[l2 | j2] = (new StringBuilder()).append(FLAGS[l2]).append('|').append(FLAGS[j2]).toString();
                            FLAGS[l2 | j2 | 8] = (new StringBuilder()).append(FLAGS[l2]).append('|').append(FLAGS[j2]).append("|PADDED").toString();
                        }

                        j1++;
                    } while (true);
                    for (; k1 < FLAGS.length; k1++)
                    {
                        if (FLAGS[k1] == null)
                        {
                            FLAGS[k1] = BINARY[k1];
                        }
                    }

                }

                FrameLogger()
                {
                }
            }

        }


        private final boolean client;
        private final ContinuationSource continuation;
        final Hpack.Reader hpackReader;
        private final j source;

        private void readData(FrameReader.Handler handler, int l, byte byte0, int i1)
        {
            boolean flag = true;
            int j1 = 0;
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
                throw Http2.ioException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            }
            if ((byte0 & 8) != 0)
            {
                j1 = (short)(source.i() & 0xff);
            }
            l = Http2.lengthWithoutPadding(l, byte0, j1);
            handler.data(flag1, i1, source, l);
            source.g(j1);
        }

        private void readGoAway(FrameReader.Handler handler, int l, byte byte0, int i1)
        {
            if (l < 8)
            {
                throw Http2.ioException("TYPE_GOAWAY length < 8: %s", new Object[] {
                    Integer.valueOf(l)
                });
            }
            if (i1 != 0)
            {
                throw Http2.ioException("TYPE_GOAWAY streamId != 0", new Object[0]);
            }
            byte0 = source.k();
            i1 = source.k();
            l -= 8;
            ErrorCode errorcode = ErrorCode.fromHttp2(i1);
            if (errorcode == null)
            {
                throw Http2.ioException("TYPE_GOAWAY unexpected error code: %d", new Object[] {
                    Integer.valueOf(i1)
                });
            }
            k k1 = k.b;
            if (l > 0)
            {
                k1 = source.c(l);
            }
            handler.goAway(byte0, errorcode, k1);
        }

        private List readHeaderBlock(int l, short word0, byte byte0, int i1)
        {
            ContinuationSource continuationsource = continuation;
            continuation.left = l;
            continuationsource.length = l;
            continuation.padding = word0;
            continuation.flags = byte0;
            continuation.streamId = i1;
            hpackReader.readHeaders();
            return hpackReader.getAndResetHeaderList();
        }

        private void readHeaders(FrameReader.Handler handler, int l, byte byte0, int i1)
        {
            if (i1 == 0)
            {
                throw Http2.ioException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            }
            short word0;
            int j1;
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
                word0 = (short)(source.i() & 0xff);
            } else
            {
                word0 = 0;
            }
            j1 = l;
            if ((byte0 & 0x20) != 0)
            {
                readPriority(handler, i1);
                j1 = l - 5;
            }
            handler.headers(false, flag, i1, -1, readHeaderBlock(Http2.lengthWithoutPadding(j1, byte0, word0), word0, byte0, i1), HeadersMode.HTTP_20_HEADERS);
        }

        private void readPing(FrameReader.Handler handler, int l, byte byte0, int i1)
        {
            boolean flag = true;
            if (l != 8)
            {
                throw Http2.ioException("TYPE_PING length != 8: %s", new Object[] {
                    Integer.valueOf(l)
                });
            }
            if (i1 != 0)
            {
                throw Http2.ioException("TYPE_PING streamId != 0", new Object[0]);
            }
            l = source.k();
            i1 = source.k();
            if ((byte0 & 1) == 0)
            {
                flag = false;
            }
            handler.ping(flag, l, i1);
        }

        private void readPriority(FrameReader.Handler handler, int l)
        {
            int i1 = source.k();
            boolean flag;
            if ((0x80000000 & i1) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            handler.priority(l, i1 & 0x7fffffff, (source.i() & 0xff) + 1, flag);
        }

        private void readPriority(FrameReader.Handler handler, int l, byte byte0, int i1)
        {
            if (l != 5)
            {
                throw Http2.ioException("TYPE_PRIORITY length: %d != 5", new Object[] {
                    Integer.valueOf(l)
                });
            }
            if (i1 == 0)
            {
                throw Http2.ioException("TYPE_PRIORITY streamId == 0", new Object[0]);
            } else
            {
                readPriority(handler, i1);
                return;
            }
        }

        private void readPushPromise(FrameReader.Handler handler, int l, byte byte0, int i1)
        {
            short word0 = 0;
            if (i1 == 0)
            {
                throw Http2.ioException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            }
            if ((byte0 & 8) != 0)
            {
                word0 = (short)(source.i() & 0xff);
            }
            handler.pushPromise(i1, source.k() & 0x7fffffff, readHeaderBlock(Http2.lengthWithoutPadding(l - 4, byte0, word0), word0, byte0, i1));
        }

        private void readRstStream(FrameReader.Handler handler, int l, byte byte0, int i1)
        {
            if (l != 4)
            {
                throw Http2.ioException("TYPE_RST_STREAM length: %d != 4", new Object[] {
                    Integer.valueOf(l)
                });
            }
            if (i1 == 0)
            {
                throw Http2.ioException("TYPE_RST_STREAM streamId == 0", new Object[0]);
            }
            l = source.k();
            ErrorCode errorcode = ErrorCode.fromHttp2(l);
            if (errorcode == null)
            {
                throw Http2.ioException("TYPE_RST_STREAM unexpected error code: %d", new Object[] {
                    Integer.valueOf(l)
                });
            } else
            {
                handler.rstStream(i1, errorcode);
                return;
            }
        }

        private void readSettings(FrameReader.Handler handler, int l, byte byte0, int i1)
        {
            if (i1 != 0)
            {
                throw Http2.ioException("TYPE_SETTINGS streamId != 0", new Object[0]);
            }
            if ((byte0 & 1) == 0) goto _L2; else goto _L1
_L1:
            if (l != 0)
            {
                throw Http2.ioException("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            }
            handler.ackSettings();
_L15:
            return;
_L2:
            Settings settings;
            if (l % 6 != 0)
            {
                throw Http2.ioException("TYPE_SETTINGS length %% 6 != 0: %s", new Object[] {
                    Integer.valueOf(l)
                });
            }
            settings = new Settings();
            byte0 = 0;
_L10:
            short word0;
            int j1;
            if (byte0 >= l)
            {
                break MISSING_BLOCK_LABEL_273;
            }
            word0 = source.j();
            j1 = source.k();
            i1 = word0;
            word0;
            JVM INSTR tableswitch 1 6: default 148
        //                       1 198
        //                       2 166
        //                       3 195
        //                       4 217
        //                       5 236
        //                       6 198;
               goto _L3 _L4 _L5 _L6 _L7 _L8 _L4
_L7:
            break; /* Loop/switch isn't completed */
_L4:
            break; /* Loop/switch isn't completed */
_L3:
            throw Http2.ioException("PROTOCOL_ERROR invalid settings id: %s", new Object[] {
                Short.valueOf(word0)
            });
_L5:
            i1 = word0;
            if (j1 != 0)
            {
                i1 = word0;
                if (j1 != 1)
                {
                    throw Http2.ioException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                }
            }
            break; /* Loop/switch isn't completed */
_L6:
            i1 = 4;
_L12:
            settings.set(i1, 0, j1);
            byte0 += 6;
            if (true) goto _L10; else goto _L9
_L9:
            i1 = 7;
            if (j1 >= 0) goto _L12; else goto _L11
_L11:
            throw Http2.ioException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
_L8:
            if (j1 < 16384)
            {
                break; /* Loop/switch isn't completed */
            }
            i1 = word0;
            if (j1 <= 0xffffff) goto _L12; else goto _L13
_L13:
            throw Http2.ioException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", new Object[] {
                Integer.valueOf(j1)
            });
            handler.settings(false, settings);
            if (settings.getHeaderTableSize() >= 0)
            {
                hpackReader.headerTableSizeSetting(settings.getHeaderTableSize());
                return;
            }
            if (true) goto _L15; else goto _L14
_L14:
        }

        private void readWindowUpdate(FrameReader.Handler handler, int l, byte byte0, int i1)
        {
            if (l != 4)
            {
                throw Http2.ioException("TYPE_WINDOW_UPDATE length !=4: %s", new Object[] {
                    Integer.valueOf(l)
                });
            }
            long l1 = (long)source.k() & 0x7fffffffL;
            if (l1 == 0L)
            {
                throw Http2.ioException("windowSizeIncrement was 0", new Object[] {
                    Long.valueOf(l1)
                });
            } else
            {
                handler.windowUpdate(i1, l1);
                return;
            }
        }

        public void close()
        {
            source.close();
        }

        public boolean nextFrame(FrameReader.Handler handler)
        {
            int l;
            try
            {
                source.a(9L);
            }
            // Misplaced declaration of an exception variable
            catch (FrameReader.Handler handler)
            {
                return false;
            }
            l = Http2.readMedium(source);
            if (l < 0 || l > 16384)
            {
                throw Http2.ioException("FRAME_SIZE_ERROR: %s", new Object[] {
                    Integer.valueOf(l)
                });
            }
            byte byte0 = (byte)(source.i() & 0xff);
            byte byte1 = (byte)(source.i() & 0xff);
            int i1 = source.k() & 0x7fffffff;
            if (Http2.logger.isLoggable(Level.FINE))
            {
                Http2.logger.fine(FrameLogger.formatHeader(true, i1, l, byte0, byte1));
            }
            switch (byte0)
            {
            default:
                source.g(l);
                return true;

            case 0: // '\0'
                readData(handler, l, byte1, i1);
                return true;

            case 1: // '\001'
                readHeaders(handler, l, byte1, i1);
                return true;

            case 2: // '\002'
                readPriority(handler, l, byte1, i1);
                return true;

            case 3: // '\003'
                readRstStream(handler, l, byte1, i1);
                return true;

            case 4: // '\004'
                readSettings(handler, l, byte1, i1);
                return true;

            case 5: // '\005'
                readPushPromise(handler, l, byte1, i1);
                return true;

            case 6: // '\006'
                readPing(handler, l, byte1, i1);
                return true;

            case 7: // '\007'
                readGoAway(handler, l, byte1, i1);
                return true;

            case 8: // '\b'
                readWindowUpdate(handler, l, byte1, i1);
                break;
            }
            return true;
        }

        public void readConnectionPreface()
        {
            if (!client)
            {
                k k1 = source.c(Http2.CONNECTION_PREFACE.f());
                if (Http2.logger.isLoggable(Level.FINE))
                {
                    Http2.logger.fine(String.format("<< CONNECTION %s", new Object[] {
                        k1.d()
                    }));
                }
                if (!Http2.CONNECTION_PREFACE.equals(k1))
                {
                    throw Http2.ioException("Expected a connection header but was %s", new Object[] {
                        k1.a()
                    });
                }
            }
        }

        Reader(j j1, int l, boolean flag)
        {
            source = j1;
            client = flag;
            continuation = new ContinuationSource(source);
            hpackReader = new Hpack.Reader(l, continuation);
        }
    }


    private class Writer
        implements FrameWriter
    {

        private final boolean client;
        private boolean closed;
        private final f hpackBuffer = new f();
        private final Hpack.Writer hpackWriter;
        private int maxFrameSize;
        private final i sink;

        private void writeContinuationFrames(int l, long l1)
        {
            while (l1 > 0L) 
            {
                int i1 = (int)Math.min(maxFrameSize, l1);
                l1 -= i1;
                byte byte0;
                if (l1 == 0L)
                {
                    byte0 = 4;
                } else
                {
                    byte0 = 0;
                }
                frameHeader(l, i1, (byte)9, byte0);
                sink.write(hpackBuffer, i1);
            }
        }

        public void ackSettings(Settings settings1)
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

        public void close()
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

        public void connectionPreface()
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
            if (Http2.logger.isLoggable(Level.FINE))
            {
                Http2.logger.fine(String.format(">> CONNECTION %s", new Object[] {
                    Http2.CONNECTION_PREFACE.d()
                }));
            }
            sink.c(Http2.CONNECTION_PREFACE.g());
            sink.flush();
              goto _L1
        }

        public void data(boolean flag, int l, f f1, int i1)
        {
            this;
            JVM INSTR monitorenter ;
            if (closed)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_24;
            f1;
            this;
            JVM INSTR monitorexit ;
            throw f1;
            byte byte0;
            byte0 = 0;
            if (flag)
            {
                byte0 = (byte)1;
            }
            dataFrame(l, byte0, f1, i1);
            this;
            JVM INSTR monitorexit ;
        }

        void dataFrame(int l, byte byte0, f f1, int i1)
        {
            frameHeader(l, i1, (byte)0, byte0);
            if (i1 > 0)
            {
                sink.write(f1, i1);
            }
        }

        public void flush()
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

        void frameHeader(int l, int i1, byte byte0, byte byte1)
        {
            if (Http2.logger.isLoggable(Level.FINE))
            {
                Http2.logger.fine(FrameLogger.formatHeader(false, l, i1, byte0, byte1));
            }
            if (i1 > maxFrameSize)
            {
                throw Http2.illegalArgument("FRAME_SIZE_ERROR length > %d: %d", new Object[] {
                    Integer.valueOf(maxFrameSize), Integer.valueOf(i1)
                });
            }
            if ((0x80000000 & l) != 0)
            {
                throw Http2.illegalArgument("reserved bit set: %s", new Object[] {
                    Integer.valueOf(l)
                });
            } else
            {
                Http2.writeMedium(sink, i1);
                sink.i(byte0 & 0xff);
                sink.i(byte1 & 0xff);
                sink.g(0x7fffffff & l);
                return;
            }
        }

        public void goAway(int l, ErrorCode errorcode, byte abyte0[])
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
                throw Http2.illegalArgument("errorCode.httpCode == -1", new Object[0]);
            }
            frameHeader(0, abyte0.length + 8, (byte)7, (byte)0);
            sink.g(l);
            sink.g(errorcode.httpCode);
            if (abyte0.length > 0)
            {
                sink.c(abyte0);
            }
            sink.flush();
            this;
            JVM INSTR monitorexit ;
        }

        public void headers(int l, List list)
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
            headers(false, l, list);
            this;
            JVM INSTR monitorexit ;
        }

        void headers(boolean flag, int l, List list)
        {
            if (closed)
            {
                throw new IOException("closed");
            }
            hpackWriter.writeHeaders(list);
            long l1 = hpackBuffer.a();
            int i1 = (int)Math.min(maxFrameSize, l1);
            byte byte0;
            byte byte1;
            if (l1 == (long)i1)
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
            frameHeader(l, i1, (byte)1, byte1);
            sink.write(hpackBuffer, i1);
            if (l1 > (long)i1)
            {
                writeContinuationFrames(l, l1 - (long)i1);
            }
        }

        public int maxDataLength()
        {
            return maxFrameSize;
        }

        public void ping(boolean flag, int l, int i1)
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
            sink.g(l);
            sink.g(i1);
            sink.flush();
            this;
            JVM INSTR monitorexit ;
        }

        public void pushPromise(int l, int i1, List list)
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
            int j1;
            long l1;
            hpackWriter.writeHeaders(list);
            l1 = hpackBuffer.a();
            j1 = (int)Math.min(maxFrameSize - 4, l1);
            byte byte0;
            if (l1 == (long)j1)
            {
                byte0 = 4;
            } else
            {
                byte0 = 0;
            }
            frameHeader(l, j1 + 4, (byte)5, byte0);
            sink.g(0x7fffffff & i1);
            sink.write(hpackBuffer, j1);
            if (l1 <= (long)j1)
            {
                break MISSING_BLOCK_LABEL_130;
            }
            writeContinuationFrames(l, l1 - (long)j1);
            this;
            JVM INSTR monitorexit ;
        }

        public void rstStream(int l, ErrorCode errorcode)
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
                throw new IllegalArgumentException();
            }
            frameHeader(l, 4, (byte)3, (byte)0);
            sink.g(errorcode.httpCode);
            sink.flush();
            this;
            JVM INSTR monitorexit ;
        }

        public void settings(Settings settings1)
        {
            int l = 0;
            this;
            JVM INSTR monitorenter ;
            if (closed)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_26;
            settings1;
            this;
            JVM INSTR monitorexit ;
            throw settings1;
            frameHeader(0, settings1.size() * 6, (byte)4, (byte)0);
_L6:
            if (l >= 10) goto _L2; else goto _L1
_L1:
            if (settings1.isSet(l)) goto _L4; else goto _L3
_L5:
            int i1;
            sink.h(i1);
            sink.g(settings1.get(l));
              goto _L3
_L2:
            sink.flush();
            this;
            JVM INSTR monitorexit ;
            return;
_L8:
            i1 = l;
              goto _L5
_L3:
            l++;
              goto _L6
_L4:
            if (l != 4)
            {
                continue; /* Loop/switch isn't completed */
            }
            i1 = 3;
              goto _L5
            if (l != 7) goto _L8; else goto _L7
_L7:
            i1 = 4;
              goto _L5
        }

        public void synReply(boolean flag, int l, List list)
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
            headers(flag, l, list);
            this;
            JVM INSTR monitorexit ;
        }

        public void synStream(boolean flag, boolean flag1, int l, int i1, List list)
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
            headers(flag, l, list);
            this;
            JVM INSTR monitorexit ;
        }

        public void windowUpdate(int l, long l1)
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
            if (l1 != 0L && l1 <= 0x7fffffffL)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            throw Http2.illegalArgument("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", new Object[] {
                Long.valueOf(l1)
            });
            frameHeader(l, 4, (byte)8, (byte)0);
            sink.g((int)l1);
            sink.flush();
            this;
            JVM INSTR monitorexit ;
        }

        Writer(i l, boolean flag)
        {
            sink = l;
            client = flag;
            hpackWriter = new Hpack.Writer(hpackBuffer);
            maxFrameSize = 16384;
        }
    }

}
