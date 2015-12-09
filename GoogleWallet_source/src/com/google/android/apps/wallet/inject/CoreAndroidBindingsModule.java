// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.inject;

import android.app.Application;
import android.content.ContentResolver;
import android.os.Handler;
import android.os.Looper;

public class CoreAndroidBindingsModule
{

    public CoreAndroidBindingsModule()
    {
    }

    static ContentResolver getContentResolver(Application application)
    {
        return application.getContentResolver();
    }

    static Handler getMainThreadHandler()
    {
        return new Handler(Looper.getMainLooper());
    }
}
