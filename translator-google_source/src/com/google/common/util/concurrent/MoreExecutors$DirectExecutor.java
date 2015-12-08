// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

public final class  extends Enum
    implements Executor
{

    public static final INSTANCE INSTANCE;
    private static final INSTANCE a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/common/util/concurrent/MoreExecutors$DirectExecutor, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    public final void execute(Runnable runnable)
    {
        runnable.run();
    }

    static 
    {
        INSTANCE = new <init>("INSTANCE");
        a = (new a[] {
            INSTANCE
        });
    }

    private (String s)
    {
        super(s, 0);
    }
}
