// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj;


// Referenced classes of package ar.com.hjg.pngj:
//            j, h, m, o

public final class p
    implements j
{

    public final m a;
    protected final int b[];
    protected final int c;
    protected h d;

    public p(m m1)
    {
        this(m1, (byte)0);
    }

    private p(m m1, byte byte0)
    {
        d = h.o;
        a = m1;
        d = h.o;
        c = m1.l;
        b = new int[c];
    }

    public final void a(byte abyte0[], int i, int k, int l)
    {
        d = h.a(abyte0[0]);
        int k2 = i - 1;
        int l3 = (l - 1) * a.d;
        if (a.c == 8)
        {
            if (l == 1)
            {
                for (i = 0; i < c; i++)
                {
                    b[i] = abyte0[i + 1] & 0xff;
                }

            } else
            {
                l = 1;
                boolean flag = false;
                i = k * a.d;
                k = ((flag) ? 1 : 0);
                while (l <= k2) 
                {
                    b[i] = abyte0[l] & 0xff;
                    int l1 = k + 1;
                    k = l1;
                    int i1 = i;
                    if (l1 == a.d)
                    {
                        k = 0;
                        i1 = i + l3;
                    }
                    l++;
                    i = i1 + 1;
                }
            }
        } else
        if (a.c == 16)
        {
            if (l == 1)
            {
                i = 0;
                k = 1;
                for (; i < c; i++)
                {
                    int ai[] = b;
                    l = k + 1;
                    byte byte0 = abyte0[k];
                    k = l + 1;
                    ai[i] = (byte0 & 0xff) << 8 | abyte0[l] & 0xff;
                }

            } else
            {
                boolean flag1 = false;
                if (k != 0)
                {
                    i = k * a.d;
                } else
                {
                    i = 0;
                }
                l = 1;
                k = ((flag1) ? 1 : 0);
                int i2;
                for (; l <= k2; l = i2 + 1)
                {
                    int ai1[] = b;
                    i2 = l + 1;
                    ai1[i] = (abyte0[l] & 0xff) << 8 | abyte0[i2] & 0xff;
                    int j1 = k + 1;
                    k = j1;
                    l = i;
                    if (j1 == a.d)
                    {
                        k = 0;
                        l = i + l3;
                    }
                    i = l + 1;
                }

            }
        } else
        {
            int i4 = a.c;
            int k3 = o.a(i4);
            k *= a.d;
            int k1 = 1;
            l = 0;
label0:
            for (; k1 < i; k1++)
            {
                int j3 = k3;
                int j2 = 8 - i4;
                int i3 = k;
                int l2 = l;
                do
                {
                    b[i3] = (abyte0[k1] & j3) >> j2;
                    j3 >>= i4;
                    j2 -= i4;
                    i3++;
                    l2++;
                    l = l2;
                    k = i3;
                    if (l2 == a.d)
                    {
                        l = 0;
                        k = i3 + l3;
                    }
                    if (j3 == 0)
                    {
                        continue label0;
                    }
                    l2 = l;
                    i3 = k;
                } while (k < c);
            }

        }
    }

    public final int[] a()
    {
        return b;
    }

    public final String toString()
    {
        return (new StringBuilder(" cols=")).append(a.a).append(" bpc=").append(a.c).append(" size=").append(b.length).toString();
    }
}
