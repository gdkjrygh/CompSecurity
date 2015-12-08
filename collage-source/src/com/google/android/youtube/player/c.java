// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.android.youtube.player.internal.ac;
import java.util.List;

public final class c
{

    private c()
    {
    }

    public static Intent a(Context context, String s)
    {
        return a(context, s, false, false);
    }

    public static Intent a(Context context, String s, boolean flag, boolean flag1)
    {
        String s1 = String.valueOf("http://www.youtube.com/watch?v=");
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = s1.concat(s);
        } else
        {
            s = new String(s1);
        }
        return b(context, Uri.parse(s)).putExtra("force_fullscreen", flag).putExtra("finish_on_ended", flag1);
    }

    static Intent a(Intent intent, Context context)
    {
        intent.putExtra("app_package", context.getPackageName()).putExtra("app_version", ac.d(context)).putExtra("client_library_version", ac.a());
        return intent;
    }

    public static boolean a(Context context)
    {
        return a(context, Uri.parse("http://www.youtube.com/watch?v="));
    }

    private static boolean a(Context context, Intent intent)
    {
        context = context.getPackageManager().queryIntentActivities(intent, 0x10000);
        return context != null && !context.isEmpty();
    }

    private static boolean a(Context context, Uri uri)
    {
        return a(context, (new Intent("android.intent.action.VIEW", uri)).setPackage(b(context)));
    }

    private static Intent b(Context context, Uri uri)
    {
        return a((new Intent("android.intent.action.VIEW", uri)).setPackage(b(context)), context);
    }

    private static String b(Context context)
    {
        context = context.getPackageManager();
        if (ac.b(context))
        {
            return "com.google.android.youtube.tv";
        }
        if (ac.a(context))
        {
            return "com.google.android.youtube.googletv";
        } else
        {
            return "com.google.android.youtube";
        }
    }
}
