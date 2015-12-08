// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.flib.pref;

import android.content.SharedPreferences;

// Referenced classes of package com.google.android.flib.pref:
//            PreferenceFile

final class aredPreference extends aredPreference
{

    final PreferenceFile this$0;
    final Integer val$defaultValue;
    final String val$key;

    protected final volatile Object read(SharedPreferences sharedpreferences)
    {
        if (sharedpreferences.contains(val$key))
        {
            return Integer.valueOf(sharedpreferences.getInt(val$key, 0));
        } else
        {
            return val$defaultValue;
        }
    }

    aredPreference(String s1, Integer integer)
    {
        this$0 = final_preferencefile;
        val$key = s1;
        val$defaultValue = integer;
        super(final_preferencefile1, String.this);
    }
}
