// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.executors;

import java.util.concurrent.atomic.AtomicInteger;

final class o extends ThreadLocal
{

    o()
    {
    }

    protected AtomicInteger a()
    {
        return new AtomicInteger(0);
    }

    protected Object initialValue()
    {
        return a();
    }
}
