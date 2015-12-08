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
//            gr, av, db, dd, 
//            ay, da

public final class dc extends cz.a
{

    private final MediationAdapter qV;

    public dc(MediationAdapter mediationadapter)
    {
        qV = mediationadapter;
    }

    private Bundle a(String s, int i, String s1)
        throws RemoteException
    {
        Bundle bundle;
        gr.W((new StringBuilder()).append("Server parameters: ").append(s).toString());
        Iterator iterator;
        String s2;
        try
        {
            bundle = new Bundle();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.internal.gr.d("Could not get Server Parameters Bundle.", s);
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

        if (qV instanceof AdMobAdapter)
        {
            bundle.putString("adJson", s1);
            bundle.putInt("tagForChildDirectedTreatment", i);
        }
        return bundle;
    }

    public void a(d d, av av1, String s, da da)
        throws RemoteException
    {
        a(d, av1, s, null, da);
    }

    public void a(d d, av av1, String s, String s1, da da)
        throws RemoteException
    {
        if (!(qV instanceof MediationInterstitialAdapter))
        {
            gr.W((new StringBuilder()).append("MediationAdapter is not a MediationInterstitialAdapter: ").append(qV.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        gr.S("Requesting interstitial ad from adapter.");
        MediationInterstitialAdapter mediationinterstitialadapter = (MediationInterstitialAdapter)qV;
        if (av1.of == null) goto _L2; else goto _L1
_L1:
        Object obj = new HashSet(av1.of);
_L5:
        db db1 = new db(new Date(av1.od), av1.oe, ((java.util.Set) (obj)), av1.ol, av1.og, av1.oh);
        if (av1.on == null) goto _L4; else goto _L3
_L3:
        obj = av1.on.getBundle(mediationinterstitialadapter.getClass().getName());
_L6:
        mediationinterstitialadapter.requestInterstitialAd((Context)e.f(d), new dd(da), a(s, av1.oh, s1), db1, ((Bundle) (obj)));
        return;
_L2:
        obj = null;
          goto _L5
_L4:
        obj = null;
          goto _L6
        d;
        com.google.android.gms.internal.gr.d("Could not request interstitial ad from adapter.", d);
        throw new RemoteException();
          goto _L5
    }

    public void a(d d, ay ay1, av av1, String s, da da)
        throws RemoteException
    {
        a(d, ay1, av1, s, null, da);
    }

    public void a(d d, ay ay1, av av1, String s, String s1, da da)
        throws RemoteException
    {
        Object obj1;
        obj1 = null;
        if (!(qV instanceof MediationBannerAdapter))
        {
            gr.W((new StringBuilder()).append("MediationAdapter is not a MediationBannerAdapter: ").append(qV.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        gr.S("Requesting banner ad from adapter.");
        Object obj;
        MediationBannerAdapter mediationbanneradapter;
        mediationbanneradapter = (MediationBannerAdapter)qV;
        if (av1.of == null)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        obj = new HashSet(av1.of);
_L1:
        db db1 = new db(new Date(av1.od), av1.oe, ((java.util.Set) (obj)), av1.ol, av1.og, av1.oh);
        obj = obj1;
        try
        {
            if (av1.on != null)
            {
                obj = av1.on.getBundle(mediationbanneradapter.getClass().getName());
            }
            mediationbanneradapter.requestBannerAd((Context)e.f(d), new dd(da), a(s, av1.oh, s1), com.google.android.gms.ads.a.a(ay1.width, ay1.height, ay1.op), db1, ((Bundle) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (d d)
        {
            com.google.android.gms.internal.gr.d("Could not request banner ad from adapter.", d);
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
            qV.onDestroy();
            return;
        }
        catch (Throwable throwable)
        {
            com.google.android.gms.internal.gr.d("Could not destroy adapter.", throwable);
        }
        throw new RemoteException();
    }

    public d getView()
        throws RemoteException
    {
        if (!(qV instanceof MediationBannerAdapter))
        {
            gr.W((new StringBuilder()).append("MediationAdapter is not a MediationBannerAdapter: ").append(qV.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        d d;
        try
        {
            d = e.k(((MediationBannerAdapter)qV).getBannerView());
        }
        catch (Throwable throwable)
        {
            com.google.android.gms.internal.gr.d("Could not get banner view from adapter.", throwable);
            throw new RemoteException();
        }
        return d;
    }

    public void pause()
        throws RemoteException
    {
        try
        {
            qV.onPause();
            return;
        }
        catch (Throwable throwable)
        {
            com.google.android.gms.internal.gr.d("Could not pause adapter.", throwable);
        }
        throw new RemoteException();
    }

    public void resume()
        throws RemoteException
    {
        try
        {
            qV.onResume();
            return;
        }
        catch (Throwable throwable)
        {
            com.google.android.gms.internal.gr.d("Could not resume adapter.", throwable);
        }
        throw new RemoteException();
    }

    public void showInterstitial()
        throws RemoteException
    {
        if (!(qV instanceof MediationInterstitialAdapter))
        {
            gr.W((new StringBuilder()).append("MediationAdapter is not a MediationInterstitialAdapter: ").append(qV.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        gr.S("Showing interstitial from adapter.");
        try
        {
            ((MediationInterstitialAdapter)qV).showInterstitial();
            return;
        }
        catch (Throwable throwable)
        {
            com.google.android.gms.internal.gr.d("Could not show interstitial from adapter.", throwable);
        }
        throw new RemoteException();
    }
}
