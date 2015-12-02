// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.a;


public final class j extends Enum
{

    private static final j $VALUES[];
    public static final j FILTERING;
    public static final j FINISHED;

    private j(String s, int i)
    {
        super(s, i);
    }

    public static j valueOf(String s)
    {
        return (j)Enum.valueOf(com/facebook/widget/a/j, s);
    }

    public static j[] values()
    {
        return (j[])$VALUES.clone();
    }

    static 
    {
        FILTERING = new j("FILTERING", 0);
        FINISHED = new j("FINISHED", 1);
        $VALUES = (new j[] {
            FILTERING, FINISHED
        });
    }
}
