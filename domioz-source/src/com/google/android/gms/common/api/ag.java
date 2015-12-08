// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            aa

final class ag
    implements Runnable
{

    final aa a;

    ag(aa aa1)
    {
        a = aa1;
        super();
    }

    public final void run()
    {
        aa.a(a).lock();
        aa.u(a);
        aa.a(a).unlock();
        return;
        Exception exception;
        exception;
        aa.a(a).unlock();
        throw exception;
    }
}
