// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.util.Log;
import com.arist.b.b;
import com.arist.b.c;
import com.arist.c.e;
import com.arist.c.f;
import com.arist.c.j;
import com.arist.model.errorinfo.a;
import com.arist.model.scan.MediaScanService;
import com.arist.service.MusicPlayService;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Timer;

// Referenced classes of package com.arist.activity:
//            aj

public class MyApplication extends Application
{

    public static MediaPlayer a;
    public static Timer c;
    public static MyApplication d;
    public static f e;
    public static int f = 0;
    public static int g = 0;
    public static int h = 0;
    public static int i;
    public static int j = 1;
    public static boolean k = false;
    public static ArrayList l = new ArrayList();
    public static ArrayList m = new ArrayList();
    public static ArrayList n = new ArrayList();
    public static ArrayList o = new ArrayList();
    public static ArrayList p = new ArrayList();
    public static Context q;
    public static boolean r = false;
    public static boolean s = false;
    private static b t;
    private static int u;
    public List b;

    public MyApplication()
    {
        b = new LinkedList();
    }

    public static void a()
    {
        e.b(f);
        e.a(g);
        e.a(g().e());
    }

    static void a(int i1)
    {
        u = i1;
    }

    public static int b()
    {
        if (t == null || t.g() == 0)
        {
            return 0x493e0;
        } else
        {
            return t.g();
        }
    }

    public static int c()
    {
        int i1;
        try
        {
            i1 = a.getCurrentPosition();
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return 0;
        }
        return i1;
    }

    public static boolean d()
    {
        boolean flag;
        try
        {
            flag = a.isPlaying();
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return false;
        }
        return flag;
    }

    public static ArrayList e()
    {
        switch (f)
        {
        default:
            return p;

        case 1: // '\001'
            return n;

        case 0: // '\0'
            return p;

        case 2: // '\002'
            return o;

        case 3: // '\003'
            return l;

        case 4: // '\004'
            return m;
        }
    }

    public static c f()
    {
        if (g >= e().size() || g < 0)
        {
            g = 0;
            h = 0;
        }
        c c1;
        try
        {
            c1 = (c)e().get(g);
        }
        catch (Exception exception)
        {
            return com.arist.b.c.h();
        }
        return c1;
    }

    public static b g()
    {
        if (f().f().isEmpty())
        {
            return new b("Title", "", "1", "Artist");
        }
        if (h < 0)
        {
            h = 0;
        }
        if (h >= f().f().size())
        {
            h = f().f().size() - 1;
        }
        t = (b)f().f().get(h);
        Log.i("size_last", (new StringBuilder("size=")).append(e().size()).append("--firstPoistion:").append(f).append("--secondPosition:").append(g).append("--thirdPosition:").append(h).toString());
        return t;
    }

    static int i()
    {
        return u;
    }

    public final void h()
    {
        Log.e("MyApplication", "\u9000\u51FA");
        c.cancel();
        stopService(new Intent(q, com/arist/service/MusicPlayService));
        if (com.arist.c.j.a(getApplicationContext(), com/arist/model/scan/MediaScanService.getName()))
        {
            MediaScanService.b(getApplicationContext());
        }
        do
        {
            Activity activity;
            do
            {
                if (b.isEmpty())
                {
                    if (a != null)
                    {
                        Log.i("MyApplication", "\u91CA\u653EMediaPlayer");
                        a.release();
                        a = null;
                    }
                    System.exit(0);
                    return;
                }
                activity = (Activity)b.remove(0);
            } while (activity == null);
            activity.finish();
        } while (true);
    }

    public void onCreate()
    {
        Object obj;
        ArrayList arraylist;
        int i1;
        long l1;
        super.onCreate();
        Log.i("MyApplication", "onCreate()");
        l1 = System.currentTimeMillis();
        com.arist.model.errorinfo.a.a().a(getApplicationContext());
        com.ijoysoft.a.a.a().a(getApplicationContext());
        com.ijoysoft.a.a.a().c();
        q = getApplicationContext();
        d = this;
        a = com.arist.c.e.a();
        com.arist.c.a.a.a(getApplicationContext());
        (new com.arist.model.a.b()).a();
        obj = new f(q);
        e = ((f) (obj));
        i = ((f) (obj)).d();
        f = e.c();
        g = e.b();
        r = e.f();
        com.arist.model.skin.b.a().a(e.m());
        h = -1;
        obj = e.a();
        arraylist = f().f();
        i1 = 0;
_L5:
        if (i1 < arraylist.size()) goto _L2; else goto _L1
_L1:
        if (h < 0)
        {
            f = 0;
            g = 0;
            h = 0;
        }
        g();
        obj = new Timer();
        c = ((Timer) (obj));
        ((Timer) (obj)).schedule(new aj(), 0L, 1000L);
        com.ijoysoft.appwall.a.a(getApplicationContext());
        Log.i("MyApplication", (new StringBuilder("\u542F\u52A8\u65F6\u95F4:")).append(System.currentTimeMillis() - l1).toString());
        return;
_L2:
        if (!((String) (obj)).equals(((b)arraylist.get(i1)).e()))
        {
            break; /* Loop/switch isn't completed */
        }
        h = i1;
        if (true) goto _L1; else goto _L3
_L3:
        i1++;
        if (true) goto _L5; else goto _L4
_L4:
    }

}
