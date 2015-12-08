// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            a, au, am

private static class amk extends a
{

    private final List amk;
    private final com.google.android.gms.common.api.l.au.a.amk yR;

    public void a(am am1)
    {
        yR.(new init>(new Status(am1.statusCode), am1.alO));
        if (am1.statusCode != 0)
        {
            for (am1 = amk.iterator(); am1.hasNext(); ((FutureTask)am1.next()).cancel(true)) { }
        }
    }

    (com.google.android.gms.common.api.a a1, List list)
    {
        yR = a1;
        amk = list;
    }
}
