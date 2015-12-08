// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            az, ap, av

static final class ayf extends ayf
{

    private final List ayf;

    public void a(ap ap1)
    {
        A(new init>(av.gN(ap1.statusCode), ap1.axM));
        if (ap1.statusCode != 0)
        {
            for (ap1 = ayf.iterator(); ap1.hasNext(); ((FutureTask)ap1.next()).cancel(true)) { }
        }
    }

    n.b(com.google.android.gms.common.api.mplementation.b b, List list)
    {
        super(b);
        ayf = list;
    }
}
