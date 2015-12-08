// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.onboarding.whatsnew;


// Referenced classes of package com.fitbit.onboarding.whatsnew:
//            PanelContent

public static final class theme extends Enum
{

    public static final b a;
    public static final b b;
    private static final b c[];
    private int theme;

    public static theme valueOf(String s)
    {
        return (theme)Enum.valueOf(com/fitbit/onboarding/whatsnew/PanelContent$PanelTheme, s);
    }

    public static theme[] values()
    {
        return (theme[])c.clone();
    }

    public int a()
    {
        return theme;
    }

    static 
    {
        a = new <init>("DARK_THEME", 0, 0x7f0c01e6);
        b = new <init>("LIGHT_THEME", 1, 0x7f0c01e5);
        c = (new c[] {
            a, b
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        theme = j;
    }
}
