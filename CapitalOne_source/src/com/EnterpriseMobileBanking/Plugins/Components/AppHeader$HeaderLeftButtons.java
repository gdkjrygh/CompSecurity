// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins.Components;


// Referenced classes of package com.EnterpriseMobileBanking.Plugins.Components:
//            AppHeader

public static final class  extends Enum
{

    private static final CLOSE $VALUES[];
    public static final CLOSE BACK;
    public static final CLOSE CLOSE;
    public static final CLOSE MENU;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        BACK = new <init>("BACK", 0);
        MENU = new <init>("MENU", 1);
        CLOSE = new <init>("CLOSE", 2);
        $VALUES = (new .VALUES[] {
            BACK, MENU, CLOSE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
