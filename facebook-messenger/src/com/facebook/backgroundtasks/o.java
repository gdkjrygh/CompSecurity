// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.backgroundtasks;

import com.facebook.common.executors.a;
import java.util.concurrent.locks.ReentrantLock;

class o
{

    private final a a;
    private final ReentrantLock b = new ReentrantLock();

    o(a a1)
    {
        a = a1;
    }

    void a()
    {
        a.b();
        b.lock();
    }

    void b()
    {
        b.unlock();
    }

    boolean c()
    {
        return b.isHeldByCurrentThread();
    }
}
