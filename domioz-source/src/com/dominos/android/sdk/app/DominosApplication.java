// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.app;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.support.multidex.a;

// Referenced classes of package com.dominos.android.sdk.app:
//            ApplicationUncaughtExceptionHandler

public class DominosApplication extends Application
{

    private static Context mContext;

    public DominosApplication()
    {
    }

    public static boolean isDebuggable()
    {
        return mContext != null && (mContext.getApplicationInfo().flags & 2) != 0;
    }

    protected void attachBaseContext(Context context)
    {
        super.attachBaseContext(context);
        mContext = context;
        if (isDebuggable())
        {
            a.a(this);
        }
    }

    public void onCreate()
    {
        super.onCreate();
        Thread.setDefaultUncaughtExceptionHandler(new ApplicationUncaughtExceptionHandler(this));
    }
}
