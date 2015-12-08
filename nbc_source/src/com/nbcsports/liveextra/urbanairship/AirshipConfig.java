// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.urbanairship;

import android.content.Context;
import com.urbanairship.AirshipConfigOptions;

public final class AirshipConfig extends AirshipConfigOptions
{

    public AirshipConfig()
    {
    }

    public static AirshipConfigOptions load(Context context)
    {
        context = AirshipConfigOptions.loadDefaultOptions(context);
        context.developmentAppKey = "p6e11wg0RNWCYKK4W0tH-g";
        context.developmentAppSecret = "B6W61eSNQ5mLJgHu5TOFlw";
        context.productionAppKey = "g2nELRrfSL-ikoPOr53mDQ";
        context.productionAppSecret = "OfeDb6DpS6CNDwR-3zeFkA";
        context.gcmSender = "617119423416";
        context.transport = "GCM";
        context.developmentLogLevel = 3;
        context.productionLogLevel = 6;
        context.minSdkVersion = 10;
        context.inProduction = true;
        return context;
    }
}
