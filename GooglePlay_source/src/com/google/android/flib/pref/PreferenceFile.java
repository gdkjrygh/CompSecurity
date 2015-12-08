// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.flib.pref;

import android.content.Context;
import android.content.SharedPreferences;

public final class PreferenceFile
{
    public static abstract class SharedPreference
    {

        PreferenceFile mFile;
        final String mKey;

        public final Object get()
        {
            PreferenceFile preferencefile = mFile;
            return read(PreferenceFile.sContext.getSharedPreferences(preferencefile.mName, 0));
        }

        protected abstract Object read(SharedPreferences sharedpreferences);

        protected SharedPreference(PreferenceFile preferencefile, String s)
        {
            mFile = preferencefile;
            mKey = s;
        }
    }


    public static Context sContext;
    final int mMode;
    final String mName;

    public PreferenceFile(String s)
    {
        this(s, (byte)0);
    }

    private PreferenceFile(String s, byte byte0)
    {
        mName = s;
        mMode = 0;
    }

    public final SharedPreference intValue(final String final_s, Integer integer)
    {
        return new SharedPreference(final_s, integer) {

            final PreferenceFile this$0;
            final Integer val$defaultValue;
            final String val$key;

            protected final volatile Object read(SharedPreferences sharedpreferences)
            {
                if (sharedpreferences.contains(key))
                {
                    return Integer.valueOf(sharedpreferences.getInt(key, 0));
                } else
                {
                    return defaultValue;
                }
            }

            
            {
                this$0 = PreferenceFile.this;
                key = s1;
                defaultValue = integer;
                super(final_preferencefile1, final_s);
            }
        };
    }
}
