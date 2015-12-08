// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj;


// Referenced classes of package ar.com.hjg.pngj:
//            j, h, m, o

public final class n
    implements j
{

    public final m a;
    final byte b[];
    final byte c[];
    protected h d;
    final int e;

    public final void a(byte abyte0[], int i, int k, int l)
    {
        int k2;
        int l3;
        d = h.a(abyte0[0]);
        k2 = i - 1;
        l3 = (l - 1) * a.d;
        if (a.c != 8) goto _L2; else goto _L1
_L1:
        if (l == 1)
        {
            System.arraycopy(abyte0, 1, b, 0, k2);
        } else
        {
            l = 1;
            boolean flag = false;
            i = k * a.d;
            k = ((flag) ? 1 : 0);
            while (l <= k2) 
            {
                b[i] = abyte0[l];
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
_L4:
        return;
_L2:
        if (a.c != 16)
        {
            break; /* Loop/switch isn't completed */
        }
        if (l == 1)
        {
            i = 0;
            k = 1;
            while (i < a.l) 
            {
                byte abyte1[] = b;
                l = k + 1;
                abyte1[i] = abyte0[k];
                abyte1 = c;
                k = l + 1;
                abyte1[i] = abyte0[l];
                i++;
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
            while (l <= k2) 
            {
                byte abyte2[] = b;
                int i2 = l + 1;
                abyte2[i] = abyte0[l];
                abyte2 = c;
                int j1 = i2 + 1;
                abyte2[i] = abyte0[i2];
                i2 = k + 1;
                k = i2;
                l = i;
                if (i2 == a.d)
                {
                    k = 0;
                    l = i + l3;
                }
                i = l + 1;
                l = j1;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        int i4 = a.c;
        int k3 = o.a(i4);
        k *= a.d;
        int k1 = 1;
        l = 0;
        while (k1 < i) 
        {
            int j3 = k3;
            int j2 = 8 - i4;
            int i3 = k;
            int l2 = l;
            do
            {
                b[i3] = (byte)((abyte0[k1] & j3) >> j2);
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
                    break;
                }
                l2 = l;
                i3 = k;
            } while (k < e);
            k1++;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public final String toString()
    {
        return (new StringBuilder(" cols=")).append(a.a).append(" bpc=").append(a.c).append(" size=").append(b.length).toString();
    }
}
