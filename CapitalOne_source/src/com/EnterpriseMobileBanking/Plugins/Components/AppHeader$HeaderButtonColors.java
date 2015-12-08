// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins.Components;


// Referenced classes of package com.EnterpriseMobileBanking.Plugins.Components:
//            AppHeader

public static final class Q extends Enum
{

    private static final BLUE $VALUES[];
    public static final BLUE BLUE;
    public static final BLUE RED;

    public static Q valueOf(String s)
    {
        return (Q)Enum.valueOf(com/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors, s);
    }

    public static Q[] values()
    {
        return (Q[])$VALUES.clone();
    }

    static 
    {
        RED = new <init>("RED", 0);
        BLUE = new <init>("BLUE", 1);
        $VALUES = (new .VALUES[] {
            RED, BLUE
        });
    }

    private Q(String s, int i)
    {
        super(s, i);
    }
}
