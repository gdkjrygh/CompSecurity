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
//            fq, dw, bs

public final class bv
    implements MediationBannerListener, MediationInterstitialListener
{

    private final bs nG;

    public bv(bs bs1)
    {
        nG = bs1;
    }

    public void onAdClicked(MediationBannerAdapter mediationbanneradapter)
    {
        fq.aj("onClick must be called on the main UI thread.");
        dw.v("Adapter called onClick.");
        try
        {
            nG.P();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            dw.c("Could not call onAdClicked.", mediationbanneradapter);
        }
    }

    public void onAdClosed(MediationBannerAdapter mediationbanneradapter)
    {
        fq.aj("onAdClosed must be called on the main UI thread.");
        dw.v("Adapter called onAdClosed.");
        try
        {
            nG.onAdClosed();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            dw.c("Could not call onAdClosed.", mediationbanneradapter);
        }
    }

    public void onAdClosed(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        fq.aj("onAdClosed must be called on the main UI thread.");
        dw.v("Adapter called onAdClosed.");
        try
        {
            nG.onAdClosed();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            dw.c("Could not call onAdClosed.", mediationinterstitialadapter);
        }
    }

    public void onAdFailedToLoad(MediationBannerAdapter mediationbanneradapter, int i)
    {
        fq.aj("onAdFailedToLoad must be called on the main UI thread.");
        dw.v((new StringBuilder()).append("Adapter called onAdFailedToLoad with error. ").append(i).toString());
        try
        {
            nG.onAdFailedToLoad(i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            dw.c("Could not call onAdFailedToLoad.", mediationbanneradapter);
        }
    }

    public void onAdFailedToLoad(MediationInterstitialAdapter mediationinterstitialadapter, int i)
    {
        fq.aj("onAdFailedToLoad must be called on the main UI thread.");
        dw.v((new StringBuilder()).append("Adapter called onAdFailedToLoad with error ").append(i).append(".").toString());
        try
        {
            nG.onAdFailedToLoad(i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            dw.c("Could not call onAdFailedToLoad.", mediationinterstitialadapter);
        }
    }

    public void onAdLeftApplication(MediationBannerAdapter mediationbanneradapter)
    {
        fq.aj("onAdLeftApplication must be called on the main UI thread.");
        dw.v("Adapter called onAdLeftApplication.");
        try
        {
            nG.onAdLeftApplication();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            dw.c("Could not call onAdLeftApplication.", mediationbanneradapter);
        }
    }

    public void onAdLeftApplication(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        fq.aj("onAdLeftApplication must be called on the main UI thread.");
        dw.v("Adapter called onAdLeftApplication.");
        try
        {
            nG.onAdLeftApplication();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            dw.c("Could not call onAdLeftApplication.", mediationinterstitialadapter);
        }
    }

    public void onAdLoaded(MediationBannerAdapter mediationbanneradapter)
    {
        fq.aj("onAdLoaded must be called on the main UI thread.");
        dw.v("Adapter called onAdLoaded.");
        try
        {
            nG.onAdLoaded();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            dw.c("Could not call onAdLoaded.", mediationbanneradapter);
        }
    }

    public void onAdLoaded(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        fq.aj("onAdLoaded must be called on the main UI thread.");
        dw.v("Adapter called onAdLoaded.");
        try
        {
            nG.onAdLoaded();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            dw.c("Could not call onAdLoaded.", mediationinterstitialadapter);
        }
    }

    public void onAdOpened(MediationBannerAdapter mediationbanneradapter)
    {
        fq.aj("onAdOpened must be called on the main UI thread.");
        dw.v("Adapter called onAdOpened.");
        try
        {
            nG.onAdOpened();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            dw.c("Could not call onAdOpened.", mediationbanneradapter);
        }
    }

    public void onAdOpened(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        fq.aj("onAdOpened must be called on the main UI thread.");
        dw.v("Adapter called onAdOpened.");
        try
        {
            nG.onAdOpened();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            dw.c("Could not call onAdOpened.", mediationinterstitialadapter);
        }
    }
}
