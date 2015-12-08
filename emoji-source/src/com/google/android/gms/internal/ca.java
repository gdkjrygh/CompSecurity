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

// Referenced classes of package com.google.android.gms.internal:
//            eu, et, bv, cb

public final class ca
    implements MediationBannerListener, MediationInterstitialListener
{

    private final bv nT;

    public ca(bv bv1)
    {
        nT = bv1;
    }

    static bv a(ca ca1)
    {
        return ca1.nT;
    }

    public void onClick(MediationBannerAdapter mediationbanneradapter)
    {
        eu.z("Adapter called onClick.");
        if (!et.bW())
        {
            eu.D("onClick must be called on the main UI thread.");
            et.sv.post(new Runnable() {

                final ca nW;

                public void run()
                {
                    try
                    {
                        ca.a(nW).onAdClicked();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        eu.c("Could not call onAdClicked.", remoteexception);
                    }
                }

            
            {
                nW = ca.this;
                super();
            }
            });
            return;
        }
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

    public void onDismissScreen(MediationBannerAdapter mediationbanneradapter)
    {
        eu.z("Adapter called onDismissScreen.");
        if (!et.bW())
        {
            eu.D("onDismissScreen must be called on the main UI thread.");
            et.sv.post(new Runnable() {

                final ca nW;

                public void run()
                {
                    try
                    {
                        ca.a(nW).onAdClosed();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        eu.c("Could not call onAdClosed.", remoteexception);
                    }
                }

            
            {
                nW = ca.this;
                super();
            }
            });
            return;
        }
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

    public void onDismissScreen(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        eu.z("Adapter called onDismissScreen.");
        if (!et.bW())
        {
            eu.D("onDismissScreen must be called on the main UI thread.");
            et.sv.post(new Runnable() {

                final ca nW;

                public void run()
                {
                    try
                    {
                        ca.a(nW).onAdClosed();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        eu.c("Could not call onAdClosed.", remoteexception);
                    }
                }

            
            {
                nW = ca.this;
                super();
            }
            });
            return;
        }
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

    public void onFailedToReceiveAd(MediationBannerAdapter mediationbanneradapter, com.google.ads.AdRequest.ErrorCode errorcode)
    {
        eu.z((new StringBuilder()).append("Adapter called onFailedToReceiveAd with error. ").append(errorcode).toString());
        if (!et.bW())
        {
            eu.D("onFailedToReceiveAd must be called on the main UI thread.");
            et.sv.post(new Runnable(errorcode) {

                final ca nW;
                final com.google.ads.AdRequest.ErrorCode nX;

                public void run()
                {
                    try
                    {
                        ca.a(nW).onAdFailedToLoad(cb.a(nX));
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        eu.c("Could not call onAdFailedToLoad.", remoteexception);
                    }
                }

            
            {
                nW = ca.this;
                nX = errorcode;
                super();
            }
            });
            return;
        }
        try
        {
            nT.onAdFailedToLoad(cb.a(errorcode));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            eu.c("Could not call onAdFailedToLoad.", mediationbanneradapter);
        }
    }

    public void onFailedToReceiveAd(MediationInterstitialAdapter mediationinterstitialadapter, com.google.ads.AdRequest.ErrorCode errorcode)
    {
        eu.z((new StringBuilder()).append("Adapter called onFailedToReceiveAd with error ").append(errorcode).append(".").toString());
        if (!et.bW())
        {
            eu.D("onFailedToReceiveAd must be called on the main UI thread.");
            et.sv.post(new Runnable(errorcode) {

                final ca nW;
                final com.google.ads.AdRequest.ErrorCode nX;

                public void run()
                {
                    try
                    {
                        ca.a(nW).onAdFailedToLoad(cb.a(nX));
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        eu.c("Could not call onAdFailedToLoad.", remoteexception);
                    }
                }

            
            {
                nW = ca.this;
                nX = errorcode;
                super();
            }
            });
            return;
        }
        try
        {
            nT.onAdFailedToLoad(cb.a(errorcode));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            eu.c("Could not call onAdFailedToLoad.", mediationinterstitialadapter);
        }
    }

    public void onLeaveApplication(MediationBannerAdapter mediationbanneradapter)
    {
        eu.z("Adapter called onLeaveApplication.");
        if (!et.bW())
        {
            eu.D("onLeaveApplication must be called on the main UI thread.");
            et.sv.post(new Runnable() {

                final ca nW;

                public void run()
                {
                    try
                    {
                        ca.a(nW).onAdLeftApplication();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        eu.c("Could not call onAdLeftApplication.", remoteexception);
                    }
                }

            
            {
                nW = ca.this;
                super();
            }
            });
            return;
        }
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

    public void onLeaveApplication(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        eu.z("Adapter called onLeaveApplication.");
        if (!et.bW())
        {
            eu.D("onLeaveApplication must be called on the main UI thread.");
            et.sv.post(new Runnable() {

                final ca nW;

                public void run()
                {
                    try
                    {
                        ca.a(nW).onAdLeftApplication();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        eu.c("Could not call onAdLeftApplication.", remoteexception);
                    }
                }

            
            {
                nW = ca.this;
                super();
            }
            });
            return;
        }
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

    public void onPresentScreen(MediationBannerAdapter mediationbanneradapter)
    {
        eu.z("Adapter called onPresentScreen.");
        if (!et.bW())
        {
            eu.D("onPresentScreen must be called on the main UI thread.");
            et.sv.post(new Runnable() {

                final ca nW;

                public void run()
                {
                    try
                    {
                        ca.a(nW).onAdOpened();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        eu.c("Could not call onAdOpened.", remoteexception);
                    }
                }

            
            {
                nW = ca.this;
                super();
            }
            });
            return;
        }
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

    public void onPresentScreen(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        eu.z("Adapter called onPresentScreen.");
        if (!et.bW())
        {
            eu.D("onPresentScreen must be called on the main UI thread.");
            et.sv.post(new Runnable() {

                final ca nW;

                public void run()
                {
                    try
                    {
                        ca.a(nW).onAdOpened();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        eu.c("Could not call onAdOpened.", remoteexception);
                    }
                }

            
            {
                nW = ca.this;
                super();
            }
            });
            return;
        }
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

    public void onReceivedAd(MediationBannerAdapter mediationbanneradapter)
    {
        eu.z("Adapter called onReceivedAd.");
        if (!et.bW())
        {
            eu.D("onReceivedAd must be called on the main UI thread.");
            et.sv.post(new Runnable() {

                final ca nW;

                public void run()
                {
                    try
                    {
                        ca.a(nW).onAdLoaded();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        eu.c("Could not call onAdLoaded.", remoteexception);
                    }
                }

            
            {
                nW = ca.this;
                super();
            }
            });
            return;
        }
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

    public void onReceivedAd(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        eu.z("Adapter called onReceivedAd.");
        if (!et.bW())
        {
            eu.D("onReceivedAd must be called on the main UI thread.");
            et.sv.post(new Runnable() {

                final ca nW;

                public void run()
                {
                    try
                    {
                        ca.a(nW).onAdLoaded();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        eu.c("Could not call onAdLoaded.", remoteexception);
                    }
                }

            
            {
                nW = ca.this;
                super();
            }
            });
            return;
        }
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
}
