// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import me.lyft.android.LyftApplication;

public class LyftService extends Service
{

    public LyftService()
    {
    }

    protected LyftApplication getLyftApplication()
    {
        return (LyftApplication)getApplication();
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        getLyftApplication().inject(this);
    }
}
