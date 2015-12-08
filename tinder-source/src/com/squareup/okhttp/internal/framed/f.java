// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.ByteString;
import okio.c;
import okio.e;
import okio.l;
import okio.r;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            e, h

final class f
{
    static final class a
    {

        final List a = new ArrayList();
        final e b;
        int c;
        int d;
        com.squareup.okhttp.internal.framed.e e[];
        int f;
        int g;
        int h;

        private void c()
        {
            a.clear();
            Arrays.fill(e, null);
            f = e.length - 1;
            g = 0;
            h = 0;
        }

        static boolean c(int i)
        {
            return i >= 0 && i <= f.a().length - 1;
        }

        private int d()
            throws IOException
        {
            return b.f() & 0xff;
        }

        private int d(int i)
        {
            int j = 0;
            boolean flag = false;
            if (i > 0)
            {
                j = e.length - 1;
                int k = i;
                i = ((flag) ? 1 : 0);
                for (; j >= f && k > 0; j--)
                {
                    k -= e[j].j;
                    h = h - e[j].j;
                    g = g - 1;
                    i++;
                }

                System.arraycopy(e, f + 1, e, f + 1 + i, g);
                f = f + i;
                j = i;
            }
            return j;
        }

        final int a(int i)
        {
            return f + 1 + i;
        }

        final int a(int i, int j)
            throws IOException
        {
            i &= j;
            if (i < j)
            {
                return i;
            }
            i = 0;
            do
            {
                int k = d();
                if ((k & 0x80) != 0)
                {
                    j += (k & 0x7f) << i;
                    i += 7;
                } else
                {
                    return (k << i) + j;
                }
            } while (true);
        }

        final void a()
        {
label0:
            {
                if (d < h)
                {
                    if (d != 0)
                    {
                        break label0;
                    }
                    c();
                }
                return;
            }
            d(h - d);
        }

        final void a(com.squareup.okhttp.internal.framed.e e1)
        {
            a.add(e1);
            int i = e1.j;
            if (i > d)
            {
                c();
                return;
            }
            d((h + i) - d);
            if (g + 1 > e.length)
            {
                com.squareup.okhttp.internal.framed.e ae[] = new com.squareup.okhttp.internal.framed.e[e.length * 2];
                System.arraycopy(e, 0, ae, e.length, e.length);
                f = e.length - 1;
                e = ae;
            }
            int j = f;
            f = j - 1;
            e[j] = e1;
            g = g + 1;
            h = i + h;
        }

        final ByteString b()
            throws IOException
        {
            int j = 0;
            int k = d();
            int i;
            if ((k & 0x80) == 128)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            k = a(k, 127);
            if (i != 0)
            {
                h h1 = com.squareup.okhttp.internal.framed.h.a();
                byte abyte0[] = b.e(k);
                ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
                h.a a1 = h1.a;
                k = 0;
                i = 0;
                h.a a3;
                int i1;
                do
                {
                    i1 = i;
                    a3 = a1;
                    if (j >= abyte0.length)
                    {
                        break;
                    }
                    k = k << 8 | abyte0[j] & 0xff;
                    for (i += 8; i >= 8;)
                    {
                        a1 = a1.a[k >>> i - 8 & 0xff];
                        if (a1.a == null)
                        {
                            bytearrayoutputstream.write(a1.b);
                            i -= a1.c;
                            a1 = h1.a;
                        } else
                        {
                            i -= 8;
                        }
                    }

                    j++;
                } while (true);
                do
                {
                    if (i1 <= 0)
                    {
                        break;
                    }
                    h.a a2 = a3.a[k << 8 - i1 & 0xff];
                    if (a2.a != null || a2.c > i1)
                    {
                        break;
                    }
                    bytearrayoutputstream.write(a2.b);
                    i1 -= a2.c;
                    a3 = h1.a;
                } while (true);
                return ByteString.a(bytearrayoutputstream.toByteArray());
            } else
            {
                return b.c(k);
            }
        }

        final ByteString b(int i)
        {
            if (c(i))
            {
                return f.a()[i].h;
            } else
            {
                return e[a(i - f.a().length)].h;
            }
        }

        a(r r)
        {
            e = new com.squareup.okhttp.internal.framed.e[8];
            f = e.length - 1;
            g = 0;
            h = 0;
            c = 4096;
            d = 4096;
            b = l.a(r);
        }
    }

    static final class b
    {

        private final c a;

        private void a(int i, int j)
            throws IOException
        {
            if (i < j)
            {
                a.b(i | 0);
                return;
            }
            a.b(j | 0);
            for (i -= j; i >= 128; i >>>= 7)
            {
                a.b(i & 0x7f | 0x80);
            }

            a.b(i);
        }

        private void a(ByteString bytestring)
            throws IOException
        {
            a(bytestring.c.length, 127);
            a.a(bytestring);
        }

        final void a(List list)
            throws IOException
        {
            int j = list.size();
            int i = 0;
            while (i < j) 
            {
                ByteString bytestring = ((com.squareup.okhttp.internal.framed.e)list.get(i)).h.c();
                Integer integer = (Integer)f.b().get(bytestring);
                if (integer != null)
                {
                    a(integer.intValue() + 1, 15);
                    a(((com.squareup.okhttp.internal.framed.e)list.get(i)).i);
                } else
                {
                    a.b(0);
                    a(bytestring);
                    a(((com.squareup.okhttp.internal.framed.e)list.get(i)).i);
                }
                i++;
            }
        }

        b(c c1)
        {
            a = c1;
        }
    }


