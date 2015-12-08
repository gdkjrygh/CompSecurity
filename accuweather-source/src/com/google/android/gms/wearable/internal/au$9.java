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

    final com.google.android.gms.wearable.pi.NodeListener alV;
    final au ame;
    final com.google.android.gms.common.api.l.au amf;

    public void a(Status status)
    {
        if (!status.isSuccess())
        {
            synchronized (au.d(ame))
            {
                au.d(ame).remove(alV);
            }
        }
        amf.(status);
        return;
        status;
        hashmap;
        JVM INSTR monitorexit ;
        throw status;
    }

    r(au au1, com.google.android.gms.wearable.pi.NodeListener nodelistener, com.google.android.gms.common.api.ner ner)
    {
        ame = au1;
        alV = nodelistener;
        amf = ner;
        super();
    }
}
