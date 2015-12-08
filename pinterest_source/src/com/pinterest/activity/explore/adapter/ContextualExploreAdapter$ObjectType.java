// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.explore.adapter;


public final class  extends Enum
{

    private static final Search $VALUES[];
    public static final Search Board;
    public static final Search Search;
    public static final Search User;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pinterest/activity/explore/adapter/ContextualExploreAdapter$ObjectType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Board = new <init>("Board", 0);
        User = new <init>("User", 1);
        Search = new <init>("Search", 2);
        $VALUES = (new .VALUES[] {
            Board, User, Search
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
