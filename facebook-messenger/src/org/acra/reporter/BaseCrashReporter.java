// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.acra.reporter;

import android.app.Application;

// Referenced classes of package org.acra.reporter:
//            ReportsCrashes

public class BaseCrashReporter
    implements ReportsCrashes
{

    protected Application mApplication;

    public BaseCrashReporter(Application application)
    {
        if (application == null)
        {
            throw new IllegalArgumentException("Application cannot be null");
        } else
        {
            mApplication = application;
            return;
        }
    }

    public String[] additionalDropBoxTags()
    {
        return new String[0];
    }

    public boolean checkSSLCertsOnCrashReport()
    {
        return true;
    }

    public int dropboxCollectionMinutes()
    {
        return 5;
    }

    public String formPostFormat()
    {
        return "ACRA-NULL-STRING";
    }

    public Application getApplication()
    {
        return mApplication;
    }

    public boolean includeDropBoxSystemTags()
    {
        return false;
    }

    public String[] logcatArguments()
    {
        return (new String[] {
            "-t", "200", "-v", "time"
        });
    }

    public int socketTimeout()
    {
        return 3000;
    }
}
