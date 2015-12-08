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
//            gs, av, cw, cy, 
//            ay, cv

public final class cx extends cu.a
{

    private final MediationAdapter qE;

    public cx(MediationAdapter mediationadapter)
    {
        qE = mediationadapter;
    }

    private Bundle a(String s, int i, String s1)
        throws RemoteException
    {
        Bundle bundle;
        gs.W((new StringBuilder()).append("Server parameters: ").append(s).toString());
        Iterator iterator;
        String s2;
        try
        {
            bundle = new Bundle();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.internal.gs.d("Could not get Server Parameters Bundle.", s);
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

        if (qE instanceof AdMobAdapter)
        {
            bundle.putString("adJson", s1);
            bundle.putInt("tagForChildDirectedTreatment", i);
        }
        return bundle;
    }

    public void a(d d, av av1, String s, cv cv)
        throws RemoteException
    {
        a(d, av1, s, null, cv);
    }

    public void a(d d, av av1, String s, String s1, cv cv)
        throws RemoteException
    {
        if (!(qE instanceof MediationInterstitialAdapter))
        {
            gs.W((new StringBuilder()).append("MediationAdapter is not a MediationInterstitialAdapter: ").append(qE.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        gs.S("Requesting interstitial ad from adapter.");
        MediationInterstitialAdapter mediationinterstitialadapter = (MediationInterstitialAdapter)qE;
        if (av1.nV == null) goto _L2; else goto _L1
_L1:
        Object obj = new HashSet(av1.nV);
_L5:
        cw cw1 = new cw(new Date(av1.nT), av1.nU, ((java.util.Set) (obj)), av1.ob, av1.nW, av1.nX);
        if (av1.od == null) goto _L4; else goto _L3
_L3:
        obj = av1.od.getBundle(mediationinterstitialadapter.getClass().getName());
_L6:
        mediationinterstitialadapter.requestInterstitialAd((Context)e.f(d), new cy(cv), a(s, av1.nX, s1), cw1, ((Bundle) (obj)));
        return;
_L2:
        obj = null;
          goto _L5
_L4:
        obj = null;
          goto _L6
        d;
        com.google.android.gms.internal.gs.d("Could not request interstitial ad from adapter.", d);
        throw new RemoteException();
          goto _L5
    }

    public void a(d d, ay ay1, av av1, String s, cv cv)
        throws RemoteException
    {
        a(d, ay1, av1, s, null, cv);
    }

    public void a(d d, ay ay1, av av1, String s, String s1, cv cv)
        throws RemoteException
    {
        Object obj1;
        obj1 = null;
        if (!(qE instanceof MediationBannerAdapter))
        {
            gs.W((new StringBuilder()).append("MediationAdapter is not a MediationBannerAdapter: ").append(qE.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        gs.S("Requesting banner ad from adapter.");
        Object obj;
        MediationBannerAdapter mediationbanneradapter;
        mediationbanneradapter = (MediationBannerAdapter)qE;
        if (av1.nV == null)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        obj = new HashSet(av1.nV);
_L1:
        cw cw1 = new cw(new Date(av1.nT), av1.nU, ((java.util.Set) (obj)), av1.ob, av1.nW, av1.nX);
        obj = obj1;
        try
        {
            if (av1.od != null)
            {
                obj = av1.od.getBundle(mediationbanneradapter.getClass().getName());
            }
            mediationbanneradapter.requestBannerAd((Context)e.f(d), new cy(cv), a(s, av1.nX, s1), com.google.android.gms.ads.a.a(ay1.width, ay1.height, ay1.of), cw1, ((Bundle) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (d d)
        {
            com.google.android.gms.internal.gs.d("Could not request banner ad from adapter.", d);
        }
        break MISSING_BLOCK_LABEL_220;
        obj = null;
          goto _L1
        throw new RemoteException();
    }

    public void destroy()
        throws RemoteException
    {
        try
        {
            qE.onDestroy();
            return;
        }
        catch (Throwable throwable)
        {
            com.google.android.gms.internal.gs.d("Could not destroy adapter.", throwable);
        }
        throw new RemoteException();
    }

    public d getView()
        throws RemoteException
    {
        if (!(qE instanceof MediationBannerAdapter))
        {
            gs.W((new StringBuilder()).append("MediationAdapter is not a MediationBannerAdapter: ").append(qE.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        d d;
        try
        {
            d = e.k(((MediationBannerAdapter)qE).getBannerView());
        }
        catch (Throwable throwable)
        {
            com.google.android.gms.internal.gs.d("Could not get banner view from adapter.", throwable);
            throw new RemoteException();
        }
        return d;
    }

    public void pause()
        throws RemoteException
    {
        try
        {
            qE.onPause();
            return;
        }
        catch (Throwable throwable)
        {
            com.google.android.gms.internal.gs.d("Could not pause adapter.", throwable);
        }
        throw new RemoteException();
    }

    public void resume()
        throws RemoteException
    {
        try
        {
            qE.onResume();
            return;
        }
        catch (Throwable throwable)
        {
            com.google.android.gms.internal.gs.d("Could not resume adapter.", throwable);
        }
        throw new RemoteException();
    }

    public void showInterstitial()
        throws RemoteException
    {
        if (!(qE instanceof MediationInterstitialAdapter))
        {
            gs.W((new StringBuilder()).append("MediationAdapter is not a MediationInterstitialAdapter: ").append(qE.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        gs.S("Showing interstitial from adapter.");
        try
        {
            ((MediationInterstitialAdapter)qE).showInterstitial();
            return;
        }
        catch (Throwable throwable)
        {
            com.google.android.gms.internal.gs.d("Could not show interstitial from adapter.", throwable);
        }
        throw new RemoteException();
    }
}
