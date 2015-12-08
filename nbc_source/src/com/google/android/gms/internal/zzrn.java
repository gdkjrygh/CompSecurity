// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzro, zzrg

public abstract class zzrn
{

    protected volatile int zzaWf;

    public zzrn()
    {
        zzaWf = -1;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return zzBK();
    }

    public String toString()
    {
        return zzro.zzg(this);
    }

    protected int zzB()
    {
        return 0;
    }

    public zzrn zzBK()
        throws CloneNotSupportedException
    {
        return (zzrn)super.clone();
    }

    public int zzBU()
    {
        if (zzaWf < 0)
        {
            zzBV();
        }
        return zzaWf;
    }

    public int zzBV()
    {
        int i = zzB();
        zzaWf = i;
        return i;
    }

    public void zza(zzrg zzrg)
        throws IOException
    {
    }
}
