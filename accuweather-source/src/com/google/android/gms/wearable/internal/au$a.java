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

private static class amh extends a
{

    private final List amh;
    private final com.google.android.gms.common.api.l.au.a.amh yO;

    public void a(am am1)
    {
        yO.(new init>(new Status(am1.statusCode), am1.alL));
        if (am1.statusCode != 0)
        {
            for (am1 = amh.iterator(); am1.hasNext(); ((FutureTask)am1.next()).cancel(true)) { }
        }
    }

    (com.google.android.gms.common.api.a a1, List list)
    {
        yO = a1;
        amh = list;
    }
}
