// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            n, o

class a
    implements a
{

    final n a;

    public void onConnected(Bundle bundle)
    {
        n.a(a).lock();
        n.b(a).a(bundle);
        n.a(a).unlock();
        return;
        bundle;
        n.a(a).unlock();
        throw bundle;
    }

    public void onConnectionSuspended(int i)
    {
        n.a(a).lock();
        n.b(a).a(i);
        n.a(a).unlock();
        return;
        Exception exception;
        exception;
        n.a(a).unlock();
        throw exception;
    }

    (n n1)
    {
        a = n1;
        super();
    }
}
