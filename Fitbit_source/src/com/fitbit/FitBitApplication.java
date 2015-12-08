// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.support.multidex.MultiDexApplication;
import com.fitbit.analytics.b;
import com.fitbit.analytics.google.ga.AnalyticsContainer;
import com.fitbit.e.a;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.util.ah;
import com.fitbit.util.x;

// Referenced classes of package com.fitbit:
//            b

public class FitBitApplication extends MultiDexApplication
{

    private static final String a = "FitBitApplication";
    private static FitBitApplication b;
    private ServerGateway c;
    private AnalyticsContainer d;
    private final com.fitbit.b e = new com.fitbit.b();

    public FitBitApplication()
    {
        b = this;
    }

    public static FitBitApplication a()
    {
        return b;
    }

    public static FitBitApplication a(Context context)
    {
        if (context instanceof FitBitApplication)
        {
            return (FitBitApplication)context;
        }
        if (context instanceof Activity)
        {
            android.app.Application application = ((Activity)context).getApplication();
            if (application instanceof FitBitApplication)
            {
                return (FitBitApplication)application;
            }
        }
        if (context instanceof Service)
        {
            android.app.Application application1 = ((Service)context).getApplication();
            if (application1 instanceof FitBitApplication)
            {
                return (FitBitApplication)application1;
            }
        }
        context = context.getApplicationContext();
        if (context instanceof FitBitApplication)
        {
            return (FitBitApplication)context;
        } else
        {
            FitBitApplication fitbitapplication = new FitBitApplication();
            fitbitapplication.attachBaseContext(context);
            fitbitapplication.onCreate();
            return fitbitapplication;
        }
    }

    public ServerGateway b()
    {
        return c;
    }

    public AnalyticsContainer c()
    {
        return d;
    }

    public ah d()
    {
        return e.d();
    }

    public com.a.a.a.a e()
    {
        return e.e();
    }

    public com.fitbit.config.a f()
    {
        return e.c();
    }

    public void onCreate()
    {
        super.onCreate();
        com.fitbit.e.a.a("FitBitApplication", "onCreate()", new Object[0]);
        c = new ServerGateway(this);
        d = new AnalyticsContainer(new b(this));
        e.a(this);
        x.a();
    }

    public void onLowMemory()
    {
        super.onLowMemory();
        e.f();
    }
}
