// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzkg, zzkh, zzkk, zzht

public abstract class zzkj
{

    private final zzkk zzawh;
    protected final zzkg zzawi;
    private final List zzawj = new ArrayList();

    protected zzkj(zzkk zzkk, zzht zzht)
    {
        zzv.zzr(zzkk);
        zzawh = zzkk;
        zzkk = new zzkg(this, zzht);
        zzkk.zzuj();
        zzawi = zzkk;
    }

    protected void zza(zzkg zzkg1)
    {
    }

    protected void zzd(zzkg zzkg1)
    {
        for (Iterator iterator = zzawj.iterator(); iterator.hasNext(); ((zzkh)iterator.next()).zza(this, zzkg1)) { }
    }

    public zzkg zzfP()
    {
        zzkg zzkg1 = zzawi.zztZ();
        zzd(zzkg1);
        return zzkg1;
    }

    protected zzkk zzuh()
    {
        return zzawh;
    }

    public zzkg zzuk()
    {
        return zzawi;
    }

    public List zzul()
    {
        return zzawi.zzub();
    }
}
