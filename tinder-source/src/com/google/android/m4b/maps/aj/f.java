// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aj;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public interface f
    extends Future
{

    public abstract void a(Runnable runnable, Executor executor);
}
