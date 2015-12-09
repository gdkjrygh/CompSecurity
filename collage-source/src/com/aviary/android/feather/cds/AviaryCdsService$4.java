// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;

import com.aviary.android.feather.common.threading.a;
import com.aviary.android.feather.common.threading.b;
import com.aviary.android.feather.common.utils.d;
import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.aviary.android.feather.cds:
//            AviaryCdsService

class e
    implements b
{

    final AtomicBoolean a;
    final String b;
    final String c;
    final HashMap d;
    final AtomicInteger e;
    final AviaryCdsService f;

    public void a(a a1)
    {
        if (!a1.a()) goto _L2; else goto _L1
_L1:
        com.aviary.android.feather.cds.AviaryCdsService.a.("future hasException: %s", new Object[] {
            a1.b()
        });
        a.set(true);
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
        com.aviary.android.feather.cds.AviaryCdsService.a(f, f.getBaseContext(), a1, b, c);
        d.put(b, Boolean.valueOf(true));
        com.aviary.android.feather.common.utils.d.a(a1);
          goto _L3
        Object obj;
        obj;
        com.aviary.android.feather.cds.AviaryCdsService.a.Context("onAddNewMessageContent failed: %s", new Object[] {
            ((Throwable) (obj)).getMessage()
        });
        a.set(true);
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

    (AviaryCdsService aviarycdsservice, AtomicBoolean atomicboolean, String s, String s1, HashMap hashmap, AtomicInteger atomicinteger)
    {
        f = aviarycdsservice;
        a = atomicboolean;
        b = s;
        c = s1;
        d = hashmap;
        e = atomicinteger;
        super();
    }
}
