// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.animatablelistview;


final class g extends Enum
{

    private static final g $VALUES[];
    public static final g STEADY_STATE;
    public static final g WAITING_FOR_ANIMATION_TO_FINISH;

    private g(String s, int i)
    {
        super(s, i);
    }

    public static g valueOf(String s)
    {
        return (g)Enum.valueOf(com/facebook/widget/animatablelistview/g, s);
    }

    public static g[] values()
    {
        return (g[])$VALUES.clone();
    }

    static 
    {
        STEADY_STATE = new g("STEADY_STATE", 0);
        WAITING_FOR_ANIMATION_TO_FINISH = new g("WAITING_FOR_ANIMATION_TO_FINISH", 1);
        $VALUES = (new g[] {
            STEADY_STATE, WAITING_FOR_ANIMATION_TO_FINISH
        });
    }
}
