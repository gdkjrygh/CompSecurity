// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            a, aw, ao

private static class avW extends a
{

    private final com.google.android.gms.common.api.mplementation.b De;
    private final List avW;

    public void a(ao ao1)
    {
        De.b(new init>(new Status(ao1.statusCode), ao1.avA));
        if (ao1.statusCode != 0)
        {
            for (ao1 = avW.iterator(); ao1.hasNext(); ((FutureTask)ao1.next()).cancel(true)) { }
        }
    }

    n.b(com.google.android.gms.common.api.mplementation.b b, List list)
    {
        De = b;
        avW = list;
    }
}
