// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.internal.service;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.SystemClock;
import android.text.TextUtils;
import bb;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import dmz;
import dvp;
import dvw;
import eco;
import fop;
import gin;
import gio;
import gip;
import giq;
import gne;
import java.io.File;

public class DeleteCacheService extends IntentService
{

    private static gip a = gip.a("delete_cache_flag");
    private static gip b = gip.a("cache-paths-to-delete");
    private dvp c;

    public DeleteCacheService()
    {
        super(com/spotify/music/internal/service/DeleteCacheService.getSimpleName());
        dmz.a(fop);
    }

    private static String a(String s)
    {
        s = new File(s);
        File file = new File((new StringBuilder()).append(s.getAbsolutePath()).append(".").append(SystemClock.elapsedRealtime()).append(".tmp").toString());
        if (s.renameTo(file))
        {
            file.getAbsolutePath();
            return file.toString();
        } else
        {
            file.getAbsolutePath();
            return "";
        }
    }

    public static void a(Context context)
    {
        ((giq)dmz.a(giq)).a(context).b().a(a, true).a();
    }

    public static void a(Context context, dvw dvw1)
    {
        String s1 = dvw1.b();
        String s = dvw1.c();
        dvw1.c.b().a(dvw.d).a(dvw.e).a(dvw.f).a(dvw.g).a();
        if (s1 != null)
        {
            dvw1 = a(s1);
        } else
        {
            dvw1 = "";
        }
        if (s != null)
        {
            s = a(s);
        } else
        {
            s = "";
        }
        dvw1 = (new StringBuilder()).append(dvw1).append(":").append(s).toString();
        context = ((giq)dmz.a(giq)).a(context).b();
        if (":".equals(dvw1))
        {
            context.a(b);
        } else
        {
            context.a(b, dvw1);
        }
        context.a(a).a();
    }

    private void a(File file, gne gne1)
    {
        if (file.exists())
        {
            File afile[] = file.listFiles();
            if (afile != null)
            {
                int j = afile.length;
                int i = 0;
                while (i < j) 
                {
                    File file1 = afile[i];
                    if (file1.isDirectory())
                    {
                        a(file1, gne1);
                    } else
                    {
                        long l = file1.length();
                        if (file1.delete())
                        {
                            gne1.d = gne1.d + l;
                        } else
                        {
                            gne1.e = l + gne1.e;
                            file1.getAbsolutePath();
                        }
                    }
                    i++;
                }
            }
        }
        if (!file.delete())
        {
            file.getAbsolutePath();
        }
    }

    private void a(String s, gne gne1)
    {
        a(new File(s), gne1);
    }

    public static boolean b(Context context)
    {
        return ((giq)dmz.a(giq)).a(context).a(a, false);
    }

    public static boolean c(Context context)
    {
        return ((giq)dmz.a(giq)).a(context).f(b);
    }

    public static Intent d(Context context)
    {
        return new Intent(context, com/spotify/music/internal/service/DeleteCacheService);
    }

    public void onCreate()
    {
        super.onCreate();
        c = new dvp(this, null);
    }

    protected void onHandleIntent(Intent intent)
    {
        intent = c;
        Object obj = new bb(((dvp) (intent)).a);
        Object obj1 = ((dvp) (intent)).a.getResources();
        ((bb) (obj)).a(((Resources) (obj1)).getString(0x7f080273));
        ((bb) (obj)).b(((Resources) (obj1)).getString(0x7f080272));
        ((bb) (obj)).a(0x7f020203);
        ((bb) (obj)).b();
        ((bb) (obj)).c();
        ((bb) (obj)).a();
        ((bb) (obj)).a(0L);
        ((dvp) (intent)).b.a(6, ((bb) (obj)).g());
        long l = SystemClock.elapsedRealtime();
        obj = ((giq)dmz.a(giq)).a(this);
        intent = ((gin) (obj)).a(b, ":");
        obj1 = new gne((byte)0);
        String as[] = intent.split(":");
        if (as.length > 0)
        {
            intent = as[0];
        } else
        {
            intent = "";
        }
        obj1.a = intent;
        if (as.length >= 2)
        {
            intent = as[1];
        } else
        {
            intent = "";
        }
        obj1.b = intent;
        if (!TextUtils.isEmpty(((gne) (obj1)).a))
        {
            a(((gne) (obj1)).a, ((gne) (obj1)));
        }
        if (!TextUtils.isEmpty(((gne) (obj1)).b))
        {
            a(((gne) (obj1)).b, ((gne) (obj1)));
        }
        obj1.c = SystemClock.elapsedRealtime() - l;
        intent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.I);
        intent.a("cache-path", String.valueOf(((gne) (obj1)).a));
        intent.a("settings-path", String.valueOf(((gne) (obj1)).b));
        intent.a("time-taken", String.valueOf(((gne) (obj1)).c));
        intent.a("deleted-bytes", String.valueOf(((gne) (obj1)).d));
        intent.a("failed-bytes", String.valueOf(((gne) (obj1)).e));
        fop.a(ViewUri.bi, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, intent);
        (new dvw(this)).c.b().a(dvw.h).a(dvw.i).a();
        if (((gne) (obj1)).c < 5000L)
        {
            try
            {
                Thread.sleep(5000L - ((gne) (obj1)).c);
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
        }
        ((gin) (obj)).b().a(b).a();
        c.b.a(6);
    }

}
