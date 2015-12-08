// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import com.squareup.okhttp.internal.k;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.zip.Deflater;
import okio.ByteString;
import okio.c;
import okio.d;
import okio.e;
import okio.f;
import okio.l;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            o, a, b, j, 
//            m, HeadersMode, ErrorCode, e

public final class n
    implements o
{
    static final class a
        implements com.squareup.okhttp.internal.framed.a
    {

        private final e a;
        private final boolean b;
        private final j c;

        private static transient IOException a(String s, Object aobj[])
            throws IOException
        {
            throw new IOException(String.format(s, aobj));
        }

        private void a(a.a a1, int i, int l)
            throws IOException
        {
            boolean flag = true;
            int i1 = a.h();
            if (l != i1 * 8 + 4)
            {
                throw a("TYPE_SETTINGS length: %d != 4 + 8 * %d", new Object[] {
                    Integer.valueOf(l), Integer.valueOf(i1)
                });
            }
            m m1 = new m();
            for (l = 0; l < i1; l++)
            {
                int j1 = a.h();
                m1.a(j1 & 0xffffff, (0xff000000 & j1) >>> 24, a.h());
            }

            if ((i & 1) == 0)
            {
                flag = false;
            }
            a1.a(flag, m1);
        }

        public final void a()
        {
        }

        public final boolean a(a.a a1)
            throws IOException
        {
            boolean flag = false;
            boolean flag1 = false;
            int i;
            int l;
            int i1;
            int j1;
            try
            {
                l = a.h();
                j1 = a.h();
            }
            // Misplaced declaration of an exception variable
            catch (a.a a1)
            {
                return false;
            }
            if ((0x80000000 & l) != 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            i1 = (0xff000000 & j1) >>> 24;
            j1 = 0xffffff & j1;
            if (i != 0)
            {
                i = (0x7fff0000 & l) >>> 16;
                if (i != 3)
                {
                    throw new ProtocolException((new StringBuilder("version != 3: ")).append(i).toString());
                }
                switch (l & 0xffff)
                {
                case 5: // '\005'
                default:
                    a.f(j1);
                    return true;

                case 1: // '\001'
                    i = a.h();
                    a.h();
                    a.g();
                    List list = c.a(j1 - 10);
                    if ((i1 & 1) != 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if ((i1 & 2) != 0)
                    {
                        flag1 = true;
                    }
                    a1.a(flag1, flag, i & 0x7fffffff, list, HeadersMode.a);
                    return true;

                case 2: // '\002'
                    i = a.h();
                    List list1 = c.a(j1 - 4);
                    if ((i1 & 1) != 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    a1.a(false, flag, i & 0x7fffffff, list1, HeadersMode.b);
                    return true;

                case 3: // '\003'
                    if (j1 != 8)
                    {
                        throw a("TYPE_RST_STREAM length: %d != 8", new Object[] {
                            Integer.valueOf(j1)
                        });
                    }
                    i = a.h();
                    l = a.h();
                    ErrorCode errorcode = ErrorCode.a(l);
                    if (errorcode == null)
                    {
                        throw a("TYPE_RST_STREAM unexpected error code: %d", new Object[] {
                            Integer.valueOf(l)
                        });
                    } else
                    {
                        a1.a(i & 0x7fffffff, errorcode);
                        return true;
                    }

                case 4: // '\004'
                    a(a1, i1, j1);
                    return true;

                case 6: // '\006'
                    if (j1 != 4)
                    {
                        throw a("TYPE_PING length: %d != 4", new Object[] {
                            Integer.valueOf(j1)
                        });
                    }
                    i = a.h();
                    boolean flag2 = b;
                    if ((i & 1) == 1)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (flag2 == flag)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    a1.a(flag, i, 0);
                    return true;

                case 7: // '\007'
                    if (j1 != 8)
                    {
                        throw a("TYPE_GOAWAY length: %d != 8", new Object[] {
                            Integer.valueOf(j1)
                        });
                    }
                    i = a.h();
                    l = a.h();
                    if (com.squareup.okhttp.internal.framed.ErrorCode.c(l) == null)
                    {
                        throw a("TYPE_GOAWAY unexpected error code: %d", new Object[] {
                            Integer.valueOf(l)
                        });
                    } else
                    {
                        a1.a(i & 0x7fffffff, ByteString.b);
                        return true;
                    }

                case 8: // '\b'
                    a1.a(false, false, a.h() & 0x7fffffff, c.a(j1 - 4), com.squareup.okhttp.internal.framed.HeadersMode.c);
                    return true;

                case 9: // '\t'
                    break;
                }
                if (j1 != 8)
                {
                    throw a("TYPE_WINDOW_UPDATE length: %d != 8", new Object[] {
                        Integer.valueOf(j1)
                    });
                }
                i = a.h();
                long l1 = a.h() & 0x7fffffff;
                if (l1 == 0L)
                {
                    throw a("windowSizeIncrement was 0", new Object[] {
                        Long.valueOf(l1)
                    });
                } else
                {
                    a1.a(i & 0x7fffffff, l1);
                    return true;
                }
            }
            if ((i1 & 1) != 0)
            {
                flag = true;
            }
            a1.a(flag, l & 0x7fffffff, a, j1);
            return true;
        }

        public final void close()
            throws IOException
        {
            c.b.close();
        }

        a(e e1, boolean flag)
        {
            a = e1;
            c = new j(a);
            b = flag;
        }
    }

    static final class b
        implements com.squareup.okhttp.internal.framed.b
    {

        private final d a;
        private final c b = new c();
        private final d c;
        private final boolean d;
        private boolean e;

        private void a(List list)
            throws IOException
        {
            c.f(list.size());
            int j = list.size();
            for (int i = 0; i < j; i++)
            {
                ByteString bytestring = ((com.squareup.okhttp.internal.framed.e)list.get(i)).h;
                c.f(bytestring.c.length);
                c.b(bytestring);
                bytestring = ((com.squareup.okhttp.internal.framed.e)list.get(i)).i;
                c.f(bytestring.c.length);
                c.b(bytestring);
            }

            c.flush();
        }

        public final void a()
        {
            this;
            JVM INSTR monitorenter ;
        }

        public final void a(int i, long l1)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (e)
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
                break MISSING_BLOCK_LABEL_64;
            }
            throw new IllegalArgumentException((new StringBuilder("windowSizeIncrement must be between 1 and 0x7fffffff: ")).append(l1).toString());
            a.f(0x80030009);
            a.f(8);
            a.f(i);
            a.f((int)l1);
            a.flush();
            this;
            JVM INSTR monitorexit ;
        }

        public final void a(int i, ErrorCode errorcode)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (e)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_24;
            errorcode;
            this;
            JVM INSTR monitorexit ;
            throw errorcode;
            if (errorcode.t == -1)
            {
                throw new IllegalArgumentException();
            }
            a.f(0x80030003);
            a.f(8);
            a.f(0x7fffffff & i);
            a.f(errorcode.t);
            a.flush();
            this;
            JVM INSTR monitorexit ;
        }

        public final void a(int i, ErrorCode errorcode, byte abyte0[])
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (e)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_24;
            errorcode;
            this;
            JVM INSTR monitorexit ;
            throw errorcode;
            if (errorcode.u == -1)
            {
                throw new IllegalArgumentException("errorCode.spdyGoAwayCode == -1");
            }
            a.f(0x80030007);
            a.f(8);
            a.f(i);
            a.f(errorcode.u);
            a.flush();
            this;
            JVM INSTR monitorexit ;
        }

        public final void a(m m1)
        {
        }

        public final void a(boolean flag, int i, int j)
            throws IOException
        {
            boolean flag2 = true;
            this;
            JVM INSTR monitorenter ;
            if (e)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_29;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
            boolean flag3 = d;
            boolean flag1;
            if ((i & 1) == 1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag3 != flag1)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
              goto _L1
_L3:
            if (flag == flag1)
            {
                break MISSING_BLOCK_LABEL_64;
            }
            throw new IllegalArgumentException("payload != reply");
            a.f(0x80030006);
            a.f(4);
            a.f(i);
            a.flush();
            this;
            JVM INSTR monitorexit ;
            return;
_L1:
            if (true) goto _L3; else goto _L2
_L2:
        }

        public final void a(boolean flag, int i, List list)
            throws IOException
        {
            boolean flag1 = false;
            this;
            JVM INSTR monitorenter ;
            if (e)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_27;
            list;
            this;
            JVM INSTR monitorexit ;
            throw list;
            int j;
            a(list);
            j = (int)(10L + b.b);
            if (flag)
            {
                flag1 = true;
            }
            a.f(0x80030001);
            a.f(((flag1 | false) & 0xff) << 24 | j & 0xffffff);
            a.f(0x7fffffff & i);
            a.f(0);
            a.g(0);
            a.a(b);
            a.flush();
            this;
            JVM INSTR monitorexit ;
        }

        public final void a(boolean flag, int i, c c1, int j)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            int i1;
            if (flag)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (e)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_37;
            c1;
            this;
            JVM INSTR monitorexit ;
            throw c1;
            if ((long)j <= 0xffffffL)
            {
                break MISSING_BLOCK_LABEL_72;
            }
            throw new IllegalArgumentException((new StringBuilder("FRAME_TOO_LARGE max size is 16Mib: ")).append(j).toString());
            a.f(0x7fffffff & i);
            a.f((i1 & 0xff) << 24 | 0xffffff & j);
            if (j <= 0)
            {
                break MISSING_BLOCK_LABEL_129;
            }
            a.a_(c1, j);
            this;
            JVM INSTR monitorexit ;
        }

        public final void b()
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (e)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_24;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
            a.flush();
            this;
            JVM INSTR monitorexit ;
        }

        public final void b(m m1)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (e)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_24;
            m1;
            this;
            JVM INSTR monitorexit ;
            throw m1;
            int i = Integer.bitCount(m1.a);
            a.f(0x80030004);
            a.f(i * 8 + 4 & 0xffffff | 0);
            a.f(i);
            int j = 0;
