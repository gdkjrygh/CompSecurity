// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.Callable;

final class pw
    implements Callable
{

    final Runnable a;

    pw(Runnable runnable)
    {
        a = runnable;
        super();
    }

    public final Object call()
    {
        a.run();
        return null;
    }
}
