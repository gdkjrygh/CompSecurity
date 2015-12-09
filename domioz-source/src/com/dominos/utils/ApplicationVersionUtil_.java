// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.utils;

import android.content.Context;

// Referenced classes of package com.dominos.utils:
//            ApplicationVersionUtil

public final class ApplicationVersionUtil_ extends ApplicationVersionUtil
{

    private Context context_;

    private ApplicationVersionUtil_(Context context)
    {
        super(context);
        context_ = context;
        init_();
    }

    public static ApplicationVersionUtil_ getInstance_(Context context)
    {
        return new ApplicationVersionUtil_(context);
    }

    private void init_()
    {
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
