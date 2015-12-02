// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.app;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.qihoo.security.locale.d;

public class UiProcessService extends Service
{

    public d a;
    protected Context b;

    public UiProcessService()
    {
        a = d.a();
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        b = getApplicationContext();
        com.qihoo.security.service.d.a(getClass().getSimpleName(), Integer.valueOf(getClass().hashCode()));
    }

    public void onDestroy()
    {
        super.onDestroy();
        com.qihoo.security.service.d.b(getClass().getSimpleName(), Integer.valueOf(getClass().hashCode()));
    }
}
