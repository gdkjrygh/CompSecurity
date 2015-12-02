// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.c;

import android.accounts.AccountManager;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.Service;
import android.app.admin.DevicePolicyManager;
import android.content.ContentResolver;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.location.Geocoder;
import android.location.LocationManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PowerManager;
import android.os.Vibrator;
import android.support.v4.app.q;
import android.telephony.TelephonyManager;
import android.text.ClipboardManager;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import com.facebook.auth.d.u;
import com.facebook.base.IsBetaBuild;
import com.facebook.base.broadcast.CrossFbAppBroadcast;
import com.facebook.base.broadcast.CrossFbProcessBroadcast;
import com.facebook.base.broadcast.LocalBroadcast;
import com.facebook.base.broadcast.j;
import com.facebook.c.l;
import com.facebook.common.e.o;
import com.facebook.common.executors.DefaultExecutorService;
import com.facebook.common.executors.ForLightweightTaskHandlerThread;
import com.facebook.common.executors.ForUiThread;
import com.facebook.common.executors.ForUiThreadWakeup;
import com.facebook.common.executors.n;
import com.facebook.common.hardware.PhoneIsoCountryCode;
import com.facebook.common.hardware.ab;
import com.facebook.common.hardware.f;
import com.facebook.common.hardware.p;
import com.facebook.common.init.NeedsHighPriorityInitOnBackgroundThread;
import com.facebook.common.init.NeedsLowPriorityInitOnBackgroundThread;
import com.facebook.common.init.NeedsLowPriorityInitOnUiThread;
import com.facebook.common.json.e;
import com.facebook.common.l.c;
import com.facebook.common.process.MyProcessId;
import com.facebook.common.random.InsecureRandom;
import com.facebook.common.time.MonotonicSinceBoot;
import com.facebook.common.v.i;
import com.facebook.common.v.k;
import com.facebook.debug.log.h;
import com.facebook.inject.a.g;
import com.facebook.inject.aj;
import com.facebook.inject.b;
import com.facebook.inject.x;
import com.google.common.d.a.d;
import com.google.common.d.a.v;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.facebook.base.c:
//            b, bc, bb, am, 
//            au, aq, aj, ai, 
//            q, p, j, d, 
//            ay, av, o, ab, 
//            at, as, f, ah, 
//            ap, ak, u, an, 
//            ao, ad, bd, r, 
//            s, g, ag, aw, 
//            t, e, n, bh, 
//            be, v, ac, ae, 
//            bg, bf, ax, l, 
//            m, bi, w, c, 
//            y, i, h, aa, 
//            az, af, ba, ar, 
//            al, z, x, k

public class a extends b
{

    public a()
    {
    }

    private void a(Class class1, String s1)
    {
        a(class1).a(new bc(this, s1));
    }

