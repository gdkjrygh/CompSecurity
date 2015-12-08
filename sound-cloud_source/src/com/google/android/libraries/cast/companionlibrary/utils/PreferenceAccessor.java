// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class PreferenceAccessor
{

    private final SharedPreferences mSharedPreference;

    public PreferenceAccessor(Context context)
    {
        mSharedPreference = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public boolean getBooleanFromPreference(String s, boolean flag)
    {
        return mSharedPreference.getBoolean(s, flag);
    }

    public float getFloatFromPreference(String s)
    {
        return mSharedPreference.getFloat(s, 1.401298E-45F);
    }

    public int getIntFromPreference(String s)
    {
        return mSharedPreference.getInt(s, 0x80000000);
    }

    public int getIntFromPreference(String s, int i)
    {
        return mSharedPreference.getInt(s, i);
    }

    public long getLongFromPreference(String s, long l)
    {
        return mSharedPreference.getLong(s, l);
    }

    public String getStringFromPreference(String s)
    {
        return getStringFromPreference(s, null);
    }

    public String getStringFromPreference(String s, String s1)
    {
        return mSharedPreference.getString(s, s1);
    }

    public void saveBooleanToPreference(String s, Boolean boolean1)
    {
        if (boolean1 == null)
        {
            mSharedPreference.edit().remove(s).apply();
            return;
        } else
        {
            mSharedPreference.edit().putBoolean(s, boolean1.booleanValue()).apply();
            return;
        }
    }

    public void saveFloatToPreference(String s, Float float1)
    {
        if (float1 == null)
        {
            mSharedPreference.edit().remove(s).apply();
            return;
        } else
        {
            mSharedPreference.edit().putFloat(s, float1.floatValue()).apply();
            return;
        }
    }

    public void saveIntToPreference(String s, Integer integer)
    {
        if (integer == null)
        {
            mSharedPreference.edit().remove(s).apply();
            return;
        } else
        {
            mSharedPreference.edit().putInt(s, integer.intValue()).apply();
            return;
        }
    }

    public void saveLongToPreference(String s, Long long1)
    {
        if (long1 == null)
        {
            mSharedPreference.edit().remove(s).apply();
            return;
        } else
        {
            mSharedPreference.edit().putLong(s, long1.longValue()).apply();
            return;
        }
    }

    public void saveStringToPreference(String s, String s1)
    {
        if (s1 == null)
        {
            mSharedPreference.edit().remove(s).apply();
            return;
        } else
        {
            mSharedPreference.edit().putString(s, s1).apply();
            return;
        }
    }
}
