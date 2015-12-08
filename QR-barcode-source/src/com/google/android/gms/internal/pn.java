// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            pm, pg, pf, po

public abstract class pn
{

    protected volatile int awU;

    public pn()
    {
        awU = -1;
    }

    public static final pn a(pn pn1, byte abyte0[])
        throws pm
    {
        return b(pn1, abyte0, 0, abyte0.length);
    }

    public static final void a(pn pn1, byte abyte0[], int i, int j)
    {
        try
        {
            abyte0 = pg.b(abyte0, i, j);
            pn1.a(((pg) (abyte0)));
            abyte0.qy();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (pn pn1)
        {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", pn1);
        }
    }

    public static final pn b(pn pn1, byte abyte0[], int i, int j)
        throws pm
    {
        try
        {
            abyte0 = pf.a(abyte0, i, j);
            pn1.b(((pf) (abyte0)));
            abyte0.gm(0);
        }
        // Misplaced declaration of an exception variable
        catch (pn pn1)
        {
            throw pn1;
        }
        // Misplaced declaration of an exception variable
        catch (pn pn1)
        {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
        return pn1;
    }

    public static final byte[] f(pn pn1)
    {
        byte abyte0[] = new byte[pn1.qI()];
        a(pn1, abyte0, 0, abyte0.length);
        return abyte0;
    }

    public void a(pg pg1)
        throws IOException
    {
    }

    public abstract pn b(pf pf1)
        throws IOException;

    protected int c()
    {
        return 0;
    }

    public int qH()
    {
        if (awU < 0)
        {
            qI();
        }
        return awU;
    }

    public int qI()
    {
        int i = c();
        awU = i;
        return i;
    }

    public String toString()
    {
        return po.g(this);
    }
}
