// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

public class ContextHelper
{

    public ContextHelper()
    {
    }

    public static boolean bindService(Context context, Class class1, String s, ServiceConnection serviceconnection, int i)
    {
        class1 = (new Intent(context, class1)).setAction(s);
        return context.getApplicationContext().bindService(class1, serviceconnection, i);
    }

    public static Object getSystemService(Context context, String s)
    {
        return context.getApplicationContext().getSystemService(s);
    }

    public static void unbindService(Context context, ServiceConnection serviceconnection)
    {
        try
        {
            context.getApplicationContext().unbindService(serviceconnection);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }
}
