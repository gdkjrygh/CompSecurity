// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.moments.api;

import android.app.Application;
import android.net.Uri;
import com.facebook.acra.ACRA;
import com.facebook.acra.ErrorReporter;
import com.facebook.common.build.BuildConstants;
import com.facebook.common.errorreporting.FbCrashReporter;
import com.facebook.moments.acra.MomentsCrashReporter;
import com.facebook.moments.application.MomentsAppConstants;

public class CrashReporter
{

    private static ErrorReporter a;

    public CrashReporter()
    {
    }

    public static void a(Application application)
    {
        if (a != null)
        {
            return;
        } else
        {
            application = ACRA.init(new MomentsCrashReporter(application), FbCrashReporter.a(MomentsAppConstants.a).toString(), BuildConstants.c());
            a = application;
            application.putCustomData("app", MomentsAppConstants.c);
            a.putCustomData("fb_app_id", MomentsAppConstants.a);
            return;
        }
    }

    public static void a(String s)
    {
        a.setUserId(s);
        a.putCustomData("moments_user_id", s);
    }
}
