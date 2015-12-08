// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common;


public final class CreativeOrientation extends Enum
{

    public static final CreativeOrientation LANDSCAPE;
    public static final CreativeOrientation PORTRAIT;
    public static final CreativeOrientation UNDEFINED;
    private static final CreativeOrientation a[];

    private CreativeOrientation(String s, int i)
    {
        super(s, i);
    }

    public static CreativeOrientation fromHeader(String s)
    {
        if ("l".equalsIgnoreCase(s))
        {
            return LANDSCAPE;
        }
        if ("p".equalsIgnoreCase(s))
        {
            return PORTRAIT;
        } else
        {
            return UNDEFINED;
        }
    }

    public static CreativeOrientation valueOf(String s)
    {
        return (CreativeOrientation)Enum.valueOf(com/mopub/common/CreativeOrientation, s);
    }

    public static CreativeOrientation[] values()
    {
        return (CreativeOrientation[])a.clone();
    }

    static 
    {
        PORTRAIT = new CreativeOrientation("PORTRAIT", 0);
        LANDSCAPE = new CreativeOrientation("LANDSCAPE", 1);
        UNDEFINED = new CreativeOrientation("UNDEFINED", 2);
        a = (new CreativeOrientation[] {
            PORTRAIT, LANDSCAPE, UNDEFINED
        });
    }
}
