// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;


final class ag extends Enum
{

    public static final ag LANDSCAPE;
    public static final ag NONE;
    public static final ag PORTRAIT;
    private static final ag b[];
    private final int a;

    private ag(String s, int i, int j)
    {
        super(s, i);
        a = j;
    }

    public static ag valueOf(String s)
    {
        return (ag)Enum.valueOf(com/mopub/mraid/ag, s);
    }

    public static ag[] values()
    {
        return (ag[])b.clone();
    }

    final int a()
    {
        return a;
    }

    static 
    {
        PORTRAIT = new ag("PORTRAIT", 0, 1);
        LANDSCAPE = new ag("LANDSCAPE", 1, 0);
        NONE = new ag("NONE", 2, -1);
        b = (new ag[] {
            PORTRAIT, LANDSCAPE, NONE
        });
    }
}
