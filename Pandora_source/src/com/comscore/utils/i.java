// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils;

import java.util.concurrent.ConcurrentLinkedQueue;
import p.aq.b;
import p.aw.a;

public class i extends ConcurrentLinkedQueue
{

    private b a;

    public i(b b1)
    {
        a = b1;
    }

    public boolean a(Runnable runnable)
    {
        return a.s().a(runnable, true);
    }

    public boolean offer(Object obj)
    {
        return a((Runnable)obj);
    }
}
