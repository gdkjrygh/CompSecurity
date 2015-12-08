// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.mopub.common.AdFormat;
import com.mopub.common.AdUrlGenerator;
import com.mopub.common.LocationService;
import com.mopub.common.MediationSettings;
import com.mopub.common.MoPub;
import com.mopub.common.MoPubReward;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.MoPubCollections;
import com.mopub.common.util.Reflection;
import com.mopub.network.AdRequest;
import com.mopub.network.AdResponse;
import com.mopub.network.MoPubNetworkError;
import com.mopub.network.Networking;
import com.mopub.volley.RequestQueue;
import com.mopub.volley.VolleyError;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// Referenced classes of package com.mopub.mobileads:
//            al, AdRequestStatusMapping, MoPubErrorCode, CustomEventRewardedVideo, 
//            y, ag, MoPubRewardedVideoListener, WebViewAdUrlGenerator, 
//            ad, ae, af, aa, 
//            z, ac, ab

public class MoPubRewardedVideoManager
{

    private static MoPubRewardedVideoManager a;
    private final Handler b = new Handler(Looper.getMainLooper());
    private WeakReference c;
    private final Context d;
    private final AdRequestStatusMapping e = new AdRequestStatusMapping();
    private final al f = new al();
    private MoPubRewardedVideoListener g;
    private final Set h = new HashSet();
    private final Map i = new HashMap();
    private final Handler j = new Handler();
    private final Map k = new HashMap();

    private transient MoPubRewardedVideoManager(Activity activity, MediationSettings amediationsettings[])
    {
        c = new WeakReference(activity);
        d = activity.getApplicationContext();
        MoPubCollections.addAllNonNull(h, amediationsettings);
    }

    static MoPubRewardedVideoListener a(MoPubRewardedVideoManager mopubrewardedvideomanager)
    {
        return mopubrewardedvideomanager.g;
    }

    static MoPubRewardedVideoManager a()
    {
        return a;
    }

