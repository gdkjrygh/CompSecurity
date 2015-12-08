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
//            cn, cm, ay, bb

public final class ba
    implements MediationBannerListener, MediationInterstitialListener
{

    private final ay ft;

    public ba(ay ay1)
    {
        ft = ay1;
    }

    static ay a(ba ba1)
    {
        return ba1.ft;
    }

    public void onClick(MediationBannerAdapter mediationbanneradapter)
    {
        cn.m("Adapter called onClick.");
        if (!cm.ar())
        {
            cn.q("onClick must be called on the main UI thread.");
            cm.hO.post(new Runnable() {

                final ba fu;

                public void run()
                {
                    try
                    {
                        ba.a(fu).y();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        cn.b("Could not call onAdClicked.", remoteexception);
                    }
                }

            
            {
                fu = ba.this;
                super();
            }
            });
            return;
        }
        try
        {
            ft.y();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            cn.b("Could not call onAdClicked.", mediationbanneradapter);
        }
    }

    public void onDismissScreen(MediationBannerAdapter mediationbanneradapter)
    {
        cn.m("Adapter called onDismissScreen.");
        if (!cm.ar())
        {
            cn.q("onDismissScreen must be called on the main UI thread.");
            cm.hO.post(new Runnable() {

                final ba fu;

                public void run()
                {
                    try
                    {
                        ba.a(fu).onAdClosed();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        cn.b("Could not call onAdClosed.", remoteexception);
                    }
                }

            
            {
                fu = ba.this;
                super();
            }
            });
            return;
        }
        try
        {
            ft.onAdClosed();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            cn.b("Could not call onAdClosed.", mediationbanneradapter);
        }
    }

    public void onDismissScreen(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        cn.m("Adapter called onDismissScreen.");
        if (!cm.ar())
        {
            cn.q("onDismissScreen must be called on the main UI thread.");
            cm.hO.post(new Runnable() {

                final ba fu;

                public void run()
                {
                    try
                    {
                        ba.a(fu).onAdClosed();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        cn.b("Could not call onAdClosed.", remoteexception);
                    }
                }

            
            {
                fu = ba.this;
                super();
            }
            });
            return;
        }
        try
        {
            ft.onAdClosed();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            cn.b("Could not call onAdClosed.", mediationinterstitialadapter);
        }
    }

    public void onFailedToReceiveAd(MediationBannerAdapter mediationbanneradapter, com.google.ads.AdRequest.ErrorCode errorcode)
    {
        cn.m((new StringBuilder()).append("Adapter called onFailedToReceiveAd with error. ").append(errorcode).toString());
        if (!cm.ar())
        {
            cn.q("onFailedToReceiveAd must be called on the main UI thread.");
            cm.hO.post(new Runnable(errorcode) {

                final ba fu;
                final com.google.ads.AdRequest.ErrorCode fv;

                public void run()
                {
                    try
                    {
                        ba.a(fu).onAdFailedToLoad(bb.a(fv));
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        cn.b("Could not call onAdFailedToLoad.", remoteexception);
                    }
                }

            
            {
                fu = ba.this;
                fv = errorcode;
                super();
            }
            });
            return;
        }
        try
        {
            ft.onAdFailedToLoad(bb.a(errorcode));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            cn.b("Could not call onAdFailedToLoad.", mediationbanneradapter);
        }
    }

    public void onFailedToReceiveAd(MediationInterstitialAdapter mediationinterstitialadapter, com.google.ads.AdRequest.ErrorCode errorcode)
    {
        cn.m((new StringBuilder()).append("Adapter called onFailedToReceiveAd with error ").append(errorcode).append(".").toString());
        if (!cm.ar())
        {
            cn.q("onFailedToReceiveAd must be called on the main UI thread.");
            cm.hO.post(new Runnable(errorcode) {

                final ba fu;
                final com.google.ads.AdRequest.ErrorCode fv;

                public void run()
                {
                    try
                    {
                        ba.a(fu).onAdFailedToLoad(bb.a(fv));
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        cn.b("Could not call onAdFailedToLoad.", remoteexception);
                    }
                }

            
            {
                fu = ba.this;
                fv = errorcode;
                super();
            }
            });
            return;
        }
        try
        {
            ft.onAdFailedToLoad(bb.a(errorcode));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            cn.b("Could not call onAdFailedToLoad.", mediationinterstitialadapter);
        }
    }

    public void onLeaveApplication(MediationBannerAdapter mediationbanneradapter)
    {
        cn.m("Adapter called onLeaveApplication.");
        if (!cm.ar())
        {
            cn.q("onLeaveApplication must be called on the main UI thread.");
            cm.hO.post(new Runnable() {

                final ba fu;

                public void run()
                {
                    try
                    {
                        ba.a(fu).onAdLeftApplication();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        cn.b("Could not call onAdLeftApplication.", remoteexception);
                    }
                }

            
            {
                fu = ba.this;
                super();
            }
            });
            return;
        }
        try
        {
            ft.onAdLeftApplication();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            cn.b("Could not call onAdLeftApplication.", mediationbanneradapter);
        }
    }

    public void onLeaveApplication(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        cn.m("Adapter called onLeaveApplication.");
        if (!cm.ar())
        {
            cn.q("onLeaveApplication must be called on the main UI thread.");
            cm.hO.post(new Runnable() {

                final ba fu;

                public void run()
                {
                    try
                    {
                        ba.a(fu).onAdLeftApplication();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        cn.b("Could not call onAdLeftApplication.", remoteexception);
                    }
                }

            
            {
                fu = ba.this;
                super();
            }
            });
            return;
        }
        try
        {
            ft.onAdLeftApplication();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            cn.b("Could not call onAdLeftApplication.", mediationinterstitialadapter);
        }
    }

    public void onPresentScreen(MediationBannerAdapter mediationbanneradapter)
    {
        cn.m("Adapter called onPresentScreen.");
        if (!cm.ar())
        {
            cn.q("onPresentScreen must be called on the main UI thread.");
            cm.hO.post(new Runnable() {

                final ba fu;

                public void run()
                {
                    try
                    {
                        ba.a(fu).onAdOpened();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        cn.b("Could not call onAdOpened.", remoteexception);
                    }
                }

            
            {
                fu = ba.this;
                super();
            }
            });
            return;
        }
        try
        {
            ft.onAdOpened();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            cn.b("Could not call onAdOpened.", mediationbanneradapter);
        }
    }

    public void onPresentScreen(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        cn.m("Adapter called onPresentScreen.");
        if (!cm.ar())
        {
            cn.q("onPresentScreen must be called on the main UI thread.");
            cm.hO.post(new Runnable() {

                final ba fu;

                public void run()
                {
                    try
                    {
                        ba.a(fu).onAdOpened();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        cn.b("Could not call onAdOpened.", remoteexception);
                    }
                }

            
            {
                fu = ba.this;
                super();
            }
            });
            return;
        }
        try
        {
            ft.onAdOpened();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            cn.b("Could not call onAdOpened.", mediationinterstitialadapter);
        }
    }

    public void onReceivedAd(MediationBannerAdapter mediationbanneradapter)
    {
        cn.m("Adapter called onReceivedAd.");
        if (!cm.ar())
        {
            cn.q("onReceivedAd must be called on the main UI thread.");
            cm.hO.post(new Runnable() {

                final ba fu;

                public void run()
                {
                    try
                    {
                        ba.a(fu).onAdLoaded();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        cn.b("Could not call onAdLoaded.", remoteexception);
                    }
                }

            
            {
                fu = ba.this;
                super();
            }
            });
            return;
        }
        try
        {
            ft.onAdLoaded();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            cn.b("Could not call onAdLoaded.", mediationbanneradapter);
        }
    }

    public void onReceivedAd(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        cn.m("Adapter called onReceivedAd.");
        if (!cm.ar())
        {
            cn.q("onReceivedAd must be called on the main UI thread.");
            cm.hO.post(new Runnable() {

                final ba fu;

                public void run()
                {
                    try
                    {
                        ba.a(fu).onAdLoaded();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        cn.b("Could not call onAdLoaded.", remoteexception);
                    }
                }

            
            {
                fu = ba.this;
                super();
            }
            });
            return;
        }
        try
        {
            ft.onAdLoaded();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            cn.b("Could not call onAdLoaded.", mediationinterstitialadapter);
        }
    }
}
