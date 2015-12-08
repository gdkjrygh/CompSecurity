// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;

// Referenced classes of package com.google.android.gms.internal:
//            zzca, zzbx, zzhx, zzgq, 
//            zzab, zzic, zzhy, zzho

public class zzu
{
    public static interface zza
    {

        public abstract void zze(String s);
    }

    public static class zzb
        implements zza
    {

        private final zzhe.zza zzmt;
        private final zzic zzmu;

        public void zze(String s)
        {
            zzhx.zzY("An auto-clicking creative is blocked");
            android.net.Uri.Builder builder = new android.net.Uri.Builder();
            builder.scheme("https");
            builder.path("//pagead2.googlesyndication.com/pagead/gen_204");
            builder.appendQueryParameter("id", "gmob-apps-blocked-navigation");
            if (!TextUtils.isEmpty(s))
            {
                builder.appendQueryParameter("navigationURL", s);
            }
            if (zzmt != null && zzmt.zzyz != null && !TextUtils.isEmpty(zzmt.zzyz.zzwN))
            {
                builder.appendQueryParameter("debugDialog", zzmt.zzyz.zzwN);
            }
            zzab.zzaM().zzc(zzmu.getContext(), zzmu.zzeJ().zzzH, builder.toString());
        }

        public zzb(zzhe.zza zza1, zzic zzic1)
        {
            zzmt = zza1;
            zzmu = zzic1;
        }
    }


    private zza zzmq;
    private boolean zzmr;
    private boolean zzms;

    public zzu()
    {
        zzms = ((Boolean)zzca.zzqq.get()).booleanValue();
    }

    public zzu(boolean flag)
    {
        zzms = flag;
    }

    public void recordClick()
    {
        zzmr = true;
    }

    public void zza(zza zza1)
    {
        zzmq = zza1;
    }

    public boolean zzaB()
    {
        return !zzms || zzmr;
    }

    public void zzd(String s)
    {
        zzhx.zzY("Action was blocked because no click was detected.");
        if (zzmq != null)
        {
            zzmq.zze(s);
        }
    }
}
