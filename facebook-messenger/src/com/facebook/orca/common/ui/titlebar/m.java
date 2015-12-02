// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.titlebar;


public final class m extends Enum
{

    private static final m $VALUES[];
    public static final m ANIMATING;
    public static final m CLOSED;
    public static final m OPENED;

    private m(String s, int i)
    {
        super(s, i);
    }

    public static m valueOf(String s)
    {
        return (m)Enum.valueOf(com/facebook/orca/common/ui/titlebar/m, s);
    }

    public static m[] values()
    {
        return (m[])$VALUES.clone();
    }

    static 
    {
        CLOSED = new m("CLOSED", 0);
        OPENED = new m("OPENED", 1);
        ANIMATING = new m("ANIMATING", 2);
        $VALUES = (new m[] {
            CLOSED, OPENED, ANIMATING
        });
    }
}
