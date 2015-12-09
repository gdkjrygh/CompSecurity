// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine.b;

import java.util.ArrayDeque;
import java.util.Queue;

// Referenced classes of package com.bumptech.glide.load.engine.b:
//            c

private static class <init>
{

    private final Queue a;

    <init> a()
    {
        <init> <init>1;
        synchronized (a)
        {
            <init>1 = (a)a.poll();
        }
        obj = <init>1;
        if (<init>1 == null)
        {
            obj = new <init>(null);
        }
        return ((<init>) (obj));
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void a(<init> <init>1)
    {
        synchronized (a)
        {
            if (a.size() < 10)
            {
                a.offer(<init>1);
            }
        }
        return;
        <init>1;
        queue;
        JVM INSTR monitorexit ;
        throw <init>1;
    }

    private ()
    {
        a = new ArrayDeque();
    }

    a(a a1)
    {
        this();
    }
}
