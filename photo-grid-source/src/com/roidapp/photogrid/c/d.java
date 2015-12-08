// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import java.io.File;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.roidapp.photogrid.c:
//            e, g, a, f, 
//            c

public final class d
{

    public static boolean a = true;
    public static ThreadPoolExecutor b;
    private static boolean c = false;
    private static d f = null;
    private static boolean i = false;
    private c d;
    private f e;
    private Context g;
    private int h;
    private Handler j;

    private d(Context context, c c1)
    {
        j = new e(this);
        g = context;
        d = c1;
    }

    static int a(d d1)
    {
        return d1.h;
    }

    static int a(d d1, int k)
    {
        d1.h = k;
        return k;
    }

    public static d a(Context context, c c1)
    {
        if (f == null)
        {
            com.roidapp.photogrid.c.g.b("DownloadMainLite", "new mDown");
            context = new d(context, c1);
            f = context;
            return context;
        } else
        {
            return f;
        }
    }

    public static void a()
    {
        c = true;
        if (f != null)
        {
            f = null;
        }
        com.roidapp.photogrid.c.g.a("DownloadMainLite", "oncancel");
    }

    static void a(d d1, int k, Object obj)
    {
        d1.j.sendMessage(Message.obtain(null, k, obj));
    }

    static c b(d d1)
    {
        return d1.d;
    }

    public static void b()
    {
        i = true;
        com.roidapp.photogrid.c.g.a("DownloadMainLite", "onReTry");
    }

    static d c()
    {
        f = null;
        return null;
    }

    static f c(d d1)
    {
        return d1.e;
    }

    static Context d(d d1)
    {
        return d1.g;
    }

    static boolean d()
    {
        c = false;
        return false;
    }

    static String e(d d1)
    {
        String s = Environment.getExternalStorageDirectory().getAbsolutePath();
        return com.roidapp.photogrid.c.a.a(PreferenceManager.getDefaultSharedPreferences(d1.g).getString("SAVEPATH", s));
    }

    static boolean e()
    {
        i = false;
        return false;
    }

    static boolean f()
    {
        return c;
    }

    static boolean f(d d1)
    {
        return d1.h();
    }

    static boolean g()
    {
        return i;
    }

    private boolean h()
    {
label0:
        {
label1:
            {
                int k;
                try
                {
                    NetworkInfo networkinfo = ((ConnectivityManager)g.getSystemService("connectivity")).getActiveNetworkInfo();
                    if (networkinfo.getSubtype() == 1)
                    {
                        break label1;
                    }
                    k = networkinfo.getSubtype();
                }
                catch (Exception exception)
                {
                    return false;
                }
                if (k != 2)
                {
                    break label0;
                }
            }
            return false;
        }
        return true;
    }

    public final void a(String s)
    {
        j.sendMessage(Message.obtain(null, 1, 1, 0, null));
        if (e == null)
        {
            e = new f(this, s);
        }
        b.execute(e);
    }

    static 
    {
        b = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue(2), new java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy());
    }
}
