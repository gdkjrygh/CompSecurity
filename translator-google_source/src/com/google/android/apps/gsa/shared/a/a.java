// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.a;

import com.google.common.base.p;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class a
    implements Iterable
{

    public final int a = 200;
    public final Queue b = new ConcurrentLinkedQueue();

    public a()
    {
        p.a(true);
    }

    public final Iterator iterator()
    {
        return b.iterator();
    }
}
