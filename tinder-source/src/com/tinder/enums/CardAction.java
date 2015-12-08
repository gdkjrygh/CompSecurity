// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.enums;


public final class CardAction extends Enum
{

    private static final CardAction $VALUES[];
    public static final CardAction LIKE;
    public static final CardAction PASS;
    public static final CardAction SUPERLIKE;

    private CardAction(String s, int i)
    {
        super(s, i);
    }

    public static CardAction valueOf(String s)
    {
        return (CardAction)Enum.valueOf(com/tinder/enums/CardAction, s);
    }

    public static CardAction[] values()
    {
        return (CardAction[])$VALUES.clone();
    }

    static 
    {
        LIKE = new CardAction("LIKE", 0);
        PASS = new CardAction("PASS", 1);
        SUPERLIKE = new CardAction("SUPERLIKE", 2);
        $VALUES = (new CardAction[] {
            LIKE, PASS, SUPERLIKE
        });
    }
}
