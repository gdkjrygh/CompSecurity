// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.model;


public final class  extends Enum
{

    public static final NOOVERLINE LINETHROUGH;
    public static final NOOVERLINE NOLINETHROUGH;
    public static final NOOVERLINE NONE;
    public static final NOOVERLINE NOOVERLINE;
    public static final NOOVERLINE NOUNDERLINE;
    public static final NOOVERLINE OVERLINE;
    public static final NOOVERLINE UNDERLINE;
    private static final NOOVERLINE a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/brightcove/player/model/StyledElement$TextDecoration, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        UNDERLINE = new <init>("UNDERLINE", 1);
        NOUNDERLINE = new <init>("NOUNDERLINE", 2);
        LINETHROUGH = new <init>("LINETHROUGH", 3);
        NOLINETHROUGH = new <init>("NOLINETHROUGH", 4);
        OVERLINE = new <init>("OVERLINE", 5);
        NOOVERLINE = new <init>("NOOVERLINE", 6);
        a = (new a[] {
            NONE, UNDERLINE, NOUNDERLINE, LINETHROUGH, NOLINETHROUGH, OVERLINE, NOOVERLINE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
