// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.util;

import android.content.Context;
import android.os.Process;

// Referenced classes of package com.google.android.gms.common.util:
//            PlatformVersion, AppOpsCompatV23, AppOpsCompatV19

public class AppOpsCompat
{

    private static final AppOpsCompat INSTANCE = new AppOpsCompat();

    AppOpsCompat()
    {
    }

    public static AppOpsCompat create(Context context)
    {
        if (PlatformVersion.checkVersion(23))
        {
            return new AppOpsCompatV23(context);
        }
        if (PlatformVersion.checkVersion(19) && context.checkPermission("android.permission.UPDATE_APP_OPS_STATS", Process.myPid(), Process.myUid()) == 0)
        {
            return new AppOpsCompatV19(context);
        } else
        {
            return INSTANCE;
        }
    }

    public int noteOpNoThrow(String s, int i, String s1)
    {
        return 0;
    }

    public String permissionToOp(String s)
    {
        return null;
    }

}
