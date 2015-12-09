// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zznx, zznr, zznq, zznz

public abstract class zzny
{

    protected volatile int zzaNT;

    public zzny()
    {
        zzaNT = -1;
    }

    public static final zzny zza(zzny zzny1, byte abyte0[])
        throws zznx
    {
        return zzb(zzny1, abyte0, 0, abyte0.length);
    }

    public static final void zza(zzny zzny1, byte abyte0[], int i, int j)
    {
        try
        {
            abyte0 = zznr.zzb(abyte0, i, j);
            zzny1.zza(((zznr) (abyte0)));
            abyte0.zzzO();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzny zzny1)
        {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", zzny1);
        }
    }

    public static final zzny zzb(zzny zzny1, byte abyte0[], int i, int j)
        throws zznx
    {
        try
        {
            abyte0 = zznq.zza(abyte0, i, j);
            zzny1.zzb(((zznq) (abyte0)));
            abyte0.zzjk(0);
        }
        // Misplaced declaration of an exception variable
        catch (zzny zzny1)
        {
            throw zzny1;
        }
        // Misplaced declaration of an exception variable
        catch (zzny zzny1)
        {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
        return zzny1;
    }

    public static final byte[] zzf(zzny zzny1)
    {
        byte abyte0[] = new byte[zzny1.zzAc()];
        zza(zzny1, abyte0, 0, abyte0.length);
        return abyte0;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return zzzR();
    }

    public String toString()
    {
        return zznz.zzg(this);
    }

    public int zzAb()
    {
        if (zzaNT < 0)
        {
            zzAc();
        }
        return zzaNT;
    }

    public int zzAc()
    {
        int i = zzc();
        zzaNT = i;
        return i;
    }

    public void zza(zznr zznr1)
        throws IOException
    {
    }

    public abstract zzny zzb(zznq zznq1)
        throws IOException;

    protected int zzc()
    {
        return 0;
    }

    public zzny zzzR()
        throws CloneNotSupportedException
    {
        return (zzny)super.clone();
    }
}