    private static final com.squareup.okhttp.internal.framed.e a[];
    private static final Map b;

    static ByteString a(ByteString bytestring)
        throws IOException
    {
        int i = 0;
        for (int j = bytestring.c.length; i < j; i++)
        {
            byte byte0 = bytestring.c[i];
            if (byte0 >= 65 && byte0 <= 90)
            {
                throw new IOException((new StringBuilder("PROTOCOL_ERROR response malformed: mixed case name: ")).append(bytestring.a()).toString());
            }
        }

        return bytestring;
    }

    static com.squareup.okhttp.internal.framed.e[] a()
    {
        return a;
    }

    static Map b()
    {
        return b;
    }

    static 
    {
        int i = 0;
        a = (new com.squareup.okhttp.internal.framed.e[] {
            new com.squareup.okhttp.internal.framed.e(com.squareup.okhttp.internal.framed.e.e, ""), new com.squareup.okhttp.internal.framed.e(e.b, "GET"), new com.squareup.okhttp.internal.framed.e(e.b, "POST"), new com.squareup.okhttp.internal.framed.e(com.squareup.okhttp.internal.framed.e.c, "/"), new com.squareup.okhttp.internal.framed.e(com.squareup.okhttp.internal.framed.e.c, "/index.html"), new com.squareup.okhttp.internal.framed.e(e.d, "http"), new com.squareup.okhttp.internal.framed.e(e.d, "https"), new com.squareup.okhttp.internal.framed.e(e.a, "200"), new com.squareup.okhttp.internal.framed.e(e.a, "204"), new com.squareup.okhttp.internal.framed.e(e.a, "206"), 
            new com.squareup.okhttp.internal.framed.e(e.a, "304"), new com.squareup.okhttp.internal.framed.e(e.a, "400"), new com.squareup.okhttp.internal.framed.e(e.a, "404"), new com.squareup.okhttp.internal.framed.e(e.a, "500"), new com.squareup.okhttp.internal.framed.e("accept-charset", ""), new com.squareup.okhttp.internal.framed.e("accept-encoding", "gzip, deflate"), new com.squareup.okhttp.internal.framed.e("accept-language", ""), new com.squareup.okhttp.internal.framed.e("accept-ranges", ""), new com.squareup.okhttp.internal.framed.e("accept", ""), new com.squareup.okhttp.internal.framed.e("access-control-allow-origin", ""), 
            new com.squareup.okhttp.internal.framed.e("age", ""), new com.squareup.okhttp.internal.framed.e("allow", ""), new com.squareup.okhttp.internal.framed.e("authorization", ""), new com.squareup.okhttp.internal.framed.e("cache-control", ""), new com.squareup.okhttp.internal.framed.e("content-disposition", ""), new com.squareup.okhttp.internal.framed.e("content-encoding", ""), new com.squareup.okhttp.internal.framed.e("content-language", ""), new com.squareup.okhttp.internal.framed.e("content-length", ""), new com.squareup.okhttp.internal.framed.e("content-location", ""), new com.squareup.okhttp.internal.framed.e("content-range", ""), 
            new com.squareup.okhttp.internal.framed.e("content-type", ""), new com.squareup.okhttp.internal.framed.e("cookie", ""), new com.squareup.okhttp.internal.framed.e("date", ""), new com.squareup.okhttp.internal.framed.e("etag", ""), new com.squareup.okhttp.internal.framed.e("expect", ""), new com.squareup.okhttp.internal.framed.e("expires", ""), new com.squareup.okhttp.internal.framed.e("from", ""), new com.squareup.okhttp.internal.framed.e("host", ""), new com.squareup.okhttp.internal.framed.e("if-match", ""), new com.squareup.okhttp.internal.framed.e("if-modified-since", ""), 
            new com.squareup.okhttp.internal.framed.e("if-none-match", ""), new com.squareup.okhttp.internal.framed.e("if-range", ""), new com.squareup.okhttp.internal.framed.e("if-unmodified-since", ""), new com.squareup.okhttp.internal.framed.e("last-modified", ""), new com.squareup.okhttp.internal.framed.e("link", ""), new com.squareup.okhttp.internal.framed.e("location", ""), new com.squareup.okhttp.internal.framed.e("max-forwards", ""), new com.squareup.okhttp.internal.framed.e("proxy-authenticate", ""), new com.squareup.okhttp.internal.framed.e("proxy-authorization", ""), new com.squareup.okhttp.internal.framed.e("range", ""), 
            new com.squareup.okhttp.internal.framed.e("referer", ""), new com.squareup.okhttp.internal.framed.e("refresh", ""), new com.squareup.okhttp.internal.framed.e("retry-after", ""), new com.squareup.okhttp.internal.framed.e("server", ""), new com.squareup.okhttp.internal.framed.e("set-cookie", ""), new com.squareup.okhttp.internal.framed.e("strict-transport-security", ""), new com.squareup.okhttp.internal.framed.e("transfer-encoding", ""), new com.squareup.okhttp.internal.framed.e("user-agent", ""), new com.squareup.okhttp.internal.framed.e("vary", ""), new com.squareup.okhttp.internal.framed.e("via", ""), 
            new com.squareup.okhttp.internal.framed.e("www-authenticate", "")
        });
        LinkedHashMap linkedhashmap = new LinkedHashMap(a.length);
        for (; i < a.length; i++)
        {
            if (!linkedhashmap.containsKey(a[i].h))
            {
                linkedhashmap.put(a[i].h, Integer.valueOf(i));
            }
        }

        b = Collections.unmodifiableMap(linkedhashmap);
    }
}
