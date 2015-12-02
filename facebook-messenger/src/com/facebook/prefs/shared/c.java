// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.prefs.shared;

import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.prefs.shared:
//            ae, d

class c
    implements SharedPreferences
{

    private final d a;

    public c(d d1)
    {
        a = d1;
    }

    public boolean contains(String s)
    {
        return a.a(new ae(s));
    }

    public android.content.SharedPreferences.Editor edit()
    {
        throw new UnsupportedOperationException();
    }

    public Map getAll()
    {
        throw new UnsupportedOperationException();
    }

    public boolean getBoolean(String s, boolean flag)
    {
        throw new UnsupportedOperationException();
    }

    public float getFloat(String s, float f)
    {
        throw new UnsupportedOperationException();
    }

    public int getInt(String s, int i)
    {
        throw new UnsupportedOperationException();
    }

    public long getLong(String s, long l)
    {
        throw new UnsupportedOperationException();
    }

    public String getString(String s, String s1)
    {
        throw new UnsupportedOperationException();
    }

    public Set getStringSet(String s, Set set)
    {
        throw new UnsupportedOperationException();
    }

    public void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onsharedpreferencechangelistener)
    {
        throw new UnsupportedOperationException();
    }

    public void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onsharedpreferencechangelistener)
    {
        throw new UnsupportedOperationException();
    }
}
