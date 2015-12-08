// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.stats;


public final class  extends Enum
{

    public static final FAVORITES COMMENTS;
    private static final FAVORITES ENUM$VALUES[];
    public static final FAVORITES FAVORITES;
    public static final FAVORITES VIEWS;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/googlecode/flickrjandroid/stats/StatsInterface$SORT, s);
    }

    public static [] values()
    {
         a[] = ENUM$VALUES;
        int i = a.length;
         a1[] = new ENUM.VALUES[i];
        System.arraycopy(a, 0, a1, 0, i);
        return a1;
    }

    static 
    {
        VIEWS = new <init>("VIEWS", 0);
        COMMENTS = new <init>("COMMENTS", 1);
        FAVORITES = new <init>("FAVORITES", 2);
        ENUM$VALUES = (new ENUM.VALUES[] {
            VIEWS, COMMENTS, FAVORITES
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
