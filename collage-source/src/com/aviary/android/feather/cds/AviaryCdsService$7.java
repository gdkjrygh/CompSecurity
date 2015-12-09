// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;

import com.aviary.android.feather.common.threading.a;
import com.aviary.android.feather.common.threading.b;
import com.aviary.android.feather.common.utils.d;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.aviary.android.feather.cds:
//            AviaryCdsService

class e
    implements b
{

    final List a;
    final String b;
    final String c;
    final String d;
    final AtomicInteger e;
    final AviaryCdsService f;

    public void a(a a1)
    {
        if (!a1.a()) goto _L2; else goto _L1
_L1:
        a.add(new <init>(4, a1.b()));
_L3:
        synchronized (e)
        {
            int i = e.decrementAndGet();
            com.aviary.android.feather.cds.AviaryCdsService.a.et("completed. remaining tasks: %d", new Object[] {
                Integer.valueOf(i)
            });
            e.notify();
        }
        return;
_L2:
        a1 = (InputStream)a1.get();
        com.aviary.android.feather.cds.a.a a2;
        a2 = new com.aviary.android.feather.cds.a.a();
        if (a2.a(a1) == 0)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        a.add(new <init>(3, (new StringBuilder()).append(b).append(": ").append(a2.o()).toString()));
_L4:
        com.aviary.android.feather.common.utils.d.a(a1);
          goto _L3
        com.aviary.android.feather.cds.AviaryCdsService.a(f, f.getBaseContext(), a2, 10000, 0, c);
        com.aviary.android.feather.cds.AviaryCdsService.a.Context("restored: %s", new Object[] {
            b
        });
          goto _L4
        Object obj;
        obj;
        com.aviary.android.feather.cds.AviaryCdsService.a.Context((new StringBuilder()).append("onAddNewJsonContent failed on '%s'").append(d).toString());
        ((Throwable) (obj)).printStackTrace();
        a.add(new <init>(5, ((Throwable) (obj))));
        com.aviary.android.feather.common.utils.d.a(a1);
          goto _L3
        obj;
        com.aviary.android.feather.common.utils.d.a(a1);
        throw obj;
        exception;
        a1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (AviaryCdsService aviarycdsservice, List list, String s, String s1, String s2, AtomicInteger atomicinteger)
    {
        f = aviarycdsservice;
        a = list;
        b = s;
        c = s1;
        d = s2;
        e = atomicinteger;
        super();
    }
}
