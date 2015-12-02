// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.mobvista.sdk.m.a.d.a.k;
import com.mobvista.sdk.m.a.e.a;
import com.mobvista.sdk.m.a.f.b;
import com.mobvista.sdk.m.a.f.g;
import com.mobvista.sdk.m.a.f.i;
import java.util.HashMap;

// Referenced classes of package com.mobvista.sdk.m.core:
//            l, m, p, r, 
//            MobvistaAdWall, MobvistaAdNative, s, ac

public class MobvistaAd
{

    public static HashMap mCachedMobvistaAdNative = new HashMap();

    public MobvistaAd()
    {
    }

    static void a(Context context)
    {
        b(context);
    }

    private static void b(Context context)
    {
        try
        {
            Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient.Info");
            com.mobvista.sdk.m.a.f.b.a(AdvertisingIdClient.getAdvertisingIdInfo(context).getId());
            return;
        }
        catch (Exception exception)
        {
            Log.w("MobvistaAd", "GET ADID ERROR TRY TO GET FROM GOOGLE PLAY APP");
        }
        try
        {
            com.mobvista.sdk.m.a.f.b.a((new l()).a(context).a());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("MobvistaAd", "GET ADID FROM GOOGLE PLAY APP ERROR");
        }
    }

    public static void init(Context context, String s1, String s2)
    {
        if (i.a(s1) || i.a(s2))
        {
            throw new IllegalStateException("appId and appKey can not be NUll.");
        } else
        {
            com.mobvista.sdk.m.core.p.a = s1;
            com.mobvista.sdk.m.core.p.b = s2;
            g.a(context.getApplicationContext());
            com.mobvista.sdk.m.a.f.b.o(context.getApplicationContext());
            com.mobvista.sdk.m.a.f.b.p(context.getApplicationContext());
            k.a(context.getApplicationContext());
            (new r(context)).start();
            return;
        }
    }

    public static MobvistaAdWall newAdWallController(Activity activity, String s1, String s2)
    {
        if (i.a(com.mobvista.sdk.m.core.p.a) || i.a(com.mobvista.sdk.m.core.p.b))
        {
            throw new IllegalStateException("you should init first");
        } else
        {
            return new MobvistaAdWall(activity, s1, s2);
        }
    }

    public static MobvistaAdNative newNativeController(Activity activity, String s1, String s2)
    {
        if (i.a(com.mobvista.sdk.m.core.p.a) || i.a(com.mobvista.sdk.m.core.p.b))
        {
            throw new IllegalStateException("you should init first");
        } else
        {
            return new MobvistaAdNative(activity, s1, s2);
        }
    }

    public static MobvistaAdNative popPreloadedNativeAd(String s1)
    {
        synchronized (mCachedMobvistaAdNative)
        {
            s1 = (MobvistaAdNative)mCachedMobvistaAdNative.remove(s1);
        }
        return s1;
    }

    public static void preloadNativeAd(Activity activity, String s1, String s2)
    {
        if (i.a(s1) || i.a(s2))
        {
            throw new IllegalArgumentException("unitId or FBPlacementId can't be empty!!!");
        }
        Log.d("MobvistaAd", "native preload start!");
        synchronized (mCachedMobvistaAdNative)
        {
            mCachedMobvistaAdNative.remove(s1);
        }
        activity = newNativeController(activity, s1, s2);
        activity.loadAd(new s(s1, activity));
    }

    public static void release()
    {
        com.mobvista.sdk.m.a.e.a.a().c();
        k.a();
        mCachedMobvistaAdNative.clear();
        mCachedMobvistaAdNative = null;
    }

    public void allowDirectDownload(boolean flag)
    {
        com.mobvista.sdk.m.core.ac.a = flag;
    }

}
