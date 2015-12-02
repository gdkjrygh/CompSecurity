// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.ListPreference;
import com.facebook.inject.t;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.b;

public class d extends ListPreference
{

    private final b a;

    public d(Context context)
    {
        super(context);
        a = new b(this, (com.facebook.prefs.shared.d)t.a(context).a(com/facebook/prefs/shared/d));
    }

    public void a(ae ae)
    {
        a.a(ae);
    }

    protected String getPersistedString(String s)
    {
        return a.a(s);
    }

    public SharedPreferences getSharedPreferences()
    {
        return a.a();
    }

    protected boolean persistString(String s)
    {
        return a.b(s);
    }
}
