// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.j;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.List;

public class a
{

    public a()
    {
    }

    public static boolean a(Context context, Intent intent)
    {
        return context.getPackageManager().queryIntentActivities(intent, 0x10000).size() > 0;
    }

    public static boolean a(Context context, String s)
    {
        return context.getPackageManager().queryIntentActivities(new Intent(s), 0x10000).size() > 0;
    }
}
