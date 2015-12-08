// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;


// Referenced classes of package com.facebook.widget:
//            LoginButton

public static final class  extends Enum
{

    public static final NEVER_DISPLAY DEFAULT;
    public static final NEVER_DISPLAY DISPLAY_ALWAYS;
    private static final NEVER_DISPLAY ENUM$VALUES[];
    public static final NEVER_DISPLAY NEVER_DISPLAY;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/facebook/widget/LoginButton$ToolTipMode, s);
    }

    public static [] values()
    {
         a[] = ENUM$VALUES;
        int i = a.length;
         a1[] = new ENUM.VALUES[i];
        System.arraycopy(a, 0, a1, 0, i);
        return a1;
    }

    static 
    {
        DEFAULT = new <init>("DEFAULT", 0);
        DISPLAY_ALWAYS = new <init>("DISPLAY_ALWAYS", 1);
        NEVER_DISPLAY = new <init>("NEVER_DISPLAY", 2);
        ENUM$VALUES = (new ENUM.VALUES[] {
            DEFAULT, DISPLAY_ALWAYS, NEVER_DISPLAY
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
