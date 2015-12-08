// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.content.SharedPreferences;

final class val.k extends Thread
{

    final Runnable val$fun;
    final String val$k;
    final SharedPreferences val$prefs;

    public final void run()
    {
        val$fun.run();
        val$prefs.edit().putBoolean(val$k, true).apply();
    }

    ()
    {
        val$fun = runnable;
        val$prefs = sharedpreferences;
        val$k = s;
        super();
    }
}
