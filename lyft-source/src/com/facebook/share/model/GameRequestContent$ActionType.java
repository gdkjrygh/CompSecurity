// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;


public final class  extends Enum
{

    private static final TURN $VALUES[];
    public static final TURN ASKFOR;
    public static final TURN SEND;
    public static final TURN TURN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/facebook/share/model/GameRequestContent$ActionType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SEND = new <init>("SEND", 0);
        ASKFOR = new <init>("ASKFOR", 1);
        TURN = new <init>("TURN", 2);
        $VALUES = (new .VALUES[] {
            SEND, ASKFOR, TURN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
