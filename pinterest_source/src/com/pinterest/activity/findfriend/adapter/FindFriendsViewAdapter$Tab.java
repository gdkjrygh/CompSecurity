// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend.adapter;


public final class  extends Enum
{

    private static final MORE $VALUES[];
    public static final MORE CONTACT;
    public static final MORE FACEBOOK;
    public static final MORE MORE;
    public static final MORE TWITTER;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pinterest/activity/findfriend/adapter/FindFriendsViewAdapter$Tab, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        CONTACT = new <init>("CONTACT", 0);
        FACEBOOK = new <init>("FACEBOOK", 1);
        TWITTER = new <init>("TWITTER", 2);
        MORE = new <init>("MORE", 3);
        $VALUES = (new .VALUES[] {
            CONTACT, FACEBOOK, TWITTER, MORE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
