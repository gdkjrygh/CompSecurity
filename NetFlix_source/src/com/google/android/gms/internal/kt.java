// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            ks, ko, kn, ku

public abstract class kt
{

    protected volatile int adY;

    public kt()
    {
        adY = -1;
    }

    public static final kt a(kt kt1, byte abyte0[])
        throws ks
    {
        return b(kt1, abyte0, 0, abyte0.length);
    }

    public static final void a(kt kt1, byte abyte0[], int i, int j)
    {
        try
        {
            abyte0 = ko.b(abyte0, i, j);
            kt1.a(((ko) (abyte0)));
            abyte0.mw();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (kt kt1)
        {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", kt1);
        }
    }

    public static final kt b(kt kt1, byte abyte0[], int i, int j)
        throws ks
    {
        try
        {
            abyte0 = kn.a(abyte0, i, j);
            kt1.b(((kn) (abyte0)));
            abyte0.cP(0);
        }
        // Misplaced declaration of an exception variable
        catch (kt kt1)
        {
            throw kt1;
        }
        // Misplaced declaration of an exception variable
        catch (kt kt1)
        {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
        return kt1;
    }

    public static final byte[] d(kt kt1)
    {
        byte abyte0[] = new byte[kt1.c()];
        a(kt1, abyte0, 0, abyte0.length);
        return abyte0;
    }

    public void a(ko ko1)
        throws IOException
    {
    }

    public abstract kt b(kn kn1)
        throws IOException;

    public int c()
    {
        int i = mx();
        adY = i;
        return i;
    }

    public int mF()
    {
        if (adY < 0)
        {
            c();
        }
        return adY;
    }

    protected int mx()
    {
        return 0;
    }

    public String toString()
    {
        return ku.e(this);
    }
}
