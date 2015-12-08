// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.c;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.ArrayList;

public final class j
{

    public static Intent a(String s)
    {
        s = new Intent(s);
        if (android.os.Build.VERSION.SDK_INT >= 12)
        {
            s.setFlags(32);
        }
        return s;
    }

    public static boolean a(Context context)
    {
        boolean flag = false;
        int i;
        try
        {
            i = android.provider.Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return false;
        }
        if (i != 0)
        {
            flag = true;
        }
        return flag;
    }

    public static boolean a(Context context, String s)
    {
        context = (ArrayList)((ActivityManager)context.getSystemService("activity")).getRunningServices(500);
        Log.i("RestartPlayerServiceReceiver", (new StringBuilder("\u8FD0\u884C\u7684\u670D\u52A1\u6570\u91CF")).append(context.size()).toString());
        int i = 0;
        do
        {
            if (i >= context.size())
            {
                return false;
            }
            if (((android.app.ActivityManager.RunningServiceInfo)context.get(i)).service.getClassName().toString().equals(s))
            {
                return true;
            }
            i++;
        } while (true);
    }
}
