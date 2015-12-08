// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ijoysoft.a;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.AssetManager;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.c;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.e;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

// Referenced classes of package com.ijoysoft.a:
//            u, t, s, w, 
//            j, q, v, p, 
//            c, d, b, k, 
//            e, f, g, h, 
//            m, o, l

public final class a
{

    private static a a;
    private String b;
    private String c;
    private String d;
    private AdView e;
    private e f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private Handler k;
    private Dialog l;
    private Drawable m;
    private boolean n;
    private Random o;
    private boolean p;

    private a()
    {
        g = true;
        h = false;
        i = true;
        j = false;
        n = false;
        o = new Random();
        p = true;
        k = new Handler();
    }

    public static a a()
    {
        if (a == null)
        {
            a = new a();
        }
        return a;
    }

    static void a(a a1, Activity activity)
    {
        a1.c(activity);
    }

    static void a(a a1, Activity activity, Runnable runnable)
    {
        if (activity.hasWindowFocus())
        {
            Object obj = LayoutInflater.from(activity).inflate(u.a, null);
            ImageView imageview = (ImageView)((View) (obj)).findViewById(com.ijoysoft.a.t.d);
            ((View) (obj)).findViewById(t.g);
            imageview.startAnimation(AnimationUtils.loadAnimation(activity, s.a));
            activity = new Dialog(activity, com.ijoysoft.a.w.c);
            activity.setCancelable(false);
            activity.setContentView(((View) (obj)), new android.widget.LinearLayout.LayoutParams(-1, -1));
            obj = activity.getWindow().getAttributes();
            obj.dimAmount = 0.2F;
            activity.getWindow().setAttributes(((android.view.WindowManager.LayoutParams) (obj)));
            a1.l = activity;
            a1.l.show();
            a1.k.postDelayed(new j(a1, runnable), 1500L);
        }
    }

    static void a(a a1, AdView adview)
    {
        a1.e = adview;
    }

    static void a(a a1, String s1)
    {
        a1.a(s1);
    }

    private void a(String s1)
    {
        if (i)
        {
            Log.d("AdManager", s1);
        }
    }

    static boolean a(a a1)
    {
        return a1.g;
    }

