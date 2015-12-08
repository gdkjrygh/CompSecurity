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

    final com.google.android.gms.wearable.pi.DataListener alF;
    final au amh;
    final com.google.android.gms.common.api.l.au ami;

    public void a(Status status)
    {
        if (!status.isSuccess())
        {
            synchronized (au.b(amh))
            {
                au.b(amh).remove(alF);
            }
        }
        ami.(status);
        return;
        status;
        hashmap;
        JVM INSTR monitorexit ;
        throw status;
    }

    r(au au1, com.google.android.gms.wearable.pi.DataListener datalistener, com.google.android.gms.common.api.ner ner)
    {
        amh = au1;
        alF = datalistener;
        ami = ner;
        super();
    }
}
