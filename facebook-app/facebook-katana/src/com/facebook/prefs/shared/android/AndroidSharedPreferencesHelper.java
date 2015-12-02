// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.prefs.shared.android;

import android.content.Context;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AndroidSharedPreferencesHelper
{

    private final Context a;

    public AndroidSharedPreferencesHelper(Context context)
    {
        a = context.getApplicationContext();
    }

    public final File a(String s)
    {
        Method method;
        try
        {
            method = android/content/Context.getMethod("getSharedPrefsFile", new Class[] {
                java/lang/String
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        try
        {
            s = (File)method.invoke(a, new Object[] {
                s
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }
}
