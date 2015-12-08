// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.proxy.rpc.enums;


public final class LayoutMode extends Enum
{

    public static final LayoutMode a;
    private static LayoutMode b;
    private static LayoutMode c;
    private static LayoutMode d;
    private static LayoutMode e;
    private static final LayoutMode f[];

    private LayoutMode(String s, int i)
    {
        super(s, i);
    }

    public static LayoutMode valueOf(String s)
    {
        return (LayoutMode)Enum.valueOf(com/ford/syncV4/proxy/rpc/enums/LayoutMode, s);
    }

    public static LayoutMode[] values()
    {
        return (LayoutMode[])f.clone();
    }

    static 
    {
        b = new LayoutMode("ICON_ONLY", 0);
        c = new LayoutMode("ICON_WITH_SEARCH", 1);
        a = new LayoutMode("LIST_ONLY", 2);
        d = new LayoutMode("LIST_WITH_SEARCH", 3);
        e = new LayoutMode("KEYBOARD", 4);
        f = (new LayoutMode[] {
            b, c, a, d, e
        });
    }
}
