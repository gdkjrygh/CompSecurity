// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import android.content.Context;
import com.facebook.o;
import com.facebook.prefs.shared.ae;
import com.facebook.push.b.a;
import com.facebook.widget.c.c;

public class p extends c
{

    public p(Context context)
    {
        super(context);
        setKey(a.a.a());
        setTitle(o.preference_mobile_chat_availability_title);
        setSummaryOff(o.preference_mobile_chat_availability_off_summary);
        setSummaryOn(o.preference_mobile_chat_availability_on_summary);
        setDefaultValue(Boolean.valueOf(true));
    }
}
