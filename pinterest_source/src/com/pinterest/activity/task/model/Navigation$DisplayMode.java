// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.model;


public final class  extends Enum
{

    private static final EMBED $VALUES[];
    public static final EMBED DEFAULT;
    public static final EMBED EDUCATION;
    public static final EMBED EMBED;
    public static final EMBED MODAL;
    public static final EMBED OVERLAY;
    public static final EMBED SYSTEM;
    private static EMBED values[];

    public static  from(int i)
    {
        if (values == null)
        {
            values = values();
        }
        if (i < 0 || i >= values.length)
        {
            return DEFAULT;
        } else
        {
            return values[i];
        }
    }

    public static values valueOf(String s)
    {
        return (values)Enum.valueOf(com/pinterest/activity/task/model/Navigation$DisplayMode, s);
    }

    public static values[] values()
    {
        return (values[])$VALUES.clone();
    }

    static 
    {
        DEFAULT = new <init>("DEFAULT", 0);
        MODAL = new <init>("MODAL", 1);
        OVERLAY = new <init>("OVERLAY", 2);
        SYSTEM = new <init>("SYSTEM", 3);
        EDUCATION = new <init>("EDUCATION", 4);
        EMBED = new <init>("EMBED", 5);
        $VALUES = (new .VALUES[] {
            DEFAULT, MODAL, OVERLAY, SYSTEM, EDUCATION, EMBED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
