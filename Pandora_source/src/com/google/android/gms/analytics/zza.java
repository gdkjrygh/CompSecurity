// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.zze;
import com.google.android.gms.analytics.internal.zzj;
import com.google.android.gms.analytics.internal.zzm;
import com.google.android.gms.analytics.internal.zzt;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzgp;
import com.google.android.gms.internal.zzkg;
import com.google.android.gms.internal.zzkj;
import com.google.android.gms.internal.zzkm;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.android.gms.analytics:
//            zzb

public class zza extends zzkj
{

    private final zze zzEb;
    private boolean zzEc;

    public zza(zze zze1)
    {
        super(zze1.zzgJ(), zze1.zzgG());
        zzEb = zze1;
    }

    public void enableAdvertisingIdCollection(boolean flag)
    {
        zzEc = flag;
    }

    protected void zza(zzkg zzkg1)
    {
        zzkg1 = (zzgp)zzkg1.zze(com/google/android/gms/internal/zzgp);
        if (TextUtils.isEmpty(zzkg1.getClientId()))
        {
            zzkg1.setClientId(zzEb.zzgY().zzhI());
        }
        if (zzEc && TextUtils.isEmpty(zzkg1.zzgm()))
        {
            com.google.android.gms.analytics.internal.zza zza1 = zzEb.zzgX();
            zzkg1.zzaA(zza1.zzgr());
            zzkg1.zzE(zza1.zzgn());
        }
    }

    public void zzat(String s)
    {
        zzv.zzbS(s);
        zzau(s);
        zzul().add(new zzb(zzEb, s));
    }

    public void zzau(String s)
    {
        s = zzb.zzav(s);
        ListIterator listiterator = zzul().listIterator();
        do
        {
            if (!listiterator.hasNext())
            {
                break;
            }
            if (s.equals(((zzkm)listiterator.next()).zzfR()))
            {
                listiterator.remove();
            }
        } while (true);
    }

    zze zzfO()
    {
        return zzEb;
    }

    public zzkg zzfP()
    {
        zzkg zzkg1 = zzuk().zztZ();
        zzkg1.zzb(zzEb.zzgO().zzhq());
        zzkg1.zzb(zzEb.zzgP().zzix());
        zzd(zzkg1);
        return zzkg1;
    }
}