    static void a(MoPubRewardedVideoManager mopubrewardedvideomanager, AdResponse adresponse, String s)
    {
        mopubrewardedvideomanager.e.a(s, adresponse.getFailoverUrl(), adresponse.getImpressionTrackingUrl(), adresponse.getClickTrackingUrl());
        Object obj = adresponse.getAdTimeoutMillis();
        if (obj == null || ((Integer) (obj)).intValue() <= 0)
        {
            obj = Integer.valueOf(30000);
        }
        String s1 = adresponse.getCustomEventClassName();
        if (s1 == null)
        {
            MoPubLog.e("Couldn't create custom event, class name was null.");
            mopubrewardedvideomanager.a(s, MoPubErrorCode.ADAPTER_CONFIGURATION_ERROR);
            return;
        }
        try
        {
            CustomEventRewardedVideo customeventrewardedvideo = (CustomEventRewardedVideo)Reflection.instantiateClassWithEmptyConstructor(s1, com/mopub/mobileads/CustomEventRewardedVideo);
            (new TreeMap()).put("com_mopub_ad_unit_id", s);
            y y1 = new y(mopubrewardedvideomanager, customeventrewardedvideo);
            mopubrewardedvideomanager.j.postDelayed(y1, ((Integer) (obj)).intValue());
            mopubrewardedvideomanager.k.put(s, y1);
            obj = (Activity)mopubrewardedvideomanager.c.get();
            adresponse.getServerExtras();
            customeventrewardedvideo.a(((Activity) (obj)));
            adresponse = customeventrewardedvideo.a();
            obj = customeventrewardedvideo.c();
            mopubrewardedvideomanager.f.a(s, customeventrewardedvideo, adresponse, ((String) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AdResponse adresponse)
        {
            MoPubLog.e(String.format(Locale.US, "Couldn't create custom event with class name %s", new Object[] {
                s1
            }));
        }
        mopubrewardedvideomanager.a(s, MoPubErrorCode.ADAPTER_CONFIGURATION_ERROR);
    }

    static void a(MoPubRewardedVideoManager mopubrewardedvideomanager, VolleyError volleyerror, String s)
    {
        MoPubErrorCode mopuberrorcode = MoPubErrorCode.INTERNAL_ERROR;
        if (!(volleyerror instanceof MoPubNetworkError)) goto _L2; else goto _L1
_L1:
        volleyerror = (MoPubNetworkError)volleyerror;
        ag.a[volleyerror.getReason().ordinal()];
        JVM INSTR tableswitch 1 2: default 48
    //                   1 59
    //                   2 59;
           goto _L3 _L4 _L4
_L3:
        mopuberrorcode = MoPubErrorCode.INTERNAL_ERROR;
_L2:
        mopubrewardedvideomanager.a(s, mopuberrorcode);
        return;
_L4:
        mopuberrorcode = MoPubErrorCode.NO_FILL;
        if (true) goto _L2; else goto _L5
_L5:
    }

    static void a(MoPubRewardedVideoManager mopubrewardedvideomanager, String s)
    {
        s = (Runnable)mopubrewardedvideomanager.k.remove(s);
        if (s != null)
        {
            mopubrewardedvideomanager.j.removeCallbacks(s);
        }
    }

    static void a(MoPubRewardedVideoManager mopubrewardedvideomanager, String s, MoPubErrorCode mopuberrorcode)
    {
        mopubrewardedvideomanager.a(s, mopuberrorcode);
    }

    private static void a(Runnable runnable)
    {
        if (a != null)
        {
            a.b.post(runnable);
        }
    }

    private void a(String s, MoPubErrorCode mopuberrorcode)
    {
        String s1 = e.f(s);
        e.a(s);
        if (s1 != null)
        {
            a(s, s1);
        } else
        if (g != null)
        {
            g.onRewardedVideoLoadFailure(s, mopuberrorcode);
            return;
        }
    }

    private static void a(String s, String s1)
    {
        if (a == null)
        {
            MoPubLog.e("MoPub rewarded video was not initialized. You must call MoPub.initializeRewardedVideo() before loading or attempting to play video ads.");
            return;
        }
        if (a.e.e(s))
        {
            MoPubLog.d(String.format(Locale.US, "Did not queue rewarded video request for ad unit %s. A request is already pending.", new Object[] {
                s
            }));
            return;
        } else
        {
            s1 = new AdRequest(s1, AdFormat.REWARDED_VIDEO, s, a.d, a. new RewardedVideoRequestListener(s));
            Networking.getRequestQueue(a.d).add(s1);
            a.e.b(s);
            return;
        }
    }

    private static boolean a(String s, CustomEventRewardedVideo customeventrewardedvideo)
    {
        return a != null && a.e.d(s) && customeventrewardedvideo != null && customeventrewardedvideo.e();
    }

    static AdRequestStatusMapping b(MoPubRewardedVideoManager mopubrewardedvideomanager)
    {
        return mopubrewardedvideomanager.e;
    }

    static Context c(MoPubRewardedVideoManager mopubrewardedvideomanager)
    {
        return mopubrewardedvideomanager.d;
    }

    static al d(MoPubRewardedVideoManager mopubrewardedvideomanager)
    {
        return mopubrewardedvideomanager.f;
    }

    public static MediationSettings getGlobalMediationSettings(Class class1)
    {
        if (a == null)
        {
            MoPubLog.e("MoPub rewarded video was not initialized. You must call MoPub.initializeRewardedVideo() before loading or attempting to play video ads.");
            return null;
        }
        for (Iterator iterator = a.h.iterator(); iterator.hasNext();)
        {
            MediationSettings mediationsettings = (MediationSettings)iterator.next();
            if (class1.equals(mediationsettings.getClass()))
            {
                return (MediationSettings)class1.cast(mediationsettings);
            }
        }

        return null;
    }

    public static MediationSettings getInstanceMediationSettings(Class class1, String s)
    {
        if (a == null)
        {
            MoPubLog.e("MoPub rewarded video was not initialized. You must call MoPub.initializeRewardedVideo() before loading or attempting to play video ads.");
            return null;
        }
        s = (Set)a.i.get(s);
        if (s == null)
        {
            return null;
        }
        for (s = s.iterator(); s.hasNext();)
        {
            MediationSettings mediationsettings = (MediationSettings)s.next();
            if (class1.equals(mediationsettings.getClass()))
            {
                return (MediationSettings)class1.cast(mediationsettings);
            }
        }

        return null;
    }

    public static boolean hasVideo(String s)
    {
        if (a != null)
        {
            return a(s, a.f.a(s));
        } else
        {
            MoPubLog.e("MoPub rewarded video was not initialized. You must call MoPub.initializeRewardedVideo() before loading or attempting to play video ads.");
            return false;
        }
    }

    public static transient void init(Activity activity, MediationSettings amediationsettings[])
    {
        com/mopub/mobileads/MoPubRewardedVideoManager;
        JVM INSTR monitorenter ;
        if (a != null) goto _L2; else goto _L1
_L1:
        a = new MoPubRewardedVideoManager(activity, amediationsettings);
_L4:
        com/mopub/mobileads/MoPubRewardedVideoManager;
        JVM INSTR monitorexit ;
        return;
_L2:
        MoPubLog.e("Tried to call initializeRewardedVideo more than once. Only the first initialization call has any effect.");
        if (true) goto _L4; else goto _L3
_L3:
        activity;
        throw activity;
    }

    public static transient void loadVideo(String s, MediationSettings amediationsettings[])
    {
        if (a == null)
        {
            MoPubLog.e("MoPub rewarded video was not initialized. You must call MoPub.initializeRewardedVideo() before loading or attempting to play video ads.");
            return;
        } else
        {
            HashSet hashset = new HashSet();
            MoPubCollections.addAllNonNull(hashset, amediationsettings);
            a.i.put(s, hashset);
            a(s, (new WebViewAdUrlGenerator(a.d, false)).withAdUnitId(s).withLocation(LocationService.getLastKnownLocation(a.d, MoPub.getLocationPrecision(), MoPub.getLocationAwareness())).generateUrlString("ads.mopub.com"));
            return;
        }
    }

    public static void onRewardedVideoClicked(Class class1, String s)
    {
        a(new ad(class1, s));
    }

    public static void onRewardedVideoClosed(Class class1, String s)
    {
        a(new ae(class1, s));
    }

    public static void onRewardedVideoCompleted(Class class1, String s, MoPubReward mopubreward)
    {
        a(new af(class1, s, mopubreward));
    }

    public static void onRewardedVideoLoadFailure(Class class1, String s, MoPubErrorCode mopuberrorcode)
    {
        a(new aa(class1, s, mopuberrorcode));
    }

    public static void onRewardedVideoLoadSuccess(Class class1, String s)
    {
        a(new z(class1, s));
    }

    public static void onRewardedVideoPlaybackError(Class class1, String s, MoPubErrorCode mopuberrorcode)
    {
        a(new ac(class1, s, mopuberrorcode));
    }

    public static void onRewardedVideoStarted(Class class1, String s)
    {
        a(new ab(class1, s));
    }

    public static void setVideoListener(MoPubRewardedVideoListener mopubrewardedvideolistener)
    {
        if (a != null)
        {
            a.g = mopubrewardedvideolistener;
            return;
        } else
        {
            MoPubLog.e("MoPub rewarded video was not initialized. You must call MoPub.initializeRewardedVideo() before loading or attempting to play video ads.");
            return;
        }
    }

    public static void showVideo(String s)
    {
        if (a != null)
        {
            if (a(s, a.f.a(s)))
            {
                a.e.c(s);
                return;
            } else
            {
                a.a(s, MoPubErrorCode.VIDEO_NOT_AVAILABLE);
                return;
            }
        } else
        {
            MoPubLog.e("MoPub rewarded video was not initialized. You must call MoPub.initializeRewardedVideo() before loading or attempting to play video ads.");
            return;
        }
    }

    public static void updateActivity(Activity activity)
    {
        if (a != null)
        {
            a.c = new WeakReference(activity);
            return;
        } else
        {
            MoPubLog.e("MoPub rewarded video was not initialized. You must call MoPub.initializeRewardedVideo() before loading or attempting to play video ads.");
            return;
        }
    }

    private class RewardedVideoRequestListener
        implements com.mopub.network.AdRequest.Listener
    {

        private final MoPubRewardedVideoManager a;
        public final String adUnitId;

        public void onErrorResponse(VolleyError volleyerror)
        {
            MoPubRewardedVideoManager.a(a, volleyerror, adUnitId);
        }

        public void onSuccess(AdResponse adresponse)
        {
            MoPubRewardedVideoManager.a(a, adresponse, adUnitId);
        }

        public RewardedVideoRequestListener(String s)
        {
            adUnitId = s;
            a = MoPubRewardedVideoManager.this;
        }
    }

}
