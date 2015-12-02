// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nodex.startup.warmup;


public final class I extends Enum
{

    private static final WaitForInit $VALUES[];
    public static final WaitForInit Ping;
    public static final WaitForInit WaitForInit;
    public static final WaitForInit WaitForInjector;

    public static I valueOf(String s)
    {
        return (I)Enum.valueOf(com/facebook/nodex/startup/warmup/NodexWarmupContentProvider$Action, s);
    }

    public static I[] values()
    {
        return (I[])$VALUES.clone();
    }

    static 
    {
        Ping = new <init>("Ping", 0);
        WaitForInjector = new <init>("WaitForInjector", 1);
        WaitForInit = new <init>("WaitForInit", 2);
        $VALUES = (new .VALUES[] {
            Ping, WaitForInjector, WaitForInit
        });
    }

    private I(String s, int i)
    {
        super(s, i);
    }
}
