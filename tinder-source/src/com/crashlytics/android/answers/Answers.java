// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import io.fabric.sdk.android.a;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.h;
import io.fabric.sdk.android.k;
import io.fabric.sdk.android.services.c.b;
import io.fabric.sdk.android.services.c.d;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.settings.m;
import io.fabric.sdk.android.services.settings.q;
import io.fabric.sdk.android.services.settings.s;
import java.io.File;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.crashlytics.android.answers:
//            SessionAnalyticsManager, AnswersEventsHandler, AnswersPreferenceManager, SessionMetadataCollector, 
//            AnswersFilesManagerProvider, AnswersLifecycleCallbacks, SessionEvent

public class Answers extends h
{

    AnswersPreferenceManager a;
    public SessionAnalyticsManager b;
    a c;
    private String d;
    private String e;
    private long f;

    public Answers()
    {
    }

    private Boolean d()
    {
        Object obj;
        Object obj1;
        Object obj2;
        try
        {
            obj1 = io.fabric.sdk.android.services.settings.q.a.a().a();
        }
        catch (Exception exception)
        {
            io.fabric.sdk.android.c.a().c("Answers", "Error dealing with settings", exception);
            return Boolean.valueOf(false);
        }
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        io.fabric.sdk.android.c.a().e("Answers", "Failed to retrieve settings");
        return Boolean.valueOf(false);
        if (((s) (obj1)).d.d)
        {
            io.fabric.sdk.android.c.a().a("Answers", "Analytics collection enabled");
            obj = b;
            obj1 = ((s) (obj1)).e;
            obj2 = CommonUtils.d(super.n, "com.crashlytics.ApiEndpoint");
            obj = ((SessionAnalyticsManager) (obj)).a;
            ((AnswersEventsHandler) (obj)).a(new AnswersEventsHandler._cls1(((AnswersEventsHandler) (obj)), ((io.fabric.sdk.android.services.settings.b) (obj1)), ((String) (obj2))));
            return Boolean.valueOf(true);
        }
        io.fabric.sdk.android.c.a().a("Answers", "Analytics collection disabled");
        obj = c;
        if (((a) (obj)).a != null)
        {
            obj = ((a) (obj)).a;
            for (obj1 = ((io.fabric.sdk.android.a.a) (obj)).a.iterator(); ((Iterator) (obj1)).hasNext(); ((io.fabric.sdk.android.a.a) (obj)).b.unregisterActivityLifecycleCallbacks(((android.app.Application.ActivityLifecycleCallbacks) (obj2))))
            {
                obj2 = (android.app.Application.ActivityLifecycleCallbacks)((Iterator) (obj1)).next();
            }

        }
        AnswersEventsHandler answerseventshandler = b.a;
        answerseventshandler.a(new AnswersEventsHandler._cls2(answerseventshandler));
        return Boolean.valueOf(false);
    }

    public final String a()
    {
        return "1.3.2.79";
    }

    public final String b()
    {
        return "com.crashlytics.sdk.android:answers";
    }

    protected final Object e()
    {
        return d();
    }

    protected final boolean e_()
    {
        Context context;
        PackageInfo packageinfo;
        context = super.n;
        a = new AnswersPreferenceManager(new d(context, "settings"));
        c = new a(context);
        packageinfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        d = Integer.toString(packageinfo.versionCode);
        Object obj;
        boolean flag;
        long l;
        if (packageinfo.versionName == null)
        {
            obj = "0.0";
        } else
        {
            try
            {
                obj = packageinfo.versionName;
            }
            catch (Exception exception)
            {
                io.fabric.sdk.android.c.a().c("Answers", "Error retrieving app properties", exception);
                return false;
            }
        }
        e = ((String) (obj));
        if (android.os.Build.VERSION.SDK_INT < 9) goto _L2; else goto _L1
_L1:
        f = packageinfo.firstInstallTime;
_L6:
        obj = new SessionMetadataCollector(context, super.p, d, e);
        obj = new AnswersEventsHandler(this, context, new AnswersFilesManagerProvider(context, new b(this)), ((SessionMetadataCollector) (obj)), new io.fabric.sdk.android.services.network.b(io.fabric.sdk.android.c.a()));
        ((AnswersEventsHandler) (obj)).a(new AnswersEventsHandler._cls4(((AnswersEventsHandler) (obj))));
        b = new SessionAnalyticsManager(((AnswersEventsHandler) (obj)));
        c.a(new AnswersLifecycleCallbacks(b));
        l = f;
        if (a.a.a().getBoolean("analytics_launched", false)) goto _L4; else goto _L3
_L3:
        if (System.currentTimeMillis() - l < 0x36ee80L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L5
_L7:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_324;
        }
        io.fabric.sdk.android.c.a().a("Answers", "New app install detected");
        obj = b;
        io.fabric.sdk.android.c.a().a("Answers", "Logged install");
        ((SessionAnalyticsManager) (obj)).a.a(com.crashlytics.android.answers.SessionEvent.a(), false, true);
        obj = a;
        ((AnswersPreferenceManager) (obj)).a.a(((AnswersPreferenceManager) (obj)).a.b().putBoolean("analytics_launched", true));
_L8:
        return true;
_L2:
        f = (new File(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).sourceDir)).lastModified();
          goto _L6
_L4:
        flag = false;
          goto _L7
        Exception exception1;
        exception1;
        io.fabric.sdk.android.c.a().c("Answers", "Failed to initialize", exception1);
          goto _L8
_L5:
        if (!flag) goto _L4; else goto _L9
_L9:
        flag = true;
          goto _L7
    }
}
