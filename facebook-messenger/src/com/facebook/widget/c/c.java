// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.CheckBoxPreference;
import com.facebook.inject.t;
import com.facebook.prefs.shared.b;
import com.facebook.prefs.shared.d;

public class c extends CheckBoxPreference
{

    private final b a;

    public c(Context context)
    {
        super(context);
        a = new b(this, (d)t.a(context).a(com/facebook/prefs/shared/d));
    }

    protected boolean getPersistedBoolean(boolean flag)
    {
        return a.a(flag);
    }

    public SharedPreferences getSharedPreferences()
    {
        return a.a();
    }

    protected boolean persistBoolean(boolean flag)
    {
        return a.b(flag);
    }
}