    protected void a()
    {
        f(com/facebook/auth/d/u);
        f(com/facebook/common/v/k);
        f(com/facebook/c/d);
        f(com/facebook/debug/log/h);
        f(com/facebook/common/l/c);
        f(com/facebook/common/json/e);
        d(com/facebook/config/a/a);
        a(com/facebook/common/time/a).b(com/facebook/common/time/c);
        a(com/facebook/common/time/a).a(com/facebook/common/time/MonotonicSinceBoot).b(com/facebook/common/time/b);
        a(com/facebook/common/time/c).a(new bb(null)).a();
        a(com/facebook/common/time/b).a(new am(null)).a();
        a(java/util/Random).a(com/facebook/common/random/InsecureRandom).a(new au(null));
        a(com/facebook/common/o/e).a(new aq(this, null)).a();
        a(java/util/Locale).a(new com.facebook.base.c.aj(null));
        a(com/facebook/base/broadcast/j).a(com/facebook/base/broadcast/LocalBroadcast).a(new ai(this, null)).d();
        a(com/facebook/base/broadcast/j).a(com/facebook/base/broadcast/CrossFbProcessBroadcast).a(new com.facebook.base.c.q(this, null)).d();
        a(com/facebook/base/broadcast/j).a(com/facebook/base/broadcast/CrossFbAppBroadcast).a(new com.facebook.base.c.p(this, null)).d();
        a(com/facebook/ui/f/b).a(new com.facebook.base.c.j(this, null));
        a(android/location/LocationManager, "location");
        a(android/view/WindowManager, "window");
        a(android/view/LayoutInflater, "layout_inflater");
        a(android/app/ActivityManager, "activity");
        a(android/os/PowerManager, "power");
        a(android/app/admin/DevicePolicyManager, "device_policy");
        a(android/app/AlarmManager, "alarm");
        a(android/app/NotificationManager, "notification");
        a(android/app/KeyguardManager, "keyguard");
        a(android/app/SearchManager, "search");
        a(android/os/Vibrator, "vibrator");
        a(android/net/ConnectivityManager, "connectivity");
        a(android/net/wifi/WifiManager, "wifi");
        a(android/view/inputmethod/InputMethodManager, "input_method");
        a(android/hardware/SensorManager, "sensor");
        a(android/text/ClipboardManager, "clipboard");
        a(android/telephony/TelephonyManager, "phone");
        a(android/media/AudioManager, "audio");
        a(android/accounts/AccountManager, "account");
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            a(android/app/DownloadManager, "download");
        }
        a(android/app/Activity).a(new com.facebook.base.c.d(this, null));
        a(android/app/Service).a(new ay(this, null));
        a(android/content/res/Resources).a(new av(this, null));
        a(android/content/ContentResolver).a(new com.facebook.base.c.o(this, null));
        a(android/support/v4/app/q).a(new com.facebook.base.c.ab(this, null));
        a(android/content/pm/PackageManager).a(new at(this, null)).a();
        a(android/content/pm/PackageInfo).a(new as(null)).a();
        a(com/facebook/common/q/a).a(new com.facebook.base.c.f(this, null));
        a(android/support/v4/a/e).a(new ah(this, null)).a();
        a(com/facebook/common/hardware/k).a(new ap(this, null)).a();
        a(android_src/e/a).a(new ak(this, null));
        a(com/facebook/common/process/a).a(new com.facebook.base.c.u(this, null)).a();
        a(com/facebook/common/process/d).b(com/facebook/common/process/a);
        a(java/lang/Integer).a(com/facebook/common/process/MyProcessId).a(new an(this, null));
        a(com/facebook/common/process/c).a(new ao(this, null));
        a(android/os/HandlerThread).a(new ad(null)).a();
        a(android/os/Handler).a(com/facebook/common/executors/ForUiThread).a(new bd(null));
        a(java/util/concurrent/ExecutorService).a(com/facebook/common/executors/DefaultExecutorService).a(new r(this, null)).a();
        a(com/google/common/d/a/u).a(com/facebook/common/executors/DefaultExecutorService).a(new s(this, null)).a();
        a(com/facebook/common/executors/a).a(new com.facebook.base.c.g(this, null)).a();
        a(com/facebook/common/executors/n).a(new ag(this, null)).a();
        a(java/util/concurrent/ScheduledExecutorService).a(com/facebook/common/executors/DefaultExecutorService).a(new aw(this, null)).a();
        a(com/facebook/common/executors/u).a(com/facebook/common/executors/DefaultExecutorService).a(new t(this, null));
        a(com/facebook/debug/a/a).a(new com.facebook.base.c.e(this, null)).a();
        a(com/facebook/common/hardware/f).a(new com.facebook.base.c.n(this, null)).a();
        a(java/util/concurrent/Executor).a(com/facebook/common/executors/ForUiThreadWakeup).a(java/util/concurrent/ExecutorService, com/facebook/common/executors/ForUiThreadWakeup);
        a(java/util/concurrent/ExecutorService).a(com/facebook/common/executors/ForUiThreadWakeup).a(com/google/common/d/a/v, com/facebook/common/executors/ForUiThreadWakeup);
        a(com/google/common/d/a/u).a(com/facebook/common/executors/ForUiThreadWakeup).a(com/google/common/d/a/v, com/facebook/common/executors/ForUiThreadWakeup);
        a(java/util/concurrent/ScheduledExecutorService).a(com/facebook/common/executors/ForUiThreadWakeup).a(com/google/common/d/a/v, com/facebook/common/executors/ForUiThreadWakeup);
        a(com/google/common/d/a/v).a(com/facebook/common/executors/ForUiThreadWakeup).a(new bh(this, null)).a();
        a(java/util/concurrent/Executor).a(com/facebook/common/executors/ForUiThread).a(java/util/concurrent/ExecutorService, com/facebook/common/executors/ForUiThread);
        a(java/util/concurrent/ExecutorService).a(com/facebook/common/executors/ForUiThread).a(com/google/common/d/a/u, com/facebook/common/executors/ForUiThread);
        a(com/google/common/d/a/u).a(com/facebook/common/executors/ForUiThread).a(com/google/common/d/a/v, com/facebook/common/executors/ForUiThread);
        a(java/util/concurrent/ScheduledExecutorService).a(com/facebook/common/executors/ForUiThread).a(com/google/common/d/a/v, com/facebook/common/executors/ForUiThread);
        a(java/util/concurrent/ScheduledExecutorService).a(com/facebook/common/executors/ForLightweightTaskHandlerThread).a(com/google/common/d/a/v, com/facebook/common/executors/ForUiThread);
        a(com/google/common/d/a/v).a(com/facebook/common/executors/ForUiThread).a(new be(this, null)).a();
        a(com/facebook/common/a/d).a(new com.facebook.base.c.v(this, null));
        a(android/location/Geocoder).a(new ac(this, null)).a();
        a(com/facebook/common/i/b).a(new ae(this, null)).a();
        a(com/facebook/common/v/f).a(new bg(this, null)).a();
        a(com/facebook/common/v/i).a(new bf(this, null));
        a(com/facebook/common/hardware/q).a(new ax(this, null)).a();
        a(com/facebook/common/hardware/a).a(new com.facebook.base.c.l(this, null)).a();
        a(com/facebook/common/hardware/e).a(new m(this, null)).a();
        a(com/facebook/common/hardware/ab).a(new bi(this, null)).a();
        a(com/facebook/common/hardware/j).a(new w(this, null)).a();
        b(com/facebook/base/broadcast/a).a(new com.facebook.base.c.c(this, null)).a();
        a(com/facebook/base/a/k).a(new y(this, null));
        a(com/facebook/base/a/d).a(new com.facebook.base.c.i(this, null)).a();
        a(com/facebook/base/a/c).a(new com.facebook.base.c.h(this, null));
        a(com/facebook/common/u/a).a(new aa(this, null)).a();
        b(com/facebook/config/a/d).a(com.facebook.config.a.d.UNKNOWN);
        a(com/facebook/base/j).a(new az(this, null));
        a(java/lang/Boolean).a(com/facebook/base/IsBetaBuild).a(new af(this, null)).a();
        b(com/facebook/common/e/h).b(com/facebook/common/e/o);
        a(com/facebook/common/e/o).a(new ba(this, null)).a();
        a(com/facebook/common/hardware/n).a(new ar(this, null)).a();
        a(com/facebook/common/c/i).a(new al(this, null));
        c(com/facebook/base/activity/f);
        a(com/facebook/base/c, com/facebook/common/init/NeedsHighPriorityInitOnBackgroundThread);
        a(com/facebook/base/c, com/facebook/common/init/NeedsLowPriorityInitOnUiThread);
        a(com/facebook/base/c, com/facebook/common/init/NeedsLowPriorityInitOnBackgroundThread);
        a(com/facebook/base/d, com/facebook/common/init/NeedsHighPriorityInitOnBackgroundThread);
        a(com/facebook/base/d, com/facebook/common/init/NeedsLowPriorityInitOnUiThread);
        a(com/facebook/base/d, com/facebook/common/init/NeedsLowPriorityInitOnBackgroundThread);
        c(com/facebook/base/activity/f).a(com/facebook/common/v/i);
        a(com/facebook/base/d, com/facebook/common/init/NeedsHighPriorityInitOnBackgroundThread).a(com/facebook/base/a/c);
        a(com/facebook/inject/x).a(new z(this, null));
        a(com/facebook/base/c, com/facebook/common/init/NeedsLowPriorityInitOnUiThread).a(com/facebook/inject/x);
        a(java/lang/String).a(com/facebook/common/hardware/PhoneIsoCountryCode).c(com/facebook/common/hardware/p);
        a(com/facebook/c/l).a(new com.facebook.base.c.x(null)).a();
        b(com/facebook/config/b/a).a(new com.facebook.base.c.k(this, null)).a();
    }

    static 
    {
        d.a(new com.facebook.base.c.b());
    }
}
