// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.ops;


public final class y extends Enum
{

    private static final y $VALUES[];
    public static final y COMPLETED;
    public static final y INIT;
    public static final y OPERATION_QUEUED;
    public static final y READY_TO_QUEUE;

    private y(String s, int i)
    {
        super(s, i);
    }

    public static y valueOf(String s)
    {
        return (y)Enum.valueOf(com/facebook/fbservice/ops/y, s);
    }

    public static y[] values()
    {
        return (y[])$VALUES.clone();
    }

    static 
    {
        INIT = new y("INIT", 0);
        READY_TO_QUEUE = new y("READY_TO_QUEUE", 1);
        OPERATION_QUEUED = new y("OPERATION_QUEUED", 2);
        COMPLETED = new y("COMPLETED", 3);
        $VALUES = (new y[] {
            INIT, READY_TO_QUEUE, OPERATION_QUEUED, COMPLETED
        });
    }
}
