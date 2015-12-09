// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.controllers;

import android.content.Context;

// Referenced classes of package com.dominos.controllers:
//            BaseController

public final class BaseController_ extends BaseController
{

    private Context context_;

    private BaseController_(Context context)
    {
        context_ = context;
        init_();
    }

    public static BaseController_ getInstance_(Context context)
    {
        return new BaseController_(context);
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
