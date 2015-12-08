// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import java.io.OutputStream;

// Referenced classes of package com.b.a:
//            aa, m

public class z
{

    static final boolean g;
    public final m a;
    protected m b;
    protected int c;
    public final int d;
    public final OutputStream e;
    public final aa f;

    public z(m m1)
    {
        this(m1, (byte)0);
    }

    private z(m m1, byte byte0)
    {
        c = 0;
        b = m1;
        a = m1;
        d = 512;
        e = null;
        f = aa.a;
    }

    public final byte[] a()
    {
        m m1 = a;
        int i = 0;
        byte abyte0[] = new byte[c];
        m m2;
        do
        {
            int k = m1.c - m1.b;
            int j = i;
            if (k > 0)
            {
                System.arraycopy(m1.a, m1.b, abyte0, i, k);
                j = i + k;
            }
            m2 = m1.d;
            i = j;
            m1 = m2;
        } while (m2 != null);
        return abyte0;
    }

    static 
    {
        boolean flag;
        if (!com/b/a/z.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
    }
}
