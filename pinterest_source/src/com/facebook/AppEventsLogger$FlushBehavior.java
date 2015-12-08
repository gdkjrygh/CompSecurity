// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


public final class  extends Enum
{

    private static final EXPLICIT_ONLY $VALUES[];
    public static final EXPLICIT_ONLY AUTO;
    public static final EXPLICIT_ONLY EXPLICIT_ONLY;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/facebook/AppEventsLogger$FlushBehavior, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        AUTO = new <init>("AUTO", 0);
        EXPLICIT_ONLY = new <init>("EXPLICIT_ONLY", 1);
        $VALUES = (new .VALUES[] {
            AUTO, EXPLICIT_ONLY
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
