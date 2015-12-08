// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            a, au

class it> extends a
{

    final com.google.android.gms.wearable.pi.NodeListener alY;
    final au amh;
    final com.google.android.gms.common.api.l.au ami;

    public void a(Status status)
    {
        if (!status.isSuccess())
        {
            synchronized (au.d(amh))
            {
                au.d(amh).remove(alY);
            }
        }
        ami.(status);
        return;
        status;
        hashmap;
        JVM INSTR monitorexit ;
        throw status;
    }

    r(au au1, com.google.android.gms.wearable.pi.NodeListener nodelistener, com.google.android.gms.common.api.ner ner)
    {
        amh = au1;
        alY = nodelistener;
        ami = ner;
        super();
    }
}
