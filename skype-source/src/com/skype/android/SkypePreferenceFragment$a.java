// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

// Referenced classes of package com.skype.android:
//            SkypePreferenceFragment

private static final class a
{

    private PreferenceManager a;
    private Class b;

    private void a(String s)
    {
        try
        {
            s = b.getDeclaredMethod(s, new Class[0]);
            s.setAccessible(true);
            s.invoke(a, new Object[0]);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
    }

    public final Preference a(CharSequence charsequence)
    {
        try
        {
            Method method = b.getDeclaredMethod("findPreference", new Class[] {
                java/lang/CharSequence
            });
            method.setAccessible(true);
            charsequence = (Preference)method.invoke(a, new Object[] {
                charsequence
            });
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw new RuntimeException(charsequence);
        }
        return charsequence;
    }

    public final PreferenceScreen a()
    {
        Object obj;
        try
        {
            obj = b.getDeclaredMethod("getPreferenceScreen", new Class[0]);
            ((Method) (obj)).setAccessible(true);
            obj = (PreferenceScreen)((Method) (obj)).invoke(a, new Object[0]);
        }
        catch (Exception exception)
        {
            throw new RuntimeException(exception);
        }
        return ((PreferenceScreen) (obj));
    }

    public final PreferenceScreen a(Context context, int i, PreferenceScreen preferencescreen)
    {
        try
        {
            Method method = b.getDeclaredMethod("inflateFromResource", new Class[] {
                android/content/Context, Integer.TYPE, android/preference/PreferenceScreen
            });
            method.setAccessible(true);
            context = (PreferenceScreen)method.invoke(a, new Object[] {
                context, Integer.valueOf(i), preferencescreen
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException(context);
        }
        return context;
    }

    public final void a(int i, int j, Intent intent)
    {
        try
        {
            Method method = b.getDeclaredMethod("dispatchActivityResult", new Class[] {
                Integer.TYPE, Integer.TYPE, android/content/Intent
            });
            method.setAccessible(true);
            method.invoke(a, new Object[] {
                Integer.valueOf(i), Integer.valueOf(j), intent
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw new RuntimeException(intent);
        }
    }

    public final boolean a(PreferenceScreen preferencescreen)
    {
        boolean flag;
        try
        {
            Method method = b.getDeclaredMethod("setPreferences", new Class[] {
                android/preference/PreferenceScreen
            });
            method.setAccessible(true);
            flag = ((Boolean)method.invoke(a, new Object[] {
                preferencescreen
            })).booleanValue();
        }
        // Misplaced declaration of an exception variable
        catch (PreferenceScreen preferencescreen)
        {
            throw new RuntimeException(preferencescreen);
        }
        return flag;
    }

    public final void b()
    {
        a("dispatchActivityStop");
    }

    public final void c()
    {
        a("dispatchActivityDestroy");
    }

    public final PreferenceManager d()
    {
        return a;
    }

    public (Activity activity)
    {
        try
        {
            Constructor constructor = android/preference/PreferenceManager.getDeclaredConstructor(new Class[] {
                android/app/Activity, Integer.TYPE
            });
            constructor.setAccessible(true);
            a = (PreferenceManager)constructor.newInstance(new Object[] {
                activity, Integer.valueOf(100)
            });
            b = a.getClass();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw new RuntimeException(activity);
        }
    }
}
