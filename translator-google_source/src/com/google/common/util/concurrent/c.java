// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

final class c
{

    final Runnable a;
    final Executor b;
    c c;

    c(Runnable runnable, Executor executor, c c1)
    {
        a = runnable;
        b = executor;
        c = c1;
    }
}
