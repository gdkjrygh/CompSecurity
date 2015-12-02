// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.core.d;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import java.util.Iterator;
import java.util.List;

public class g
{

    public static final String a = com/qihoo360/mobilesafe/core/d/g.getSimpleName();
    static int b = 9;

    public g()
    {
    }

    static int a(int i)
    {
        if (i < b)
        {
            if (i >= 8)
            {
                return 300;
            }
            if (i < 6)
            {
                if (i >= 5)
                {
                    return 300;
                }
                if (i >= 3)
                {
                    return 170;
                }
                if (i >= 2)
                {
                    return 130;
                }
                return i < 1 ? 100 : 200;
            }
        }
        return 400;
    }

    public static boolean a(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            return true;
        }
        context = (ActivityManager)context.getApplicationContext().getSystemService("activity");
        boolean flag;
        try
        {
            flag = a(context.getRunningAppProcesses());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return flag;
    }

    public static boolean a(List list)
    {
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            return true;
        }
        if (list == null) goto _L2; else goto _L1
_L1:
        int i;
        i = Process.myUid();
        list = list.iterator();
_L5:
        if (list.hasNext()) goto _L3; else goto _L2
_L2:
        return false;
_L3:
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)list.next();
        if (runningappprocessinfo != null && runningappprocessinfo.uid != i)
        {
            return true;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

}
