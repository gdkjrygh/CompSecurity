// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.stickers;


final class ag extends Enum
{

    private static final ag $VALUES[];
    public static final ag AVAILABLE;
    public static final ag FEATURED;
    public static final ag OWNED;

    private ag(String s, int i)
    {
        super(s, i);
    }

    public static ag valueOf(String s)
    {
        return (ag)Enum.valueOf(com/facebook/orca/stickers/ag, s);
    }

    public static ag[] values()
    {
        return (ag[])$VALUES.clone();
    }

    static 
    {
        FEATURED = new ag("FEATURED", 0);
        AVAILABLE = new ag("AVAILABLE", 1);
        OWNED = new ag("OWNED", 2);
        $VALUES = (new ag[] {
            FEATURED, AVAILABLE, OWNED
        });
    }
}
