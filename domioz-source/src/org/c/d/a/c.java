// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.d.a;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package org.c.d.a:
//            a

public final class c extends FilterInputStream
{

    private boolean a;
    private int b;
    private byte c[];
    private int d;
    private int e;
    private int f;
    private boolean g;
    private int h;
    private byte i[];

    public c(InputStream inputstream)
    {
        this(inputstream, 0);
    }

    public c(InputStream inputstream, int j)
    {
        boolean flag1 = true;
        super(inputstream);
        h = j;
        int k;
        boolean flag;
        if ((j & 8) > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
        if ((j & 1) > 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        a = flag;
        if (a)
        {
            k = 4;
        } else
        {
            k = 3;
        }
        d = k;
        c = new byte[d];
        b = -1;
        f = 0;
        i = org.c.d.a.a.a(j);
    }

    public final int read()
    {
        if (b >= 0) goto _L2; else goto _L1
_L1:
        if (!a) goto _L4; else goto _L3
_L3:
        byte abyte0[];
        int i1;
        abyte0 = new byte[3];
        int j = 0;
        i1 = 0;
        do
        {
            if (j >= 3)
            {
                break;
            }
            int k1 = in.read();
            if (k1 < 0)
            {
                break;
            }
            abyte0[j] = (byte)k1;
            i1++;
            j++;
        } while (true);
        if (i1 <= 0) goto _L6; else goto _L5
_L5:
        org.c.d.a.a.a(abyte0, i1, c, h);
        b = 0;
        e = 4;
_L2:
        if (b < 0) goto _L8; else goto _L7
_L7:
        if (b < e) goto _L9; else goto _L6
_L6:
        return -1;
_L4:
        int k;
        byte abyte1[] = new byte[4];
        k = 0;
        do
        {
            if (k >= 4)
            {
                break;
            }
            int j1;
            do
            {
                j1 = in.read();
            } while (j1 >= 0 && i[j1 & 0x7f] <= -5);
            if (j1 < 0)
            {
                break;
            }
            abyte1[k] = (byte)j1;
            k++;
        } while (true);
        if (k != 4)
        {
            continue; /* Loop/switch isn't completed */
        }
        e = org.c.d.a.a.a(abyte1, c, h);
        b = 0;
        continue; /* Loop/switch isn't completed */
        if (k == 0) goto _L6; else goto _L10
_L10:
        throw new IOException("Improperly padded Base64 input.");
_L9:
        if (a && g && f >= 76)
        {
            f = 0;
            return 10;
        }
        f = f + 1;
        byte abyte2[] = c;
        int l = b;
        b = l + 1;
        l = abyte2[l];
        if (b >= d)
        {
            b = -1;
        }
        return l & 0xff;
_L8:
        throw new IOException("Error in Base64 code reading stream.");
        if (true) goto _L2; else goto _L11
_L11:
    }

    public final int read(byte abyte0[], int j, int k)
    {
        int i1;
label0:
        {
            int l = 0;
            do
            {
                i1 = l;
                if (l >= k)
                {
                    break label0;
                }
                i1 = read();
                if (i1 < 0)
                {
                    break;
                }
                abyte0[j + l] = (byte)i1;
                l++;
            } while (true);
            i1 = l;
            if (l == 0)
            {
                i1 = -1;
            }
        }
        return i1;
    }
}
