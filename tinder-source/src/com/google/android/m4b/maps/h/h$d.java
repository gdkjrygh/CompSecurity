// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.h;

import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.m4b.maps.h:
//            h, i

public abstract class a
    implements a
{

    private h a;

    public final void a(int j)
    {
        a.a.lock();
        a.r.b(j);
        a.a.unlock();
        return;
        Exception exception;
        exception;
        a.a.unlock();
        throw exception;
    }

    public (h h1)
    {
        a = h1;
        super();
    }
}
