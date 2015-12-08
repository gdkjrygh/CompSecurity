// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.os.RemoteException;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            eu, ca, ai, cb, 
//            bv, al

public final class bz extends bu.a
{

    private final MediationAdapter nU;
    private final NetworkExtras nV;

    public bz(MediationAdapter mediationadapter, NetworkExtras networkextras)
    {
        nU = mediationadapter;
        nV = networkextras;
    }

    private MediationServerParameters b(String s, int i, String s1)
        throws RemoteException
    {
        if (s == null) goto _L2; else goto _L1
_L1:
        Object obj;
        Iterator iterator;
        try
        {
            obj = new JSONObject(s);
            s1 = new HashMap(((JSONObject) (obj)).length());
            iterator = ((JSONObject) (obj)).keys();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            eu.c("Could not get MediationServerParameters.", s);
            throw new RemoteException();
        }
        s = s1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = (String)iterator.next();
        s1.put(s, ((JSONObject) (obj)).getString(s));
        if (true) goto _L4; else goto _L3
_L4:
        break MISSING_BLOCK_LABEL_34;
_L2:
        s = new HashMap(0);
_L3:
        obj = nU.getServerParametersType();
        s1 = null;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        s1 = (MediationServerParameters)((Class) (obj)).newInstance();
        s1.load(s);
        return s1;
    }

    public void a(d d, ai ai1, String s, bv bv)
        throws RemoteException
    {
        a(d, ai1, s, null, bv);
    }

    public void a(d d, ai ai1, String s, String s1, bv bv)
        throws RemoteException
    {
        if (!(nU instanceof MediationInterstitialAdapter))
        {
            eu.D((new StringBuilder()).append("MediationAdapter is not a MediationInterstitialAdapter: ").append(nU.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        eu.z("Requesting interstitial ad from adapter.");
        try
        {
            ((MediationInterstitialAdapter)nU).requestInterstitialAd(new ca(bv), (Activity)e.e(d), b(s, ai1.lW, s1), com.google.android.gms.internal.cb.e(ai1), nV);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (d d)
        {
            eu.c("Could not request interstitial ad from adapter.", d);
        }
        throw new RemoteException();
    }

    public void a(d d, al al, ai ai1, String s, bv bv)
        throws RemoteException
    {
        a(d, al, ai1, s, null, bv);
    }

    public void a(d d, al al, ai ai1, String s, String s1, bv bv)
        throws RemoteException
    {
        if (!(nU instanceof MediationBannerAdapter))
        {
            eu.D((new StringBuilder()).append("MediationAdapter is not a MediationBannerAdapter: ").append(nU.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        eu.z("Requesting banner ad from adapter.");
        try
        {
            ((MediationBannerAdapter)nU).requestBannerAd(new ca(bv), (Activity)e.e(d), b(s, ai1.lW, s1), cb.b(al), com.google.android.gms.internal.cb.e(ai1), nV);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (d d)
        {
            eu.c("Could not request banner ad from adapter.", d);
        }
        throw new RemoteException();
    }

    public void destroy()
        throws RemoteException
    {
        try
        {
            nU.destroy();
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
        if (!(nU instanceof MediationBannerAdapter))
        {
            eu.D((new StringBuilder()).append("MediationAdapter is not a MediationBannerAdapter: ").append(nU.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        d d;
        try
        {
            d = e.h(((MediationBannerAdapter)nU).getBannerView());
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
        throw new RemoteException();
    }

    public void resume()
        throws RemoteException
    {
        throw new RemoteException();
    }

    public void showInterstitial()
        throws RemoteException
    {
        if (!(nU instanceof MediationInterstitialAdapter))
        {
            eu.D((new StringBuilder()).append("MediationAdapter is not a MediationInterstitialAdapter: ").append(nU.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        eu.z("Showing interstitial from adapter.");
        try
        {
            ((MediationInterstitialAdapter)nU).showInterstitial();
            return;
        }
        catch (Throwable throwable)
        {
            eu.c("Could not show interstitial from adapter.", throwable);
        }
        throw new RemoteException();
    }
}
