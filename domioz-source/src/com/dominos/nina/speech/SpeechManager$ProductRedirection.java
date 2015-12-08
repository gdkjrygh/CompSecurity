// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.speech;


public final class  extends Enum
{

    private static final RECENT $VALUES[];
    public static final RECENT CARRYOUT;
    public static final RECENT DELIVERY;
    public static final RECENT EASY;
    public static final RECENT LANDING;
    public static final RECENT MENULIST;
    public static final RECENT NEW;
    public static final RECENT RECENT;
    public static final RECENT ROOTMENU;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/dominos/nina/speech/SpeechManager$ProductRedirection, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        LANDING = new <init>("LANDING", 0);
        NEW = new <init>("NEW", 1);
        DELIVERY = new <init>("DELIVERY", 2);
        CARRYOUT = new <init>("CARRYOUT", 3);
        EASY = new <init>("EASY", 4);
        MENULIST = new <init>("MENULIST", 5);
        ROOTMENU = new <init>("ROOTMENU", 6);
        RECENT = new <init>("RECENT", 7);
        $VALUES = (new .VALUES[] {
            LANDING, NEW, DELIVERY, CARRYOUT, EASY, MENULIST, ROOTMENU, RECENT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
