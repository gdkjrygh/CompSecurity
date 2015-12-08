// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.di.modules;

import android.app.Activity;

public class ActivityModule
{

    private final Activity a;

    public ActivityModule(Activity activity)
    {
        a = activity;
    }

    final Activity a()
    {
        return a;
    }
}
