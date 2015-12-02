// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.errorreporting;

import android.app.Application;
import android.net.Uri;
import com.facebook.acra.reporter.BaseCrashReporter;

public class FbCrashReporter extends BaseCrashReporter
{

    public FbCrashReporter(Application application)
    {
        super(application);
    }

    public static Uri a(String s)
    {
        return Uri.parse("https://www.facebook.com/mobile/generic_android_crash_logs/").buildUpon().appendPath(s).build();
    }
}
