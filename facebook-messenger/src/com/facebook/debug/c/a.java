// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.debug.c;

import android.content.Context;
import com.facebook.c;
import com.facebook.o;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.aj;
import com.facebook.widget.c.e;

public class a extends e
{

    public a(Context context)
    {
        super(context);
        setKey(aj.i.a());
        setTitle(o.debug_log_level);
        setDefaultValue("-1");
        setEntries(c.logger_levels);
        setEntryValues(c.logger_levels_values);
    }
}
