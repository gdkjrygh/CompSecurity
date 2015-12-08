// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.enums.inappmessage;


public final class SlideFrom extends Enum
{

    public static final SlideFrom BOTTOM;
    public static final SlideFrom TOP;
    private static final SlideFrom a[];

    private SlideFrom(String s, int i)
    {
        super(s, i);
    }

    public static SlideFrom valueOf(String s)
    {
        return (SlideFrom)Enum.valueOf(com/appboy/enums/inappmessage/SlideFrom, s);
    }

    public static SlideFrom[] values()
    {
        return (SlideFrom[])a.clone();
    }

    static 
    {
        TOP = new SlideFrom("TOP", 0);
        BOTTOM = new SlideFrom("BOTTOM", 1);
        a = (new SlideFrom[] {
            TOP, BOTTOM
        });
    }
}
