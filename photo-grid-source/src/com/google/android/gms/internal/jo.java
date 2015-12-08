// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import android.os.RemoteException;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            jp, iv, ju, jz, 
//            jv, kb, jq, jw, 
//            jr, jx, js, jy, 
//            jt

public final class jo
    implements MediationBannerListener, MediationInterstitialListener
{

    private final iv a;

    public jo(iv iv1)
    {
        a = iv1;
    }

    static iv a(jo jo1)
    {
        return jo1.a;
    }

    public final void onClick(MediationBannerAdapter mediationbanneradapter)
    {
        zzb.zzaF("Adapter called onClick.");
        if (!zzl.zzcF().zzgT())
        {
            zzb.zzaH("onClick must be called on the main UI thread.");
            zza.zzJt.post(new jp(this));
            return;
        }
        try
        {
            a.a();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            zzb.zzd("Could not call onAdClicked.", mediationbanneradapter);
        }
    }

    public final void onDismissScreen(MediationBannerAdapter mediationbanneradapter)
    {
        zzb.zzaF("Adapter called onDismissScreen.");
        if (!zzl.zzcF().zzgT())
        {
            zzb.zzaH("onDismissScreen must be called on the main UI thread.");
            zza.zzJt.post(new ju(this));
            return;
        }
        try
        {
            a.b();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            zzb.zzd("Could not call onAdClosed.", mediationbanneradapter);
        }
    }

    public final void onDismissScreen(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        zzb.zzaF("Adapter called onDismissScreen.");
        if (!zzl.zzcF().zzgT())
        {
            zzb.zzaH("onDismissScreen must be called on the main UI thread.");
            zza.zzJt.post(new jz(this));
            return;
        }
        try
        {
            a.b();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            zzb.zzd("Could not call onAdClosed.", mediationinterstitialadapter);
        }
    }

    public final void onFailedToReceiveAd(MediationBannerAdapter mediationbanneradapter, com.google.ads.AdRequest.ErrorCode errorcode)
    {
        zzb.zzaF((new StringBuilder("Adapter called onFailedToReceiveAd with error. ")).append(errorcode).toString());
        if (!zzl.zzcF().zzgT())
        {
            zzb.zzaH("onFailedToReceiveAd must be called on the main UI thread.");
            zza.zzJt.post(new jv(this, errorcode));
            return;
        }
        try
        {
            a.a(kb.a(errorcode));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            zzb.zzd("Could not call onAdFailedToLoad.", mediationbanneradapter);
        }
    }

    public final void onFailedToReceiveAd(MediationInterstitialAdapter mediationinterstitialadapter, com.google.ads.AdRequest.ErrorCode errorcode)
    {
        zzb.zzaF((new StringBuilder("Adapter called onFailedToReceiveAd with error ")).append(errorcode).append(".").toString());
        if (!zzl.zzcF().zzgT())
        {
            zzb.zzaH("onFailedToReceiveAd must be called on the main UI thread.");
            zza.zzJt.post(new jq(this, errorcode));
            return;
        }
        try
        {
            a.a(kb.a(errorcode));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            zzb.zzd("Could not call onAdFailedToLoad.", mediationinterstitialadapter);
        }
    }

    public final void onLeaveApplication(MediationBannerAdapter mediationbanneradapter)
    {
        zzb.zzaF("Adapter called onLeaveApplication.");
        if (!zzl.zzcF().zzgT())
        {
            zzb.zzaH("onLeaveApplication must be called on the main UI thread.");
            zza.zzJt.post(new jw(this));
            return;
        }
        try
        {
            a.c();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            zzb.zzd("Could not call onAdLeftApplication.", mediationbanneradapter);
        }
    }

    public final void onLeaveApplication(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        zzb.zzaF("Adapter called onLeaveApplication.");
        if (!zzl.zzcF().zzgT())
        {
            zzb.zzaH("onLeaveApplication must be called on the main UI thread.");
            zza.zzJt.post(new jr(this));
            return;
        }
        try
        {
            a.c();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            zzb.zzd("Could not call onAdLeftApplication.", mediationinterstitialadapter);
        }
    }

    public final void onPresentScreen(MediationBannerAdapter mediationbanneradapter)
    {
        zzb.zzaF("Adapter called onPresentScreen.");
        if (!zzl.zzcF().zzgT())
        {
            zzb.zzaH("onPresentScreen must be called on the main UI thread.");
            zza.zzJt.post(new jx(this));
            return;
        }
        try
        {
            a.d();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            zzb.zzd("Could not call onAdOpened.", mediationbanneradapter);
        }
    }

    public final void onPresentScreen(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        zzb.zzaF("Adapter called onPresentScreen.");
        if (!zzl.zzcF().zzgT())
        {
            zzb.zzaH("onPresentScreen must be called on the main UI thread.");
            zza.zzJt.post(new js(this));
            return;
        }
        try
        {
            a.d();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            zzb.zzd("Could not call onAdOpened.", mediationinterstitialadapter);
        }
    }

    public final void onReceivedAd(MediationBannerAdapter mediationbanneradapter)
    {
        zzb.zzaF("Adapter called onReceivedAd.");
        if (!zzl.zzcF().zzgT())
        {
            zzb.zzaH("onReceivedAd must be called on the main UI thread.");
            zza.zzJt.post(new jy(this));
            return;
        }
        try
        {
            a.e();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            zzb.zzd("Could not call onAdLoaded.", mediationbanneradapter);
        }
    }

    public final void onReceivedAd(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        zzb.zzaF("Adapter called onReceivedAd.");
        if (!zzl.zzcF().zzgT())
        {
            zzb.zzaH("onReceivedAd must be called on the main UI thread.");
            zza.zzJt.post(new jt(this));
            return;
        }
        try
        {
            a.e();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            zzb.zzd("Could not call onAdLoaded.", mediationinterstitialadapter);
        }
    }
}
