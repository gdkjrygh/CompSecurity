// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.au;
import com.google.android.gms.internal.ay;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.hs;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzp

public class zze
{
    public static interface zza
    {

        public abstract void zzq(String s);
    }

    public static class zzb
        implements zza
    {

        private final com.google.android.gms.internal.gl.a zzoK;
        private final hs zzoL;

        public void zzq(String s)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("An auto-clicking creative is blocked");
            android.net.Uri.Builder builder = new android.net.Uri.Builder();
            builder.scheme("https");
            builder.path("//pagead2.googlesyndication.com/pagead/gen_204");
            builder.appendQueryParameter("id", "gmob-apps-blocked-navigation");
            if (!TextUtils.isEmpty(s))
            {
                builder.appendQueryParameter("navigationURL", s);
            }
            if (zzoK != null && zzoK.b != null && !TextUtils.isEmpty(zzoK.b.zzEc))
            {
                builder.appendQueryParameter("debugDialog", zzoK.b.zzEc);
            }
            com.google.android.gms.ads.internal.zzp.zzbx().a(zzoL.getContext(), zzoL.l().zzIz, builder.toString());
        }

        public zzb(com.google.android.gms.internal.gl.a a, hs hs1)
        {
            zzoK = a;
            zzoL = hs1;
        }
    }


    private zza zzoH;
    private boolean zzoI;
    private boolean zzoJ;

    public zze()
    {
        zzoJ = ((Boolean)ay.i.c()).booleanValue();
    }

    public zze(boolean flag)
    {
        zzoJ = flag;
    }

    public void recordClick()
    {
        zzoI = true;
    }

    public void zza(zza zza1)
    {
        zzoH = zza1;
    }

    public boolean zzbe()
    {
        return !zzoJ || zzoI;
    }

    public void zzp(String s)
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Action was blocked because no click was detected.");
        if (zzoH != null)
        {
            zzoH.zzq(s);
        }
    }
}
