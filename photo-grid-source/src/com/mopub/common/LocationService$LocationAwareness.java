// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common;


public final class  extends Enum
{

    public static final DISABLED DISABLED;
    public static final DISABLED NORMAL;
    public static final DISABLED TRUNCATED;
    private static final DISABLED a[];

    public static  fromMoPubLocationAwareness( )
    {
        if ( == )
        {
            return DISABLED;
        }
        if ( == DISABLED)
        {
            return TRUNCATED;
        } else
        {
            return NORMAL;
        }
    }

    public static NORMAL valueOf(String s)
    {
        return (NORMAL)Enum.valueOf(com/mopub/common/LocationService$LocationAwareness, s);
    }

    public static NORMAL[] values()
    {
        return (NORMAL[])a.clone();
    }

    public final s_3B_.clone getNewLocationAwareness()
    {
        if (this == TRUNCATED)
        {
            return TRUNCATED;
        }
        if (this == DISABLED)
        {
            return DISABLED;
        } else
        {
            return DISABLED;
        }
    }

    static 
    {
        NORMAL = new <init>("NORMAL", 0);
        TRUNCATED = new <init>("TRUNCATED", 1);
        DISABLED = new <init>("DISABLED", 2);
        a = (new a[] {
            NORMAL, TRUNCATED, DISABLED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
