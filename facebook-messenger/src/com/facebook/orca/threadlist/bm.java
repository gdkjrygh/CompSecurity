// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import com.facebook.fbservice.c.b;
import com.facebook.orca.threads.ThreadsCollection;

public class bm
{

    public final ThreadsCollection a;
    public final long b;
    public final long c;
    public final b d;

    public bm(ThreadsCollection threadscollection, long l, long l1, b b1)
    {
        a = threadscollection;
        b = l;
        c = l1;
        d = b1;
    }

    public boolean a()
    {
        return a.d();
    }
}
