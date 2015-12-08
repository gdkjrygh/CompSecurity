// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.client.zzd;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.fg;
import com.google.android.gms.internal.fh;
import com.google.android.gms.internal.fi;
import com.google.android.gms.internal.fj;
import com.google.android.gms.internal.io;

// Referenced classes of package com.google.android.gms.ads:
//            AdLoader, AdListener

public class zd.zza
{

    private final Context a;
    private final zzq b;

    public AdLoader build()
    {
        AdLoader adloader;
        try
        {
            adloader = new AdLoader(a, b.zzbk());
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzb("Failed to build AdLoader.", remoteexception);
            return null;
        }
        return adloader;
    }

    public stallAdLoadedListener forAppInstallAd(com.google.android.gms.ads.formats.d.OnAppInstallAdLoadedListener onappinstalladloadedlistener)
    {
        try
        {
            b.zza(new fg(onappinstalladloadedlistener));
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.ads.formats.d.OnAppInstallAdLoadedListener onappinstalladloadedlistener)
        {
            zzb.zzd("Failed to add app install ad listener", onappinstalladloadedlistener);
            return this;
        }
        return this;
    }

    public dLoadedListener forContentAd(com.google.android.gms.ads.formats.nContentAdLoadedListener ncontentadloadedlistener)
    {
        try
        {
            b.zza(new fh(ncontentadloadedlistener));
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.ads.formats.nContentAdLoadedListener ncontentadloadedlistener)
        {
            zzb.zzd("Failed to add content ad listener", ncontentadloadedlistener);
            return this;
        }
        return this;
    }

    public ustomClickListener forCustomTemplateAd(String s, com.google.android.gms.ads.formats.ateAd.OnCustomTemplateAdLoadedListener oncustomtemplateadloadedlistener, com.google.android.gms.ads.formats.ateAd.OnCustomClickListener oncustomclicklistener)
    {
        zzq zzq1;
        fj fj1;
        try
        {
            zzq1 = b;
            fj1 = new fj(oncustomtemplateadloadedlistener);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzb.zzd("Failed to add custom template ad listener", s);
            return this;
        }
        if (oncustomclicklistener != null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        oncustomtemplateadloadedlistener = null;
        zzq1.zza(s, fj1, oncustomtemplateadloadedlistener);
        return this;
        oncustomtemplateadloadedlistener = new fi(oncustomclicklistener);
        break MISSING_BLOCK_LABEL_22;
    }

    public ustomClickListener withAdListener(AdListener adlistener)
    {
        try
        {
            b.zzb(new zzc(adlistener));
        }
        // Misplaced declaration of an exception variable
        catch (AdListener adlistener)
        {
            zzb.zzd("Failed to set AdListener.", adlistener);
            return this;
        }
        return this;
    }

    public ptions withNativeAdOptions(NativeAdOptions nativeadoptions)
    {
        try
        {
            b.zza(new NativeAdOptionsParcel(nativeadoptions));
        }
        // Misplaced declaration of an exception variable
        catch (NativeAdOptions nativeadoptions)
        {
            zzb.zzd("Failed to specify native ad options", nativeadoptions);
            return this;
        }
        return this;
    }

    private zq(Context context, zzq zzq1)
    {
        a = context;
        b = zzq1;
    }

    public zq(Context context, String s)
    {
        this(context, zzd.zza(context, s, new io()));
    }
}
