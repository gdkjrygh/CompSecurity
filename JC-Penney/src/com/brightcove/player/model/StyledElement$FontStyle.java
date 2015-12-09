// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.model;


public final class _cls9 extends Enum
{

    public static final ITALIC ITALIC;
    public static final ITALIC NORMAL;
    public static final ITALIC UNDEFINED;
    private static final ITALIC a[];

    public static _cls9 valueOf(String s)
    {
        return (_cls9)Enum.valueOf(com/brightcove/player/model/StyledElement$FontStyle, s);
    }

    public static _cls9[] values()
    {
        return (_cls9[])a.clone();
    }

    static 
    {
        UNDEFINED = new <init>("UNDEFINED", 0);
        NORMAL = new <init>("NORMAL", 1);
        ITALIC = new <init>("ITALIC", 2);
        a = (new a[] {
            UNDEFINED, NORMAL, ITALIC
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }
}
