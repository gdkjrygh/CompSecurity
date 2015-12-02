// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ta.utdid2.core.persistent;

import java.util.Map;

public interface MySharedPreferences
{
    public static interface MyEditor
    {

        public abstract MyEditor clear();

        public abstract boolean commit();

        public abstract MyEditor putBoolean(String s, boolean flag);

        public abstract MyEditor putFloat(String s, float f);

        public abstract MyEditor putInt(String s, int i);

        public abstract MyEditor putLong(String s, long l);

        public abstract MyEditor putString(String s, String s1);

        public abstract MyEditor remove(String s);
    }

    public static interface OnSharedPreferenceChangeListener
    {

        public abstract void onSharedPreferenceChanged(MySharedPreferences mysharedpreferences, String s);
    }


    public abstract boolean checkFile();

    public abstract boolean contains(String s);

    public abstract MyEditor edit();

    public abstract Map getAll();

    public abstract boolean getBoolean(String s, boolean flag);

    public abstract float getFloat(String s, float f);

    public abstract int getInt(String s, int i);

    public abstract long getLong(String s, long l);

    public abstract String getString(String s, String s1);

    public abstract void registerOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener onsharedpreferencechangelistener);

    public abstract void unregisterOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener onsharedpreferencechangelistener);
}
