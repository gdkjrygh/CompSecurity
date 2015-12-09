// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.u;
import com.google.android.gms.wearable.PutDataRequest;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            at, ax, an, av

final class aw extends at
{

    final PutDataRequest b;
    final av c;

    aw(av av, l l, PutDataRequest putdatarequest)
    {
        c = av;
        b = putdatarequest;
        super(l);
    }

    public final u a(Status status)
    {
        return new ax(status, null);
    }

    protected final void b(h h)
    {
        ((an)h).a(this, b);
    }
}
