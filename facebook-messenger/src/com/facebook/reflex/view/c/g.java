// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.view.c;


final class g extends Enum
{

    private static final g $VALUES[];
    public static final g AFTER;
    public static final g BEFORE;

    private g(String s, int i)
    {
        super(s, i);
    }

    public static g valueOf(String s)
    {
        return (g)Enum.valueOf(com/facebook/reflex/view/c/g, s);
    }

    public static g[] values()
    {
        return (g[])$VALUES.clone();
    }

    static 
    {
        BEFORE = new g("BEFORE", 0);
        AFTER = new g("AFTER", 1);
        $VALUES = (new g[] {
            BEFORE, AFTER
        });
    }
}
