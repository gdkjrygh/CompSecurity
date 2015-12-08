// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.common.internal.zzx;

// Referenced classes of package com.google.android.gms.internal:
//            zzhx, zzdt

public final class zzdw
    implements MediationBannerListener, MediationInterstitialListener
{

    private final zzdt zzsS;

    public zzdw(zzdt zzdt1)
    {
        zzsS = zzdt1;
    }

    public final void onAdClicked(MediationBannerAdapter mediationbanneradapter)
    {
        zzx.zzbd("onAdClicked must be called on the main UI thread.");
        zzhx.zzY("Adapter called onAdClicked.");
        try
        {
            zzsS.onAdClicked();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            zzhx.zzd("Could not call onAdClicked.", mediationbanneradapter);
        }
    }

    public final void onAdClicked(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        zzx.zzbd("onAdClicked must be called on the main UI thread.");
        zzhx.zzY("Adapter called onAdClicked.");
        try
        {
            zzsS.onAdClicked();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            zzhx.zzd("Could not call onAdClicked.", mediationinterstitialadapter);
        }
    }

    public final void onAdClosed(MediationBannerAdapter mediationbanneradapter)
    {
        zzx.zzbd("onAdClosed must be called on the main UI thread.");
        zzhx.zzY("Adapter called onAdClosed.");
        try
        {
            zzsS.onAdClosed();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            zzhx.zzd("Could not call onAdClosed.", mediationbanneradapter);
        }
    }

    public final void onAdClosed(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        zzx.zzbd("onAdClosed must be called on the main UI thread.");
        zzhx.zzY("Adapter called onAdClosed.");
        try
        {
            zzsS.onAdClosed();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            zzhx.zzd("Could not call onAdClosed.", mediationinterstitialadapter);
        }
    }

    public final void onAdFailedToLoad(MediationBannerAdapter mediationbanneradapter, int i)
    {
        zzx.zzbd("onAdFailedToLoad must be called on the main UI thread.");
        zzhx.zzY((new StringBuilder("Adapter called onAdFailedToLoad with error. ")).append(i).toString());
        try
        {
            zzsS.onAdFailedToLoad(i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            zzhx.zzd("Could not call onAdFailedToLoad.", mediationbanneradapter);
        }
    }

    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationinterstitialadapter, int i)
    {
        zzx.zzbd("onAdFailedToLoad must be called on the main UI thread.");
        zzhx.zzY((new StringBuilder("Adapter called onAdFailedToLoad with error ")).append(i).append(".").toString());
        try
        {
            zzsS.onAdFailedToLoad(i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            zzhx.zzd("Could not call onAdFailedToLoad.", mediationinterstitialadapter);
        }
    }

    public final void onAdLeftApplication(MediationBannerAdapter mediationbanneradapter)
    {
        zzx.zzbd("onAdLeftApplication must be called on the main UI thread.");
        zzhx.zzY("Adapter called onAdLeftApplication.");
        try
        {
            zzsS.onAdLeftApplication();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            zzhx.zzd("Could not call onAdLeftApplication.", mediationbanneradapter);
        }
    }

    public final void onAdLeftApplication(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        zzx.zzbd("onAdLeftApplication must be called on the main UI thread.");
        zzhx.zzY("Adapter called onAdLeftApplication.");
        try
        {
            zzsS.onAdLeftApplication();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            zzhx.zzd("Could not call onAdLeftApplication.", mediationinterstitialadapter);
        }
    }

    public final void onAdLoaded(MediationBannerAdapter mediationbanneradapter)
    {
        zzx.zzbd("onAdLoaded must be called on the main UI thread.");
        zzhx.zzY("Adapter called onAdLoaded.");
        try
        {
            zzsS.onAdLoaded();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            zzhx.zzd("Could not call onAdLoaded.", mediationbanneradapter);
        }
    }

    public final void onAdLoaded(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        zzx.zzbd("onAdLoaded must be called on the main UI thread.");
        zzhx.zzY("Adapter called onAdLoaded.");
        try
        {
            zzsS.onAdLoaded();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            zzhx.zzd("Could not call onAdLoaded.", mediationinterstitialadapter);
        }
    }

    public final void onAdOpened(MediationBannerAdapter mediationbanneradapter)
    {
        zzx.zzbd("onAdOpened must be called on the main UI thread.");
        zzhx.zzY("Adapter called onAdOpened.");
        try
        {
            zzsS.onAdOpened();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            zzhx.zzd("Could not call onAdOpened.", mediationbanneradapter);
        }
    }

    public final void onAdOpened(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        zzx.zzbd("onAdOpened must be called on the main UI thread.");
        zzhx.zzY("Adapter called onAdOpened.");
        try
        {
            zzsS.onAdOpened();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            zzhx.zzd("Could not call onAdOpened.", mediationinterstitialadapter);
        }
    }
}
