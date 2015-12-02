// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import com.b.a.a.a.g;

final class f
    implements Runnable
{

    final g val$savedPolicy;

    f(g g1)
    {
        val$savedPolicy = g1;
        super();
    }

    public void run()
    {
        val$savedPolicy.set();
    }
}
