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
//            dw, bx, ah, by, 
//            bs, ak

public final class bw extends br.a
{

    private final MediationAdapter nH;
    private final NetworkExtras nI;

    public bw(MediationAdapter mediationadapter, NetworkExtras networkextras)
    {
        nH = mediationadapter;
        nI = networkextras;
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
            dw.c("Could not get MediationServerParameters.", s);
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
        obj = nH.getServerParametersType();
        s1 = null;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        s1 = (MediationServerParameters)((Class) (obj)).newInstance();
        s1.load(s);
        return s1;
    }

    public void a(d d, ah ah1, String s, bs bs)
        throws RemoteException
    {
        a(d, ah1, s, null, bs);
    }

    public void a(d d, ah ah1, String s, String s1, bs bs)
        throws RemoteException
    {
        if (!(nH instanceof MediationInterstitialAdapter))
        {
            dw.z((new StringBuilder()).append("MediationAdapter is not a MediationInterstitialAdapter: ").append(nH.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        dw.v("Requesting interstitial ad from adapter.");
        try
        {
            ((MediationInterstitialAdapter)nH).requestInterstitialAd(new bx(bs), (Activity)e.d(d), b(s, ah1.lL, s1), com.google.android.gms.internal.by.e(ah1), nI);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (d d)
        {
            dw.c("Could not request interstitial ad from adapter.", d);
        }
        throw new RemoteException();
    }

    public void a(d d, ak ak, ah ah1, String s, bs bs)
        throws RemoteException
    {
        a(d, ak, ah1, s, null, bs);
    }

    public void a(d d, ak ak, ah ah1, String s, String s1, bs bs)
        throws RemoteException
    {
        if (!(nH instanceof MediationBannerAdapter))
        {
            dw.z((new StringBuilder()).append("MediationAdapter is not a MediationBannerAdapter: ").append(nH.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        dw.v("Requesting banner ad from adapter.");
        try
        {
            ((MediationBannerAdapter)nH).requestBannerAd(new bx(bs), (Activity)e.d(d), b(s, ah1.lL, s1), by.b(ak), com.google.android.gms.internal.by.e(ah1), nI);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (d d)
        {
            dw.c("Could not request banner ad from adapter.", d);
        }
        throw new RemoteException();
    }

    public void destroy()
        throws RemoteException
    {
        try
        {
            nH.destroy();
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
        if (!(nH instanceof MediationBannerAdapter))
        {
            dw.z((new StringBuilder()).append("MediationAdapter is not a MediationBannerAdapter: ").append(nH.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        d d;
        try
        {
            d = e.h(((MediationBannerAdapter)nH).getBannerView());
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
        if (!(nH instanceof MediationInterstitialAdapter))
        {
            dw.z((new StringBuilder()).append("MediationAdapter is not a MediationInterstitialAdapter: ").append(nH.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        dw.v("Showing interstitial from adapter.");
        try
        {
            ((MediationInterstitialAdapter)nH).showInterstitial();
            return;
        }
        catch (Throwable throwable)
        {
            dw.c("Could not show interstitial from adapter.", throwable);
        }
        throw new RemoteException();
    }
}
