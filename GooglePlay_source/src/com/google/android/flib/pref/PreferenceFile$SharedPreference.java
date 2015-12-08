// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.flib.pref;

import android.content.Context;
import android.content.SharedPreferences;

// Referenced classes of package com.google.android.flib.pref:
//            PreferenceFile

public static abstract class mKey
{

    PreferenceFile mFile;
    final String mKey;

    public final Object get()
    {
        PreferenceFile preferencefile = mFile;
        return read(PreferenceFile.sContext.getSharedPreferences(preferencefile.mName, 0));
    }

    protected abstract Object read(SharedPreferences sharedpreferences);

    protected (PreferenceFile preferencefile, String s)
    {
        mFile = preferencefile;
        mKey = s;
    }
}
