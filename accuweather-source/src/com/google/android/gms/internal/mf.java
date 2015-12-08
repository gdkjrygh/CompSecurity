// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            me, ma, lz, mg

public abstract class mf
{

    protected volatile int amY;

    public mf()
    {
        amY = -1;
    }

    public static final mf a(mf mf1, byte abyte0[])
        throws me
    {
        return b(mf1, abyte0, 0, abyte0.length);
    }

    public static final void a(mf mf1, byte abyte0[], int i, int j)
    {
        try
        {
            abyte0 = ma.b(abyte0, i, j);
            mf1.a(((ma) (abyte0)));
            abyte0.nM();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (mf mf1)
        {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", mf1);
        }
    }

    public static final mf b(mf mf1, byte abyte0[], int i, int j)
        throws me
    {
        try
        {
            abyte0 = lz.a(abyte0, i, j);
            mf1.b(((lz) (abyte0)));
            abyte0.eu(0);
        }
        // Misplaced declaration of an exception variable
        catch (mf mf1)
        {
            throw mf1;
        }
        // Misplaced declaration of an exception variable
        catch (mf mf1)
        {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
        return mf1;
    }

    public static final byte[] d(mf mf1)
    {
        byte abyte0[] = new byte[mf1.nV()];
        a(mf1, abyte0, 0, abyte0.length);
        return abyte0;
    }

    public void a(ma ma1)
        throws IOException
    {
    }

    public abstract mf b(lz lz1)
        throws IOException;

    protected int c()
    {
        return 0;
    }

    public int nU()
    {
        if (amY < 0)
        {
            nV();
        }
        return amY;
    }

    public int nV()
    {
        int i = c();
        amY = i;
        return i;
    }

    public String toString()
    {
        return mg.e(this);
    }
}
