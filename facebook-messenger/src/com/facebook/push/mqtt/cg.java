// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;


final class cg extends Enum
{

    private static final cg $VALUES[];
    public static final cg ACTIVE;
    public static final cg PAUSED;
    public static final cg STOPPED;

    private cg(String s, int i)
    {
        super(s, i);
    }

    public static cg valueOf(String s)
    {
        return (cg)Enum.valueOf(com/facebook/push/mqtt/cg, s);
    }

    public static cg[] values()
    {
        return (cg[])$VALUES.clone();
    }

    static 
    {
        ACTIVE = new cg("ACTIVE", 0);
        PAUSED = new cg("PAUSED", 1);
        STOPPED = new cg("STOPPED", 2);
        $VALUES = (new cg[] {
            ACTIVE, PAUSED, STOPPED
        });
    }
}
