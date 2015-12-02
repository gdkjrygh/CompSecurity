// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.prefs.shared;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class a
{

    private final Context a;

    public a(Context context)
    {
        a = context.getApplicationContext();
    }

    private boolean b(String s)
    {
        boolean flag1 = false;
        s = a(s);
        boolean flag = flag1;
        if (s != null)
        {
            s.delete();
            flag = flag1;
            if (!s.exists())
            {
                flag = true;
            }
        }
        return flag;
    }

    public SharedPreferences a(String s, int i)
    {
        SharedPreferences sharedpreferences;
        try
        {
            sharedpreferences = a.getSharedPreferences(s, i);
        }
        catch (NumberFormatException numberformatexception)
        {
            b(s);
            return a.getSharedPreferences(s, i);
        }
        return sharedpreferences;
    }

    public File a(String s)
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
