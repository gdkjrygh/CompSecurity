// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.proxy.rpc.enums;


public final class InteractionMode extends Enum
{

    public static final InteractionMode a;
    public static final InteractionMode b;
    private static InteractionMode c;
    private static final InteractionMode d[];

    private InteractionMode(String s, int i)
    {
        super(s, i);
    }

    public static InteractionMode valueOf(String s)
    {
        return (InteractionMode)Enum.valueOf(com/ford/syncV4/proxy/rpc/enums/InteractionMode, s);
    }

    public static InteractionMode[] values()
    {
        return (InteractionMode[])d.clone();
    }

    static 
    {
        a = new InteractionMode("MANUAL_ONLY", 0);
        c = new InteractionMode("VR_ONLY", 1);
        b = new InteractionMode("BOTH", 2);
        d = (new InteractionMode[] {
            a, c, b
        });
    }
}
