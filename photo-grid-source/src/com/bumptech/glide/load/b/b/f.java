// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b.b;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class f
{

    final Lock a;
    int b;

    private f()
    {
        a = new ReentrantLock();
    }

    f(byte byte0)
    {
        this();
    }
}
