// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            qv, qp, qo, qx

public abstract class qw
{

    protected volatile int azh;

    public qw()
    {
        azh = -1;
    }

    public static final qw a(qw qw1, byte abyte0[])
        throws qv
    {
        return b(qw1, abyte0, 0, abyte0.length);
    }

    public static final void a(qw qw1, byte abyte0[], int i, int j)
    {
        try
        {
            abyte0 = qp.b(abyte0, i, j);
            qw1.a(((qp) (abyte0)));
            abyte0.rP();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (qw qw1)
        {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", qw1);
        }
    }

    public static final qw b(qw qw1, byte abyte0[], int i, int j)
        throws qv
    {
        try
        {
            abyte0 = qo.a(abyte0, i, j);
            qw1.b(((qo) (abyte0)));
            abyte0.gP(0);
        }
        // Misplaced declaration of an exception variable
        catch (qw qw1)
        {
            throw qw1;
        }
        // Misplaced declaration of an exception variable
        catch (qw qw1)
        {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
        return qw1;
    }

    public static final byte[] f(qw qw1)
    {
        byte abyte0[] = new byte[qw1.rZ()];
        a(qw1, abyte0, 0, abyte0.length);
        return abyte0;
    }

    public void a(qp qp1)
        throws IOException
    {
    }

    public abstract qw b(qo qo1)
        throws IOException;

    protected int c()
    {
        return 0;
    }

    public int rY()
    {
        if (azh < 0)
        {
            rZ();
        }
        return azh;
    }

    public int rZ()
    {
        int i = c();
        azh = i;
        return i;
    }

    public String toString()
    {
        return qx.g(this);
    }
}
