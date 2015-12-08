// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzwx, zzwq, zzwz, zzwr

public abstract class zzwy
{

    protected volatile int zzaHM;

    public zzwy()
    {
        zzaHM = -1;
    }

    public static final zzwy zza(zzwy zzwy1, byte abyte0[])
    {
        return zzb(zzwy1, abyte0, 0, abyte0.length);
    }

    public static final zzwy zzb(zzwy zzwy1, byte abyte0[], int i, int j)
    {
        try
        {
            abyte0 = zzwq.zza(abyte0, i, j);
            zzwy1.zzb(((zzwq) (abyte0)));
            abyte0.zzim(0);
        }
        // Misplaced declaration of an exception variable
        catch (zzwy zzwy1)
        {
            throw zzwy1;
        }
        // Misplaced declaration of an exception variable
        catch (zzwy zzwy1)
        {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
        return zzwy1;
    }

    public Object clone()
    {
        return zzvN();
    }

    public String toString()
    {
        return zzwz.zzg(this);
    }

    public void zza(zzwr zzwr)
    {
    }

    public abstract zzwy zzb(zzwq zzwq1);

    protected int zzc()
    {
        return 0;
    }

    public zzwy zzvN()
    {
        return (zzwy)super.clone();
    }

    public int zzvX()
    {
        if (zzaHM < 0)
        {
            zzvY();
        }
        return zzaHM;
    }

    public int zzvY()
    {
        int i = zzc();
        zzaHM = i;
        return i;
    }
}
