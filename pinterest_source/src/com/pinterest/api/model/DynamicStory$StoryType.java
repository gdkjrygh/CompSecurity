// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;


public final class name extends Enum
{

    private static final PIN $VALUES[];
    public static final PIN CAROUSEL;
    public static final PIN GENERIC_FF;
    public static final PIN PIN;
    private final String name;

    public static name valueOf(String s)
    {
        return (name)Enum.valueOf(com/pinterest/api/model/DynamicStory$StoryType, s);
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
        GENERIC_FF = new <init>("GENERIC_FF", 1, "generic_following_feed");
        PIN = new <init>("PIN", 2, "pin");
        $VALUES = (new .VALUES[] {
            CAROUSEL, GENERIC_FF, PIN
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        name = s1;
    }
}
