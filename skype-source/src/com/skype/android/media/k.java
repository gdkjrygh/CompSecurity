// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import java.util.Arrays;

// Referenced classes of package com.skype.android.media:
//            Size

final class k
{

    private byte a[];
    private int b;
    private int c;
    private Size d;
    private Size e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;

    k(boolean flag, int j, Size size, Size size1, int l, boolean flag1, int i1)
    {
        h = flag;
        b = j;
        d = size;
        e = size1;
        c = l;
        f = flag1;
        g = true;
        i = i1;
    }

    public final byte[] a(byte abyte0[])
    {
        Size size = d;
        if (d.a() < d.b())
        {
            size = d.c();
            g = true;
        }
        int l2 = size.a();
        int k3 = size.b();
        int i3 = e.a();
        int j3 = e.b();
        int j = (c * j3 * 3) / 2 + i;
        if (a == null || a.length != j)
        {
            a = new byte[j];
        }
        Arrays.fill(a, (byte)-128);
        int k1 = (l2 - i3) / 2 + ((k3 - j3) * l2) / 2;
        int i1 = 0;
        j = i1;
        if (f)
        {
            j = i1;
            if (g)
            {
                j = c * j3 - c;
            }
        }
        i1 = 0;
        while (i1 < j3) 
        {
            if (f && !g)
            {
                byte abyte1[] = Arrays.copyOfRange(abyte0, k1, k1 + i3);
                int i2 = 0;
                for (int k2 = abyte1.length - 1; k2 > i2; i2++)
                {
                    byte byte0 = abyte1[k2];
                    abyte1[k2] = abyte1[i2];
                    abyte1[i2] = byte0;
                    k2--;
                }

                System.arraycopy(abyte1, 0, a, j, i3);
            } else
            {
                System.arraycopy(abyte0, k1, a, j, i3);
            }
            k1 += l2;
            if (f && g)
            {
                j -= c;
            } else
            {
                j += c;
            }
            i1++;
        }
label0:
        switch (b)
        {
        default:
            byte abyte2[] = a;
            int j1 = l2 * k3 + (l2 - i3) / 2 + ((k3 - j3) * l2) / 2;
            int l = c * j3 + i;
            if (f)
            {
                l = ((c * j3 * 3) / 2 + i) - c;
            }
            int l1 = 0;
            do
            {
                if (l1 >= j3 / 2)
                {
                    break label0;
                }
                int j2 = 0;
                while (j2 < i3 / 2) 
                {
                    byte byte1;
                    if (h)
                    {
                        byte1 = abyte0[j1];
                    } else
                    {
                        byte1 = abyte0[j1 + 1];
                    }
                    abyte2[l] = byte1;
                    if (h)
                    {
                        byte1 = abyte0[j1 + 1];
                    } else
                    {
                        byte1 = abyte0[j1];
                    }
                    abyte2[l + 1] = byte1;
                    j2++;
                    l += 2;
                    j1 += 2;
                }
                j2 = j1 + (l2 - i3);
                j1 = l;
                if (f)
                {
                    j1 = l - c * 2;
                }
                l = (c - i3) + j1;
                l1++;
                j1 = j2;
            } while (true);

        case 19: // '\023'
            abyte2 = a;
            j1 = l2 * k3 + (l2 - i3) / 2 + ((k3 - j3) * l2) / 2;
            l1 = c * j3 + i + (j3 / 4) * i3;
            l = l1;
            if (f)
            {
                l = l1;
                if (g)
                {
                    l = ((c * j3 * 3) / 2 + i) - c;
                }
            }
            for (l1 = 0; l1 < j3 / 4;)
            {
                for (j2 = 0; j2 < i3 / 2;)
                {
                    abyte2[l] = abyte0[j1];
                    abyte2[l + 1] = abyte0[j1 + 1];
                    j2++;
                    l += 2;
                    j1 += 2;
                }

                j2 = j1 + (l2 - i3);
                j1 = l;
                if (f)
                {
                    j1 = l;
                    if (g)
                    {
                        j1 = l - c * 2;
                    }
                }
                l = (c - i3) + j1;
                l1++;
                j1 = j2;
            }

            j1 = l2 * k3 + (l2 * k3) / 4 + (l2 - i3) / 2 + ((k3 - j3) * l2) / 2;
            l1 = c * j3 + i;
            l = l1;
            if (f)
            {
                l = l1;
                if (g)
                {
                    l = ((c * j3 * 5) / 4 + i) - c;
                }
            }
            for (l1 = 0; l1 < j3 / 4;)
            {
                for (j2 = 0; j2 < i3 / 2;)
                {
                    abyte2[l] = abyte0[j1];
                    abyte2[l + 1] = abyte0[j1 + 1];
                    j2++;
                    l += 2;
                    j1 += 2;
                }

                j2 = j1 + (l2 - i3);
                j1 = l;
                if (f)
                {
                    j1 = l;
                    if (g)
                    {
                        j1 = l - c * 2;
                    }
                }
                l = (c - i3) + j1;
                l1++;
                j1 = j2;
            }

            break;
        }
        return a;
    }
}
