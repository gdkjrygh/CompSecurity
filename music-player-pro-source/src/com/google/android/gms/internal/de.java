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
//            gr, df, av, dg, 
//            da, ay

public final class de extends cz.a
{

    private final MediationAdapter qX;
    private final NetworkExtras qY;

    public de(MediationAdapter mediationadapter, NetworkExtras networkextras)
    {
        qX = mediationadapter;
        qY = networkextras;
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
            com.google.android.gms.internal.gr.d("Could not get MediationServerParameters.", s);
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
        obj = qX.getServerParametersType();
        s1 = null;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        s1 = (MediationServerParameters)((Class) (obj)).newInstance();
        s1.load(s);
        return s1;
    }

    public void a(d d, av av1, String s, da da)
        throws RemoteException
    {
        a(d, av1, s, null, da);
    }

    public void a(d d, av av1, String s, String s1, da da)
        throws RemoteException
    {
        if (!(qX instanceof MediationInterstitialAdapter))
        {
            gr.W((new StringBuilder()).append("MediationAdapter is not a MediationInterstitialAdapter: ").append(qX.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        gr.S("Requesting interstitial ad from adapter.");
        try
        {
            ((MediationInterstitialAdapter)qX).requestInterstitialAd(new df(da), (Activity)e.f(d), b(s, av1.oh, s1), com.google.android.gms.internal.dg.d(av1), qY);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (d d)
        {
            com.google.android.gms.internal.gr.d("Could not request interstitial ad from adapter.", d);
        }
        throw new RemoteException();
    }

    public void a(d d, ay ay, av av1, String s, da da)
        throws RemoteException
    {
        a(d, ay, av1, s, null, da);
    }

    public void a(d d, ay ay, av av1, String s, String s1, da da)
        throws RemoteException
    {
        if (!(qX instanceof MediationBannerAdapter))
        {
            gr.W((new StringBuilder()).append("MediationAdapter is not a MediationBannerAdapter: ").append(qX.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        gr.S("Requesting banner ad from adapter.");
        try
        {
            ((MediationBannerAdapter)qX).requestBannerAd(new df(da), (Activity)e.f(d), b(s, av1.oh, s1), dg.b(ay), com.google.android.gms.internal.dg.d(av1), qY);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (d d)
        {
            com.google.android.gms.internal.gr.d("Could not request banner ad from adapter.", d);
        }
        throw new RemoteException();
    }

    public void destroy()
        throws RemoteException
    {
        try
        {
            qX.destroy();
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
        if (!(qX instanceof MediationBannerAdapter))
        {
            gr.W((new StringBuilder()).append("MediationAdapter is not a MediationBannerAdapter: ").append(qX.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        d d;
        try
        {
            d = e.k(((MediationBannerAdapter)qX).getBannerView());
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
        if (!(qX instanceof MediationInterstitialAdapter))
        {
            gr.W((new StringBuilder()).append("MediationAdapter is not a MediationInterstitialAdapter: ").append(qX.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        gr.S("Showing interstitial from adapter.");
        try
        {
            ((MediationInterstitialAdapter)qX).showInterstitial();
            return;
        }
        catch (Throwable throwable)
        {
            com.google.android.gms.internal.gr.d("Could not show interstitial from adapter.", throwable);
        }
        throw new RemoteException();
    }
}
