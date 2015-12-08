// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common;

import android.os.Build;

// Referenced classes of package com.dominos.android.sdk.common:
//            StringHelper

public class AmazonUtil
{

    public static final String AMAZON = "Amazon";

    public AmazonUtil()
    {
    }

    public static String getMarketURI()
    {
        if (isAmazonDevice())
        {
            return "amzn://apps/android?p=";
        } else
        {
            return "market://details?id=";
        }
    }

    public static boolean isAmazonDevice()
    {
        return StringHelper.equalsIgnoreCase(Build.MANUFACTURER, "Amazon");
    }
}
