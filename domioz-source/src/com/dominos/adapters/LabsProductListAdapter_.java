// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.adapters;

import android.content.Context;
import com.dominos.MobileSession_;

// Referenced classes of package com.dominos.adapters:
//            LabsProductListAdapter

public final class LabsProductListAdapter_ extends LabsProductListAdapter
{

    private Context context_;

    private LabsProductListAdapter_(Context context)
    {
        context_ = context;
        init_();
    }

    public static LabsProductListAdapter_ getInstance_(Context context)
    {
        return new LabsProductListAdapter_(context);
    }

    private void init_()
    {
        mMobileSession = MobileSession_.getInstance_(context_);
        context = context_;
        setupInflater();
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
