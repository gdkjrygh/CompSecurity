// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;


final class  extends Enum
{

    private static final SUCCESS $VALUES[];
    public static final SUCCESS ALERT;
    public static final SUCCESS NORMAL;
    public static final SUCCESS SUCCESS;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/dominos/nina/persona/NinaView$PromptTypes, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NORMAL = new <init>("NORMAL", 0);
        ALERT = new <init>("ALERT", 1);
        SUCCESS = new <init>("SUCCESS", 2);
        $VALUES = (new .VALUES[] {
            NORMAL, ALERT, SUCCESS
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
