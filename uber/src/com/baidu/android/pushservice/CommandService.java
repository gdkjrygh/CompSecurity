// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.android.pushservice;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;

public class CommandService extends Service
{

    public CommandService()
    {
    }

    public String a(String s, String s1)
    {
        if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1))
        {
            s1 = new Intent(s1);
            s1.setPackage(s);
            s = getPackageManager().queryBroadcastReceivers(s1, 544);
            if (s != null && s.size() > 0)
            {
                return ((ResolveInfo)s.get(0)).activityInfo.name;
            }
        }
        return null;
    }

    public void a(Intent intent)
    {
        String s = a(getPackageName(), intent.getAction());
        if (TextUtils.isEmpty(s))
        {
            Log.i("CommandService", (new StringBuilder(" reflectReceiver error: receiver for: ")).append(intent.getAction()).append(" not found, package: ").append(getPackageName()).toString());
            intent.setPackage(getPackageName());
            sendBroadcast(intent);
            return;
        }
        try
        {
            Object obj1 = Class.forName(s);
            Object obj = ((Class) (obj1)).getConstructor(new Class[0]).newInstance(new Object[0]);
            obj1 = ((Class) (obj1)).getMethod("onReceive", new Class[] {
                android/content/Context, android/content/Intent
            });
            intent.setClassName(getPackageName(), s);
            ((Method) (obj1)).invoke(obj, new Object[] {
                getApplicationContext(), intent
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            Log.i("CommandService", (new StringBuilder("reflect e: ")).append(intent).toString());
        }
    }

    public IBinder onBind(Intent intent)
    {
        Log.d("CommandService", "onBind initSuc: ");
        return null;
    }

    public void onCreate()
    {
        Log.d("CommandService", "-- CommandService oncreate -- ");
        super.onCreate();
    }

    public void onDestroy()
    {
        super.onDestroy();
    }

    public void onStart(Intent intent, int i)
    {
        super.onStart(intent, i);
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        String s = intent.getStringExtra("command_type");
        Log.d("CommandService", (new StringBuilder("-- command_type -- ")).append(s).toString());
        if (!TextUtils.isEmpty(s) && s.equals("reflect_receiver"))
        {
            a(intent);
        }
        return 2;
    }

    public boolean onUnbind(Intent intent)
    {
        return super.onUnbind(intent);
    }
}