    static void b(Activity activity)
    {
        activity.getSharedPreferences("preference_advertisement", 0).edit().putBoolean("preference_key_adv_rate", true).commit();
        if (e(activity) == null)
        {
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder("market://details?id=")).append(activity.getPackageName()).toString())));
            return;
        } else
        {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder("https://play.google.com/store/apps/details?id=")).append(activity.getPackageName()).toString()));
            intent.setClassName("com.android.vending", "com.google.android.finsky.activities.MainActivity");
            intent.setFlags(0x10000000);
            activity.startActivity(intent);
            return;
        }
    }

    private void b(Activity activity, Runnable runnable)
    {
        a("showRateDialog");
        Object obj = new StringBuilder("mAdView\u4E3A\u7A7A:");
        q q1;
        boolean flag;
        if (e == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(((StringBuilder) (obj)).append(flag).toString());
        obj = (new android.app.AlertDialog.Builder(activity, w.a)).create();
        q1 = new q(activity);
        q1.b(v.j);
        q1.a(v.h);
        if (p)
        {
            q1.b(v.g, new p(this, ((AlertDialog) (obj)), activity, runnable));
        }
        q1.a(v.i, new com.ijoysoft.a.c(this, ((AlertDialog) (obj)), activity));
        q1.c(v.f, new com.ijoysoft.a.d(this, ((AlertDialog) (obj)), runnable, activity));
        ((AlertDialog) (obj)).show();
        ((AlertDialog) (obj)).setContentView(q1);
        b(((Context) (activity)));
    }

    private void b(Context context)
    {
        a("loadAdRectView");
        context = new AdView(context);
        context.a(c);
        context.a(d.d);
        com.google.android.gms.ads.b b1 = (new c()).a();
        context.a(new b(this, context));
        context.a(b1);
    }

    static void b(a a1)
    {
        a1.g = false;
    }

    static void b(a a1, Activity activity)
    {
        a1.d(activity);
    }

    static void b(a a1, Activity activity, Runnable runnable)
    {
        View view = LayoutInflater.from(activity).inflate(com.ijoysoft.a.u.c, null);
        Object obj = a().m;
        if (obj != null)
        {
            view.setBackgroundDrawable(((Drawable) (obj)));
        }
        obj = (ImageView)view.findViewById(com.ijoysoft.a.t.d);
        ((TextView)view.findViewById(t.g)).setText((new StringBuilder(String.valueOf(activity.getString(com.ijoysoft.a.v.e)))).append(" ").append(activity.getApplicationInfo().loadLabel(activity.getPackageManager()).toString()).toString());
        ((ImageView) (obj)).startAnimation(AnimationUtils.loadAnimation(activity, s.a));
        obj = ((WindowManager)activity.getSystemService("window")).getDefaultDisplay();
        activity = new Dialog(activity, w.b);
        activity.setCancelable(false);
        activity.setContentView(view, new android.widget.LinearLayout.LayoutParams(((Display) (obj)).getWidth(), ((Display) (obj)).getHeight()));
        activity.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        a1.l = activity;
        a1.l.show();
        a1.k.postDelayed(new k(a1, runnable), 2000L);
    }

    private void c(Activity activity)
    {
        if (f != null && f.a())
        {
            f.b();
            if (j)
            {
                a(activity, false);
            }
        }
    }

    private void c(Activity activity, Runnable runnable)
    {
        a("showExitDialog");
        if (e == null)
        {
            if (runnable != null)
            {
                runnable.run();
            }
            return;
        } else
        {
            AlertDialog alertdialog = (new android.app.AlertDialog.Builder(activity, w.a)).create();
            q q1 = new q(activity);
            q1.b(com.ijoysoft.a.v.c);
            q1.a(com.ijoysoft.a.v.d);
            q1.a(v.a, new com.ijoysoft.a.e(this, alertdialog));
            q1.c(v.b, new f(this, alertdialog, runnable));
            q1.a(e);
            alertdialog.show();
            alertdialog.setContentView(q1);
            b(activity);
            return;
        }
    }

    static void c(a a1)
    {
        if (a1.l != null && a1.l.isShowing())
        {
            a1.l.dismiss();
            a1.l = null;
        }
    }

    private void d(Activity activity)
    {
        if (!h)
        {
            activity.finish();
            return;
        } else
        {
            ActivityInfo activityinfo = activity.getPackageManager().resolveActivity((new Intent("android.intent.action.MAIN")).addCategory("android.intent.category.HOME"), 0).activityInfo;
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setComponent(new ComponentName(activityinfo.packageName, activityinfo.name));
            activity.startActivity(intent);
            return;
        }
    }

    private static PackageInfo e(Activity activity)
    {
        try
        {
            activity = activity.getPackageManager().getPackageInfo("com.android.vending", 0);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            return null;
        }
        return activity;
    }

    public final void a(Activity activity)
    {
        Object obj = activity.getSharedPreferences("preference_advertisement", 0);
        LinearLayout linearlayout;
        com.google.android.gms.ads.b b1;
        if (((SharedPreferences) (obj)).getBoolean("preference_key_adv_first_start", true))
        {
            a("\u9996\u6B21\u542F\u52A8");
            n = true;
            ((SharedPreferences) (obj)).edit().putBoolean("preference_key_adv_first_start", false).commit();
        } else
        {
            n = false;
        }
        b(activity);
        obj = new AdView(activity);
        ((AdView) (obj)).a(d);
        ((AdView) (obj)).a(d.f);
        linearlayout = (LinearLayout)activity.findViewById(0x7f060030);
        linearlayout.addView(((View) (obj)));
        b1 = (new c()).a();
        ((AdView) (obj)).a(new g(this, linearlayout));
        ((AdView) (obj)).a(b1);
        a(activity, g);
    }

    public final void a(Activity activity, Runnable runnable)
    {
        if (!activity.getSharedPreferences("preference_advertisement", 0).getBoolean("preference_key_adv_rate", false) && (n || o.nextInt(1) == 0))
        {
            b(activity, runnable);
            return;
        } else
        {
            c(activity, runnable);
            return;
        }
    }

    public final void a(Activity activity, boolean flag)
    {
        a((new StringBuilder("loadInterstitialAdView:isInterstitialAdValid ")).append(g).toString());
        if (!n)
        {
            f = new e(activity);
            f.a(b);
            com.google.android.gms.ads.b b1 = (new c()).a();
            f.a(b1);
            f.a(new h(this, flag, activity));
        }
    }

    public final void a(Activity activity, boolean flag, Runnable runnable)
    {
        boolean flag1 = true;
        if (flag) goto _L2; else goto _L1
_L1:
        if (f == null || !f.a()) goto _L4; else goto _L3
_L3:
        a("showInterstitialAd");
        f.a(new m(this, activity));
        f.b();
_L6:
        return;
_L4:
        d(activity);
        a(activity, false);
        return;
_L2:
        if (!activity.getSharedPreferences("preference_advertisement", 0).getBoolean("preference_key_adv_rate", false) && (n || o.nextInt(1) == 0))
        {
            b(activity, runnable);
            return;
        }
        if (f != null && f.a())
        {
            a("showInterstitialActivity");
            f.a(new o(this, activity, runnable));
            c(activity);
        } else
        {
            flag1 = false;
        }
        if (!flag1)
        {
            c(activity, runnable);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(Context context)
    {
        Properties properties = new Properties();
        try
        {
            properties.load(context.getAssets().open("AdvertisementConfigure.properties"));
            b = properties.getProperty("adv_interstitial_id", "ca-app-pub-6282254818375654/5670833328");
            c = properties.getProperty("adv_rect_id", "ca-app-pub-6282254818375654/1375391328");
            d = properties.getProperty("adv_banner_id", "ca-app-pub-6282254818375654/7421924925");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
    }

    public final void a(Runnable runnable)
    {
        if (f != null)
        {
            if (f.a())
            {
                f.a(new l(this, runnable));
                f.b();
                return;
            }
            f.a(null);
        }
        runnable.run();
    }

    public final void b()
    {
        g = true;
    }

    public final void c()
    {
        j = true;
    }
}
