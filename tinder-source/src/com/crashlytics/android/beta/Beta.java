// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.beta;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.h;
import io.fabric.sdk.android.services.a.b;
import io.fabric.sdk.android.services.c.d;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.common.k;
import io.fabric.sdk.android.services.common.p;
import io.fabric.sdk.android.services.settings.f;
import io.fabric.sdk.android.services.settings.q;
import io.fabric.sdk.android.services.settings.s;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.crashlytics.android.beta:
//            DeviceTokenLoader, BuildProperties, UpdatesController, ActivityLifecycleCheckForUpdatesController, 
//            ImmediateCheckForUpdatesController

public class Beta extends h
    implements k
{

    private final b a = new b();
    private final DeviceTokenLoader b = new DeviceTokenLoader();
    private UpdatesController c;

    public Beta()
    {
    }

    private static BuildProperties a(Context context)
    {
        Object obj = context.getAssets().open("crashlytics-build.properties");
        if (obj == null) goto _L2; else goto _L1
_L1:
        Object obj1 = obj;
        context = BuildProperties.a(((InputStream) (obj)));
        obj1 = obj;
        io.fabric.sdk.android.c.a().a("Beta", (new StringBuilder()).append(((BuildProperties) (context)).d).append(" build properties: ").append(((BuildProperties) (context)).b).append(" (").append(((BuildProperties) (context)).a).append(") - ").append(((BuildProperties) (context)).c).toString());
_L9:
        obj1 = context;
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                io.fabric.sdk.android.c.a().c("Beta", "Error closing Beta build properties asset", ((Throwable) (obj)));
                return context;
            }
            obj1 = context;
        }
_L4:
        return ((BuildProperties) (obj1));
        Exception exception;
        exception;
        obj = null;
        context = null;
_L7:
        obj1 = obj;
        io.fabric.sdk.android.c.a().c("Beta", "Error reading Beta build properties", exception);
        obj1 = context;
        if (obj == null) goto _L4; else goto _L3
_L3:
        try
        {
            ((InputStream) (obj)).close();
        }
        catch (IOException ioexception)
        {
            io.fabric.sdk.android.c.a().c("Beta", "Error closing Beta build properties asset", ioexception);
            return context;
        }
        return context;
        context;
        obj1 = null;
_L6:
        if (obj1 != null)
        {
            try
            {
                ((InputStream) (obj1)).close();
            }
            catch (IOException ioexception1)
            {
                io.fabric.sdk.android.c.a().c("Beta", "Error closing Beta build properties asset", ioexception1);
            }
        }
        throw context;
        context;
        if (true) goto _L6; else goto _L5
_L5:
        exception;
        context = null;
          goto _L7
        exception;
          goto _L7
_L2:
        context = null;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private String a(Context context, String s1)
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            if (s1 == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = "io.crash.air".equals(s1);
        }
        if (flag)
        {
            io.fabric.sdk.android.c.a().a("Beta", "App was possibly installed by Beta. Getting device token");
            try
            {
                context = (String)a.a(context, b);
                flag = "".equals(context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                io.fabric.sdk.android.c.a().c("Beta", "Failed to load the Beta device token", context);
                return null;
            }
            if (flag)
            {
                context = null;
            }
            return context;
        } else
        {
            io.fabric.sdk.android.c.a().a("Beta", "App was not installed by Beta. Skipping device token");
            return null;
        }
    }

    public final String a()
    {
        return "1.1.3.61";
    }

    public final String b()
    {
        return "com.crashlytics.sdk.android:beta";
    }

    public final Map d()
    {
        String s1 = super.p.e();
        s1 = a(super.n, s1);
        HashMap hashmap = new HashMap();
        if (!TextUtils.isEmpty(s1))
        {
            hashmap.put(io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType.c, s1);
        }
        return hashmap;
    }

    protected final Object e()
    {
        boolean flag1 = false;
        io.fabric.sdk.android.c.a().a("Beta", "Beta kit initializing...");
        Context context = super.n;
        IdManager idmanager = super.p;
        if (TextUtils.isEmpty(a(context, idmanager.e())))
        {
            io.fabric.sdk.android.c.a().a("Beta", "A Beta device token was not found for this app");
            return Boolean.valueOf(false);
        }
        io.fabric.sdk.android.c.a().a("Beta", "Beta device token is present, checking for app updates.");
        Object obj = io.fabric.sdk.android.services.settings.q.a.a().a();
        BuildProperties buildproperties;
        boolean flag;
        if (obj != null)
        {
            obj = ((s) (obj)).f;
        } else
        {
            obj = null;
        }
        buildproperties = a(context);
        flag = flag1;
        if (obj != null)
        {
            flag = flag1;
            if (!TextUtils.isEmpty(((f) (obj)).a))
            {
                flag = flag1;
                if (buildproperties != null)
                {
                    flag = true;
                }
            }
        }
        if (flag)
        {
            c.a(context, this, idmanager, ((f) (obj)), buildproperties, new d(this), new p(), new io.fabric.sdk.android.services.network.b(io.fabric.sdk.android.c.a()));
        }
        return Boolean.valueOf(true);
    }

    protected final boolean e_()
    {
        super.n.getApplicationContext();
        Object obj;
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            obj = new ActivityLifecycleCheckForUpdatesController(super.l.d, super.l.c);
        } else
        {
            obj = new ImmediateCheckForUpdatesController();
        }
        c = ((UpdatesController) (obj));
        return true;
    }
}
