// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

// Referenced classes of package com.google.android.gms.internal:
//            hm, eu, bv

public final class by
    implements MediationBannerListener, MediationInterstitialListener
{

    private final bv nT;

    public by(bv bv1)
    {
        nT = bv1;
    }

    public void onAdClicked(MediationBannerAdapter mediationbanneradapter)
    {
        hm.ay("onAdClicked must be called on the main UI thread.");
        eu.z("Adapter called onAdClicked.");
        try
        {
            nT.onAdClicked();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            eu.c("Could not call onAdClicked.", mediationbanneradapter);
        }
    }

    public void onAdClicked(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        hm.ay("onAdClicked must be called on the main UI thread.");
        eu.z("Adapter called onAdClicked.");
        try
        {
            nT.onAdClicked();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            eu.c("Could not call onAdClicked.", mediationinterstitialadapter);
        }
    }

    public void onAdClosed(MediationBannerAdapter mediationbanneradapter)
    {
        hm.ay("onAdClosed must be called on the main UI thread.");
        eu.z("Adapter called onAdClosed.");
        try
        {
            nT.onAdClosed();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            eu.c("Could not call onAdClosed.", mediationbanneradapter);
        }
    }

    public void onAdClosed(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        hm.ay("onAdClosed must be called on the main UI thread.");
        eu.z("Adapter called onAdClosed.");
        try
        {
            nT.onAdClosed();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            eu.c("Could not call onAdClosed.", mediationinterstitialadapter);
        }
    }

    public void onAdFailedToLoad(MediationBannerAdapter mediationbanneradapter, int i)
    {
        hm.ay("onAdFailedToLoad must be called on the main UI thread.");
        eu.z((new StringBuilder()).append("Adapter called onAdFailedToLoad with error. ").append(i).toString());
        try
        {
            nT.onAdFailedToLoad(i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            eu.c("Could not call onAdFailedToLoad.", mediationbanneradapter);
        }
    }

    public void onAdFailedToLoad(MediationInterstitialAdapter mediationinterstitialadapter, int i)
    {
        hm.ay("onAdFailedToLoad must be called on the main UI thread.");
        eu.z((new StringBuilder()).append("Adapter called onAdFailedToLoad with error ").append(i).append(".").toString());
        try
        {
            nT.onAdFailedToLoad(i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            eu.c("Could not call onAdFailedToLoad.", mediationinterstitialadapter);
        }
    }

    public void onAdLeftApplication(MediationBannerAdapter mediationbanneradapter)
    {
        hm.ay("onAdLeftApplication must be called on the main UI thread.");
        eu.z("Adapter called onAdLeftApplication.");
        try
        {
            nT.onAdLeftApplication();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            eu.c("Could not call onAdLeftApplication.", mediationbanneradapter);
        }
    }

    public void onAdLeftApplication(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        hm.ay("onAdLeftApplication must be called on the main UI thread.");
        eu.z("Adapter called onAdLeftApplication.");
        try
        {
            nT.onAdLeftApplication();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            eu.c("Could not call onAdLeftApplication.", mediationinterstitialadapter);
        }
    }

    public void onAdLoaded(MediationBannerAdapter mediationbanneradapter)
    {
        hm.ay("onAdLoaded must be called on the main UI thread.");
        eu.z("Adapter called onAdLoaded.");
        try
        {
            nT.onAdLoaded();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            eu.c("Could not call onAdLoaded.", mediationbanneradapter);
        }
    }

    public void onAdLoaded(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        hm.ay("onAdLoaded must be called on the main UI thread.");
        eu.z("Adapter called onAdLoaded.");
        try
        {
            nT.onAdLoaded();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            eu.c("Could not call onAdLoaded.", mediationinterstitialadapter);
        }
    }

    public void onAdOpened(MediationBannerAdapter mediationbanneradapter)
    {
        hm.ay("onAdOpened must be called on the main UI thread.");
        eu.z("Adapter called onAdOpened.");
        try
        {
            nT.onAdOpened();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            eu.c("Could not call onAdOpened.", mediationbanneradapter);
        }
    }

    public void onAdOpened(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        hm.ay("onAdOpened must be called on the main UI thread.");
        eu.z("Adapter called onAdOpened.");
        try
        {
            nT.onAdOpened();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            eu.c("Could not call onAdOpened.", mediationinterstitialadapter);
        }
    }
}
