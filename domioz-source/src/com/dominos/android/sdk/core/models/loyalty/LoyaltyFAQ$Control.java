// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.loyalty;


public final class text extends Enum
{

    private static final NORMAL $VALUES[];
    public static final NORMAL NORMAL;
    public static final NORMAL OPT_OUT;
    private final String text;

    public static text valueOf(String s)
    {
        return (text)Enum.valueOf(com/dominos/android/sdk/core/models/loyalty/LoyaltyFAQ$Control, s);
    }

    public static text[] values()
    {
        return (text[])$VALUES.clone();
    }

    public final String getText()
    {
        return text;
    }

    static 
    {
        OPT_OUT = new <init>("OPT_OUT", 0, "optout");
        NORMAL = new <init>("NORMAL", 1, "normal");
        $VALUES = (new .VALUES[] {
            OPT_OUT, NORMAL
        });
    }


    private (String s, int i, String s1)
    {
        super(s, i);
        text = s1;
    }
}
