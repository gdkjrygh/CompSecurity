// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.adapters;

import android.content.Context;

// Referenced classes of package com.dominos.adapters:
//            LabsCouponListAdapter

public final class LabsCouponListAdapter_ extends LabsCouponListAdapter
{

    private Context context_;

    private LabsCouponListAdapter_(Context context)
    {
        context_ = context;
        init_();
    }

    public static LabsCouponListAdapter_ getInstance_(Context context)
    {
        return new LabsCouponListAdapter_(context);
    }

    private void init_()
    {
        context = context_;
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
