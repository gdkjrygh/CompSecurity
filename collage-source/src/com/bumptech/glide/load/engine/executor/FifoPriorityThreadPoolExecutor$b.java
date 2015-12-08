// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine.executor;

import android.util.Log;

// Referenced classes of package com.bumptech.glide.load.engine.executor:
//            FifoPriorityThreadPoolExecutor

public static class <init> extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/bumptech/glide/load/engine/executor/FifoPriorityThreadPoolExecutor$b, s);
    }

    public static <init>[] values()
    {
        return (<init>[])d.clone();
    }

    protected void a(Throwable throwable)
    {
    }

    static 
    {
        a = new <init>("IGNORE", 0);
        b = new FifoPriorityThreadPoolExecutor.b("LOG", 1) {

            protected void a(Throwable throwable)
            {
                if (Log.isLoggable("PriorityExecutor", 6))
                {
                    Log.e("PriorityExecutor", "Request threw uncaught throwable", throwable);
                }
            }

        };
        c = new FifoPriorityThreadPoolExecutor.b("THROW", 2) {

            protected void a(Throwable throwable)
            {
                a(throwable);
                throw new RuntimeException(throwable);
            }

        };
        d = (new d[] {
            a, b, c
        });
    }

    private _cls2(String s, int i)
    {
        super(s, i);
    }

    _cls2(String s, int i, _cls2 _pcls2)
    {
        this(s, i);
    }
}
