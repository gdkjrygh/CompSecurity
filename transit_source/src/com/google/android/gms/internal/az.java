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
import com.google.ads.mediation.admob.AdMobServerParameters;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamic.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            cn, ba, v, bb, 
//            ay, x

public final class az extends ax.a
{

    private final MediationAdapter fr;
    private final NetworkExtras fs;

    public az(MediationAdapter mediationadapter, NetworkExtras networkextras)
    {
        fr = mediationadapter;
        fs = networkextras;
    }

    private MediationServerParameters a(String s, int i)
        throws RemoteException
    {
        if (s == null) goto _L2; else goto _L1
_L1:
        try
        {
            JSONObject jsonobject = new JSONObject(s);
            s = new HashMap(jsonobject.length());
            String s1;
            for (Iterator iterator = jsonobject.keys(); iterator.hasNext(); s.put(s1, jsonobject.getString(s1)))
            {
                s1 = (String)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.internal.cn.b("Could not get MediationServerParameters.", s);
            throw new RemoteException();
        }
_L4:
        Class class1 = fr.getServerParametersType();
        MediationServerParameters mediationserverparameters;
        mediationserverparameters = null;
        if (class1 == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        mediationserverparameters = (MediationServerParameters)class1.newInstance();
        mediationserverparameters.load(s);
        if (!(mediationserverparameters instanceof AdMobServerParameters))
        {
            break; /* Loop/switch isn't completed */
        }
        ((AdMobServerParameters)mediationserverparameters).tagForChildDirectedTreatment = i;
        return mediationserverparameters;
_L2:
        s = new HashMap(0);
        if (true) goto _L4; else goto _L3
_L3:
        return mediationserverparameters;
    }

    public void a(b b, v v1, String s, ay ay)
        throws RemoteException
    {
        if (!(fr instanceof MediationInterstitialAdapter))
        {
            cn.q((new StringBuilder()).append("MediationAdapter is not a MediationInterstitialAdapter: ").append(fr.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        cn.m("Requesting interstitial ad from adapter.");
        try
        {
            ((MediationInterstitialAdapter)fr).requestInterstitialAd(new ba(ay), (Activity)c.b(b), a(s, v1.tagForChildDirectedTreatment), bb.e(v1), fs);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (b b)
        {
            com.google.android.gms.internal.cn.b("Could not request interstitial ad from adapter.", b);
        }
        throw new RemoteException();
    }

    public void a(b b, x x, v v1, String s, ay ay)
        throws RemoteException
    {
        if (!(fr instanceof MediationBannerAdapter))
        {
            cn.q((new StringBuilder()).append("MediationAdapter is not a MediationBannerAdapter: ").append(fr.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        cn.m("Requesting banner ad from adapter.");
        try
        {
            ((MediationBannerAdapter)fr).requestBannerAd(new ba(ay), (Activity)c.b(b), a(s, v1.tagForChildDirectedTreatment), bb.a(x), bb.e(v1), fs);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (b b)
        {
            com.google.android.gms.internal.cn.b("Could not request banner ad from adapter.", b);
        }
        throw new RemoteException();
    }

    public void destroy()
        throws RemoteException
    {
        try
        {
            fr.destroy();
            return;
        }
        catch (Throwable throwable)
        {
            com.google.android.gms.internal.cn.b("Could not destroy adapter.", throwable);
        }
        throw new RemoteException();
    }

    public b getView()
        throws RemoteException
    {
        if (!(fr instanceof MediationBannerAdapter))
        {
            cn.q((new StringBuilder()).append("MediationAdapter is not a MediationBannerAdapter: ").append(fr.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        b b;
        try
        {
            b = c.g(((MediationBannerAdapter)fr).getBannerView());
        }
        catch (Throwable throwable)
        {
            com.google.android.gms.internal.cn.b("Could not get banner view from adapter.", throwable);
            throw new RemoteException();
        }
        return b;
    }

    public void showInterstitial()
        throws RemoteException
    {
        if (!(fr instanceof MediationInterstitialAdapter))
        {
            cn.q((new StringBuilder()).append("MediationAdapter is not a MediationInterstitialAdapter: ").append(fr.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        cn.m("Showing interstitial from adapter.");
        try
        {
            ((MediationInterstitialAdapter)fr).showInterstitial();
            return;
        }
        catch (Throwable throwable)
        {
            com.google.android.gms.internal.cn.b("Could not show interstitial from adapter.", throwable);
        }
        throw new RemoteException();
    }
}
