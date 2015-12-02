// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import com.google.android.exoplayer.upstream.Allocator;

public interface LoadControl
{

    public abstract void a();

    public abstract void a(Object obj);

    public abstract void a(Object obj, int i);

    public abstract boolean a(Object obj, long l, long l1, boolean flag);

    public abstract Allocator b();
}
