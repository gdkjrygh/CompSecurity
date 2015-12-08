// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicInteger;

public final class gcp
{

    public final AtomicInteger a = new AtomicInteger(32);
    public final Runnable b;

    public gcp(Runnable runnable)
    {
        ctz.a(true, "Countdown must be initialized with positive value.");
        b = runnable;
    }
}
