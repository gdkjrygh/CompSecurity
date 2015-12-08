// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common;

import android.content.Context;

// Referenced classes of package com.dominos.android.sdk.common:
//            OrderUtil, DeviceCapabilities_

public final class OrderUtil_ extends OrderUtil
{

    private Context context_;

    private OrderUtil_(Context context)
    {
        context_ = context;
        init_();
    }

    public static OrderUtil_ getInstance_(Context context)
    {
        return new OrderUtil_(context);
    }

    private void init_()
    {
        mDeviceCapabilities = DeviceCapabilities_.getInstance_(context_);
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
