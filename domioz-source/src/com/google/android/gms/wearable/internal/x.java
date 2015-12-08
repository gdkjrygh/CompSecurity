// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.u;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            at, y, an, k, 
//            aj, w

final class x extends at
{

    final w b;

    x(w w, l l)
    {
        b = w;
        super(l);
    }

    protected final u a(Status status)
    {
        return new y(status, new ArrayList());
    }

    protected final void b(h h)
    {
        ((k)((an)h).l()).d(new aj(this));
    }
}
