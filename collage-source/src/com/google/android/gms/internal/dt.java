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
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            du, dv, dk, dl, 
//            dm

public final class dt extends dj.a
{

    private final MediationAdapter a;
    private final NetworkExtras b;

    public dt(MediationAdapter mediationadapter, NetworkExtras networkextras)
    {
        a = mediationadapter;
        b = networkextras;
    }

    private MediationServerParameters a(String s, int j, String s1)
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
            zzb.zzd("Could not get MediationServerParameters.", s);
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
        obj = a.c();
        s1 = null;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        s1 = (MediationServerParameters)((Class) (obj)).newInstance();
        s1.a(s);
        return s1;
    }

    public a a()
        throws RemoteException
    {
        if (!(a instanceof MediationBannerAdapter))
        {
            zzb.zzaE((new StringBuilder()).append("MediationAdapter is not a MediationBannerAdapter: ").append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        a a1;
        try
        {
            a1 = com.google.android.gms.a.b.a(((MediationBannerAdapter)a).d());
        }
        catch (Throwable throwable)
        {
            zzb.zzd("Could not get banner view from adapter.", throwable);
            throw new RemoteException();
        }
        return a1;
    }

    public void a(a a1, AdRequestParcel adrequestparcel, String s, zza zza, String s1)
        throws RemoteException
    {
    }

    public void a(a a1, AdRequestParcel adrequestparcel, String s, dk dk)
        throws RemoteException
    {
        a(a1, adrequestparcel, s, ((String) (null)), dk);
    }

    public void a(a a1, AdRequestParcel adrequestparcel, String s, String s1, dk dk)
        throws RemoteException
    {
        if (!(a instanceof MediationInterstitialAdapter))
        {
            zzb.zzaE((new StringBuilder()).append("MediationAdapter is not a MediationInterstitialAdapter: ").append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        zzb.zzaC("Requesting interstitial ad from adapter.");
        try
        {
            ((MediationInterstitialAdapter)a).a(new du(dk), (Activity)com.google.android.gms.a.b.a(a1), a(s, adrequestparcel.zzsu, s1), com.google.android.gms.internal.dv.a(adrequestparcel), b);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            zzb.zzd("Could not request interstitial ad from adapter.", a1);
        }
        throw new RemoteException();
    }

    public void a(a a1, AdRequestParcel adrequestparcel, String s, String s1, dk dk, NativeAdOptionsParcel nativeadoptionsparcel, List list)
    {
    }

    public void a(a a1, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, dk dk)
        throws RemoteException
    {
        a(a1, adsizeparcel, adrequestparcel, s, null, dk);
    }

    public void a(a a1, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, String s1, dk dk)
        throws RemoteException
    {
        if (!(a instanceof MediationBannerAdapter))
        {
            zzb.zzaE((new StringBuilder()).append("MediationAdapter is not a MediationBannerAdapter: ").append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        zzb.zzaC("Requesting banner ad from adapter.");
        try
        {
            ((MediationBannerAdapter)a).a(new du(dk), (Activity)com.google.android.gms.a.b.a(a1), a(s, adrequestparcel.zzsu, s1), com.google.android.gms.internal.dv.a(adsizeparcel), com.google.android.gms.internal.dv.a(adrequestparcel), b);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            zzb.zzd("Could not request banner ad from adapter.", a1);
        }
        throw new RemoteException();
    }

    public void a(AdRequestParcel adrequestparcel, String s)
    {
    }

    public void b()
        throws RemoteException
    {
        if (!(a instanceof MediationInterstitialAdapter))
        {
            zzb.zzaE((new StringBuilder()).append("MediationAdapter is not a MediationInterstitialAdapter: ").append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        zzb.zzaC("Showing interstitial from adapter.");
        try
        {
            ((MediationInterstitialAdapter)a).e();
            return;
        }
        catch (Throwable throwable)
        {
            zzb.zzd("Could not show interstitial from adapter.", throwable);
        }
        throw new RemoteException();
    }

    public void c()
        throws RemoteException
    {
        try
        {
            a.a();
            return;
        }
        catch (Throwable throwable)
        {
            zzb.zzd("Could not destroy adapter.", throwable);
        }
        throw new RemoteException();
    }

    public void d()
        throws RemoteException
    {
        throw new RemoteException();
    }

    public void e()
        throws RemoteException
    {
        throw new RemoteException();
    }

    public void f()
    {
    }

    public boolean g()
    {
        return true;
    }

    public dl h()
    {
        return null;
    }

    public dm i()
    {
        return null;
    }
}
