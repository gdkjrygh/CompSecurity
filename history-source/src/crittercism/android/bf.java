// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.content.Context;
import android.content.pm.PackageManager;
import com.crittercism.app.CrittercismConfig;

public final class bf
{

    public boolean a;
    public boolean b;
    public boolean c;

    public bf(Context context, CrittercismConfig crittercismconfig)
    {
        boolean flag;
        flag = true;
        super();
        break MISSING_BLOCK_LABEL_6;
        if (!crittercismconfig.isLogcatReportingEnabled() || android.os.Build.VERSION.SDK_INT < 16 && !a("android.permission.READ_LOGS", context))
        {
            flag = false;
        }
        a = flag;
        c = a("android.permission.ACCESS_NETWORK_STATE", context);
        b = a("android.permission.GET_TASKS", context);
        return;
    }

    private static boolean a(String s, Context context)
    {
        return context.getPackageManager().checkPermission(s, context.getPackageName()) == 0;
    }
}
