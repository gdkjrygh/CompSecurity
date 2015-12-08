// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.data.DataHolder;

public abstract class zzb
    implements zzi.zzb
{

    private final DataHolder zzPy;

    protected zzb(DataHolder dataholder)
    {
        zzPy = dataholder;
    }

    protected abstract void zza(Object obj, DataHolder dataholder);

    public final void zzk(Object obj)
    {
        zza(obj, zzPy);
    }

    public void zzkJ()
    {
        if (zzPy != null)
        {
            zzPy.close();
        }
    }
}
