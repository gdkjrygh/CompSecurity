// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.locale.language;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.qihoo.security.app.UiProcessService;

public class LanguageService extends UiProcessService
{
    public class a extends Binder
    {

        final LanguageService a;

        public a()
        {
            a = LanguageService.this;
            super();
        }
    }


    private final IBinder c = new a();

    public LanguageService()
    {
    }

    public IBinder onBind(Intent intent)
    {
        return c;
    }

    public void onCreate()
    {
        super.onCreate();
        b = getApplicationContext();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        return 1;
    }
}
