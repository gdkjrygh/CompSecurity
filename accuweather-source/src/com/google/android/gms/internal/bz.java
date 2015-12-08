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
//            hn, ev, bw

public final class bz
    implements MediationBannerListener, MediationInterstitialListener
{

    private final bw nR;

    public bz(bw bw1)
    {
        nR = bw1;
    }

    public void onAdClicked(MediationBannerAdapter mediationbanneradapter)
    {
        hn.ay("onAdClicked must be called on the main UI thread.");
        ev.z("Adapter called onAdClicked.");
        try
        {
            nR.onAdClicked();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            ev.c("Could not call onAdClicked.", mediationbanneradapter);
        }
    }

    public void onAdClicked(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        hn.ay("onAdClicked must be called on the main UI thread.");
        ev.z("Adapter called onAdClicked.");
        try
        {
            nR.onAdClicked();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            ev.c("Could not call onAdClicked.", mediationinterstitialadapter);
        }
    }

    public void onAdClosed(MediationBannerAdapter mediationbanneradapter)
    {
        hn.ay("onAdClosed must be called on the main UI thread.");
        ev.z("Adapter called onAdClosed.");
        try
        {
            nR.onAdClosed();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            ev.c("Could not call onAdClosed.", mediationbanneradapter);
        }
    }

    public void onAdClosed(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        hn.ay("onAdClosed must be called on the main UI thread.");
        ev.z("Adapter called onAdClosed.");
        try
        {
            nR.onAdClosed();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            ev.c("Could not call onAdClosed.", mediationinterstitialadapter);
        }
    }

    public void onAdFailedToLoad(MediationBannerAdapter mediationbanneradapter, int i)
    {
        hn.ay("onAdFailedToLoad must be called on the main UI thread.");
        ev.z((new StringBuilder()).append("Adapter called onAdFailedToLoad with error. ").append(i).toString());
        try
        {
            nR.onAdFailedToLoad(i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            ev.c("Could not call onAdFailedToLoad.", mediationbanneradapter);
        }
    }

    public void onAdFailedToLoad(MediationInterstitialAdapter mediationinterstitialadapter, int i)
    {
        hn.ay("onAdFailedToLoad must be called on the main UI thread.");
        ev.z((new StringBuilder()).append("Adapter called onAdFailedToLoad with error ").append(i).append(".").toString());
        try
        {
            nR.onAdFailedToLoad(i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            ev.c("Could not call onAdFailedToLoad.", mediationinterstitialadapter);
        }
    }

    public void onAdLeftApplication(MediationBannerAdapter mediationbanneradapter)
    {
        hn.ay("onAdLeftApplication must be called on the main UI thread.");
        ev.z("Adapter called onAdLeftApplication.");
        try
        {
            nR.onAdLeftApplication();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            ev.c("Could not call onAdLeftApplication.", mediationbanneradapter);
        }
    }

    public void onAdLeftApplication(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        hn.ay("onAdLeftApplication must be called on the main UI thread.");
        ev.z("Adapter called onAdLeftApplication.");
        try
        {
            nR.onAdLeftApplication();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            ev.c("Could not call onAdLeftApplication.", mediationinterstitialadapter);
        }
    }

    public void onAdLoaded(MediationBannerAdapter mediationbanneradapter)
    {
        hn.ay("onAdLoaded must be called on the main UI thread.");
        ev.z("Adapter called onAdLoaded.");
        try
        {
            nR.onAdLoaded();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            ev.c("Could not call onAdLoaded.", mediationbanneradapter);
        }
    }

    public void onAdLoaded(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        hn.ay("onAdLoaded must be called on the main UI thread.");
        ev.z("Adapter called onAdLoaded.");
        try
        {
            nR.onAdLoaded();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            ev.c("Could not call onAdLoaded.", mediationinterstitialadapter);
        }
    }

    public void onAdOpened(MediationBannerAdapter mediationbanneradapter)
    {
        hn.ay("onAdOpened must be called on the main UI thread.");
        ev.z("Adapter called onAdOpened.");
        try
        {
            nR.onAdOpened();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            ev.c("Could not call onAdOpened.", mediationbanneradapter);
        }
    }

    public void onAdOpened(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        hn.ay("onAdOpened must be called on the main UI thread.");
        ev.z("Adapter called onAdOpened.");
        try
        {
            nR.onAdOpened();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            ev.c("Could not call onAdOpened.", mediationinterstitialadapter);
        }
    }
}
