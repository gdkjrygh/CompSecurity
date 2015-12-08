// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.proxy.rpc.enums;


public final class UpdateMode extends Enum
{

    public static final UpdateMode a;
    public static final UpdateMode b;
    public static final UpdateMode c;
    public static final UpdateMode d;
    private static UpdateMode e;
    private static final UpdateMode f[];

    private UpdateMode(String s, int i)
    {
        super(s, i);
    }

    public static UpdateMode valueOf(String s)
    {
        return (UpdateMode)Enum.valueOf(com/ford/syncV4/proxy/rpc/enums/UpdateMode, s);
    }

    public static UpdateMode[] values()
    {
        return (UpdateMode[])f.clone();
    }

    static 
    {
        a = new UpdateMode("COUNTUP", 0);
        b = new UpdateMode("COUNTDOWN", 1);
        c = new UpdateMode("PAUSE", 2);
        e = new UpdateMode("RESUME", 3);
        d = new UpdateMode("CLEAR", 4);
        f = (new UpdateMode[] {
            a, b, c, e, d
        });
    }
}
