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
//            gs, gr, cv, db

public final class da
    implements MediationBannerListener, MediationInterstitialListener
{

    private final cv qF;

    public da(cv cv1)
    {
        qF = cv1;
    }

    static cv a(da da1)
    {
        return da1.qF;
    }

    public void onClick(MediationBannerAdapter mediationbanneradapter)
    {
        gs.S("Adapter called onClick.");
        if (!gr.ds())
        {
            gs.W("onClick must be called on the main UI thread.");
            gr.wC.post(new Runnable() {

                final da qI;

                public void run()
                {
                    try
                    {
                        da.a(qI).onAdClicked();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        gs.d("Could not call onAdClicked.", remoteexception);
                    }
                }

            
            {
                qI = da.this;
                super();
            }
            });
            return;
        }
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

    public void onDismissScreen(MediationBannerAdapter mediationbanneradapter)
    {
        gs.S("Adapter called onDismissScreen.");
        if (!gr.ds())
        {
            gs.W("onDismissScreen must be called on the main UI thread.");
            gr.wC.post(new Runnable() {

                final da qI;

                public void run()
                {
                    try
                    {
                        da.a(qI).onAdClosed();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        gs.d("Could not call onAdClosed.", remoteexception);
                    }
                }

            
            {
                qI = da.this;
                super();
            }
            });
            return;
        }
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

    public void onDismissScreen(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        gs.S("Adapter called onDismissScreen.");
        if (!gr.ds())
        {
            gs.W("onDismissScreen must be called on the main UI thread.");
            gr.wC.post(new Runnable() {

                final da qI;

                public void run()
                {
                    try
                    {
                        da.a(qI).onAdClosed();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        gs.d("Could not call onAdClosed.", remoteexception);
                    }
                }

            
            {
                qI = da.this;
                super();
            }
            });
            return;
        }
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

    public void onFailedToReceiveAd(MediationBannerAdapter mediationbanneradapter, com.google.ads.AdRequest.ErrorCode errorcode)
    {
        gs.S((new StringBuilder()).append("Adapter called onFailedToReceiveAd with error. ").append(errorcode).toString());
        if (!gr.ds())
        {
            gs.W("onFailedToReceiveAd must be called on the main UI thread.");
            gr.wC.post(new Runnable(errorcode) {

                final da qI;
                final com.google.ads.AdRequest.ErrorCode qJ;

                public void run()
                {
                    try
                    {
                        da.a(qI).onAdFailedToLoad(db.a(qJ));
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        gs.d("Could not call onAdFailedToLoad.", remoteexception);
                    }
                }

            
            {
                qI = da.this;
                qJ = errorcode;
                super();
            }
            });
            return;
        }
        try
        {
            qF.onAdFailedToLoad(db.a(errorcode));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            gs.d("Could not call onAdFailedToLoad.", mediationbanneradapter);
        }
    }

    public void onFailedToReceiveAd(MediationInterstitialAdapter mediationinterstitialadapter, com.google.ads.AdRequest.ErrorCode errorcode)
    {
        gs.S((new StringBuilder()).append("Adapter called onFailedToReceiveAd with error ").append(errorcode).append(".").toString());
        if (!gr.ds())
        {
            gs.W("onFailedToReceiveAd must be called on the main UI thread.");
            gr.wC.post(new Runnable(errorcode) {

                final da qI;
                final com.google.ads.AdRequest.ErrorCode qJ;

                public void run()
                {
                    try
                    {
                        da.a(qI).onAdFailedToLoad(db.a(qJ));
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        gs.d("Could not call onAdFailedToLoad.", remoteexception);
                    }
                }

            
            {
                qI = da.this;
                qJ = errorcode;
                super();
            }
            });
            return;
        }
        try
        {
            qF.onAdFailedToLoad(db.a(errorcode));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            gs.d("Could not call onAdFailedToLoad.", mediationinterstitialadapter);
        }
    }

    public void onLeaveApplication(MediationBannerAdapter mediationbanneradapter)
    {
        gs.S("Adapter called onLeaveApplication.");
        if (!gr.ds())
        {
            gs.W("onLeaveApplication must be called on the main UI thread.");
            gr.wC.post(new Runnable() {

                final da qI;

                public void run()
                {
                    try
                    {
                        da.a(qI).onAdLeftApplication();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        gs.d("Could not call onAdLeftApplication.", remoteexception);
                    }
                }

            
            {
                qI = da.this;
                super();
            }
            });
            return;
        }
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

    public void onLeaveApplication(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        gs.S("Adapter called onLeaveApplication.");
        if (!gr.ds())
        {
            gs.W("onLeaveApplication must be called on the main UI thread.");
            gr.wC.post(new Runnable() {

                final da qI;

                public void run()
                {
                    try
                    {
                        da.a(qI).onAdLeftApplication();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        gs.d("Could not call onAdLeftApplication.", remoteexception);
                    }
                }

            
            {
                qI = da.this;
                super();
            }
            });
            return;
        }
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

    public void onPresentScreen(MediationBannerAdapter mediationbanneradapter)
    {
        gs.S("Adapter called onPresentScreen.");
        if (!gr.ds())
        {
            gs.W("onPresentScreen must be called on the main UI thread.");
            gr.wC.post(new Runnable() {

                final da qI;

                public void run()
                {
                    try
                    {
                        da.a(qI).onAdOpened();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        gs.d("Could not call onAdOpened.", remoteexception);
                    }
                }

            
            {
                qI = da.this;
                super();
            }
            });
            return;
        }
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

    public void onPresentScreen(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        gs.S("Adapter called onPresentScreen.");
        if (!gr.ds())
        {
            gs.W("onPresentScreen must be called on the main UI thread.");
            gr.wC.post(new Runnable() {

                final da qI;

                public void run()
                {
                    try
                    {
                        da.a(qI).onAdOpened();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        gs.d("Could not call onAdOpened.", remoteexception);
                    }
                }

            
            {
                qI = da.this;
                super();
            }
            });
            return;
        }
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

    public void onReceivedAd(MediationBannerAdapter mediationbanneradapter)
    {
        gs.S("Adapter called onReceivedAd.");
        if (!gr.ds())
        {
            gs.W("onReceivedAd must be called on the main UI thread.");
            gr.wC.post(new Runnable() {

                final da qI;

                public void run()
                {
                    try
                    {
                        da.a(qI).onAdLoaded();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        gs.d("Could not call onAdLoaded.", remoteexception);
                    }
                }

            
            {
                qI = da.this;
                super();
            }
            });
            return;
        }
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

    public void onReceivedAd(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        gs.S("Adapter called onReceivedAd.");
        if (!gr.ds())
        {
            gs.W("onReceivedAd must be called on the main UI thread.");
            gr.wC.post(new Runnable() {

                final da qI;

                public void run()
                {
                    try
                    {
                        da.a(qI).onAdLoaded();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        gs.d("Could not call onAdLoaded.", remoteexception);
                    }
                }

            
            {
                qI = da.this;
                super();
            }
            });
            return;
        }
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
}
