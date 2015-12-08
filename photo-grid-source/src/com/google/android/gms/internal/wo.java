// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.ActivityManager;
import android.content.Context;
import java.util.Iterator;
import java.util.List;

public final class wo
{

    public static String a(int i)
    {
        StackTraceElement astacktraceelement[] = Thread.currentThread().getStackTrace();
        StringBuffer stringbuffer = new StringBuffer();
        int j = 3;
        while (j < i + 3) 
        {
            Object obj;
            if (j + 4 >= astacktraceelement.length)
            {
                obj = "<bottom of call stack>";
            } else
            {
                obj = astacktraceelement[j + 4];
                obj = (new StringBuilder()).append(((StackTraceElement) (obj)).getClassName()).append(".").append(((StackTraceElement) (obj)).getMethodName()).append(":").append(((StackTraceElement) (obj)).getLineNumber()).toString();
            }
            stringbuffer.append(((String) (obj))).append(" ");
            j++;
        }
        return stringbuffer.toString();
    }

    public static String a(Context context, int i)
    {
label0:
        {
            context = ((ActivityManager)context.getSystemService("activity")).getRunningAppProcesses();
            if (context == null)
            {
                break label0;
            }
            context = context.iterator();
            android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
            do
            {
                if (!context.hasNext())
                {
                    break label0;
                }
                runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)context.next();
            } while (runningappprocessinfo.pid != i);
            return runningappprocessinfo.processName;
        }
        return null;
    }
}
