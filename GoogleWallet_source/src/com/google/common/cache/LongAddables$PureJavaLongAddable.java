// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.google.common.cache:
//            LongAddable, LongAddables

static final class <init> extends AtomicLong
    implements LongAddable
{

    public final void add(long l)
    {
        getAndAdd(l);
    }

    public final void increment()
    {
        getAndIncrement();
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
