// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.clearengine.sdk.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.qihoo360.i.v1.main.IIpcPref;
import com.qihoo360.mobilesafe.opti.i.plugins.ISharedPreferences;
import com.qihoo360.mobilesafe.share.b;
import java.util.Map;
import java.util.Set;

public class c
    implements ISharedPreferences
{
    public static class a
        implements SharedPreferences
    {

        private final IIpcPref a;

        public boolean contains(String s)
        {
            return a.contains(s);
        }

        public android.content.SharedPreferences.Editor edit()
        {
            return a.edit();
        }

        public Map getAll()
        {
            return a.getAll();
        }

        public boolean getBoolean(String s, boolean flag)
        {
            return a.getBoolean(s, flag);
        }

        public float getFloat(String s, float f)
        {
            return a.getFloat(s, f);
        }

        public int getInt(String s, int i)
        {
            return a.getInt(s, i);
        }

        public long getLong(String s, long l)
        {
            return a.getLong(s, l);
        }

        public String getString(String s, String s1)
        {
            return a.getString(s, s1);
        }

        public Set getStringSet(String s, Set set)
        {
            return null;
        }

        public void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onsharedpreferencechangelistener)
        {
            a.registerOnSharedPreferenceChangeListener(onsharedpreferencechangelistener);
        }

        public void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onsharedpreferencechangelistener)
        {
            a.unregisterOnSharedPreferenceChangeListener(onsharedpreferencechangelistener);
        }

        public a(Context context, String s)
        {
            if (s != null)
            {
                a = c.a().getSharedPreferences(s);
                return;
            } else
            {
                a = c.a().getDefaultSharedPreferences();
                return;
            }
        }
    }


    private static b b;
    private final Context a;

    public c(Context context)
    {
        a = context;
        b = com.qihoo360.mobilesafe.share.b.a();
    }

    static b a()
    {
        return b;
    }

    public SharedPreferences getDefaultSharedPreferences()
    {
        return new a(a, "sp_clear_sdk");
    }

    public SharedPreferences getSharedPreferences(String s)
    {
        return new a(a, s);
    }
}
