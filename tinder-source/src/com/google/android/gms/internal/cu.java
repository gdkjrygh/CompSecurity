// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.util.client.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ck

final class cu
{

    final Object a = new Object();
    final List b = new ArrayList();
    boolean c;
    private final List d = new ArrayList();

    public cu()
    {
        c = false;
    }

    static void a(Runnable runnable)
    {
        a.a.post(runnable);
    }

    public final void a()
    {
label0:
        {
            synchronized (a)
            {
                if (!c)
                {
                    break label0;
                }
            }
            return;
        }
        for (Iterator iterator = d.iterator(); iterator.hasNext(); com.google.android.gms.internal.ck.a((Runnable)iterator.next())) { }
        break MISSING_BLOCK_LABEL_57;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        for (Iterator iterator1 = b.iterator(); iterator1.hasNext(); a((Runnable)iterator1.next())) { }
        d.clear();
        b.clear();
        c = true;
        obj;
        JVM INSTR monitorexit ;
    }
}
