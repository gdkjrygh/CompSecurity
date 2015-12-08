// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.scan;

import kik.android.util.bx;

public final class c
{

    private final byte a[];
    private final int b;
    private final int c;
    private final int d = 0;
    private final int e = 0;
    private final int f;
    private final int g;

    public c(byte abyte0[], int i, int j, int k, int l)
    {
        f = k;
        g = l;
        if (k + 0 > i || l + 0 > j)
        {
            bx.d(new IllegalArgumentException("Crop rectangle does not fit within image data."));
        }
        a = abyte0;
        b = i;
        c = j;
    }

    public final byte[] a()
    {
        int i;
        int k;
        int l;
        i = 0;
        k = f;
        l = g;
        if (k != b || l != c) goto _L2; else goto _L1
_L1:
        byte abyte0[] = a;
_L4:
        return abyte0;
_L2:
        int i1 = k * l;
        byte abyte1[] = new byte[i1];
        int j = e * b + d;
        if (k == b)
        {
            System.arraycopy(a, j, abyte1, 0, i1);
            return abyte1;
        }
        byte abyte2[] = a;
        do
        {
            abyte0 = abyte1;
            if (i >= l)
            {
                continue;
            }
            System.arraycopy(abyte2, j, abyte1, i * k, k);
            j += b;
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
