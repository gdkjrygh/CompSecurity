// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.internal:
//            dl, dm

final class a
    implements com.google.android.gms.common.api.
{

    final dl a;

    public final void a(int i)
    {
        dl.b(a).lock();
        dl.c(a).a(i);
        dl.b(a).unlock();
        return;
        Exception exception;
        exception;
        dl.b(a).unlock();
        throw exception;
    }

    public final void a(Bundle bundle)
    {
        dl.b(a).lock();
        dl.c(a).a(bundle);
        dl.b(a).unlock();
        return;
        bundle;
        dl.b(a).unlock();
        throw bundle;
    }

    (dl dl1)
    {
        a = dl1;
        super();
    }
}