_L2:
            if (j > 10)
            {
                break MISSING_BLOCK_LABEL_140;
            }
            if (m1.a(j))
            {
                int i1 = m1.b(j);
                a.f((i1 & 0xff) << 24 | j & 0xffffff);
                a.f(m1.d[j]);
            }
            break MISSING_BLOCK_LABEL_152;
            a.flush();
            this;
            JVM INSTR monitorexit ;
            return;
            j++;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public final int c()
        {
            return 16383;
        }

        public final void close()
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            e = true;
            k.a(a, c);
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        b(d d1, boolean flag)
        {
            a = d1;
            d = flag;
            d1 = new Deflater();
            d1.setDictionary(n.a);
            c = l.a(new f(b, d1));
        }
    }


    static final byte a[];

    public n()
    {
    }

    public final com.squareup.okhttp.internal.framed.a a(e e, boolean flag)
    {
        return new a(e, flag);
    }

    public final com.squareup.okhttp.internal.framed.b a(d d, boolean flag)
    {
        return new b(d, flag);
    }

    static 
    {
        try
        {
            a = "\000\000\000\007options\000\000\000\004head\000\000\000\004post\000\000\000\003put\000\000\000\006delete\000\000\000\005trace\000\000\000\006accept\000\000\000\016accept-charset\000\000\000\017accept-encoding\000\000\000\017accept-language\000\000\000\raccept-ranges\000\000\000\003age\000\000\000\005allow\000\000\000\rauthorization\000\000\000\rcache-control\000\000\000\nconnection\000\000\000\fcontent-base\000\000\000\020content-encoding\000\000\000\020content-language\000\000\000\016content-length\000\000\000\020content-location\000\000\000\013content-md5\000\000\000\rcontent-range\000\000\000\fcontent-type\000\000\000\004date\000\000\000\004etag\000\000\000\006expect\000\000\000\007expires\000\000\000\004from\000\000\000\004host\000\000\000\bif-match\000\000\000\021if-modified-since\000\000\000\rif-none-match\000\000\000\bif-range\000\000\000\023if-unmodified-since\000\000\000\rlast-modified\000\000\000\blocation\000\000\000\fmax-forwards\000\000\000\006pragma\000\000\000\022proxy-authenticate\000\000\000\023proxy-authorization\000\000\000\005range\000\000\000\007referer\000\000\000\013retry-after\000\000\000\006server\000\000\000\002te\000\000\000\007trailer\000\000\000\021transfer-encoding\000\000\000\007upgrade\000\000\000\nuser-agent\000\000\000\004vary\000\000\000\003via\000\000\000\007warning\000\000\000\020www-authenticate\000\000\000\006method\000\000\000\003get\000\000\000\006status\000\000\000\006200 OK\000\000\000\007version\000\000\000\bHTTP/1.1\000\000\000\003url\000\000\000\006public\000\000\000\nset-cookie\000\000\000\nkeep-alive\000\000\000\006origin100101201202205206300302303304305306307402405406407408409410411412413414415416417502504505203 Non-Authoritative Information204 No Content301 Moved Permanently400 Bad Request401 Unauthorized403 Forbidden404 Not Found500 Internal Server Error501 Not Implemented503 Service UnavailableJan Feb Mar Apr May Jun Jul Aug Sept Oct Nov Dec 00:00:00 Mon, Tue, Wed, Thu, Fri, Sat, Sun, GMTchunked,text/html,image/png,image/jpg,image/gif,application/xml,application/xhtml+xml,text/plain,text/javascript,publicprivatemax-age=gzip,deflate,sdchcharset=utf-8charset=iso-8859-1,utf-,*,enq=0.".getBytes(k.c.name());
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            throw new AssertionError();
        }
    }
}
