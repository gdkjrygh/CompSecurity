// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.b;

import c.e;
import c.h;
import c.i;
import c.o;
import c.y;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.c.a.a.b:
//            d, h

final class f
{
    static final class a
    {

        final List a = new ArrayList();
        final h b;
        int c;
        int d;
        d e[];
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

        static boolean c(int j)
        {
            return j >= 0 && j <= f.a().length - 1;
        }

        private int d()
            throws IOException
        {
            return b.e() & 0xff;
        }

        private int d(int j)
        {
            int k = 0;
            boolean flag = false;
            if (j > 0)
            {
                k = e.length - 1;
                int l = j;
                j = ((flag) ? 1 : 0);
                for (; k >= f && l > 0; k--)
                {
                    l -= e[k].j;
                    h = h - e[k].j;
                    g = g - 1;
                    j++;
                }

                System.arraycopy(e, f + 1, e, f + 1 + j, g);
                f = f + j;
                k = j;
            }
            return k;
        }

        final int a(int j)
        {
            return f + 1 + j;
        }

        final int a(int j, int k)
            throws IOException
        {
            j &= k;
            if (j < k)
            {
                return j;
            }
            j = 0;
            do
            {
                int l = d();
                if ((l & 0x80) != 0)
                {
                    k += (l & 0x7f) << j;
                    j += 7;
                } else
                {
                    return (l << j) + k;
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

        final void a(d d1)
        {
            a.add(d1);
            int j = d1.j;
            if (j > d)
            {
                c();
                return;
            }
            d((h + j) - d);
            if (g + 1 > e.length)
            {
                d ad[] = new d[e.length * 2];
                System.arraycopy(e, 0, ad, e.length, e.length);
                f = e.length - 1;
                e = ad;
            }
            int k = f;
            f = k - 1;
            e[k] = d1;
            g = g + 1;
            h = j + h;
        }

        final i b()
            throws IOException
        {
            int k = 0;
            int l = d();
            int j;
            if ((l & 0x80) == 128)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            l = a(l, 127);
            if (j != 0)
            {
                com.c.a.a.b.h h1 = com.c.a.a.b.h.a();
                byte abyte0[] = b.e(l);
                ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
                h.a a1 = h1.a;
                l = 0;
                j = 0;
                h.a a3;
                int i1;
                do
                {
                    i1 = j;
                    a3 = a1;
                    if (k >= abyte0.length)
                    {
                        break;
                    }
                    l = l << 8 | abyte0[k] & 0xff;
                    for (j += 8; j >= 8;)
                    {
                        a1 = a1.a[l >>> j - 8 & 0xff];
                        if (a1.a == null)
                        {
                            bytearrayoutputstream.write(a1.b);
                            j -= a1.c;
                            a1 = h1.a;
                        } else
                        {
                            j -= 8;
                        }
                    }

                    k++;
                } while (true);
                do
                {
                    if (i1 <= 0)
                    {
                        break;
                    }
                    h.a a2 = a3.a[l << 8 - i1 & 0xff];
                    if (a2.a != null || a2.c > i1)
                    {
                        break;
                    }
                    bytearrayoutputstream.write(a2.b);
                    i1 -= a2.c;
                    a3 = h1.a;
                } while (true);
                return i.a(bytearrayoutputstream.toByteArray());
            } else
            {
                return b.c(l);
            }
        }

        final i b(int j)
        {
            if (c(j))
            {
                return f.a()[j].h;
            } else
            {
                return e[a(j - f.a().length)].h;
            }
        }

        a(y y)
        {
            e = new d[8];
            f = e.length - 1;
            g = 0;
            h = 0;
            c = 4096;
            d = 4096;
            b = o.a(y);
        }
    }

    static final class b
    {

        private final e a;

        private void a(int j, int k)
            throws IOException
        {
            if (j < k)
            {
                a.a(j | 0);
                return;
            }
            a.a(k | 0);
            for (j -= k; j >= 128; j >>>= 7)
            {
                a.a(j & 0x7f | 0x80);
            }

            a.a(j);
        }

        private void a(i j)
            throws IOException
        {
            a(j.c.length, 127);
            a.a(j);
        }

        final void a(List list)
            throws IOException
        {
            int l = list.size();
            int k = 0;
            while (k < l) 
            {
                i j = ((d)list.get(k)).h.c();
                Integer integer = (Integer)f.b().get(j);
                if (integer != null)
                {
                    a(integer.intValue() + 1, 15);
                    a(((d)list.get(k)).i);
                } else
                {
                    a.a(0);
                    a(j);
                    a(((d)list.get(k)).i);
                }
                k++;
            }
        }

        b(e e1)
        {
            a = e1;
        }
    }


    private static final d a[];
    private static final Map b;

    static i a(i j)
        throws IOException
    {
        int k = 0;
        for (int l = j.c.length; k < l; k++)
        {
            byte byte0 = j.c[k];
            if (byte0 >= 65 && byte0 <= 90)
            {
                throw new IOException((new StringBuilder("PROTOCOL_ERROR response malformed: mixed case name: ")).append(j.a()).toString());
            }
        }

        return j;
    }

    static d[] a()
    {
        return a;
    }

    static Map b()
    {
        return b;
    }

    static 
    {
        int j = 0;
        a = (new d[] {
            new d(com.c.a.a.b.d.e, ""), new d(d.b, "GET"), new d(d.b, "POST"), new d(d.c, "/"), new d(d.c, "/index.html"), new d(d.d, "http"), new d(d.d, "https"), new d(d.a, "200"), new d(d.a, "204"), new d(d.a, "206"), 
            new d(d.a, "304"), new d(d.a, "400"), new d(d.a, "404"), new d(d.a, "500"), new d("accept-charset", ""), new d("accept-encoding", "gzip, deflate"), new d("accept-language", ""), new d("accept-ranges", ""), new d("accept", ""), new d("access-control-allow-origin", ""), 
            new d("age", ""), new d("allow", ""), new d("authorization", ""), new d("cache-control", ""), new d("content-disposition", ""), new d("content-encoding", ""), new d("content-language", ""), new d("content-length", ""), new d("content-location", ""), new d("content-range", ""), 
            new d("content-type", ""), new d("cookie", ""), new d("date", ""), new d("etag", ""), new d("expect", ""), new d("expires", ""), new d("from", ""), new d("host", ""), new d("if-match", ""), new d("if-modified-since", ""), 
            new d("if-none-match", ""), new d("if-range", ""), new d("if-unmodified-since", ""), new d("last-modified", ""), new d("link", ""), new d("location", ""), new d("max-forwards", ""), new d("proxy-authenticate", ""), new d("proxy-authorization", ""), new d("range", ""), 
            new d("referer", ""), new d("refresh", ""), new d("retry-after", ""), new d("server", ""), new d("set-cookie", ""), new d("strict-transport-security", ""), new d("transfer-encoding", ""), new d("user-agent", ""), new d("vary", ""), new d("via", ""), 
            new d("www-authenticate", "")
        });
        LinkedHashMap linkedhashmap = new LinkedHashMap(a.length);
        for (; j < a.length; j++)
        {
            if (!linkedhashmap.containsKey(a[j].h))
            {
                linkedhashmap.put(a[j].h, Integer.valueOf(j));
            }
        }

        b = Collections.unmodifiableMap(linkedhashmap);
    }
}
