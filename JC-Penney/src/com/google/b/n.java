// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;


// Referenced classes of package com.google.b:
//            i

public final class n extends i
{

    private final byte a[];
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    public n(byte abyte0[], int j, int k, int l, int i1, int j1, int k1, 
            boolean flag)
    {
        super(j1, k1);
        if (l + j1 > j || i1 + k1 > k)
        {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        a = abyte0;
        b = j;
        c = k;
        d = l;
        e = i1;
        if (flag)
        {
            a(j1, k1);
        }
    }

    private void a(int j, int k)
    {
        byte abyte0[] = a;
        int l = e;
        int i1 = b;
        l = d + l * i1;
        for (int j1 = 0; j1 < k; j1++)
        {
            int i2 = j / 2;
            int k1 = (l + j) - 1;
            for (int l1 = l; l1 < l + i2;)
            {
                byte byte0 = abyte0[l1];
                abyte0[l1] = abyte0[k1];
                abyte0[k1] = byte0;
                l1++;
                k1--;
            }

            l += b;
        }

    }

    public byte[] a()
    {
        int j;
        int l;
        int i1;
        j = 0;
        l = b();
        i1 = c();
        if (l != b || i1 != c) goto _L2; else goto _L1
_L1:
        byte abyte0[] = a;
_L4:
        return abyte0;
_L2:
        int j1 = l * i1;
        byte abyte1[] = new byte[j1];
        int k = e * b + d;
        if (l == b)
        {
            System.arraycopy(a, k, abyte1, 0, j1);
            return abyte1;
        }
        byte abyte2[] = a;
        do
        {
            abyte0 = abyte1;
            if (j >= i1)
            {
                continue;
            }
            System.arraycopy(abyte2, k, abyte1, j * l, l);
            k += b;
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public byte[] a(int j, byte abyte0[])
    {
        byte abyte1[];
        int k;
label0:
        {
            if (j < 0 || j >= c())
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Requested row is outside the image: ").append(j).toString());
            }
            k = b();
            if (abyte0 != null)
            {
                abyte1 = abyte0;
                if (abyte0.length >= k)
                {
                    break label0;
                }
            }
            abyte1 = new byte[k];
        }
        int l = e;
        int i1 = b;
        int j1 = d;
        System.arraycopy(a, (l + j) * i1 + j1, abyte1, 0, k);
        return abyte1;
    }
}
