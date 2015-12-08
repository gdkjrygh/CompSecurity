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
//            eu, ai, bw, by, 
//            al, bv

public final class bx extends bu.a
{

    private final MediationAdapter nS;

    public bx(MediationAdapter mediationadapter)
    {
        nS = mediationadapter;
    }

    private Bundle a(String s, int i, String s1)
        throws RemoteException
    {
        Bundle bundle;
        eu.D((new StringBuilder()).append("Server parameters: ").append(s).toString());
        Iterator iterator;
        String s2;
        try
        {
            bundle = new Bundle();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            eu.c("Could not get Server Parameters Bundle.", s);
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

        if (nS instanceof AdMobAdapter)
        {
            bundle.putString("adJson", s1);
            bundle.putInt("tagForChildDirectedTreatment", i);
        }
        return bundle;
    }

    public void a(d d, ai ai1, String s, bv bv)
        throws RemoteException
    {
        a(d, ai1, s, null, bv);
    }

    public void a(d d, ai ai1, String s, String s1, bv bv)
        throws RemoteException
    {
        Object obj1;
        obj1 = null;
        if (!(nS instanceof MediationInterstitialAdapter))
        {
            eu.D((new StringBuilder()).append("MediationAdapter is not a MediationInterstitialAdapter: ").append(nS.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        eu.z("Requesting interstitial ad from adapter.");
        Object obj;
        MediationInterstitialAdapter mediationinterstitialadapter;
        mediationinterstitialadapter = (MediationInterstitialAdapter)nS;
        if (ai1.lU == null)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        obj = new HashSet(ai1.lU);
_L1:
        bw bw1 = new bw(new Date(ai1.lS), ai1.lT, ((java.util.Set) (obj)), ai1.lV, ai1.lW);
        obj = obj1;
        try
        {
            if (ai1.mc != null)
            {
                obj = ai1.mc.getBundle(mediationinterstitialadapter.getClass().getName());
            }
            mediationinterstitialadapter.requestInterstitialAd((Context)e.e(d), new by(bv), a(s, ai1.lW, s1), bw1, ((Bundle) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (d d)
        {
            eu.c("Could not request interstitial ad from adapter.", d);
        }
        break MISSING_BLOCK_LABEL_200;
        obj = null;
          goto _L1
        throw new RemoteException();
    }

    public void a(d d, al al1, ai ai1, String s, bv bv)
        throws RemoteException
    {
        a(d, al1, ai1, s, null, bv);
    }

    public void a(d d, al al1, ai ai1, String s, String s1, bv bv)
        throws RemoteException
    {
        Object obj1;
        obj1 = null;
        if (!(nS instanceof MediationBannerAdapter))
        {
            eu.D((new StringBuilder()).append("MediationAdapter is not a MediationBannerAdapter: ").append(nS.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        eu.z("Requesting banner ad from adapter.");
        Object obj;
        MediationBannerAdapter mediationbanneradapter;
        mediationbanneradapter = (MediationBannerAdapter)nS;
        if (ai1.lU == null)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        obj = new HashSet(ai1.lU);
_L1:
        bw bw1 = new bw(new Date(ai1.lS), ai1.lT, ((java.util.Set) (obj)), ai1.lV, ai1.lW);
        obj = obj1;
        try
        {
            if (ai1.mc != null)
            {
                obj = ai1.mc.getBundle(mediationbanneradapter.getClass().getName());
            }
            mediationbanneradapter.requestBannerAd((Context)e.e(d), new by(bv), a(s, ai1.lW, s1), com.google.android.gms.ads.a.a(al1.width, al1.height, al1.me), bw1, ((Bundle) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (d d)
        {
            eu.c("Could not request banner ad from adapter.", d);
        }
        break MISSING_BLOCK_LABEL_216;
        obj = null;
          goto _L1
        throw new RemoteException();
    }

    public void destroy()
        throws RemoteException
    {
        try
        {
            nS.onDestroy();
            return;
        }
        catch (Throwable throwable)
        {
            eu.c("Could not destroy adapter.", throwable);
        }
        throw new RemoteException();
    }

    public d getView()
        throws RemoteException
    {
        if (!(nS instanceof MediationBannerAdapter))
        {
            eu.D((new StringBuilder()).append("MediationAdapter is not a MediationBannerAdapter: ").append(nS.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        d d;
        try
        {
            d = e.h(((MediationBannerAdapter)nS).getBannerView());
        }
        catch (Throwable throwable)
        {
            eu.c("Could not get banner view from adapter.", throwable);
            throw new RemoteException();
        }
        return d;
    }

    public void pause()
        throws RemoteException
    {
        try
        {
            nS.onPause();
            return;
        }
        catch (Throwable throwable)
        {
            eu.c("Could not pause adapter.", throwable);
        }
        throw new RemoteException();
    }

    public void resume()
        throws RemoteException
    {
        try
        {
            nS.onResume();
            return;
        }
        catch (Throwable throwable)
        {
            eu.c("Could not resume adapter.", throwable);
        }
        throw new RemoteException();
    }

    public void showInterstitial()
        throws RemoteException
    {
        if (!(nS instanceof MediationInterstitialAdapter))
        {
            eu.D((new StringBuilder()).append("MediationAdapter is not a MediationInterstitialAdapter: ").append(nS.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        eu.z("Showing interstitial from adapter.");
        try
        {
            ((MediationInterstitialAdapter)nS).showInterstitial();
            return;
        }
        catch (Throwable throwable)
        {
            eu.c("Could not show interstitial from adapter.", throwable);
        }
        throw new RemoteException();
    }
}
