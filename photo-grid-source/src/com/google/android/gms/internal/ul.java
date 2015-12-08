// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.k;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.internal:
//            uj, uu

final class ul
    implements k
{

    final uj a;

    ul(uj uj1)
    {
        a = uj1;
        super();
    }

    public final void onConnected(Bundle bundle)
    {
        uj.b(a).lock();
        uj.c(a).a(bundle);
        uj.b(a).unlock();
        return;
        bundle;
        uj.b(a).unlock();
        throw bundle;
    }

    public final void onConnectionSuspended(int i)
    {
        uj.b(a).lock();
        uj.c(a).a(i);
        uj.b(a).unlock();
        return;
        Exception exception;
        exception;
        uj.b(a).unlock();
        throw exception;
    }
}
