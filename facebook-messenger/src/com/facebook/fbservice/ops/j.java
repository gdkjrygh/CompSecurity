// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.ops;


public final class j extends Enum
{

    private static final j $VALUES[];
    public static final j COMPLETED;
    public static final j INIT;
    public static final j OPERATION_QUEUED;
    public static final j READY_TO_QUEUE;

    private j(String s, int i)
    {
        super(s, i);
    }

    public static j valueOf(String s)
    {
        return (j)Enum.valueOf(com/facebook/fbservice/ops/j, s);
    }

    public static j[] values()
    {
        return (j[])$VALUES.clone();
    }

    static 
    {
        INIT = new j("INIT", 0);
        READY_TO_QUEUE = new j("READY_TO_QUEUE", 1);
        OPERATION_QUEUED = new j("OPERATION_QUEUED", 2);
        COMPLETED = new j("COMPLETED", 3);
        $VALUES = (new j[] {
            INIT, READY_TO_QUEUE, OPERATION_QUEUED, COMPLETED
        });
    }
}
