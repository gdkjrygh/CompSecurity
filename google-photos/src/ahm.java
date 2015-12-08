// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicInteger;

final class ahm
{

    AtomicInteger a;

    ahm()
    {
        a = new AtomicInteger(2);
    }

    public final void a(int i)
    {
        a.set(i);
    }
}
