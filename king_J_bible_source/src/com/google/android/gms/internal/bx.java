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
//            dw, dv, bs, by

public final class bx
    implements MediationBannerListener, MediationInterstitialListener
{

    private final bs nG;

    public bx(bs bs1)
    {
        nG = bs1;
    }

    static bs a(bx bx1)
    {
        return bx1.nG;
    }

    public void onClick(MediationBannerAdapter mediationbanneradapter)
    {
        dw.v("Adapter called onClick.");
        if (!dv.bD())
        {
            dw.z("onClick must be called on the main UI thread.");
            dv.rp.post(new Runnable() {

                final bx nJ;

                public void run()
                {
                    try
                    {
                        bx.a(nJ).P();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        dw.c("Could not call onAdClicked.", remoteexception);
                    }
                }

            
            {
                nJ = bx.this;
                super();
            }
            });
            return;
        }
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

    public void onDismissScreen(MediationBannerAdapter mediationbanneradapter)
    {
        dw.v("Adapter called onDismissScreen.");
        if (!dv.bD())
        {
            dw.z("onDismissScreen must be called on the main UI thread.");
            dv.rp.post(new Runnable() {

                final bx nJ;

                public void run()
                {
                    try
                    {
                        bx.a(nJ).onAdClosed();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        dw.c("Could not call onAdClosed.", remoteexception);
                    }
                }

            
            {
                nJ = bx.this;
                super();
            }
            });
            return;
        }
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

    public void onDismissScreen(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        dw.v("Adapter called onDismissScreen.");
        if (!dv.bD())
        {
            dw.z("onDismissScreen must be called on the main UI thread.");
            dv.rp.post(new Runnable() {

                final bx nJ;

                public void run()
                {
                    try
                    {
                        bx.a(nJ).onAdClosed();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        dw.c("Could not call onAdClosed.", remoteexception);
                    }
                }

            
            {
                nJ = bx.this;
                super();
            }
            });
            return;
        }
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

    public void onFailedToReceiveAd(MediationBannerAdapter mediationbanneradapter, com.google.ads.AdRequest.ErrorCode errorcode)
    {
        dw.v((new StringBuilder()).append("Adapter called onFailedToReceiveAd with error. ").append(errorcode).toString());
        if (!dv.bD())
        {
            dw.z("onFailedToReceiveAd must be called on the main UI thread.");
            dv.rp.post(new Runnable(errorcode) {

                final bx nJ;
                final com.google.ads.AdRequest.ErrorCode nK;

                public void run()
                {
                    try
                    {
                        bx.a(nJ).onAdFailedToLoad(by.a(nK));
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        dw.c("Could not call onAdFailedToLoad.", remoteexception);
                    }
                }

            
            {
                nJ = bx.this;
                nK = errorcode;
                super();
            }
            });
            return;
        }
        try
        {
            nG.onAdFailedToLoad(by.a(errorcode));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            dw.c("Could not call onAdFailedToLoad.", mediationbanneradapter);
        }
    }

    public void onFailedToReceiveAd(MediationInterstitialAdapter mediationinterstitialadapter, com.google.ads.AdRequest.ErrorCode errorcode)
    {
        dw.v((new StringBuilder()).append("Adapter called onFailedToReceiveAd with error ").append(errorcode).append(".").toString());
        if (!dv.bD())
        {
            dw.z("onFailedToReceiveAd must be called on the main UI thread.");
            dv.rp.post(new Runnable(errorcode) {

                final bx nJ;
                final com.google.ads.AdRequest.ErrorCode nK;

                public void run()
                {
                    try
                    {
                        bx.a(nJ).onAdFailedToLoad(by.a(nK));
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        dw.c("Could not call onAdFailedToLoad.", remoteexception);
                    }
                }

            
            {
                nJ = bx.this;
                nK = errorcode;
                super();
            }
            });
            return;
        }
        try
        {
            nG.onAdFailedToLoad(by.a(errorcode));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            dw.c("Could not call onAdFailedToLoad.", mediationinterstitialadapter);
        }
    }

    public void onLeaveApplication(MediationBannerAdapter mediationbanneradapter)
    {
        dw.v("Adapter called onLeaveApplication.");
        if (!dv.bD())
        {
            dw.z("onLeaveApplication must be called on the main UI thread.");
            dv.rp.post(new Runnable() {

                final bx nJ;

                public void run()
                {
                    try
                    {
                        bx.a(nJ).onAdLeftApplication();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        dw.c("Could not call onAdLeftApplication.", remoteexception);
                    }
                }

            
            {
                nJ = bx.this;
                super();
            }
            });
            return;
        }
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

    public void onLeaveApplication(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        dw.v("Adapter called onLeaveApplication.");
        if (!dv.bD())
        {
            dw.z("onLeaveApplication must be called on the main UI thread.");
            dv.rp.post(new Runnable() {

                final bx nJ;

                public void run()
                {
                    try
                    {
                        bx.a(nJ).onAdLeftApplication();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        dw.c("Could not call onAdLeftApplication.", remoteexception);
                    }
                }

            
            {
                nJ = bx.this;
                super();
            }
            });
            return;
        }
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

    public void onPresentScreen(MediationBannerAdapter mediationbanneradapter)
    {
        dw.v("Adapter called onPresentScreen.");
        if (!dv.bD())
        {
            dw.z("onPresentScreen must be called on the main UI thread.");
            dv.rp.post(new Runnable() {

                final bx nJ;

                public void run()
                {
                    try
                    {
                        bx.a(nJ).onAdOpened();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        dw.c("Could not call onAdOpened.", remoteexception);
                    }
                }

            
            {
                nJ = bx.this;
                super();
            }
            });
            return;
        }
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

    public void onPresentScreen(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        dw.v("Adapter called onPresentScreen.");
        if (!dv.bD())
        {
            dw.z("onPresentScreen must be called on the main UI thread.");
            dv.rp.post(new Runnable() {

                final bx nJ;

                public void run()
                {
                    try
                    {
                        bx.a(nJ).onAdOpened();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        dw.c("Could not call onAdOpened.", remoteexception);
                    }
                }

            
            {
                nJ = bx.this;
                super();
            }
            });
            return;
        }
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

    public void onReceivedAd(MediationBannerAdapter mediationbanneradapter)
    {
        dw.v("Adapter called onReceivedAd.");
        if (!dv.bD())
        {
            dw.z("onReceivedAd must be called on the main UI thread.");
            dv.rp.post(new Runnable() {

                final bx nJ;

                public void run()
                {
                    try
                    {
                        bx.a(nJ).onAdLoaded();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        dw.c("Could not call onAdLoaded.", remoteexception);
                    }
                }

            
            {
                nJ = bx.this;
                super();
            }
            });
            return;
        }
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

    public void onReceivedAd(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        dw.v("Adapter called onReceivedAd.");
        if (!dv.bD())
        {
            dw.z("onReceivedAd must be called on the main UI thread.");
            dv.rp.post(new Runnable() {

                final bx nJ;

                public void run()
                {
                    try
                    {
                        bx.a(nJ).onAdLoaded();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        dw.c("Could not call onAdLoaded.", remoteexception);
                    }
                }

            
            {
                nJ = bx.this;
                super();
            }
            });
            return;
        }
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
}
