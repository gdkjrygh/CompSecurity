// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.acra.reporter;

import android.content.Context;

// Referenced classes of package com.facebook.acra.reporter:
//            ReportsCrashes

public class BaseCrashReporter
    implements ReportsCrashes
{

    protected boolean checkSSLcerts;
    protected Context mApplicationContext;

    public BaseCrashReporter(Context context)
    {
        checkSSLcerts = true;
        if (context == null)
        {
            throw new IllegalArgumentException("Application context cannot be null");
        } else
        {
            mApplicationContext = context;
            return;
        }
    }

    public String[] additionalDropBoxTags()
    {
        return new String[0];
    }

    public void checkSSLCertsOnCrashReport(boolean flag)
    {
        checkSSLcerts = flag;
    }

    public boolean checkSSLCertsOnCrashReport()
    {
        return checkSSLcerts;
    }

    public int dropboxCollectionMinutes()
    {
        return 5;
    }

    public String formPostFormat()
    {
        return "application/x-www-form-urlencoded";
    }

    public Context getApplicationContext()
    {
        return mApplicationContext;
    }

    public String getUserAgent()
    {
        return "Android";
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
