// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;


public final class  extends Enum
{

    public static final b a;
    private static b b;
    private static final b c[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/facebook/widget/ToolTipPopup$Style, s);
    }

    public static [] values()
    {
        return ([])c.clone();
    }

    static 
    {
        a = new <init>("BLUE", 0);
        b = new <init>("BLACK", 1);
        c = (new c[] {
            a, b
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
