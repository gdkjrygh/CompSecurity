// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.lang.ref.WeakReference;

class a
{

    private WeakReference a;

    public a(Context context)
    {
        a = new WeakReference(context);
    }

    public Context a()
    {
        return (Context)a.get();
    }

    protected final boolean a(String s, String s1)
    {
        Object obj = c();
        if (obj != null)
        {
            obj = ((SharedPreferences) (obj)).edit();
            ((android.content.SharedPreferences.Editor) (obj)).putString(s, s1);
            ((android.content.SharedPreferences.Editor) (obj)).commit();
            return true;
        } else
        {
            return false;
        }
    }

    protected final String b()
    {
        return (new StringBuilder()).append(((Context)a.get()).getPackageName()).append("_preferences").toString();
    }

    protected final String b(String s, String s1)
    {
        SharedPreferences sharedpreferences = c();
        String s2 = s1;
        if (sharedpreferences != null)
        {
            s2 = sharedpreferences.getString(s, s1);
        }
        return s2;
    }

    final SharedPreferences c()
    {
        if (a.get() != null)
        {
            return PreferenceManager.getDefaultSharedPreferences((Context)a.get());
        } else
        {
            return null;
        }
    }

    public void d()
    {
        if (a != null)
        {
            a.clear();
        }
    }
}
