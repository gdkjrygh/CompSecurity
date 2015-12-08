// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrm, zzrf, zzro, zzrg

public abstract class zzrn
{

    protected volatile int p;

    public zzrn()
    {
        p = -1;
    }

    public static final zzrn a(zzrn zzrn1, byte abyte0[])
    {
        return a(zzrn1, abyte0, 0, abyte0.length);
    }

    public static final zzrn a(zzrn zzrn1, byte abyte0[], int i, int j)
    {
        try
        {
            abyte0 = zzrf.a(abyte0, i, j);
            zzrn1.b(abyte0);
            abyte0.a(0);
        }
        // Misplaced declaration of an exception variable
        catch (zzrn zzrn1)
        {
            throw zzrn1;
        }
        // Misplaced declaration of an exception variable
        catch (zzrn zzrn1)
        {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
        return zzrn1;
    }

    public void a(zzrg zzrg)
    {
    }

    protected int b()
    {
        return 0;
    }

    public abstract zzrn b(zzrf zzrf1);

    public Object clone()
    {
        return f();
    }

    public zzrn f()
    {
        return (zzrn)super.clone();
    }

    public int g()
    {
        if (p < 0)
        {
            h();
        }
        return p;
    }

    public int h()
    {
        int i = b();
        p = i;
        return i;
    }

    public String toString()
    {
        return zzro.a(this);
    }
}
