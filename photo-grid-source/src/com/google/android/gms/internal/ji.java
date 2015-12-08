// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.zza;
import com.google.android.gms.b.a;
import com.google.android.gms.b.d;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            it, jh, jj, jm, 
//            jk, jl, su, sv, 
//            iv, jb, je

public final class ji extends it
{

    private final MediationAdapter a;
    private jj b;

    public ji(MediationAdapter mediationadapter)
    {
        a = mediationadapter;
    }

    private Bundle a(String s, int i1, String s1)
    {
        Bundle bundle;
        zzb.zzaH((new StringBuilder("Server parameters: ")).append(s).toString());
        Iterator iterator;
        String s2;
        try
        {
            bundle = new Bundle();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzb.zzd("Could not get Server Parameters Bundle.", s);
            throw new RemoteException();
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        s = new JSONObject(s);
        bundle = new Bundle();
        for (iterator = s.keys(); iterator.hasNext(); bundle.putString(s2, s.getString(s2)))
        {
            s2 = (String)iterator.next();
        }

        if (a instanceof AdMobAdapter)
        {
            bundle.putString("adJson", s1);
            bundle.putInt("tagForChildDirectedTreatment", i1);
        }
        return bundle;
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
        if (!(a instanceof MediationRewardedVideoAdAdapter))
        {
            zzb.zzaH((new StringBuilder("MediationAdapter is not a MediationRewardedVideoAdAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        zzb.zzaF("Requesting rewarded video ad from adapter.");
        MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter = (MediationRewardedVideoAdAdapter)a;
        if (adrequestparcel.zzsD == null) goto _L2; else goto _L1
_L1:
        Object obj = new HashSet(adrequestparcel.zzsD);
_L5:
        Object obj1;
        if (adrequestparcel.zzsB == -1L)
        {
            obj1 = null;
        } else
        {
            try
            {
                obj1 = new Date(adrequestparcel.zzsB);
            }
            // Misplaced declaration of an exception variable
            catch (AdRequestParcel adrequestparcel)
            {
                zzb.zzd("Could not load rewarded video ad from adapter.", adrequestparcel);
                throw new RemoteException();
            }
        }
        obj1 = new jh(((Date) (obj1)), adrequestparcel.zzsC, ((java.util.Set) (obj)), adrequestparcel.zzsJ, adrequestparcel.zzsE, adrequestparcel.zzsF);
        if (adrequestparcel.zzsL == null)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        obj = adrequestparcel.zzsL.getBundle(mediationrewardedvideoadadapter.getClass().getName());
_L3:
        mediationrewardedvideoadadapter.loadAd(((com.google.android.gms.ads.mediation.MediationAdRequest) (obj1)), a(s, adrequestparcel.zzsF, null), ((Bundle) (obj)));
        return;
        obj = null;
          goto _L3
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void a(a a1, AdRequestParcel adrequestparcel, String s, com.google.android.gms.ads.internal.reward.mediation.client.zza zza1, String s1)
    {
        if (!(a instanceof MediationRewardedVideoAdAdapter))
        {
            zzb.zzaH((new StringBuilder("MediationAdapter is not a MediationRewardedVideoAdAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        zzb.zzaF("Initialize rewarded video adapter.");
        MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter = (MediationRewardedVideoAdAdapter)a;
        if (adrequestparcel.zzsD == null) goto _L2; else goto _L1
_L1:
        Object obj = new HashSet(adrequestparcel.zzsD);
_L5:
        Object obj1;
        if (adrequestparcel.zzsB == -1L)
        {
            obj1 = null;
        } else
        {
            try
            {
                obj1 = new Date(adrequestparcel.zzsB);
            }
            // Misplaced declaration of an exception variable
            catch (a a1)
            {
                zzb.zzd("Could not initialize rewarded video adapter.", a1);
                throw new RemoteException();
            }
        }
        obj1 = new jh(((Date) (obj1)), adrequestparcel.zzsC, ((java.util.Set) (obj)), adrequestparcel.zzsJ, adrequestparcel.zzsE, adrequestparcel.zzsF);
        if (adrequestparcel.zzsL == null)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        obj = adrequestparcel.zzsL.getBundle(mediationrewardedvideoadadapter.getClass().getName());
_L3:
        mediationrewardedvideoadadapter.initialize((Context)com.google.android.gms.b.d.a(a1), ((com.google.android.gms.ads.mediation.MediationAdRequest) (obj1)), s, new com.google.android.gms.ads.internal.reward.mediation.client.zzb(zza1), a(s1, adrequestparcel.zzsF, null), ((Bundle) (obj)));
        return;
        obj = null;
          goto _L3
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
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
        MediationInterstitialAdapter mediationinterstitialadapter = (MediationInterstitialAdapter)a;
        if (adrequestparcel.zzsD == null) goto _L2; else goto _L1
_L1:
        Object obj = new HashSet(adrequestparcel.zzsD);
_L5:
        Object obj1;
        if (adrequestparcel.zzsB == -1L)
        {
            obj1 = null;
        } else
        {
            try
            {
                obj1 = new Date(adrequestparcel.zzsB);
            }
            // Misplaced declaration of an exception variable
            catch (a a1)
            {
                zzb.zzd("Could not request interstitial ad from adapter.", a1);
                throw new RemoteException();
            }
        }
        obj1 = new jh(((Date) (obj1)), adrequestparcel.zzsC, ((java.util.Set) (obj)), adrequestparcel.zzsJ, adrequestparcel.zzsE, adrequestparcel.zzsF);
        if (adrequestparcel.zzsL == null)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        obj = adrequestparcel.zzsL.getBundle(mediationinterstitialadapter.getClass().getName());
_L3:
        mediationinterstitialadapter.requestInterstitialAd((Context)com.google.android.gms.b.d.a(a1), new jj(iv), a(s, adrequestparcel.zzsF, s1), ((com.google.android.gms.ads.mediation.MediationAdRequest) (obj1)), ((Bundle) (obj)));
        return;
        obj = null;
          goto _L3
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void a(a a1, AdRequestParcel adrequestparcel, String s, String s1, iv iv, NativeAdOptionsParcel nativeadoptionsparcel, List list)
    {
        if (!(a instanceof MediationNativeAdapter))
        {
            zzb.zzaH((new StringBuilder("MediationAdapter is not a MediationNativeAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        MediationNativeAdapter mediationnativeadapter = (MediationNativeAdapter)a;
        if (adrequestparcel.zzsD == null) goto _L2; else goto _L1
_L1:
        HashSet hashset = new HashSet(adrequestparcel.zzsD);
_L5:
        Date date;
        if (adrequestparcel.zzsB == -1L)
        {
            date = null;
        } else
        {
            try
            {
                date = new Date(adrequestparcel.zzsB);
            }
            // Misplaced declaration of an exception variable
            catch (a a1)
            {
                zzb.zzd("Could not request interstitial ad from adapter.", a1);
                throw new RemoteException();
            }
        }
        list = new jm(date, adrequestparcel.zzsC, hashset, adrequestparcel.zzsJ, adrequestparcel.zzsE, adrequestparcel.zzsF, nativeadoptionsparcel, list);
        if (adrequestparcel.zzsL == null)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        nativeadoptionsparcel = adrequestparcel.zzsL.getBundle(mediationnativeadapter.getClass().getName());
_L3:
        b = new jj(iv);
        mediationnativeadapter.requestNativeAd((Context)com.google.android.gms.b.d.a(a1), b, a(s, adrequestparcel.zzsF, s1), list, nativeadoptionsparcel);
        return;
        nativeadoptionsparcel = null;
          goto _L3
_L2:
        hashset = null;
        if (true) goto _L5; else goto _L4
_L4:
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
        MediationBannerAdapter mediationbanneradapter = (MediationBannerAdapter)a;
        if (adrequestparcel.zzsD == null) goto _L2; else goto _L1
_L1:
        Object obj = new HashSet(adrequestparcel.zzsD);
_L5:
        Object obj1;
        if (adrequestparcel.zzsB == -1L)
        {
            obj1 = null;
        } else
        {
            try
            {
                obj1 = new Date(adrequestparcel.zzsB);
            }
            // Misplaced declaration of an exception variable
            catch (a a1)
            {
                zzb.zzd("Could not request banner ad from adapter.", a1);
                throw new RemoteException();
            }
        }
        obj1 = new jh(((Date) (obj1)), adrequestparcel.zzsC, ((java.util.Set) (obj)), adrequestparcel.zzsJ, adrequestparcel.zzsE, adrequestparcel.zzsF);
        if (adrequestparcel.zzsL == null)
        {
            break MISSING_BLOCK_LABEL_234;
        }
        obj = adrequestparcel.zzsL.getBundle(mediationbanneradapter.getClass().getName());
_L3:
        mediationbanneradapter.requestBannerAd((Context)com.google.android.gms.b.d.a(a1), new jj(iv), a(s, adrequestparcel.zzsF, s1), zza.zza(adsizeparcel.width, adsizeparcel.height, adsizeparcel.zzte), ((com.google.android.gms.ads.mediation.MediationAdRequest) (obj1)), ((Bundle) (obj)));
        return;
        obj = null;
          goto _L3
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
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
            a.onDestroy();
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
        try
        {
            a.onPause();
            return;
        }
        catch (Throwable throwable)
        {
            zzb.zzd("Could not pause adapter.", throwable);
        }
        throw new RemoteException();
    }

    public final void e()
    {
        try
        {
            a.onResume();
            return;
        }
        catch (Throwable throwable)
        {
            zzb.zzd("Could not resume adapter.", throwable);
        }
        throw new RemoteException();
    }

    public final void f()
    {
        if (!(a instanceof MediationRewardedVideoAdAdapter))
        {
            zzb.zzaH((new StringBuilder("MediationAdapter is not a MediationRewardedVideoAdAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        zzb.zzaF("Show rewarded video ad from adapter.");
        try
        {
            ((MediationRewardedVideoAdAdapter)a).showVideo();
            return;
        }
        catch (Throwable throwable)
        {
            zzb.zzd("Could not show rewarded video ad from adapter.", throwable);
        }
        throw new RemoteException();
    }

    public final boolean g()
    {
        if (!(a instanceof MediationRewardedVideoAdAdapter))
        {
            zzb.zzaH((new StringBuilder("MediationAdapter is not a MediationRewardedVideoAdAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        zzb.zzaF("Check if adapter is initialized.");
        boolean flag;
        try
        {
            flag = ((MediationRewardedVideoAdAdapter)a).isInitialized();
        }
        catch (Throwable throwable)
        {
            zzb.zzd("Could not check if adapter is initialized.", throwable);
            throw new RemoteException();
        }
        return flag;
    }

    public final jb h()
    {
        com.google.android.gms.ads.mediation.NativeAdMapper nativeadmapper = b.a();
        if (nativeadmapper instanceof NativeAppInstallAdMapper)
        {
            return new jk((NativeAppInstallAdMapper)nativeadmapper);
        } else
        {
            return null;
        }
    }

    public final je i()
    {
        com.google.android.gms.ads.mediation.NativeAdMapper nativeadmapper = b.a();
        if (nativeadmapper instanceof NativeContentAdMapper)
        {
            return new jl((NativeContentAdMapper)nativeadmapper);
        } else
        {
            return null;
        }
    }

    public final Bundle j()
    {
        if (!(a instanceof su))
        {
            zzb.zzaH((new StringBuilder("MediationAdapter is not a v2 MediationBannerAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            return new Bundle();
        } else
        {
            return ((su)a).a();
        }
    }

    public final Bundle k()
    {
        if (!(a instanceof sv))
        {
            zzb.zzaH((new StringBuilder("MediationAdapter is not a v2 MediationInterstitialAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            return new Bundle();
        } else
        {
            return ((sv)a).a();
        }
    }

    public final Bundle l()
    {
        return new Bundle();
    }
}
