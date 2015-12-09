// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.a.f;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.android.slyce.report.a.f:
//            a

public class b extends FilterOutputStream
{

    private boolean a;
    private int b;
    private byte c[];
    private int d;
    private int e;
    private boolean f;
    private byte g[];
    private boolean h;
    private int i;
    private byte j[];

    public b(OutputStream outputstream, int k)
    {
        boolean flag1 = true;
        super(outputstream);
        int l;
        boolean flag;
        if ((k & 8) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
        if ((k & 1) != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        a = flag;
        if (a)
        {
            l = 3;
        } else
        {
            l = 4;
        }
        d = l;
        c = new byte[d];
        b = 0;
        e = 0;
        h = false;
        g = new byte[4];
        i = k;
        j = com.android.slyce.report.a.f.a.a(k);
    }

    public void a()
    {
label0:
        {
            if (b > 0)
            {
                if (!a)
                {
                    break label0;
                }
                out.write(com.android.slyce.report.a.f.a.a(g, c, b, i));
                b = 0;
            }
            return;
        }
        throw new IOException("Base64 input not properly padded.");
    }

    public void close()
    {
        a();
        super.close();
        c = null;
        out = null;
    }

    public void write(int k)
    {
        if (!h) goto _L2; else goto _L1
_L1:
        out.write(k);
_L4:
        return;
_L2:
        if (!a)
        {
            break; /* Loop/switch isn't completed */
        }
        byte abyte0[] = c;
        int l = b;
        b = l + 1;
        abyte0[l] = (byte)k;
        if (b >= d)
        {
            out.write(com.android.slyce.report.a.f.a.a(g, c, d, i));
            e = e + 4;
            if (f && e >= 76)
            {
                out.write(10);
                e = 0;
            }
            b = 0;
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (j[k & 0x7f] <= -5)
        {
            continue; /* Loop/switch isn't completed */
        }
        byte abyte1[] = c;
        int i1 = b;
        b = i1 + 1;
        abyte1[i1] = (byte)k;
        if (b < d) goto _L4; else goto _L5
_L5:
        k = com.android.slyce.report.a.f.a.a(c, 0, g, 0, i);
        out.write(g, 0, k);
        b = 0;
        return;
        if (j[k & 0x7f] == -5) goto _L4; else goto _L6
_L6:
        throw new IOException("Invalid character in Base64 data.");
    }

    public void write(byte abyte0[], int k, int l)
    {
        if (h)
        {
            out.write(abyte0, k, l);
        } else
        {
            int i1 = 0;
            while (i1 < l) 
            {
                write(abyte0[k + i1]);
                i1++;
            }
        }
    }
}
