// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage;

import android.content.SharedPreferences;
import android.support.multidex.MultiDexApplication;
import android.webkit.WebView;
import com.androidquery.callback.AjaxCallback;
import com.androidquery.callback.BitmapAjaxCallback;
import com.bumptech.glide.g;
import com.cardinalblue.android.a.a;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.amazon.HomeHeroWidgetManager;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.cardinalblue.android.piccollage.controller.RatingNotifierManager;
import com.cardinalblue.android.piccollage.controller.f;
import com.cardinalblue.android.piccollage.controller.network.e;
import com.cardinalblue.android.piccollage.controller.o;
import com.cardinalblue.android.piccollage.lib.b;
import com.cardinalblue.android.piccollage.lib.c;
import com.cardinalblue.android.piccollage.lib.d;
import com.crashlytics.android.Crashlytics;
import com.facebook.FacebookSdk;
import com.flurry.android.FlurryAgent;
import io.fabric.sdk.android.i;
import java.io.InputStream;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.cardinalblue.android.piccollage:
//            a

public class PCApplication extends MultiDexApplication
{

    public PCApplication()
    {
    }

    private void a()
    {
        com.cardinalblue.android.a.a.a(com/cardinalblue/android/piccollage/a, new com.cardinalblue.android.piccollage.a());
        com.cardinalblue.android.a.a.a(com/cardinalblue/android/piccollage/lib/c, new c());
        com.cardinalblue.android.a.a.a(com/cardinalblue/android/piccollage/lib/d, new d());
        com.cardinalblue.android.a.a.a(com/cardinalblue/android/piccollage/lib/b, new b());
    }

    public void onCreate()
    {
        super.onCreate();
        BitmapAjaxCallback.h(100);
        BitmapAjaxCallback.i(0x1e8480);
        AjaxCallback.c(8);
        k.a(getApplicationContext());
        io.fabric.sdk.android.c.a(this, new i[] {
            new Crashlytics()
        });
        f.b = Math.min(Math.max(Math.max(k.c(), k.d()) / 3, 400), 800);
        o.a().b();
        com.cardinalblue.android.piccollage.controller.a.a().h();
        FlurryAgent.init(this, k.q());
        String s1 = k.j().getString("pref_device_uuid", null);
        String s = s1;
        if (s1 == null)
        {
            s = UUID.randomUUID().toString();
            k.j().edit().putString("pref_device_uuid", s).apply();
        }
        FacebookSdk.sdkInitialize(this);
        com.cardinalblue.android.piccollage.a.i.a(getApplicationContext());
        g.a(this).a(com/bumptech/glide/load/b/d, java/io/InputStream, new com.bumptech.glide.integration.volley.d.a(com.cardinalblue.android.piccollage.lib.i.a(this).b(), new com.bumptech.glide.integration.volley.a() {

            final PCApplication a;

            public com.android.volley.k a(String s2, com.bumptech.glide.integration.volley.b b1, com.android.volley.k.a a1, Map map)
            {
                s2 = new e(s2, b1, a1, map);
                s2.a(new com.android.volley.c(2500, 5, 1.0F));
                return s2;
            }

            
            {
                a = PCApplication.this;
                super();
            }
        }));
        Crashlytics.setUserIdentifier(s);
        com.cardinalblue.android.piccollage.controller.network.f.a(new com.cardinalblue.android.piccollage.controller.network.a());
        if (k.k(this))
        {
            HomeHeroWidgetManager.a(getApplicationContext()).a();
        }
        if (android.os.Build.VERSION.SDK_INT > 18 && com.cardinalblue.android.b.d.f())
        {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        a();
        com.cardinalblue.android.piccollage.controller.d.a().a(PicAuth.h());
        com.cardinalblue.android.piccollage.controller.d.a().a(com.cardinalblue.android.a.a.a(com/cardinalblue/android/piccollage/lib/b));
        registerActivityLifecycleCallbacks((android.app.Application.ActivityLifecycleCallbacks)com.cardinalblue.android.a.a.a(com/cardinalblue/android/piccollage/lib/c));
        com.cardinalblue.android.piccollage.controller.d.b(RatingNotifierManager.a());
        com.cardinalblue.android.piccollage.controller.d.a().c(new com.cardinalblue.android.piccollage.controller.RatingNotifierManager.b(com.cardinalblue.android.piccollage.controller.RatingNotifierManager.a.b));
    }

    public void onLowMemory()
    {
        super.onLowMemory();
        BitmapAjaxCallback.g();
    }
}
