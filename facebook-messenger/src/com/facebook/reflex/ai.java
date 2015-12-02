// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex;


public final class ai extends Enum
{

    private static final ai $VALUES[];
    public static final ai Horizontal;
    public static final ai Vertical;

    private ai(String s, int i)
    {
        super(s, i);
    }

    public static ai valueOf(String s)
    {
        return (ai)Enum.valueOf(com/facebook/reflex/ai, s);
    }

    public static ai[] values()
    {
        return (ai[])$VALUES.clone();
    }

    static 
    {
        Horizontal = new ai("Horizontal", 0);
        Vertical = new ai("Vertical", 1);
        $VALUES = (new ai[] {
            Horizontal, Vertical
        });
    }
}
