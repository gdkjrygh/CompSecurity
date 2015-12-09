// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.content.Context;

// Referenced classes of package com.fitbit.device.ui:
//            DeviceView_, DeviceViewWithMultipleDevicesSupport_, DeviceViewWithMultipleDevicesSupport, DeviceView

public class b
{

    public b()
    {
    }

    public static DeviceView a(Context context)
    {
        return DeviceView_.a(context);
    }

    public static DeviceView a(Context context, DeviceViewWithMultipleDevicesSupport.a a1, boolean flag)
    {
        if (flag)
        {
            return a(context, a1);
        } else
        {
            return a(context);
        }
    }

    public static DeviceViewWithMultipleDevicesSupport a(Context context, DeviceViewWithMultipleDevicesSupport.a a1)
    {
        context = DeviceViewWithMultipleDevicesSupport_.a(context);
        context.a(a1);
        return context;
    }
}
