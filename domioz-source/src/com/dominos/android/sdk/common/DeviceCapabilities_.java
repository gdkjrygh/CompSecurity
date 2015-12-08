// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common;

import android.content.Context;

// Referenced classes of package com.dominos.android.sdk.common:
//            DeviceCapabilities

public final class DeviceCapabilities_ extends DeviceCapabilities
{

    private Context context_;

    private DeviceCapabilities_(Context context)
    {
        super(context);
        context_ = context;
        init_();
    }

    public static DeviceCapabilities_ getInstance_(Context context)
    {
        return new DeviceCapabilities_(context);
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
