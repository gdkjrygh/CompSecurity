// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;

public final class UserAgent
{

    private static final HashMap sUserAgentMap = new HashMap();

    public static void clear()
    {
        com/google/android/gms/common/server/UserAgent;
        JVM INSTR monitorenter ;
        sUserAgentMap.clear();
        com/google/android/gms/common/server/UserAgent;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static String get(Context context, String s)
    {
        com/google/android/gms/common/server/UserAgent;
        JVM INSTR monitorenter ;
        String s1 = s;
        if (TextUtils.isEmpty(s))
        {
            s1 = "GMS/1.0";
        }
        String s2 = (String)sUserAgentMap.get(s1);
        s = s2;
        if (s2 != null)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        s = new StringBuilder();
        s.append("Mozilla 5.0 (Linux; U; Android ");
        s.append(android.os.Build.VERSION.RELEASE);
        s.append("; ");
        s.append(Locale.getDefault().toString());
        String s3 = Build.MODEL;
        if (!TextUtils.isEmpty(s3))
        {
            s.append("; ");
            s.append(s3);
        }
        s3 = Build.ID;
        if (!TextUtils.isEmpty(s3))
        {
            s.append("; Build/");
            s.append(s3);
        }
        s.append("); ");
        s.append(context.getPackageName());
        s.append('/');
        s.append(getVersionCode(context));
        s.append("; FastParser/1.1; ");
        s.append(s1);
        s.append("; (gzip)");
        s = s.toString();
        sUserAgentMap.put(s1, s);
        com/google/android/gms/common/server/UserAgent;
        JVM INSTR monitorexit ;
        return s;
        context;
        throw context;
    }

    private static int getVersionCode(Context context)
    {
        int i;
        try
        {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return 0;
        }
        return i;
    }

}
