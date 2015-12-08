// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import rx.internal.util.unsafe.SpscArrayQueue;

// Referenced classes of package rx.internal.util:
//            c, g

final class h extends c
{

    h()
    {
    }

    protected final Object b()
    {
        return new SpscArrayQueue(g.c);
    }
}
