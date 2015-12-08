// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login.widget;


public final class intValue extends Enum
{

    private static final AUTOMATIC $VALUES[];
    public static final AUTOMATIC AUTOMATIC;
    public static AUTOMATIC DEFAULT;
    public static final AUTOMATIC DISPLAY_ALWAYS;
    public static final AUTOMATIC NEVER_DISPLAY;
    private int intValue;
    private String stringValue;

    public static intValue fromInt(int i)
    {
        intValue aintvalue[] = values();
        int k = aintvalue.length;
        for (int j = 0; j < k; j++)
        {
            intValue intvalue = aintvalue[j];
            if (intvalue.getValue() == i)
            {
                return intvalue;
            }
        }

        return null;
    }

    public static getValue valueOf(String s)
    {
        return (getValue)Enum.valueOf(com/facebook/login/widget/LoginButton$ToolTipMode, s);
    }

    public static getValue[] values()
    {
        return (getValue[])$VALUES.clone();
    }

    public int getValue()
    {
        return intValue;
    }

    public String toString()
    {
        return stringValue;
    }

    static 
    {
        AUTOMATIC = new <init>("AUTOMATIC", 0, "automatic", 0);
        DISPLAY_ALWAYS = new <init>("DISPLAY_ALWAYS", 1, "display_always", 1);
        NEVER_DISPLAY = new <init>("NEVER_DISPLAY", 2, "never_display", 2);
        $VALUES = (new .VALUES[] {
            AUTOMATIC, DISPLAY_ALWAYS, NEVER_DISPLAY
        });
        DEFAULT = AUTOMATIC;
    }

    private (String s, int i, String s1, int j)
    {
        super(s, i);
        stringValue = s1;
        intValue = j;
    }
}
