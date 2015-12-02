// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.e;

import android.app.Application;
import org.acra.reporter.BaseCrashReporter;

public class g extends BaseCrashReporter
{

    public g(Application application)
    {
        super(application);
    }

    public boolean checkSSLCertsOnCrashReport()
    {
        return true;
    }

    public String[] logcatArguments()
    {
        return (new String[] {
            "-t", "500", "-v", "threadtime"
        });
    }
}
