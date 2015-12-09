// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.moments.acra;

import android.app.Application;
import com.facebook.acra.reporter.BaseCrashReporter;

public class MomentsCrashReporter extends BaseCrashReporter
{

    public MomentsCrashReporter(Application application)
    {
        super(application);
    }

    public boolean checkSSLCertsOnCrashReport()
    {
        return true;
    }
}
