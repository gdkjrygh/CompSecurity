// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.m;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.tinder.utils:
//            v

public final class o
{

    private static boolean a = true;

    public static float a(float f1, float f2, float f3, float f4, float f5)
    {
        return ((f5 - f3) / (f4 - f2)) * (f1 - f2) + f3;
    }

    public static int a(Context context)
    {
        int i;
        try
        {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            v.a("tried getting app versionCode", context);
            return 0;
        }
        return i;
    }

    public static int a(Object aobj[])
    {
        int j = 0;
        int l = aobj.length;
        for (int i = 0; i < l;)
        {
            int k = j;
            if (aobj[i] != null)
            {
                k = j + 1;
            }
            i++;
            j = k;
        }

        return j;
    }

    public static void a(Fragment fragment)
    {
        try
        {
            Field field = android/support/v4/app/Fragment.getDeclaredField("mSavedFragmentState");
            field.setAccessible(true);
            fragment = (Bundle)field.get(fragment);
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            (new StringBuilder("Could not get mSavedFragmentState field: ")).append(fragment);
            return;
        }
        if (fragment == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        fragment.setClassLoader(android/support/v4/app/Fragment.getClassLoader());
    }

    public static void a(Fragment fragment, int i, int j, Intent intent)
    {
        if (fragment.getChildFragmentManager() != null)
        {
            for (fragment = fragment.getChildFragmentManager().f().iterator(); fragment.hasNext(); ((Fragment)fragment.next()).onActivityResult(i, j, intent)) { }
        }
    }

    public static boolean a()
    {
        return android.os.Build.VERSION.SDK_INT >= 21;
    }

    public static boolean a(SoftReference softreference)
    {
        return softreference != null && softreference.get() != null;
    }

    public static boolean a(WeakReference weakreference)
    {
        return weakreference != null && weakreference.get() != null;
    }

    public static boolean a(Collection collection)
    {
        return collection == null || collection.isEmpty();
    }

    public static boolean b()
    {
        return android.os.Build.VERSION.SDK_INT >= 19;
    }

    public static boolean c()
    {
        return android.os.Build.VERSION.SDK_INT >= 17;
    }

    public static boolean d()
    {
        return android.os.Build.VERSION.SDK_INT >= 16;
    }

    public static boolean e()
    {
        return android.os.Build.VERSION.SDK_INT >= 21;
    }

    public static boolean f()
    {
        return a;
    }

    public static void g()
    {
        a = false;
    }

}
