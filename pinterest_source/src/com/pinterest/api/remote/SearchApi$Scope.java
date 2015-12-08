// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;


public final class  extends Enum
{

    public static final i a;
    public static final i b;
    public static final i c;
    public static final i d;
    public static final i e;
    public static final i f;
    public static final i g;
    public static final i h;
    public static final i i;
    private static final i j[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pinterest/api/remote/SearchApi$Scope, s);
    }

    public static [] values()
    {
        return ([])j.clone();
    }

    static 
    {
        a = new <init>("ALL", 0);
        b = new <init>("TYPEAHEAD", 1);
        c = new <init>("TYPEAHEAD_MY_BOARD", 2);
        d = new <init>("RECENT_QUERIES", 3);
        e = new <init>("RECENT_MY_QUERIES", 4);
        f = new <init>("PEOPLE_PICKER", 5);
        g = new <init>("PLACES", 6);
        h = new <init>("INVITE_FRIENDS", 7);
        i = new <init>("BOARD_COLLABORATORS", 8);
        j = (new j[] {
            a, b, c, d, e, f, g, h, i
        });
    }

    private (String s, int k)
    {
        super(s, k);
    }
}
