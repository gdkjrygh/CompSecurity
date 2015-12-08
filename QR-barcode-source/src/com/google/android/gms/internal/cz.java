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
//            gs, da, av, db, 
//            cv, ay

public final class cz extends cu.a
{

    private final MediationAdapter qG;
    private final NetworkExtras qH;

    public cz(MediationAdapter mediationadapter, NetworkExtras networkextras)
    {
        qG = mediationadapter;
        qH = networkextras;
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
            com.google.android.gms.internal.gs.d("Could not get MediationServerParameters.", s);
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
        obj = qG.getServerParametersType();
        s1 = null;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        s1 = (MediationServerParameters)((Class) (obj)).newInstance();
        s1.load(s);
        return s1;
    }

    public void a(d d, av av1, String s, cv cv)
        throws RemoteException
    {
        a(d, av1, s, null, cv);
    }

    public void a(d d, av av1, String s, String s1, cv cv)
        throws RemoteException
    {
        if (!(qG instanceof MediationInterstitialAdapter))
        {
            gs.W((new StringBuilder()).append("MediationAdapter is not a MediationInterstitialAdapter: ").append(qG.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        gs.S("Requesting interstitial ad from adapter.");
        try
        {
            ((MediationInterstitialAdapter)qG).requestInterstitialAd(new da(cv), (Activity)e.f(d), b(s, av1.nX, s1), com.google.android.gms.internal.db.d(av1), qH);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (d d)
        {
            com.google.android.gms.internal.gs.d("Could not request interstitial ad from adapter.", d);
        }
        throw new RemoteException();
    }

    public void a(d d, ay ay, av av1, String s, cv cv)
        throws RemoteException
    {
        a(d, ay, av1, s, null, cv);
    }

    public void a(d d, ay ay, av av1, String s, String s1, cv cv)
        throws RemoteException
    {
        if (!(qG instanceof MediationBannerAdapter))
        {
            gs.W((new StringBuilder()).append("MediationAdapter is not a MediationBannerAdapter: ").append(qG.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        gs.S("Requesting banner ad from adapter.");
        try
        {
            ((MediationBannerAdapter)qG).requestBannerAd(new da(cv), (Activity)e.f(d), b(s, av1.nX, s1), db.b(ay), com.google.android.gms.internal.db.d(av1), qH);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (d d)
        {
            com.google.android.gms.internal.gs.d("Could not request banner ad from adapter.", d);
        }
        throw new RemoteException();
    }

    public void destroy()
        throws RemoteException
    {
        try
        {
            qG.destroy();
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
        if (!(qG instanceof MediationBannerAdapter))
        {
            gs.W((new StringBuilder()).append("MediationAdapter is not a MediationBannerAdapter: ").append(qG.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        d d;
        try
        {
            d = e.k(((MediationBannerAdapter)qG).getBannerView());
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
        if (!(qG instanceof MediationInterstitialAdapter))
        {
            gs.W((new StringBuilder()).append("MediationAdapter is not a MediationInterstitialAdapter: ").append(qG.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        gs.S("Showing interstitial from adapter.");
        try
        {
            ((MediationInterstitialAdapter)qG).showInterstitial();
            return;
        }
        catch (Throwable throwable)
        {
            com.google.android.gms.internal.gs.d("Could not show interstitial from adapter.", throwable);
        }
        throw new RemoteException();
    }
}
