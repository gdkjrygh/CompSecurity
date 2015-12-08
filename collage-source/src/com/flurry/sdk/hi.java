// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.concurrent.ThreadFactory;

public class hi
    implements ThreadFactory
{

    private final ThreadGroup a;
    private final int b;

    public hi(String s, int i)
    {
        a = new ThreadGroup(s);
        b = i;
    }

    public Thread newThread(Runnable runnable)
    {
        runnable = new Thread(a, runnable);
        runnable.setName((new StringBuilder()).append(a.getName()).append(":").append(runnable.getId()).toString());
        runnable.setPriority(b);
        return runnable;
    }
}
