// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.m;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.io.IOException;
import java.util.Properties;
import kik.android.util.bx;

public abstract class a
{

    private Context a;

    public a(Context context)
    {
        a = context;
    }

    public final String a()
    {
        String s = a.getPackageManager().getPackageInfo(a.getPackageName(), 0).versionName;
        return s;
        Object obj;
        obj;
_L2:
        return "";
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final Properties b()
    {
        Object obj = a.getResources().getAssets();
        java.io.InputStream inputstream;
        inputstream = ((AssetManager) (obj)).open("build.properties");
        obj = new Properties();
        ((Properties) (obj)).load(inputstream);
        return ((Properties) (obj));
        IOException ioexception;
        ioexception;
        obj = null;
_L2:
        bx.a(ioexception);
        return ((Properties) (obj));
        ioexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract boolean g();
}
