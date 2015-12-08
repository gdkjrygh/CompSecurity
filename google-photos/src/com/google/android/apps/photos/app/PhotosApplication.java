// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.app;

import a;
import aly;
import ama;
import amh;
import android.app.Application;
import android.content.Context;
import com.google.android.libraries.social.jni.crashreporter.NativeCrashHandler;
import dtg;
import duf;
import dug;
import ilh;
import mrx;
import msz;
import oby;
import olm;
import olp;
import olr;
import onm;
import pub;

public class PhotosApplication extends Application
    implements olp, pub
{

    private static final long a = oby.c();
    private final olr b = new olr(new duf(this));
    private final dug c = new dug();

    public PhotosApplication()
    {
    }

    public final olm ai_()
    {
        return b.a(this);
    }

    protected void attachBaseContext(Context context)
    {
        super.attachBaseContext(context);
        a.a(this);
    }

    public final Object b()
    {
        dug dug1 = c;
        dug1.a(this);
        return dug1.a;
    }

    public void onCreate()
    {
        dtg dtg1 = (dtg)olm.a(this, dtg);
        long l = a;
        dtg1.a.a(l);
        super.onCreate();
        if (onm.a(this))
        {
            return;
        } else
        {
            mrx mrx1 = (mrx)olm.a(this, mrx);
            NativeCrashHandler.a(getApplicationContext());
            Thread.setDefaultUncaughtExceptionHandler(new onm(this, mrx1.a(new ilh(this, Thread.getDefaultUncaughtExceptionHandler()))));
            dtg1.a.a(true);
            return;
        }
    }

    public void onLowMemory()
    {
        super.onLowMemory();
        aly.c(this).b.onLowMemory();
    }

    public void onTrimMemory(int i)
    {
        super.onTrimMemory(i);
        aly.c(this).a(i);
    }

}
