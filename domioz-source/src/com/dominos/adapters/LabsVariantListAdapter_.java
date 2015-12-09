// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.adapters;

import android.content.Context;
import com.dominos.MobileSession_;

// Referenced classes of package com.dominos.adapters:
//            LabsVariantListAdapter

public final class LabsVariantListAdapter_ extends LabsVariantListAdapter
{

    private Context context_;

    private LabsVariantListAdapter_(Context context)
    {
        context_ = context;
        init_();
    }

    public static LabsVariantListAdapter_ getInstance_(Context context)
    {
        return new LabsVariantListAdapter_(context);
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
