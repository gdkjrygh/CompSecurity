// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.b;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import com.qihoo.security.SecurityApplication;
import java.util.Iterator;
import java.util.List;

public class j
{

    private static ActivityManager a = (ActivityManager)SecurityApplication.a().getSystemService("activity");

    public static void a()
    {
        String s = (new StringBuilder()).append(SecurityApplication.a().getPackageName()).append(":scanner").toString();
        Iterator iterator = a.getRunningAppProcesses().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)iterator.next();
            if (!s.equals(runningappprocessinfo.processName))
            {
                continue;
            }
            Process.killProcess(runningappprocessinfo.pid);
            break;
        } while (true);
    }

}
