// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.util;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;

// Referenced classes of package roboguice.util:
//            Ln

public static class packageName
    implements packageName
{

    protected int minimumLogLevel;
    protected String packageName;
    protected String scope;

    public int getLoggingLevel()
    {
        return minimumLogLevel;
    }

    public void setLoggingLevel(int i)
    {
        minimumLogLevel = i;
    }

    protected nInfo()
    {
        minimumLogLevel = 2;
        packageName = "";
        scope = "";
    }

    public scope(Application application)
    {
        int i;
        i = 2;
        super();
        minimumLogLevel = 2;
        packageName = "";
        scope = "";
        packageName = application.getPackageName();
        if ((application.getPackageManager().getApplicationInfo(packageName, 0).flags & 2) == 0)
        {
            i = 4;
        }
        minimumLogLevel = i;
        scope = packageName.toUpperCase();
        Ln.d("Configuring Logging, minimum log level is %s", new Object[] {
            Ln.logLevelToString(minimumLogLevel)
        });
        return;
        application;
        Log.e(packageName, "Error configuring logger", application);
        return;
    }
}
