// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.internal:
//            zzab, zzhg

public class zzhj
{

    private final zzhg zzmV;
    private final Object zznh;
    private final String zzyC;
    private int zzze;
    private int zzzf;

    zzhj(zzhg zzhg1, String s)
    {
        zznh = new Object();
        zzmV = zzhg1;
        zzyC = s;
    }

    public zzhj(String s)
    {
        this(zzab.zzaP(), s);
    }

    public Bundle toBundle()
    {
        Bundle bundle;
        synchronized (zznh)
        {
            bundle = new Bundle();
            bundle.putInt("pmnli", zzze);
            bundle.putInt("pmnll", zzzf);
        }
        return bundle;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzg(int i, int j)
    {
        synchronized (zznh)
        {
            zzze = i;
            zzzf = j;
            zzmV.zza(zzyC, this);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
