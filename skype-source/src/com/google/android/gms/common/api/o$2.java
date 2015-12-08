// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            o, p

final class a
    implements a
{

    final o a;

    public final void onConnected(Bundle bundle)
    {
        o.a(a).lock();
        o.b(a).a(bundle);
        o.a(a).unlock();
        return;
        bundle;
        o.a(a).unlock();
        throw bundle;
    }

    public final void onConnectionSuspended(int i)
    {
        o.a(a).lock();
        o.b(a).a(i);
        o.a(a).unlock();
        return;
        Exception exception;
        exception;
        o.a(a).unlock();
        throw exception;
    }

    (o o1)
    {
        a = o1;
        super();
    }
}
