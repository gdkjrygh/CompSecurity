// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.actionbar;


public final class  extends Enum
{

    private static final BOARDS $VALUES[];
    public static final BOARDS BOARDS;
    public static final BOARDS COMMENTS;
    public static final BOARDS DEFAULT;
    public static final BOARDS FOLLOWERS;
    public static final BOARDS FOLLOWING;
    public static final BOARDS LIKES;
    public static final BOARDS PINS;
    public static final BOARDS REPINS;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pinterest/ui/actionbar/MetadataBar$Mode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        DEFAULT = new <init>("DEFAULT", 0);
        PINS = new <init>("PINS", 1);
        REPINS = new <init>("REPINS", 2);
        COMMENTS = new <init>("COMMENTS", 3);
        LIKES = new <init>("LIKES", 4);
        FOLLOWERS = new <init>("FOLLOWERS", 5);
        FOLLOWING = new <init>("FOLLOWING", 6);
        BOARDS = new <init>("BOARDS", 7);
        $VALUES = (new .VALUES[] {
            DEFAULT, PINS, REPINS, COMMENTS, LIKES, FOLLOWERS, FOLLOWING, BOARDS
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
