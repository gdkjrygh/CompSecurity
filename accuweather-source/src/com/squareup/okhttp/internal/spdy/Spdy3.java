// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import com.squareup.okhttp.internal.Platform;
import com.squareup.okhttp.internal.Util;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            Variant, FrameReader, FrameWriter, ErrorCode, 
//            Settings

final class Spdy3
    implements Variant
{
    static final class Reader
        implements FrameReader
    {

        private final boolean client;
        private int compressedLimit;
        private final DataInputStream in;
        private final DataInputStream nameValueBlockIn = newNameValueBlockStream();

        private static transient IOException ioException(String s, Object aobj[])
            throws IOException
        {
            throw new IOException(String.format(s, aobj));
        }

        private DataInputStream newNameValueBlockStream()
        {
            return new DataInputStream(new InflaterInputStream(new InputStream() {

                final Reader this$0;

                public void close()
                    throws IOException
                {
                    in.close();
                }

                public int read()
                    throws IOException
                {
                    return Util.readSingleByte(this);
                }

                public int read(byte abyte0[], int i, int j)
                    throws IOException
                {
                    j = Math.min(j, compressedLimit);
                    i = in.read(abyte0, i, j);
                    abyte0 = 
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$0 = Reader.this;
                super();
            }
            }, new Inflater() {

                final Reader this$0;

                public int inflate(byte abyte0[], int i, int j)
                    throws DataFormatException
                {
                    int l = inflate(abyte0, i, j);
                    int k = l;
                    if (l == 0)
                    {
                        k = l;
                        if (needsDictionary())
                        {
                            setDictionary(Spdy3.DICTIONARY);
                            k = inflate(abyte0, i, j);
                        }
                    }
                    return k;
                }

            
            {
                this$0 = Reader.this;
                super();
            }
            }));
        }

        private void readGoAway(FrameReader.Handler handler, int i, int j)
            throws IOException
        {
            if (j != 8)
            {
                throw ioException("TYPE_GOAWAY length: %d != 8", new Object[] {
                    Integer.valueOf(j)
                });
            }
            i = in.readInt();
            j = in.readInt();
            ErrorCode errorcode = ErrorCode.fromSpdyGoAway(j);
            if (errorcode == null)
            {
                throw ioException("TYPE_GOAWAY unexpected error code: %d", new Object[] {
                    Integer.valueOf(j)
                });
            } else
            {
                handler.goAway(i & 0x7fffffff, errorcode);
                return;
            }
        }

        private void readHeaders(FrameReader.Handler handler, int i, int j)
            throws IOException
        {
            handler.headers(in.readInt() & 0x7fffffff, readNameValueBlock(j - 4));
        }

        private List readNameValueBlock(int i)
            throws IOException
        {
            int j;
            compressedLimit = compressedLimit + i;
            try
            {
                j = nameValueBlockIn.readInt();
            }
            catch (DataFormatException dataformatexception)
            {
                throw new IOException(dataformatexception.getMessage());
            }
            if (j * 2 >= 0)
            {
                break MISSING_BLOCK_LABEL_82;
            }
            Logger.getLogger(getClass().getName()).warning((new StringBuilder()).append("numberOfPairs < 0: ").append(j).toString());
            throw ioException("numberOfPairs < 0", new Object[0]);
            ArrayList arraylist = new ArrayList(j * 2);
            i = 0;
_L2:
            if (i >= j)
            {
                break; /* Loop/switch isn't completed */
            }
            String s = readString();
            String s1 = readString();
            if (s.length() == 0)
            {
                throw ioException("name.length == 0", new Object[0]);
            }
            arraylist.add(s);
            arraylist.add(s1);
            i++;
            if (true) goto _L2; else goto _L1
_L1:
            if (compressedLimit != 0)
            {
                Logger.getLogger(getClass().getName()).warning((new StringBuilder()).append("compressedLimit > 0: ").append(compressedLimit).toString());
            }
            return arraylist;
        }

        private void readPing(FrameReader.Handler handler, int i, int j)
            throws IOException
        {
            boolean flag1 = true;
            if (j != 4)
            {
                throw ioException("TYPE_PING length: %d != 4", new Object[] {
                    Integer.valueOf(j)
                });
            }
            i = in.readInt();
            boolean flag2 = client;
            boolean flag;
            if (i % 2 == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag2 == flag)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            handler.ping(flag, i, 0);
        }

        private void readRstStream(FrameReader.Handler handler, int i, int j)
            throws IOException
        {
            if (j != 8)
            {
                throw ioException("TYPE_RST_STREAM length: %d != 8", new Object[] {
                    Integer.valueOf(j)
                });
            }
            i = in.readInt();
            j = in.readInt();
            ErrorCode errorcode = ErrorCode.fromSpdy3Rst(j);
            if (errorcode == null)
            {
                throw ioException("TYPE_RST_STREAM unexpected error code: %d", new Object[] {
                    Integer.valueOf(j)
                });
            } else
            {
                handler.rstStream(i & 0x7fffffff, errorcode);
                return;
            }
        }

        private void readSettings(FrameReader.Handler handler, int i, int j)
            throws IOException
        {
            boolean flag = true;
            int k = in.readInt();
            if (j != k * 8 + 4)
            {
                throw ioException("TYPE_SETTINGS length: %d != 4 + 8 * %d", new Object[] {
                    Integer.valueOf(j), Integer.valueOf(k)
                });
            }
            Settings settings = new Settings();
            for (j = 0; j < k; j++)
            {
                int l = in.readInt();
                settings.set(l & 0xffffff, (0xff000000 & l) >>> 24, in.readInt());
            }

            if ((i & 1) == 0)
            {
                flag = false;
            }
            handler.settings(flag, settings);
        }

        private String readString()
            throws DataFormatException, IOException
        {
            int i = nameValueBlockIn.readInt();
            byte abyte0[] = new byte[i];
            Util.readFully(nameValueBlockIn, abyte0);
            return new String(abyte0, 0, i, "UTF-8");
        }

        private void readSynReply(FrameReader.Handler handler, int i, int j)
            throws IOException
        {
            int k = in.readInt();
            List list = readNameValueBlock(j - 4);
            boolean flag;
            if ((i & 1) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            handler.synReply(flag, k & 0x7fffffff, list);
        }

        private void readSynStream(FrameReader.Handler handler, int i, int j)
            throws IOException
        {
            int k = in.readInt();
            int l = in.readInt();
            short word0 = in.readShort();
            List list = readNameValueBlock(j - 10);
            boolean flag;
            boolean flag1;
            if ((i & 1) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if ((i & 2) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            handler.synStream(flag1, flag, k & 0x7fffffff, l & 0x7fffffff, (0xe000 & word0) >>> 13, word0 & 0xff, list);
        }

        private void readWindowUpdate(FrameReader.Handler handler, int i, int j)
            throws IOException
        {
            if (j != 8)
            {
                throw ioException("TYPE_WINDOW_UPDATE length: %d != 8", new Object[] {
                    Integer.valueOf(j)
                });
            } else
            {
                handler.windowUpdate(in.readInt() & 0x7fffffff, in.readInt() & 0x7fffffff, false);
                return;
            }
        }

        public void close()
            throws IOException
        {
            Util.closeAll(in, nameValueBlockIn);
        }

        public boolean nextFrame(FrameReader.Handler handler)
            throws IOException
        {
            boolean flag = false;
            int i;
            int j;
            int k;
            int l;
            try
            {
                j = in.readInt();
            }
            // Misplaced declaration of an exception variable
            catch (FrameReader.Handler handler)
            {
                return false;
            }
            k = in.readInt();
            if ((0x80000000 & j) != 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            l = (0xff000000 & k) >>> 24;
            k &= 0xffffff;
            if (i != 0)
            {
                i = (0x7fff0000 & j) >>> 16;
                if (i != 3)
                {
                    throw new ProtocolException((new StringBuilder()).append("version != 3: ").append(i).toString());
                }
                switch (j & 0xffff)
                {
                case 10: // '\n'
                case 11: // '\013'
                case 12: // '\f'
                case 13: // '\r'
                case 14: // '\016'
                case 15: // '\017'
                default:
                    throw new IOException("Unexpected frame");

                case 1: // '\001'
                    readSynStream(handler, l, k);
                    return true;

                case 2: // '\002'
                    readSynReply(handler, l, k);
                    return true;

                case 3: // '\003'
                    readRstStream(handler, l, k);
                    return true;

                case 4: // '\004'
                    readSettings(handler, l, k);
                    return true;

                case 5: // '\005'
                    if (k != 0)
                    {
                        throw ioException("TYPE_NOOP length: %d != 0", new Object[] {
                            Integer.valueOf(k)
                        });
                    } else
                    {
                        handler.noop();
                        return true;
                    }

                case 6: // '\006'
                    readPing(handler, l, k);
                    return true;

                case 7: // '\007'
                    readGoAway(handler, l, k);
                    return true;

                case 8: // '\b'
                    readHeaders(handler, l, k);
                    return true;

                case 9: // '\t'
                    readWindowUpdate(handler, l, k);
                    return true;

                case 16: // '\020'
                    Util.skipByReading(in, k);
                    throw new UnsupportedOperationException("TODO");
                }
            }
            if ((l & 1) != 0)
            {
                flag = true;
            }
            handler.data(flag, j & 0x7fffffff, in, k);
            return true;
        }



/*
        static int access$020(Reader reader, int i)
        {
            i = reader.compressedLimit - i;
            reader.compressedLimit = i;
            return i;
        }

*/


        Reader(InputStream inputstream, boolean flag)
        {
            in = new DataInputStream(inputstream);
            client = flag;
        }
    }

    static final class Writer
        implements FrameWriter
    {

        private final boolean client;
        private final ByteArrayOutputStream nameValueBlockBuffer = new ByteArrayOutputStream();
        private final DataOutputStream nameValueBlockOut;
        private final DataOutputStream out;

        private void writeNameValueBlockToBuffer(List list)
            throws IOException
        {
            nameValueBlockBuffer.reset();
            int i = list.size() / 2;
            nameValueBlockOut.writeInt(i);
            String s;
            for (list = list.iterator(); list.hasNext(); nameValueBlockOut.write(s.getBytes("UTF-8")))
            {
                s = (String)list.next();
                nameValueBlockOut.writeInt(s.length());
            }

            nameValueBlockOut.flush();
        }

        public void close()
            throws IOException
        {
            Util.closeAll(out, nameValueBlockOut);
        }

        public void connectionHeader()
        {
            this;
            JVM INSTR monitorenter ;
        }

        public void data(boolean flag, int i, byte abyte0[])
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            data(flag, i, abyte0, 0, abyte0.length);
            this;
            JVM INSTR monitorexit ;
            return;
            abyte0;
            throw abyte0;
        }

        public void data(boolean flag, int i, byte abyte0[], int j, int k)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            int l;
            if (flag)
            {
                l = 1;
            } else
            {
                l = 0;
            }
            out.writeInt(0x7fffffff & i);
            out.writeInt((l & 0xff) << 24 | 0xffffff & k);
            out.write(abyte0, j, k);
            this;
            JVM INSTR monitorexit ;
            return;
            abyte0;
            throw abyte0;
        }

        public void flush()
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            out.flush();
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        public void goAway(int i, ErrorCode errorcode)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (errorcode.spdyGoAwayCode == -1)
            {
                throw new IllegalArgumentException();
            }
            break MISSING_BLOCK_LABEL_23;
            errorcode;
            this;
            JVM INSTR monitorexit ;
            throw errorcode;
            out.writeInt(0x80030007);
            out.writeInt(8);
            out.writeInt(i);
            out.writeInt(errorcode.spdyGoAwayCode);
            out.flush();
            this;
            JVM INSTR monitorexit ;
        }

        public void headers(int i, List list)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            writeNameValueBlockToBuffer(list);
            int j = nameValueBlockBuffer.size();
            out.writeInt(0x80030008);
            out.writeInt(0xffffff & j + 4 | 0);
            out.writeInt(0x7fffffff & i);
            nameValueBlockBuffer.writeTo(out);
            out.flush();
            this;
            JVM INSTR monitorexit ;
            return;
            list;
            throw list;
        }

        public void noop()
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            out.writeInt(0x80030005);
            out.writeInt(0);
            out.flush();
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        public void ping(boolean flag, int i, int j)
            throws IOException
        {
            boolean flag2 = true;
            this;
            JVM INSTR monitorenter ;
            boolean flag3 = client;
            Exception exception;
            boolean flag1;
            if (i % 2 == 1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
              goto _L1
_L7:
            if (flag == flag1) goto _L3; else goto _L2
_L2:
            throw new IllegalArgumentException("payload != reply");
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
_L5:
            flag1 = false;
            continue; /* Loop/switch isn't completed */
_L3:
            out.writeInt(0x80030006);
            out.writeInt(4);
            out.writeInt(i);
            out.flush();
            this;
            JVM INSTR monitorexit ;
            return;
_L1:
            if (flag3 == flag1) goto _L5; else goto _L4
_L4:
            flag1 = flag2;
            if (true) goto _L7; else goto _L6
_L6:
        }

        public void rstStream(int i, ErrorCode errorcode)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (errorcode.spdyRstCode == -1)
            {
                throw new IllegalArgumentException();
            }
            break MISSING_BLOCK_LABEL_23;
            errorcode;
            this;
            JVM INSTR monitorexit ;
            throw errorcode;
            out.writeInt(0x80030003);
            out.writeInt(8);
            out.writeInt(0x7fffffff & i);
            out.writeInt(errorcode.spdyRstCode);
            out.flush();
            this;
            JVM INSTR monitorexit ;
        }

        public void settings(Settings settings1)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            int i = settings1.size();
            out.writeInt(0x80030004);
            out.writeInt(i * 8 + 4 & 0xffffff | 0);
            out.writeInt(i);
            int j = 0;
_L2:
            if (j > 10)
            {
                break MISSING_BLOCK_LABEL_107;
            }
            if (!settings1.isSet(j))
            {
                break MISSING_BLOCK_LABEL_117;
            }
            int k = settings1.flags(j);
            out.writeInt((k & 0xff) << 24 | j & 0xffffff);
            out.writeInt(settings1.get(j));
            break MISSING_BLOCK_LABEL_117;
            settings1;
            throw settings1;
            out.flush();
            this;
            JVM INSTR monitorexit ;
            return;
            j++;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public void synReply(boolean flag, int i, List list)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            writeNameValueBlockToBuffer(list);
            int j;
            int k;
            if (flag)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            k = nameValueBlockBuffer.size();
            out.writeInt(0x80030002);
            out.writeInt((j & 0xff) << 24 | 0xffffff & k + 4);
            out.writeInt(0x7fffffff & i);
            nameValueBlockBuffer.writeTo(out);
            out.flush();
            this;
            JVM INSTR monitorexit ;
            return;
            list;
            throw list;
        }

        public void synStream(boolean flag, boolean flag1, int i, int j, int k, int l, List list)
            throws IOException
        {
            byte byte0 = 0;
            this;
            JVM INSTR monitorenter ;
            int i1;
            writeNameValueBlockToBuffer(list);
            i1 = nameValueBlockBuffer.size();
            boolean flag2;
            if (flag)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (flag1)
            {
                byte0 = 2;
            }
              goto _L1
_L3:
            out.writeInt(0x80030001);
            out.writeInt(((flag2 | byte0) & 0xff) << 24 | 0xffffff & i1 + 10);
            out.writeInt(i & 0x7fffffff);
            out.writeInt(j & 0x7fffffff);
            out.writeShort((k & 7) << 13 | 0 | l & 0xff);
            nameValueBlockBuffer.writeTo(out);
            out.flush();
            this;
            JVM INSTR monitorexit ;
            return;
            list;
            throw list;
_L1:
            if (true) goto _L3; else goto _L2
_L2:
        }

        public void windowUpdate(int i, int j)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            out.writeInt(0x80030009);
            out.writeInt(8);
            out.writeInt(i);
            out.writeInt(j);
            out.flush();
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        Writer(OutputStream outputstream, boolean flag)
        {
            out = new DataOutputStream(outputstream);
            client = flag;
            outputstream = new Deflater();
            outputstream.setDictionary(Spdy3.DICTIONARY);
            nameValueBlockOut = new DataOutputStream(Platform.get().newDeflaterOutputStream(nameValueBlockBuffer, outputstream, true));
        }
    }


    static final byte DICTIONARY[];
    static final int FLAG_FIN = 1;
    static final int FLAG_UNIDIRECTIONAL = 2;
    static final int TYPE_CREDENTIAL = 16;
    static final int TYPE_DATA = 0;
    static final int TYPE_GOAWAY = 7;
    static final int TYPE_HEADERS = 8;
    static final int TYPE_NOOP = 5;
    static final int TYPE_PING = 6;
    static final int TYPE_RST_STREAM = 3;
    static final int TYPE_SETTINGS = 4;
    static final int TYPE_SYN_REPLY = 2;
    static final int TYPE_SYN_STREAM = 1;
    static final int TYPE_WINDOW_UPDATE = 9;
    static final int VERSION = 3;

    Spdy3()
    {
    }

    public FrameReader newReader(InputStream inputstream, boolean flag)
    {
        return new Reader(inputstream, flag);
    }

    public FrameWriter newWriter(OutputStream outputstream, boolean flag)
    {
        return new Writer(outputstream, flag);
    }

    static 
    {
        try
        {
            DICTIONARY = "\000\000\000\007options\000\000\000\004head\000\000\000\004post\000\000\000\003put\000\000\000\006delete\000\000\000\005trace\000\000\000\006accept\000\000\000\016accept-charset\000\000\000\017accept-encoding\000\000\000\017accept-language\000\000\000\raccept-ranges\000\000\000\003age\000\000\000\005allow\000\000\000\rauthorization\000\000\000\rcache-control\000\000\000\nconnection\000\000\000\fcontent-base\000\000\000\020content-encoding\000\000\000\020content-language\000\000\000\016content-length\000\000\000\020content-location\000\000\000\013content-md5\000\000\000\rcontent-range\000\000\000\fcontent-type\000\000\000\004date\000\000\000\004etag\000\000\000\006expect\000\000\000\007expires\000\000\000\004from\000\000\000\004host\000\000\000\bif-match\000\000\000\021if-modified-since\000\000\000\rif-none-match\000\000\000\bif-range\000\000\000\023if-unmodified-since\000\000\000\rlast-modified\000\000\000\blocation\000\000\000\fmax-forwards\000\000\000\006pragma\000\000\000\022proxy-authenticate\000\000\000\023proxy-authorization\000\000\000\005range\000\000\000\007referer\000\000\000\013retry-after\000\000\000\006server\000\000\000\002te\000\000\000\007trailer\000\000\000\021transfer-encoding\000\000\000\007upgrade\000\000\000\nuser-agent\000\000\000\004vary\000\000\000\003via\000\000\000\007warning\000\000\000\020www-authenticate\000\000\000\006method\000\000\000\003get\000\000\000\006status\000\000\000\006200 OK\000\000\000\007version\000\000\000\bHTTP/1.1\000\000\000\003url\000\000\000\006public\000\000\000\nset-cookie\000\000\000\nkeep-alive\000\000\000\006origin100101201202205206300302303304305306307402405406407408409410411412413414415416417502504505203 Non-Authoritative Information204 No Content301 Moved Permanently400 Bad Request401 Unauthorized403 Forbidden404 Not Found500 Internal Server Error501 Not Implemented503 Service UnavailableJan Feb Mar Apr May Jun Jul Aug Sept Oct Nov Dec 00:00:00 Mon, Tue, Wed, Thu, Fri, Sat, Sun, GMTchunked,text/html,image/png,image/jpg,image/gif,application/xml,application/xhtml+xml,text/plain,text/javascript,publicprivatemax-age=gzip,deflate,sdchcharset=utf-8charset=iso-8859-1,utf-,*,enq=0.".getBytes(Util.UTF_8.name());
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            throw new AssertionError();
        }
    }
}
