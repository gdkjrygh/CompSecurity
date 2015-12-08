// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;

// Referenced classes of package com.google.android.gms.internal:
//            zzu, zzhx, zzgq, zzab, 
//            zzic, zzhy, zzho

public static class zzmu
    implements zzmu
{

    private final  zzmt;
    private final zzic zzmu;

    public void zze(String s)
    {
        zzhx.zzY("An auto-clicking creative is blocked");
        android.net.der der = new android.net.der();
        der.scheme("https");
        der.path("//pagead2.googlesyndication.com/pagead/gen_204");
        der.appendQueryParameter("id", "gmob-apps-blocked-navigation");
        if (!TextUtils.isEmpty(s))
        {
            der.appendQueryParameter("navigationURL", s);
        }
        if (zzmt != null && zzmt.zzyz != null && !TextUtils.isEmpty(zzmt.zzyz.zzwN))
        {
            der.appendQueryParameter("debugDialog", zzmt.zzyz.zzwN);
        }
        zzab.zzaM().zzc(zzmu.getContext(), zzmu.zzeJ().zzzH, der.toString());
    }

    public ( , zzic zzic1)
    {
        zzmt = ;
        zzmu = zzic1;
    }
}
