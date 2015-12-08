// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.adapters;

import android.content.Context;

// Referenced classes of package com.dominos.adapters:
//            LabsCouponWizardListAdapter

public final class LabsCouponWizardListAdapter_ extends LabsCouponWizardListAdapter
{

    private Context context_;

    private LabsCouponWizardListAdapter_(Context context)
    {
        context_ = context;
        init_();
    }

    public static LabsCouponWizardListAdapter_ getInstance_(Context context)
    {
        return new LabsCouponWizardListAdapter_(context);
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
