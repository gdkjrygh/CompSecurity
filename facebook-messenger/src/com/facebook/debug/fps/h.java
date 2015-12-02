// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.debug.fps;

import android.content.Context;
import com.facebook.o;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.aj;
import com.facebook.widget.c.c;

public class h extends c
{

    public h(Context context, boolean flag)
    {
        super(context);
        setKey(aj.q.a());
        setTitle(o.debug_fps_enabled_title);
        setSummary(o.debug_fps_enabled_summary);
        setDefaultValue(Boolean.valueOf(flag));
    }
}
