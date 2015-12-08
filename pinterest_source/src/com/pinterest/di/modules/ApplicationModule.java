// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.di.modules;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.google.gson.Gson;

public class ApplicationModule
{

    private final Application a;

    public ApplicationModule(Application application)
    {
        a = application;
    }

    static Gson c()
    {
        return new Gson();
    }

    final Context a()
    {
        return a;
    }

    final Application b()
    {
        return a;
    }

    final Resources d()
    {
        return a.getResources();
    }
}
