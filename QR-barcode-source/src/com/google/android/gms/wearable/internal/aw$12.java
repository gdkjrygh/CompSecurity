// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            a, aw

class t> extends a
{

    final com.google.android.gms.wearable.eApi.MessageListener avG;
    final aw avT;
    final com.google.android.gms.common.api.plementation.b avV;

    public void a(Status status)
    {
        if (!status.isSuccess())
        {
            synchronized (aw.c(avT))
            {
                aw.c(avT).remove(avG);
            }
        }
        avV.b(status);
        return;
        status;
        hashmap;
        JVM INSTR monitorexit ;
        throw status;
    }

    b(aw aw1, com.google.android.gms.wearable.eApi.MessageListener messagelistener, com.google.android.gms.common.api.plementation.b b)
    {
        avT = aw1;
        avG = messagelistener;
        avV = b;
        super();
    }
}
