// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.b.a;
import com.google.android.gms.b.d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            it, jo, kb, iv, 
//            jb, je

public final class jn extends it
{

    private final MediationAdapter a;
    private final NetworkExtras b;

    public jn(MediationAdapter mediationadapter, NetworkExtras networkextras)
    {
        a = mediationadapter;
        b = networkextras;
    }

    private MediationServerParameters a(String s)
    {
        if (s == null) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        Iterator iterator;
        try
        {
            obj1 = new JSONObject(s);
            obj = new HashMap(((JSONObject) (obj1)).length());
            iterator = ((JSONObject) (obj1)).keys();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzb.zzd("Could not get MediationServerParameters.", s);
            throw new RemoteException();
        }
        s = ((String) (obj));
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = (String)iterator.next();
        ((Map) (obj)).put(s, ((JSONObject) (obj1)).getString(s));
        if (true) goto _L4; else goto _L3
_L4:
        break MISSING_BLOCK_LABEL_31;
_L2:
        s = new HashMap(0);
_L3:
        obj1 = a.getServerParametersType();
        obj = null;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        obj = (MediationServerParameters)((Class) (obj1)).newInstance();
        ((MediationServerParameters) (obj)).load(s);
        return ((MediationServerParameters) (obj));
    }

    public final a a()
    {
        if (!(a instanceof MediationBannerAdapter))
        {
            zzb.zzaH((new StringBuilder("MediationAdapter is not a MediationBannerAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        a a1;
        try
        {
            a1 = com.google.android.gms.b.d.a(((MediationBannerAdapter)a).getBannerView());
        }
        catch (Throwable throwable)
        {
            zzb.zzd("Could not get banner view from adapter.", throwable);
            throw new RemoteException();
        }
        return a1;
    }

    public final void a(AdRequestParcel adrequestparcel, String s)
    {
    }

    public final void a(a a1, AdRequestParcel adrequestparcel, String s, zza zza, String s1)
    {
    }

    public final void a(a a1, AdRequestParcel adrequestparcel, String s, iv iv)
    {
        a(a1, adrequestparcel, s, ((String) (null)), iv);
    }

    public final void a(a a1, AdRequestParcel adrequestparcel, String s, String s1, iv iv)
    {
        if (!(a instanceof MediationInterstitialAdapter))
        {
            zzb.zzaH((new StringBuilder("MediationAdapter is not a MediationInterstitialAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        zzb.zzaF("Requesting interstitial ad from adapter.");
        try
        {
            s1 = (MediationInterstitialAdapter)a;
            iv = new jo(iv);
            a1 = (Activity)com.google.android.gms.b.d.a(a1);
            int i1 = adrequestparcel.zzsF;
            s1.requestInterstitialAd(iv, a1, a(s), com.google.android.gms.internal.kb.a(adrequestparcel), b);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            zzb.zzd("Could not request interstitial ad from adapter.", a1);
        }
        throw new RemoteException();
    }

    public final void a(a a1, AdRequestParcel adrequestparcel, String s, String s1, iv iv, NativeAdOptionsParcel nativeadoptionsparcel, List list)
    {
    }

    public final void a(a a1, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, iv iv)
    {
        a(a1, adsizeparcel, adrequestparcel, s, null, iv);
    }

    public final void a(a a1, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, String s1, iv iv)
    {
        if (!(a instanceof MediationBannerAdapter))
        {
            zzb.zzaH((new StringBuilder("MediationAdapter is not a MediationBannerAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        zzb.zzaF("Requesting banner ad from adapter.");
        try
        {
            s1 = (MediationBannerAdapter)a;
            iv = new jo(iv);
            a1 = (Activity)com.google.android.gms.b.d.a(a1);
            int i1 = adrequestparcel.zzsF;
            s1.requestBannerAd(iv, a1, a(s), com.google.android.gms.internal.kb.a(adsizeparcel), com.google.android.gms.internal.kb.a(adrequestparcel), b);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            zzb.zzd("Could not request banner ad from adapter.", a1);
        }
        throw new RemoteException();
    }

    public final void b()
    {
        if (!(a instanceof MediationInterstitialAdapter))
        {
            zzb.zzaH((new StringBuilder("MediationAdapter is not a MediationInterstitialAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        zzb.zzaF("Showing interstitial from adapter.");
        try
        {
            ((MediationInterstitialAdapter)a).showInterstitial();
            return;
        }
        catch (Throwable throwable)
        {
            zzb.zzd("Could not show interstitial from adapter.", throwable);
        }
        throw new RemoteException();
    }

    public final void c()
    {
        try
        {
            a.destroy();
            return;
        }
        catch (Throwable throwable)
        {
            zzb.zzd("Could not destroy adapter.", throwable);
        }
        throw new RemoteException();
    }

    public final void d()
    {
        throw new RemoteException();
    }

    public final void e()
    {
        throw new RemoteException();
    }

    public final void f()
    {
    }

    public final boolean g()
    {
        return true;
    }

    public final jb h()
    {
        return null;
    }

    public final je i()
    {
        return null;
    }

    public final Bundle j()
    {
        return new Bundle();
    }

    public final Bundle k()
    {
        return new Bundle();
    }

    public final Bundle l()
    {
        return new Bundle();
    }
}
