// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bc;

import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.ac.c;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bo.am;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.bo.k;
import com.google.android.m4b.maps.bq.i;
import com.google.android.m4b.maps.bw.d;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

// Referenced classes of package com.google.android.m4b.maps.bc:
//            c, d, a

public final class b
    implements ba
{

    private final ac a;
    private final int b;
    private final long c;
    private final com.google.android.m4b.maps.bc.c d[];

    private b(ac ac1, a a1, long l)
    {
        a = ac1;
        b = a1.d(1);
        c = l;
        d = new com.google.android.m4b.maps.bc.c[a1.j(2)];
        a(a1, a(a1));
        b(a1);
    }

    public static int a(byte abyte0[], int j)
    {
        abyte0 = new com.google.android.m4b.maps.ad.a(abyte0);
        abyte0.skipBytes(j);
        j = abyte0.readInt();
        if (j != 0x45504752)
        {
            throw new IOException((new StringBuilder(41)).append("FORMAT_MAGIC expected. Found: ").append(j).toString());
        }
        j = abyte0.readUnsignedShort();
        if (j != 1)
        {
            abyte0 = String.valueOf("Version mismatch: 1 expected, ");
            throw new IOException((new StringBuilder(String.valueOf(abyte0).length() + 17)).append(abyte0).append(j).append(" found").toString());
        } else
        {
            return abyte0.readInt();
        }
    }

    public static b a(ac ac1, byte abyte0[], int j, long l)
    {
        Inflater inflater;
        int k1;
        int j1 = a(abyte0, j);
        k1 = j + 10;
        byte abyte1[] = new byte[32];
        i.a(ac1.b, ac1.c, ac1.a, j1, abyte1);
        i i1 = new i();
        System.arraycopy(i.a, 0, i1.b, 0, 256);
        j1 = 0;
        for (j = 0; j < 256; j++)
        {
            j1 = j1 + i1.b[j] + abyte1[j & 0x1f] & 0xff;
            byte byte0 = i1.b[j];
            i1.b[j] = i1.b[j1];
            i1.b[j1] = byte0;
        }

        i1.c = 0;
        i1.d = 0;
        i1.a();
        i1.a(abyte0, k1, abyte0.length - k1);
        j = abyte0.length;
        inflater = new Inflater(true);
        Object obj = com.google.android.m4b.maps.bw.d.a(abyte0, k1, j - k1);
        abyte0 = ((com.google.android.m4b.maps.bw.d.a) (obj)).a;
        j = ((com.google.android.m4b.maps.bw.d.a) (obj)).b;
        obj = new a(com.google.android.m4b.maps.bz.b.a);
        ((a) (obj)).a(new ByteArrayInputStream(abyte0), j);
        ac1 = new b(ac1, ((a) (obj)), l);
        inflater.end();
        return ac1;
        ac1;
        throw new IOException(ac1.getMessage());
        ac1;
        inflater.end();
        throw ac1;
    }

    private void a(a a1, g ag[])
    {
        int j1 = 0;
        while (j1 < d.length / 2) 
        {
            int i2 = j1 * 2;
            int j2 = j1 * 2 + 1;
            a a3 = a1.c(2, i2);
            int k2 = com.google.android.m4b.maps.ac.c.a(a3, 2);
            a a4 = a1.c(2, j2);
            int l2 = com.google.android.m4b.maps.ac.c.a(a4, 2);
            byte abyte0[] = null;
            a a2 = a1.c(3, j1);
            if (a2.i(1))
            {
                abyte0 = a2.c(1);
            }
            int i3 = com.google.android.m4b.maps.ac.c.a(a2, 2, 0);
            int j3 = com.google.android.m4b.maps.ac.c.a(a2, 3, 0);
            int i1 = a3.j(3);
            com.google.android.m4b.maps.bc.d ad[];
            boolean flag;
            if (j3 == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (i1 > 0)
            {
                com.google.android.m4b.maps.bc.d ad1[] = new com.google.android.m4b.maps.bc.d[i1];
                int j = 0;
                do
                {
                    ad = ad1;
                    if (j >= i1)
                    {
                        break;
                    }
                    a a5 = a1.c(5, a3.b(3, j));
                    ad = null;
                    if (a5.i(2))
                    {
                        ad = a5.g(2).intern();
                    }
                    ad1[j] = new com.google.android.m4b.maps.bc.d(a5.g(1).intern(), ad, flag);
                    j++;
                } while (true);
            } else
            {
                ad = new com.google.android.m4b.maps.bc.d[1];
                ad[0] = com.google.android.m4b.maps.bc.c.a;
            }
            g g1 = ag[j2];
            g g2 = ag[i2];
            Object obj;
            com.google.android.m4b.maps.bo.k.a a6;
            int l;
            int k1;
            int l1;
            if (abyte0 != null)
            {
                obj = new DataInputStream(new ByteArrayInputStream(abyte0));
                l = am.a(((java.io.DataInput) (obj)));
            } else
            {
                obj = null;
                l = 0;
            }
            a6 = new com.google.android.m4b.maps.bo.k.a(l + 2);
            if (g1 != null)
            {
                a6.a(g1);
            }
            l1 = 0;
            k1 = 0;
            for (i1 = 0; i1 < l; i1++)
            {
                l1 += am.b(((java.io.DataInput) (obj)));
                k1 += am.b(((java.io.DataInput) (obj)));
                a6.a(com.google.android.m4b.maps.bo.g.c(l1, k1));
            }

            if (g2 != null)
            {
                a6.a(g2);
            }
            obj = a6.a();
            if (g1 == null && g2 == null)
            {
                a1 = String.valueOf("Both polyline endpoints are missing for segment: ");
                ag = String.valueOf(d[i2]);
                obj = String.valueOf(a);
                throw new IOException((new StringBuilder(String.valueOf(a1).length() + 10 + String.valueOf(ag).length() + String.valueOf(obj).length())).append(a1).append(ag).append(" in tile: ").append(((String) (obj))).toString());
            }
            if (g1 == null)
            {
                i1 = 2;
                l = 5;
            } else
            if (g2 == null)
            {
                i1 = 1;
                l = 6;
            } else
            {
                l = 4;
                i1 = 0;
            }
            if ((com.google.android.m4b.maps.ac.c.a(a3, 4, 0) & 1) != 0)
            {
                i1 |= 8;
            }
            if ((com.google.android.m4b.maps.ac.c.a(a4, 4, 0) & 1) != 0)
            {
                l |= 8;
            }
            d[i2] = new com.google.android.m4b.maps.bc.c(com.google.android.m4b.maps.bc.c.a(a, i2), ad, ((k) (obj)), i1, k2, j3, i3);
            d[j2] = new com.google.android.m4b.maps.bc.c(com.google.android.m4b.maps.bc.c.a(a, j2), ad, ((k) (obj)), l, l2, j3, i3);
            if (((k) (obj)).a.length / 3 < 2)
            {
                a1 = String.valueOf("Segment polyline had fewer than two points for segment: ");
                ag = String.valueOf(d[i2]);
                obj = String.valueOf(a);
                throw new IOException((new StringBuilder(String.valueOf(a1).length() + 10 + String.valueOf(ag).length() + String.valueOf(obj).length())).append(a1).append(ag).append(" in tile: ").append(((String) (obj))).toString());
            }
            j1++;
        }
    }

    private static int[] a(byte abyte0[])
    {
        abyte0 = new DataInputStream(new ByteArrayInputStream(abyte0));
        int l = am.a(abyte0);
        int ai[] = new int[l];
        for (int j = 0; j < l; j++)
        {
            ai[j] = am.a(abyte0);
        }

        return ai;
    }

    private g[] a(a a1)
    {
        g ag[] = new g[d.length];
        int i1 = a1.j(4);
        for (int j = 0; j < i1; j++)
        {
            a a2 = a1.c(4, j);
            g g1 = com.google.android.m4b.maps.bo.g.a(a2.d(1), a2.d(2));
            int ai[] = a(a2.c(3));
            for (int l = 0; l < ai.length; l++)
            {
                ag[ai[l]] = g1;
            }

        }

        return ag;
    }

    private void b(a a1)
    {
        int k2 = a1.j(4);
        new g();
        new g();
label0:
        for (int l = 0; l < k2; l++)
        {
            a a2 = a1.c(4, l);
            int ai[] = a(a2.c(3));
            int ai1[] = a(a2.c(4));
            int i1 = 0;
            com.google.android.m4b.maps.bc.a aa[] = new com.google.android.m4b.maps.bc.a[ai.length];
            int j = 0;
            do
            {
                if (j >= ai.length)
                {
                    continue label0;
                }
                com.google.android.m4b.maps.bc.c c1 = d[ai[j]];
                int j1 = 0;
                boolean flag = false;
                int k1 = j;
                j = ((flag) ? 1 : 0);
                while (j < ai.length) 
                {
                    int l1;
                    int i2;
                    int j2;
                    if (i1 >= ai1.length)
                    {
                        j2 = ai.length;
                        i2 = j2;
                        l1 = j1;
                    } else
                    {
                        int l2 = ai1[i1];
                        j2 = j;
                        l1 = j1;
                        i2 = k1;
                        if (l2 != 0)
                        {
                            aa[j1] = new com.google.android.m4b.maps.bc.a(d[ai[j] ^ 1], l2);
                            l1 = j1 + 1;
                            j2 = j;
                            i2 = k1;
                        }
                    }
                    j = j2 + 1;
                    i1++;
                    j1 = l1;
                    k1 = i2;
                }
                com.google.android.m4b.maps.bc.a aa1[] = new com.google.android.m4b.maps.bc.a[j1];
                System.arraycopy(aa, 0, aa1, 0, aa1.length);
                if (aa1.length == 0)
                {
                    c1.c = c.b;
                } else
                {
                    c1.c = aa1;
                }
                j = k1 + 1;
            } while (true);
        }

    }

    public final ac a()
    {
        return a;
    }

    public final ah b()
    {
        return ah.i;
    }

    public final int c()
    {
        return b;
    }

    public final boolean d()
    {
        return c >= 0L && com.google.android.m4b.maps.ay.k.c() > c;
    }

    public final int e()
    {
        return -1;
    }

    public final boolean f()
    {
        return false;
    }

    public final void g()
    {
    }

    public final boolean h()
    {
        return false;
    }

    public final long m()
    {
        return c;
    }

    public final long o()
    {
        return -1L;
    }
}
