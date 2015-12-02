// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.view.c;


public final class m extends Enum
{

    private static final m $VALUES[];
    public static final m Loading;
    public static final m Normal;
    public static final m PullToRefresh;
    public static final m ReleaseToRefresh;

    private m(String s, int i)
    {
        super(s, i);
    }

    public static m valueOf(String s)
    {
        return (m)Enum.valueOf(com/facebook/reflex/view/c/m, s);
    }

    public static m[] values()
    {
        return (m[])$VALUES.clone();
    }

    static 
    {
        Normal = new m("Normal", 0);
        PullToRefresh = new m("PullToRefresh", 1);
        ReleaseToRefresh = new m("ReleaseToRefresh", 2);
        Loading = new m("Loading", 3);
        $VALUES = (new m[] {
            Normal, PullToRefresh, ReleaseToRefresh, Loading
        });
    }
}
