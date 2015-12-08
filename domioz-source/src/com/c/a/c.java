// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a;

import java.util.concurrent.ConcurrentLinkedQueue;

// Referenced classes of package com.c.a:
//            b

final class c extends ThreadLocal
{

    final b a;

    c(b b)
    {
        a = b;
        super();
    }

    protected final Object initialValue()
    {
        return new ConcurrentLinkedQueue();
    }
}
