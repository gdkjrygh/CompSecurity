// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.common.inject;

import android.app.Application;
import android.content.Context;
import android.os.Looper;

public final class ApplicationModule
{

    private final Application application;

    public ApplicationModule(Application application1)
    {
        application = application1;
    }

    public static Looper provideMainLooper()
    {
        return Looper.getMainLooper();
    }

    public final Application provideApplication()
    {
        return application;
    }

    public final Context provideContext()
    {
        return application;
    }
}
