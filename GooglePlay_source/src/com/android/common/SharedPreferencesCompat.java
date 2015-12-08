// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.common;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class SharedPreferencesCompat
{

    private static Method sApplyMethod;

    public static void apply(android.content.SharedPreferences.Editor editor)
    {
        if (sApplyMethod != null)
        {
            try
            {
                sApplyMethod.invoke(editor, new Object[0]);
                return;
            }
            catch (InvocationTargetException invocationtargetexception) { }
            catch (IllegalAccessException illegalaccessexception) { }
        }
        editor.commit();
    }

    static 
    {
        try
        {
            sApplyMethod = android/content/SharedPreferences$Editor.getMethod("apply", new Class[0]);
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            sApplyMethod = null;
        }
    }
}
