// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.controllers;

import android.content.Context;

// Referenced classes of package com.dominos.controllers:
//            MenuListController

public final class MenuListController_ extends MenuListController
{

    private Context context_;

    private MenuListController_(Context context)
    {
        super(context);
        context_ = context;
        init_();
    }

    public static MenuListController_ getInstance_(Context context)
    {
        return new MenuListController_(context);
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
