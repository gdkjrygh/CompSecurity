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
//            gr, gq, da, dg

public final class df
    implements MediationBannerListener, MediationInterstitialListener
{

    private final da qW;

    public df(da da1)
    {
        qW = da1;
    }

    static da a(df df1)
    {
        return df1.qW;
    }

    public void onClick(MediationBannerAdapter mediationbanneradapter)
    {
        gr.S("Adapter called onClick.");
        if (!gq.dB())
        {
            gr.W("onClick must be called on the main UI thread.");
            gq.wR.post(new Runnable() {

                final df qZ;

                public void run()
                {
                    try
                    {
                        df.a(qZ).onAdClicked();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        gr.d("Could not call onAdClicked.", remoteexception);
                    }
                }

            
            {
                qZ = df.this;
                super();
            }
            });
            return;
        }
        try
        {
            qW.onAdClicked();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            gr.d("Could not call onAdClicked.", mediationbanneradapter);
        }
    }

    public void onDismissScreen(MediationBannerAdapter mediationbanneradapter)
    {
        gr.S("Adapter called onDismissScreen.");
        if (!gq.dB())
        {
            gr.W("onDismissScreen must be called on the main UI thread.");
            gq.wR.post(new Runnable() {

                final df qZ;

                public void run()
                {
                    try
                    {
                        df.a(qZ).onAdClosed();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        gr.d("Could not call onAdClosed.", remoteexception);
                    }
                }

            
            {
                qZ = df.this;
                super();
            }
            });
            return;
        }
        try
        {
            qW.onAdClosed();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            gr.d("Could not call onAdClosed.", mediationbanneradapter);
        }
    }

    public void onDismissScreen(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        gr.S("Adapter called onDismissScreen.");
        if (!gq.dB())
        {
            gr.W("onDismissScreen must be called on the main UI thread.");
            gq.wR.post(new Runnable() {

                final df qZ;

                public void run()
                {
                    try
                    {
                        df.a(qZ).onAdClosed();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        gr.d("Could not call onAdClosed.", remoteexception);
                    }
                }

            
            {
                qZ = df.this;
                super();
            }
            });
            return;
        }
        try
        {
            qW.onAdClosed();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            gr.d("Could not call onAdClosed.", mediationinterstitialadapter);
        }
    }

    public void onFailedToReceiveAd(MediationBannerAdapter mediationbanneradapter, com.google.ads.AdRequest.ErrorCode errorcode)
    {
        gr.S((new StringBuilder()).append("Adapter called onFailedToReceiveAd with error. ").append(errorcode).toString());
        if (!gq.dB())
        {
            gr.W("onFailedToReceiveAd must be called on the main UI thread.");
            gq.wR.post(new Runnable(errorcode) {

                final df qZ;
                final com.google.ads.AdRequest.ErrorCode ra;

                public void run()
                {
                    try
                    {
                        df.a(qZ).onAdFailedToLoad(dg.a(ra));
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        gr.d("Could not call onAdFailedToLoad.", remoteexception);
                    }
                }

            
            {
                qZ = df.this;
                ra = errorcode;
                super();
            }
            });
            return;
        }
        try
        {
            qW.onAdFailedToLoad(dg.a(errorcode));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            gr.d("Could not call onAdFailedToLoad.", mediationbanneradapter);
        }
    }

    public void onFailedToReceiveAd(MediationInterstitialAdapter mediationinterstitialadapter, com.google.ads.AdRequest.ErrorCode errorcode)
    {
        gr.S((new StringBuilder()).append("Adapter called onFailedToReceiveAd with error ").append(errorcode).append(".").toString());
        if (!gq.dB())
        {
            gr.W("onFailedToReceiveAd must be called on the main UI thread.");
            gq.wR.post(new Runnable(errorcode) {

                final df qZ;
                final com.google.ads.AdRequest.ErrorCode ra;

                public void run()
                {
                    try
                    {
                        df.a(qZ).onAdFailedToLoad(dg.a(ra));
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        gr.d("Could not call onAdFailedToLoad.", remoteexception);
                    }
                }

            
            {
                qZ = df.this;
                ra = errorcode;
                super();
            }
            });
            return;
        }
        try
        {
            qW.onAdFailedToLoad(dg.a(errorcode));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            gr.d("Could not call onAdFailedToLoad.", mediationinterstitialadapter);
        }
    }

    public void onLeaveApplication(MediationBannerAdapter mediationbanneradapter)
    {
        gr.S("Adapter called onLeaveApplication.");
        if (!gq.dB())
        {
            gr.W("onLeaveApplication must be called on the main UI thread.");
            gq.wR.post(new Runnable() {

                final df qZ;

                public void run()
                {
                    try
                    {
                        df.a(qZ).onAdLeftApplication();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        gr.d("Could not call onAdLeftApplication.", remoteexception);
                    }
                }

            
            {
                qZ = df.this;
                super();
            }
            });
            return;
        }
        try
        {
            qW.onAdLeftApplication();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            gr.d("Could not call onAdLeftApplication.", mediationbanneradapter);
        }
    }

    public void onLeaveApplication(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        gr.S("Adapter called onLeaveApplication.");
        if (!gq.dB())
        {
            gr.W("onLeaveApplication must be called on the main UI thread.");
            gq.wR.post(new Runnable() {

                final df qZ;

                public void run()
                {
                    try
                    {
                        df.a(qZ).onAdLeftApplication();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        gr.d("Could not call onAdLeftApplication.", remoteexception);
                    }
                }

            
            {
                qZ = df.this;
                super();
            }
            });
            return;
        }
        try
        {
            qW.onAdLeftApplication();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            gr.d("Could not call onAdLeftApplication.", mediationinterstitialadapter);
        }
    }

    public void onPresentScreen(MediationBannerAdapter mediationbanneradapter)
    {
        gr.S("Adapter called onPresentScreen.");
        if (!gq.dB())
        {
            gr.W("onPresentScreen must be called on the main UI thread.");
            gq.wR.post(new Runnable() {

                final df qZ;

                public void run()
                {
                    try
                    {
                        df.a(qZ).onAdOpened();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        gr.d("Could not call onAdOpened.", remoteexception);
                    }
                }

            
            {
                qZ = df.this;
                super();
            }
            });
            return;
        }
        try
        {
            qW.onAdOpened();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            gr.d("Could not call onAdOpened.", mediationbanneradapter);
        }
    }

    public void onPresentScreen(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        gr.S("Adapter called onPresentScreen.");
        if (!gq.dB())
        {
            gr.W("onPresentScreen must be called on the main UI thread.");
            gq.wR.post(new Runnable() {

                final df qZ;

                public void run()
                {
                    try
                    {
                        df.a(qZ).onAdOpened();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        gr.d("Could not call onAdOpened.", remoteexception);
                    }
                }

            
            {
                qZ = df.this;
                super();
            }
            });
            return;
        }
        try
        {
            qW.onAdOpened();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            gr.d("Could not call onAdOpened.", mediationinterstitialadapter);
        }
    }

    public void onReceivedAd(MediationBannerAdapter mediationbanneradapter)
    {
        gr.S("Adapter called onReceivedAd.");
        if (!gq.dB())
        {
            gr.W("onReceivedAd must be called on the main UI thread.");
            gq.wR.post(new Runnable() {

                final df qZ;

                public void run()
                {
                    try
                    {
                        df.a(qZ).onAdLoaded();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        gr.d("Could not call onAdLoaded.", remoteexception);
                    }
                }

            
            {
                qZ = df.this;
                super();
            }
            });
            return;
        }
        try
        {
            qW.onAdLoaded();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            gr.d("Could not call onAdLoaded.", mediationbanneradapter);
        }
    }

    public void onReceivedAd(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        gr.S("Adapter called onReceivedAd.");
        if (!gq.dB())
        {
            gr.W("onReceivedAd must be called on the main UI thread.");
            gq.wR.post(new Runnable() {

                final df qZ;

                public void run()
                {
                    try
                    {
                        df.a(qZ).onAdLoaded();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        gr.d("Could not call onAdLoaded.", remoteexception);
                    }
                }

            
            {
                qZ = df.this;
                super();
            }
            });
            return;
        }
        try
        {
            qW.onAdLoaded();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            gr.d("Could not call onAdLoaded.", mediationinterstitialadapter);
        }
    }
}
