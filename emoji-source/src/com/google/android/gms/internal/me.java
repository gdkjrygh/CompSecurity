// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            md, lz, ly, mf

public abstract class me
{

    protected volatile int anb;

    public me()
    {
        anb = -1;
    }

    public static final me a(me me1, byte abyte0[])
        throws md
    {
        return b(me1, abyte0, 0, abyte0.length);
    }

    public static final void a(me me1, byte abyte0[], int i, int j)
    {
        try
        {
            abyte0 = lz.b(abyte0, i, j);
            me1.a(((lz) (abyte0)));
            abyte0.nR();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (me me1)
        {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", me1);
        }
    }

    public static final me b(me me1, byte abyte0[], int i, int j)
        throws md
    {
        try
        {
            abyte0 = ly.a(abyte0, i, j);
            me1.b(((ly) (abyte0)));
            abyte0.eu(0);
        }
        // Misplaced declaration of an exception variable
        catch (me me1)
        {
            throw me1;
        }
        // Misplaced declaration of an exception variable
        catch (me me1)
        {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
        return me1;
    }

    public static final byte[] d(me me1)
    {
        byte abyte0[] = new byte[me1.oa()];
        a(me1, abyte0, 0, abyte0.length);
        return abyte0;
    }

    public void a(lz lz1)
        throws IOException
    {
    }

    public abstract me b(ly ly1)
        throws IOException;

    protected int c()
    {
        return 0;
    }

    public int nZ()
    {
        if (anb < 0)
        {
            oa();
        }
        return anb;
    }

    public int oa()
    {
        int i = c();
        anb = i;
        return i;
    }

    public String toString()
    {
        return mf.e(this);
    }
}
