// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.analytics;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

public class PersistentStorage
{

    private SharedPreferences a;
    private Context b;

    public PersistentStorage(Application application, String s)
    {
        a = application.getSharedPreferences(s, 0);
        b = application;
    }

    protected final void a(String s, long l)
    {
        android.content.SharedPreferences.Editor editor = a.edit();
        editor.putLong(s, l);
        editor.apply();
    }

    protected final void a(String s, String s1)
    {
        android.content.SharedPreferences.Editor editor = a.edit();
        editor.putString(s, s1);
        editor.apply();
    }

    protected final String b(String s, String s1)
    {
        return a.getString(s, s1);
    }

    protected final long e(String s)
    {
        return a.getLong(s, -1L);
    }
}
