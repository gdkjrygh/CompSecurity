// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicLong;

final class npf
    implements Runnable
{

    private npe a;

    npf(npe npe1)
    {
        a = npe1;
        super();
    }

    public final void run()
    {
        a.a.a(a.d.get(), a.c);
        a.b = false;
    }
}
