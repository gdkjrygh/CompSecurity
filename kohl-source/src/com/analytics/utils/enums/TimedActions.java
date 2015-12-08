// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.analytics.utils.enums;


public final class TimedActions extends Enum
{

    private static final TimedActions $VALUES[];
    public static final TimedActions CHECKOUT_COMPLETION;
    public static final TimedActions TIME_TO_PRODUCT_VIEW;
    private String stringValue;

    private TimedActions(String s, int i, String s1)
    {
        super(s, i);
        stringValue = s1;
    }

    public static TimedActions valueOf(String s)
    {
        return (TimedActions)Enum.valueOf(com/analytics/utils/enums/TimedActions, s);
    }

    public static TimedActions[] values()
    {
        return (TimedActions[])$VALUES.clone();
    }

    public String toString()
    {
        return stringValue;
    }

    static 
    {
        TIME_TO_PRODUCT_VIEW = new TimedActions("TIME_TO_PRODUCT_VIEW", 0, "TimetoProductView");
        CHECKOUT_COMPLETION = new TimedActions("CHECKOUT_COMPLETION", 1, "CheckoutCompletion");
        $VALUES = (new TimedActions[] {
            TIME_TO_PRODUCT_VIEW, CHECKOUT_COMPLETION
        });
    }
}
