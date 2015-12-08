// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.util;

import com.pinterest.experiment.Experiments;

public class CommerceHelper
{

    private static boolean instrumentationEnabled = false;
    private static Boolean isCommerceEnabled = null;
    private static Boolean isShopSpaceEnabled = null;

    public CommerceHelper()
    {
    }

    public static void clearCommerce()
    {
        isCommerceEnabled = null;
        isShopSpaceEnabled = null;
    }

    public static void enableInstrumentation()
    {
        instrumentationEnabled = true;
    }

    public static void init()
    {
        isCommerceEnabled = Boolean.valueOf(Experiments.H());
        isShopSpaceEnabled = Boolean.valueOf(Experiments.I());
    }

    public static boolean isCommerceEnabled()
    {
        if (instrumentationEnabled)
        {
            return true;
        }
        if (isCommerceEnabled == null)
        {
            init();
        }
        return isCommerceEnabled.booleanValue();
    }

    public static boolean isCommerceShopSpaceEnabled()
    {
        if (isShopSpaceEnabled == null)
        {
            init();
        }
        return isShopSpaceEnabled.booleanValue();
    }

}
