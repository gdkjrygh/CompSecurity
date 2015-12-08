// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;


public final class  extends Enum
{

    private static final PERSONAL_INFO_LINK $VALUES[];
    public static final PERSONAL_INFO_LINK DEFAULT;
    public static final PERSONAL_INFO_LINK PERSONAL_INFO_LINK;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/dominos/views/CustomerPersonalInformationView$ViewMode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        DEFAULT = new <init>("DEFAULT", 0);
        PERSONAL_INFO_LINK = new <init>("PERSONAL_INFO_LINK", 1);
        $VALUES = (new .VALUES[] {
            DEFAULT, PERSONAL_INFO_LINK
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
