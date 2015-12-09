// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.wear;

import android.content.Context;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.wear:
//            WearSession

public final class WearSession_ extends WearSession
{

    private static WearSession_ instance_;
    private Context context_;

    private WearSession_(Context context)
    {
        super(context);
        context_ = context;
    }

    public static WearSession_ getInstance_(Context context)
    {
        if (instance_ == null)
        {
            c c1 = c.a(null);
            context = new WearSession_(context.getApplicationContext());
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
