// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.common.SharedPreferencesCompat;

public abstract class BaseSharedPrefs
{

    private final String mPrefsFile;

    public BaseSharedPrefs(String s)
    {
        mPrefsFile = s;
    }

    public abstract void assertProcess(Context context);

    public final android.content.SharedPreferences.Editor getEditor(Context context)
    {
        assertProcess(context);
        return getSharedPrefs(context).edit();
    }

    public final int getInteger(Context context, String s, int i)
    {
        return getSharedPrefs(context).getInt(s, i);
    }

    public final SharedPreferences getSharedPrefs(Context context)
    {
        assertProcess(context);
        return context.getSharedPreferences(mPrefsFile, 0);
    }

    public final String getString(Context context, String s)
    {
        return getSharedPrefs(context).getString(s, null);
    }

    public final void setInteger(Context context, String s, int i)
    {
        context = getEditor(context);
        context.putInt(s, i);
        SharedPreferencesCompat.apply(context);
    }

    public final void setString(Context context, String s, String s1)
    {
        context = getEditor(context);
        context.putString(s, s1);
        SharedPreferencesCompat.apply(context);
    }
}
