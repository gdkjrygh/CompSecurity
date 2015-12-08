// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.reporting;

import android.content.Context;
import com.crittercism.app.Crittercism;
import com.crittercism.app.CrittercismConfig;
import com.pinterest.kit.log.PLog;
import java.lang.reflect.Constructor;

public class CrashReporting
{

    public static void a()
    {
        Crittercism.sendAppLoadData();
    }

    public static void a(Context context, String s, String s1)
    {
        CrittercismConfig crittercismconfig = new CrittercismConfig();
        crittercismconfig.setCustomVersionName(s);
        crittercismconfig.setDelaySendingAppLoad(true);
        Crittercism.initialize(context, s1, crittercismconfig);
    }

    public static void a(String s)
    {
        Crittercism.setUsername(s);
    }

    public static void a(Throwable throwable)
    {
        Crittercism.logHandledException(throwable);
        PLog.error(throwable, "exception occurred", new Object[0]);
    }

    public static void a(Throwable throwable, String s)
    {
        Class class1 = throwable.getClass();
        try
        {
            s = (Throwable)class1.getConstructor(new Class[] {
                java/lang/String
            }).newInstance(new Object[] {
                (new StringBuilder("org_msg: [")).append(throwable.getMessage()).append("] detailed msg [").append(s).append("]").toString()
            });
            s.setStackTrace(throwable.getStackTrace());
            s.initCause(throwable.getCause());
            a(((Throwable) (s)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            a(throwable);
        }
    }

    public static void b(String s)
    {
        PLog.log("Breadcrumb", s, new Object[0]);
        Crittercism.leaveBreadcrumb(s);
    }
}
