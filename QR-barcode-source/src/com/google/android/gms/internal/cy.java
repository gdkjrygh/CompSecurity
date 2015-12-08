// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.common.internal.o;

// Referenced classes of package com.google.android.gms.internal:
//            gs, cv

public final class cy
    implements MediationBannerListener, MediationInterstitialListener
{

    private final cv qF;

    public cy(cv cv1)
    {
        qF = cv1;
    }

    public void onAdClicked(MediationBannerAdapter mediationbanneradapter)
    {
        o.aT("onAdClicked must be called on the main UI thread.");
        gs.S("Adapter called onAdClicked.");
        try
        {
            qF.onAdClicked();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            gs.d("Could not call onAdClicked.", mediationbanneradapter);
        }
    }

    public void onAdClicked(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        o.aT("onAdClicked must be called on the main UI thread.");
        gs.S("Adapter called onAdClicked.");
        try
        {
            qF.onAdClicked();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            gs.d("Could not call onAdClicked.", mediationinterstitialadapter);
        }
    }

    public void onAdClosed(MediationBannerAdapter mediationbanneradapter)
    {
        o.aT("onAdClosed must be called on the main UI thread.");
        gs.S("Adapter called onAdClosed.");
        try
        {
            qF.onAdClosed();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            gs.d("Could not call onAdClosed.", mediationbanneradapter);
        }
    }

    public void onAdClosed(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        o.aT("onAdClosed must be called on the main UI thread.");
        gs.S("Adapter called onAdClosed.");
        try
        {
            qF.onAdClosed();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            gs.d("Could not call onAdClosed.", mediationinterstitialadapter);
        }
    }

    public void onAdFailedToLoad(MediationBannerAdapter mediationbanneradapter, int i)
    {
        o.aT("onAdFailedToLoad must be called on the main UI thread.");
        gs.S((new StringBuilder()).append("Adapter called onAdFailedToLoad with error. ").append(i).toString());
        try
        {
            qF.onAdFailedToLoad(i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            gs.d("Could not call onAdFailedToLoad.", mediationbanneradapter);
        }
    }

    public void onAdFailedToLoad(MediationInterstitialAdapter mediationinterstitialadapter, int i)
    {
        o.aT("onAdFailedToLoad must be called on the main UI thread.");
        gs.S((new StringBuilder()).append("Adapter called onAdFailedToLoad with error ").append(i).append(".").toString());
        try
        {
            qF.onAdFailedToLoad(i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            gs.d("Could not call onAdFailedToLoad.", mediationinterstitialadapter);
        }
    }

    public void onAdLeftApplication(MediationBannerAdapter mediationbanneradapter)
    {
        o.aT("onAdLeftApplication must be called on the main UI thread.");
        gs.S("Adapter called onAdLeftApplication.");
        try
        {
            qF.onAdLeftApplication();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            gs.d("Could not call onAdLeftApplication.", mediationbanneradapter);
        }
    }

    public void onAdLeftApplication(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        o.aT("onAdLeftApplication must be called on the main UI thread.");
        gs.S("Adapter called onAdLeftApplication.");
        try
        {
            qF.onAdLeftApplication();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            gs.d("Could not call onAdLeftApplication.", mediationinterstitialadapter);
        }
    }

    public void onAdLoaded(MediationBannerAdapter mediationbanneradapter)
    {
        o.aT("onAdLoaded must be called on the main UI thread.");
        gs.S("Adapter called onAdLoaded.");
        try
        {
            qF.onAdLoaded();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            gs.d("Could not call onAdLoaded.", mediationbanneradapter);
        }
    }

    public void onAdLoaded(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        o.aT("onAdLoaded must be called on the main UI thread.");
        gs.S("Adapter called onAdLoaded.");
        try
        {
            qF.onAdLoaded();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            gs.d("Could not call onAdLoaded.", mediationinterstitialadapter);
        }
    }

    public void onAdOpened(MediationBannerAdapter mediationbanneradapter)
    {
        o.aT("onAdOpened must be called on the main UI thread.");
        gs.S("Adapter called onAdOpened.");
        try
        {
            qF.onAdOpened();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            gs.d("Could not call onAdOpened.", mediationbanneradapter);
        }
    }

    public void onAdOpened(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        o.aT("onAdOpened must be called on the main UI thread.");
        gs.S("Adapter called onAdOpened.");
        try
        {
            qF.onAdOpened();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            gs.d("Could not call onAdOpened.", mediationinterstitialadapter);
        }
    }
}
