// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;


public final class name extends Enum
{

    private static final GRID $VALUES[];
    public static final GRID CAROUSEL;
    public static final GRID GRID;
    private final String name;

    public static name valueOf(String s)
    {
        return (name)Enum.valueOf(com/pinterest/api/model/DynamicStory$ContainerType, s);
    }

    public static name[] values()
    {
        return (name[])$VALUES.clone();
    }

    public final String toString()
    {
        return name;
    }

    static 
    {
        CAROUSEL = new <init>("CAROUSEL", 0, "carousel");
        GRID = new <init>("GRID", 1, "grid");
        $VALUES = (new .VALUES[] {
            CAROUSEL, GRID
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        name = s1;
    }
}
