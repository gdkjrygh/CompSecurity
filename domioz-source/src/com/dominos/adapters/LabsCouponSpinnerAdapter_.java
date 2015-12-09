// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.adapters;

import android.content.Context;
import android.view.LayoutInflater;

// Referenced classes of package com.dominos.adapters:
//            LabsCouponSpinnerAdapter

public final class LabsCouponSpinnerAdapter_ extends LabsCouponSpinnerAdapter
{

    private Context context_;

    private LabsCouponSpinnerAdapter_(Context context)
    {
        context_ = context;
        init_();
    }

    public static LabsCouponSpinnerAdapter_ getInstance_(Context context)
    {
        return new LabsCouponSpinnerAdapter_(context);
    }

    private void init_()
    {
        inflater = (LayoutInflater)context_.getSystemService("layout_inflater");
        context = context_;
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
