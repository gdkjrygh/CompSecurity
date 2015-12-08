// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics.framework;

import Im;
import com.snapchat.android.SnapchatApplication;

public class MemoryState
{

    long a;
    long b;
    long c;
    long d;
    long e;
    boolean f;

    public MemoryState()
    {
        Runtime runtime = Runtime.getRuntime();
        Im.a();
        this(runtime);
    }

    private MemoryState(Runtime runtime)
    {
        f = false;
        a = runtime.freeMemory();
        c = runtime.totalMemory();
        b = c - a;
        d = runtime.maxMemory();
        e = Im.d(SnapchatApplication.get());
    }
}
