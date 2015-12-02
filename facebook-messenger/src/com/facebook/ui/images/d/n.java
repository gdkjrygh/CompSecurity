// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.d;


public final class n extends Enum
{

    private static final n $VALUES[];
    public static final n DOWNSCALE;
    public static final n UPSCALE;

    private n(String s, int i)
    {
        super(s, i);
    }

    public static n valueOf(String s)
    {
        return (n)Enum.valueOf(com/facebook/ui/images/d/n, s);
    }

    public static n[] values()
    {
        return (n[])$VALUES.clone();
    }

    static 
    {
        DOWNSCALE = new n("DOWNSCALE", 0);
        UPSCALE = new n("UPSCALE", 1);
        $VALUES = (new n[] {
            DOWNSCALE, UPSCALE
        });
    }
}
