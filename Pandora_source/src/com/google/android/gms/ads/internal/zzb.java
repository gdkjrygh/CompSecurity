// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.zzap;
import com.google.android.gms.internal.zzat;
import com.google.android.gms.internal.zzfl;
import com.google.android.gms.internal.zzgd;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzh

public class com.google.android.gms.ads.internal.zzb
{
    public static interface zza
    {

        public abstract void zzf(String s);
    }

    public static class zzb
        implements zza
    {

        private final com.google.android.gms.internal.zzfa.zza zzno;
        private final zzgd zznp;

        public void zzf(String s)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaj("An auto-clicking creative is blocked");
            android.net.Uri.Builder builder = new android.net.Uri.Builder();
            builder.scheme("https");
            builder.path("//pagead2.googlesyndication.com/pagead/gen_204");
            builder.appendQueryParameter("id", "gmob-apps-blocked-navigation");
            if (!TextUtils.isEmpty(s))
            {
                builder.appendQueryParameter("navigationURL", s);
            }
            if (zzno != null && zzno.zzBz != null && !TextUtils.isEmpty(zzno.zzBz.zzzy))
            {
                builder.appendQueryParameter("debugDialog", zzno.zzBz.zzzy);
            }
            zzh.zzaQ().zzc(zznp.getContext(), zznp.zzfw().zzCI, builder.toString());
        }

        public zzb(com.google.android.gms.internal.zzfa.zza zza1, zzgd zzgd1)
        {
            zzno = zza1;
            zznp = zzgd1;
        }
    }


    private zza zznl;
    private boolean zznm;
    private boolean zznn;

    public com.google.android.gms.ads.internal.zzb()
    {
        zznn = ((Boolean)zzat.zzrm.get()).booleanValue();
    }

    public com.google.android.gms.ads.internal.zzb(boolean flag)
    {
        zznn = flag;
    }

    public void recordClick()
    {
        zznm = true;
    }

    public void zza(zza zza1)
    {
        zznl = zza1;
    }

    public boolean zzaF()
    {
        return !zznn || zznm;
    }

    public void zze(String s)
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaj("Action was blocked because no click was detected.");
        if (zznl != null)
        {
            zznl.zzf(s);
        }
    }
}
