// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.utils;

import android.content.Context;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.utils:
//            ResUtils

public final class ResUtils_ extends ResUtils
{

    private static ResUtils_ instance_;
    private Context context_;

    private ResUtils_(Context context)
    {
        super(context);
        context_ = context;
    }

    public static ResUtils_ getInstance_(Context context)
    {
        if (instance_ == null)
        {
            c c1 = c.a(null);
            context = new ResUtils_(context.getApplicationContext());
            instance_ = context;
            context.init_();
            c.a(c1);
        }
        return instance_;
    }

    private void init_()
    {
    }
}
