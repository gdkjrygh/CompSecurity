// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.Process;
import android.view.ViewConfiguration;
import com.qihoo.security.app.DaemonMain;
import com.qihoo.security.locale.d;
import com.qihoo.security.profile.j;
import com.qihoo.security.support.b;
import com.qihoo.security.support.c;
import com.qihoo.security.ui.b.a;
import com.qihoo360.mobilesafe.b.o;
import com.qihoo360.mobilesafe.share.SharedPref;
import com.qihoo360.mobilesafe.support.NativeManager;
import java.lang.reflect.Field;

public class SecurityApplication extends Application
    implements android.os.MessageQueue.IdleHandler
{

    public static boolean a = false;
    public static long b = 0L;
    public static boolean c = false;
    static final int d[] = {
        0x7f0b0126, 0x7f0b012a, 0x7f0b012b, 0x7f0b0129, 0x7f0b012c, 0x7f0b012d
    };
    static final int e[] = {
        0x7f0b00bd, 0x7f0b00be, 0x7f0b00bf, 0x7f0b00c0, 0x7f0b00b3, 0x7f0b00b4, 0x7f0b00b5, 0x7f0b00b6, 0x7f0b00c3, 0x7f0b00c5, 
        0x7f0b00c6, 0x7f0b00c7, 0x7f0b00b8, 0x7f0b00b9, 0x7f0b00ba, 0x7f0b00b1, 0x7f0b00bc
    };
    static final int f[] = {
        0x7f0b022f, 0x7f0b0231, 0x7f0b0233, 0x7f0b0234, 0x7f0b0237, 0x7f0b0230, 0x7f0b0235, 0x7f0b023a, 0x7f0b023c, 0x7f0b0240, 
        0x7f0b0244, 0x7f0b0239
    };
    static final int g[] = {
        0x7f0b009d, 0x7f0b009f, 0x7f0b00a0, 0x7f0b00a2, 0x7f0b00a6, 0x7f0b00a3, 0x7f0b01c8, 0x7f0b01c9, 0x7f0b0194, 0x7f0b0195, 
        0x7f0b00a5, 0x7f0b00a7, 0x7f0b00f6
    };
    static final int h[] = {
        0x7f0b0071, 0x7f0b006b, 0x7f0b0070, 0x7f0b006c
    };
    private static final String j = com/qihoo/security/SecurityApplication.getSimpleName();
    private static Context k;
    private static boolean l = false;
    private static String m;
    private static Looper n;
    boolean i;

    public SecurityApplication()
    {
        i = false;
    }

    public static Context a()
    {
        return k;
    }

    public static void a(boolean flag)
    {
        l = flag;
    }

    public static boolean b()
    {
        return l;
    }

    public static String c()
    {
        return m;
    }

    public static Looper e()
    {
        return n;
    }

    private void f()
    {
        i = true;
        Process.setThreadPriority(-4);
        a a1 = com.qihoo.security.ui.b.a.a();
        a1.a(0x7f030093, (int[])null, false);
        a1.a(0x7f03001d, h, false);
        a1.a(0x7f03009f, (int[])null, false);
        a1.a(0x7f030055, d, false);
        a1.a(0x7f03008c, (int[])null, false);
        a1.a(0x7f030033, e, false);
        a1.a(0x7f0300ae, f, false);
        a1.a(0x7f030030, g, false);
        a1.a(new int[] {
            0x7f02004e, 0x7f02009a, 0x7f020152, 0x7f02004c, 0x7f02004d, 0x7f02009b, 0x7f020099, 0x7f02009c
        });
        com.qihoo.security.app.a.a(this).a(true);
    }

    private void g()
    {
        boolean flag = true;
        if (!SharedPref.b(this, "init_done", false))
        {
            Resources resources = getResources();
            SharedPref.a(this, "init_done", true);
            if (!resources.getBoolean(0x7f070009) || android.os.Build.VERSION.SDK_INT >= 21)
            {
                flag = false;
            }
            SharedPref.a(this, "fv_enabled", flag);
            SharedPref.a(this, "notification", resources.getBoolean(0x7f070006));
        }
    }

    final void d()
    {
        Looper.myQueue().addIdleHandler(this);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        if (i)
        {
            com.qihoo.security.ui.b.a.a().a(configuration);
        }
        super.onConfigurationChanged(configuration);
    }

    public void onCreate()
    {
        {
            m = o.a();
            super.onCreate();
            k = getApplicationContext();
            System.currentTimeMillis();
            com.qihoo.security.support.b.c();
            com.qihoo.security.clearengine.b.a.a(k, "");
            com.qihoo.security.locale.d.a();
            if (!m.equals((new StringBuilder()).append(getPackageName()).append(":crashhandler").toString()))
            {
                com.qihoo.security.crashhandler.b.a(this).a();
            }
            if (!m.equals(getPackageName()))
            {
                break MISSING_BLOCK_LABEL_187;
            }
            g();
            d();
            DaemonMain.b(this);
            Object obj;
            Error error;
            Field field;
            try
            {
                NativeManager.a(this);
            }
            catch (Error error1)
            {
                return;
            }
            com.qihoo.security.gamebooster.b.a().j();
        }
        a = true;
        com.qihoo.security.profile.j.a();
        obj = ViewConfiguration.get(this);
        field = android/view/ViewConfiguration.getDeclaredField("sHasPermanentMenuKey");
        if (field != null)
        {
            try
            {
                field.setAccessible(true);
                field.setBoolean(obj, false);
            }
            catch (Exception exception) { }
        }
        if (SharedPref.b(getApplicationContext(), "remind_trash_swtich_last", true))
        {
            SharedPref.a(getApplicationContext(), "remind_trash_swtich_last_time", System.currentTimeMillis());
            SharedPref.a(getApplicationContext(), "remind_trash_swtich_last", false);
        }
        return;
        if (m.equals((new StringBuilder()).append(getPackageName()).append(":ui").toString()))
        {
            obj = new HandlerThread("AsyncLooperThread");
            ((HandlerThread) (obj)).start();
            n = ((HandlerThread) (obj)).getLooper();
            f();
            d();
            try
            {
                NativeManager.a(this);
            }
            // Misplaced declaration of an exception variable
            catch (Error error) { }
        }
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_110;
        }
    }

    public void onTerminate()
    {
    }

    public boolean queueIdle()
    {
        if (m.equals(getPackageName()))
        {
            com.qihoo.b.a.d.a(k, com.qihoo.security.support.c.a(k), null);
        } else
        {
            com.qihoo.security.adv.a.c.a(this);
        }
        return false;
    }

}
