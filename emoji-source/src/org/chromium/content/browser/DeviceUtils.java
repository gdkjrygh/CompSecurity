// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.content.Context;
import org.chromium.base.CommandLine;
import org.chromium.ui.base.DeviceFormFactor;

public class DeviceUtils
{

    public DeviceUtils()
    {
    }

    public static void addDeviceSpecificUserAgentSwitch(Context context)
    {
        if (!DeviceFormFactor.isTablet(context))
        {
            CommandLine.getInstance().appendSwitch("use-mobile-user-agent");
        }
    }
}
