// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.internal:
//            zzct

public final class zzcw
    implements MediationBannerListener, MediationInterstitialListener
{

    private final zzct zzvb;

    public zzcw(zzct zzct1)
    {
        zzvb = zzct1;
    }

    public void onAdClicked(MediationBannerAdapter mediationbanneradapter)
    {
        zzv.zzbI("onAdClicked must be called on the main UI thread.");
        zzb.zzaj("Adapter called onAdClicked.");
        try
        {
            zzvb.onAdClicked();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            zzb.zzd("Could not call onAdClicked.", mediationbanneradapter);
        }
    }

    public void onAdClicked(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        zzv.zzbI("onAdClicked must be called on the main UI thread.");
        zzb.zzaj("Adapter called onAdClicked.");
        try
        {
            zzvb.onAdClicked();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            zzb.zzd("Could not call onAdClicked.", mediationinterstitialadapter);
        }
    }

    public void onAdClosed(MediationBannerAdapter mediationbanneradapter)
    {
        zzv.zzbI("onAdClosed must be called on the main UI thread.");
        zzb.zzaj("Adapter called onAdClosed.");
        try
        {
            zzvb.onAdClosed();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            zzb.zzd("Could not call onAdClosed.", mediationbanneradapter);
        }
    }

    public void onAdClosed(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        zzv.zzbI("onAdClosed must be called on the main UI thread.");
        zzb.zzaj("Adapter called onAdClosed.");
        try
        {
            zzvb.onAdClosed();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            zzb.zzd("Could not call onAdClosed.", mediationinterstitialadapter);
        }
    }

    public void onAdFailedToLoad(MediationBannerAdapter mediationbanneradapter, int i)
    {
        zzv.zzbI("onAdFailedToLoad must be called on the main UI thread.");
        zzb.zzaj((new StringBuilder()).append("Adapter called onAdFailedToLoad with error. ").append(i).toString());
        try
        {
            zzvb.onAdFailedToLoad(i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            zzb.zzd("Could not call onAdFailedToLoad.", mediationbanneradapter);
        }
    }

    public void onAdFailedToLoad(MediationInterstitialAdapter mediationinterstitialadapter, int i)
    {
        zzv.zzbI("onAdFailedToLoad must be called on the main UI thread.");
        zzb.zzaj((new StringBuilder()).append("Adapter called onAdFailedToLoad with error ").append(i).append(".").toString());
        try
        {
            zzvb.onAdFailedToLoad(i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            zzb.zzd("Could not call onAdFailedToLoad.", mediationinterstitialadapter);
        }
    }

    public void onAdLeftApplication(MediationBannerAdapter mediationbanneradapter)
    {
        zzv.zzbI("onAdLeftApplication must be called on the main UI thread.");
        zzb.zzaj("Adapter called onAdLeftApplication.");
        try
        {
            zzvb.onAdLeftApplication();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            zzb.zzd("Could not call onAdLeftApplication.", mediationbanneradapter);
        }
    }

    public void onAdLeftApplication(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        zzv.zzbI("onAdLeftApplication must be called on the main UI thread.");
        zzb.zzaj("Adapter called onAdLeftApplication.");
        try
        {
            zzvb.onAdLeftApplication();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            zzb.zzd("Could not call onAdLeftApplication.", mediationinterstitialadapter);
        }
    }

    public void onAdLoaded(MediationBannerAdapter mediationbanneradapter)
    {
        zzv.zzbI("onAdLoaded must be called on the main UI thread.");
        zzb.zzaj("Adapter called onAdLoaded.");
        try
        {
            zzvb.onAdLoaded();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            zzb.zzd("Could not call onAdLoaded.", mediationbanneradapter);
        }
    }

    public void onAdLoaded(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        zzv.zzbI("onAdLoaded must be called on the main UI thread.");
        zzb.zzaj("Adapter called onAdLoaded.");
        try
        {
            zzvb.onAdLoaded();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            zzb.zzd("Could not call onAdLoaded.", mediationinterstitialadapter);
        }
    }

    public void onAdOpened(MediationBannerAdapter mediationbanneradapter)
    {
        zzv.zzbI("onAdOpened must be called on the main UI thread.");
        zzb.zzaj("Adapter called onAdOpened.");
        try
        {
            zzvb.onAdOpened();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            zzb.zzd("Could not call onAdOpened.", mediationbanneradapter);
        }
    }

    public void onAdOpened(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        zzv.zzbI("onAdOpened must be called on the main UI thread.");
        zzb.zzaj("Adapter called onAdOpened.");
        try
        {
            zzvb.onAdOpened();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            zzb.zzd("Could not call onAdOpened.", mediationinterstitialadapter);
        }
    }
}
