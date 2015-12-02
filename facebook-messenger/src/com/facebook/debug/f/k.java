// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.debug.f;

import android.content.Context;
import com.facebook.o;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.aj;
import com.facebook.widget.c.c;

public class k extends c
{

    public k(Context context)
    {
        super(context);
        setKey(aj.s.a());
        setTitle(o.debug_ui_thread_watchdog_pref_title);
        setSummary(o.debug_ui_thread_watchdog_pref_summary);
        setDefaultValue(Boolean.valueOf(false));
    }
}
