// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.a;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.e;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            dw, ah, bt, bv, 
//            ak, bs

public final class bu extends br.a
{

    private final MediationAdapter nE;
    private final Bundle nF;

    public bu(MediationAdapter mediationadapter, Bundle bundle)
    {
        nE = mediationadapter;
        nF = bundle;
    }

    private Bundle a(String s, int i, String s1)
        throws RemoteException
    {
        Bundle bundle;
        dw.z((new StringBuilder()).append("Server parameters: ").append(s).toString());
        Iterator iterator;
        String s2;
        try
        {
            bundle = new Bundle();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            dw.c("Could not get Server Parameters Bundle.", s);
            throw new RemoteException();
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        s = new JSONObject(s);
        bundle = new Bundle();
        for (iterator = s.keys(); iterator.hasNext(); bundle.putString(s2, s.getString(s2)))
        {
            s2 = (String)iterator.next();
        }

        if (nE instanceof AdMobAdapter)
        {
            bundle.putString("adJson", s1);
            bundle.putInt("tagForChildDirectedTreatment", i);
        }
        return bundle;
    }

    public void a(d d, ah ah1, String s, bs bs)
        throws RemoteException
    {
        a(d, ah1, s, null, bs);
    }

    public void a(d d, ah ah1, String s, String s1, bs bs)
        throws RemoteException
    {
        if (!(nE instanceof MediationInterstitialAdapter))
        {
            dw.z((new StringBuilder()).append("MediationAdapter is not a MediationInterstitialAdapter: ").append(nE.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        dw.v("Requesting interstitial ad from adapter.");
        Object obj;
        MediationInterstitialAdapter mediationinterstitialadapter;
        mediationinterstitialadapter = (MediationInterstitialAdapter)nE;
        if (ah1.lJ == null)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        obj = new HashSet(ah1.lJ);
_L1:
        obj = new bt(new Date(ah1.lH), ah1.lI, ((java.util.Set) (obj)), ah1.lK, ah1.lL);
        mediationinterstitialadapter.requestInterstitialAd((Context)e.d(d), new bv(bs), a(s, ah1.lL, s1), ((com.google.android.gms.ads.mediation.MediationAdRequest) (obj)), nF);
        return;
        obj = null;
          goto _L1
        d;
        dw.c("Could not request interstitial ad from adapter.", d);
        throw new RemoteException();
    }

    public void a(d d, ak ak1, ah ah1, String s, bs bs)
        throws RemoteException
    {
        a(d, ak1, ah1, s, null, bs);
    }

    public void a(d d, ak ak1, ah ah1, String s, String s1, bs bs)
        throws RemoteException
    {
        if (!(nE instanceof MediationBannerAdapter))
        {
            dw.z((new StringBuilder()).append("MediationAdapter is not a MediationBannerAdapter: ").append(nE.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        dw.v("Requesting banner ad from adapter.");
        Object obj;
        MediationBannerAdapter mediationbanneradapter;
        mediationbanneradapter = (MediationBannerAdapter)nE;
        if (ah1.lJ == null)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        obj = new HashSet(ah1.lJ);
_L1:
        obj = new bt(new Date(ah1.lH), ah1.lI, ((java.util.Set) (obj)), ah1.lK, ah1.lL);
        mediationbanneradapter.requestBannerAd((Context)e.d(d), new bv(bs), a(s, ah1.lL, s1), com.google.android.gms.ads.a.a(ak1.width, ak1.height, ak1.lS), ((com.google.android.gms.ads.mediation.MediationAdRequest) (obj)), nF);
        return;
        obj = null;
          goto _L1
        d;
        dw.c("Could not request banner ad from adapter.", d);
        throw new RemoteException();
    }

    public void destroy()
        throws RemoteException
    {
        try
        {
            nE.onDestroy();
            return;
        }
        catch (Throwable throwable)
        {
            dw.c("Could not destroy adapter.", throwable);
        }
        throw new RemoteException();
    }

    public d getView()
        throws RemoteException
    {
        if (!(nE instanceof MediationBannerAdapter))
        {
            dw.z((new StringBuilder()).append("MediationAdapter is not a MediationBannerAdapter: ").append(nE.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        d d;
        try
        {
            d = e.h(((MediationBannerAdapter)nE).getBannerView());
        }
        catch (Throwable throwable)
        {
            dw.c("Could not get banner view from adapter.", throwable);
            throw new RemoteException();
        }
        return d;
    }

    public void pause()
        throws RemoteException
    {
        try
        {
            nE.onPause();
            return;
        }
        catch (Throwable throwable)
        {
            dw.c("Could not pause adapter.", throwable);
        }
        throw new RemoteException();
    }

    public void resume()
        throws RemoteException
    {
        try
        {
            nE.onResume();
            return;
        }
        catch (Throwable throwable)
        {
            dw.c("Could not resume adapter.", throwable);
        }
        throw new RemoteException();
    }

    public void showInterstitial()
        throws RemoteException
    {
        if (!(nE instanceof MediationInterstitialAdapter))
        {
            dw.z((new StringBuilder()).append("MediationAdapter is not a MediationInterstitialAdapter: ").append(nE.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        dw.v("Showing interstitial from adapter.");
        try
        {
            ((MediationInterstitialAdapter)nE).showInterstitial();
            return;
        }
        catch (Throwable throwable)
        {
            dw.c("Could not show interstitial from adapter.", throwable);
        }
        throw new RemoteException();
    }
}
