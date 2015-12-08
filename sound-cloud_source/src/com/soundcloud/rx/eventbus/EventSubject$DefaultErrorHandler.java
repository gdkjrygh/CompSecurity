// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.rx.eventbus;

import rx.b.b;

// Referenced classes of package com.soundcloud.rx.eventbus:
//            EventSubject

private static final class <init>
    implements b
{

    public final volatile void call(Object obj)
    {
        call((Throwable)obj);
    }

    public final void call(Throwable throwable)
    {
        throwable.printStackTrace();
    }

    private A()
    {
    }

    A(A a)
    {
        this();
    }
}
