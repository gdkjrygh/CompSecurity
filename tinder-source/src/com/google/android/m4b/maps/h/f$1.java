// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.h;

import com.google.android.m4b.maps.g.a;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.m4b.maps.h:
//            f

final class a
    implements Runnable
{

    private a a;
    private f b;

    public final void run()
    {
        b.b.lock();
        b.b(a);
        b.b.unlock();
        return;
        Exception exception;
        exception;
        b.b.unlock();
        throw exception;
    }

    (f f1, a a1)
    {
        b = f1;
        a = a1;
        super();
    }
}
