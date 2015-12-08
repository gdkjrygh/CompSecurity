// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicInteger;

final class bwx
    implements blp
{

    private bww a;

    bwx(bww bww1)
    {
        a = bww1;
        super();
    }

    public final int a()
    {
        return bww.a(a).E.getAndIncrement();
    }
}
