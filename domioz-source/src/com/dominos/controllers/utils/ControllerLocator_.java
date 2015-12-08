// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.controllers.utils;

import android.content.Context;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.controllers.utils:
//            ControllerLocator

public final class ControllerLocator_ extends ControllerLocator
{

    private static ControllerLocator_ instance_;
    private Context context_;

    private ControllerLocator_(Context context)
    {
        super(context);
        context_ = context;
    }

    public static ControllerLocator_ getInstance_(Context context)
    {
        if (instance_ == null)
        {
            c c1 = c.a(null);
            context = new ControllerLocator_(context.getApplicationContext());
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
