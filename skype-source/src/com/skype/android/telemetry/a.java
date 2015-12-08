// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.telemetry;

import android.app.Application;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.skype.android.SkypeApplication;
import com.skype.android.util.NetworkUtil;

final class a
{

    private final NetworkUtil a;
    private SkypeApplication b;
    private DisplayMetrics c;
    private float d;

    public a(Application application, NetworkUtil networkutil)
    {
        a = networkutil;
        b = (SkypeApplication)application;
        c = b.getResources().getDisplayMetrics();
        d = (float)c.densityDpi / 160F;
    }

    public final String a()
    {
        return a.e().name();
    }

    public final boolean b()
    {
        return b.getPackageManager().hasSystemFeature("android.hardware.touchscreen");
    }

    public final int c()
    {
        return c.widthPixels;
    }

    public final float d()
    {
        return (float)c.widthPixels / d;
    }

    public final int e()
    {
        return c.heightPixels;
    }

    public final float f()
    {
        return (float)c.heightPixels / d;
    }
}
