// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;

import android.content.Context;
import android.net.Uri;
import com.aviary.android.feather.common.threading.a;
import com.aviary.android.feather.common.threading.b;
import com.aviary.android.feather.common.utils.d;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.aviary.android.feather.cds:
//            AviaryCdsService, h

class d
    implements b
{

    final AtomicBoolean a;
    final a b;
    final Uri c;
    final AtomicInteger d;
    final AviaryCdsService e;

    public void a(a a1)
    {
        if (!a1.a()) goto _L2; else goto _L1
_L1:
        com.aviary.android.feather.cds.AviaryCdsService.a.("error: %s", new Object[] {
            a1.b()
        });
        a.set(true);
_L5:
        synchronized (d)
        {
            int i = d.decrementAndGet();
            com.aviary.android.feather.cds.AviaryCdsService.a.et("completed. remaining tasks: %d", new Object[] {
                Integer.valueOf(i)
            });
            d.notify();
        }
        return;
_L2:
        obj = (InputStream)a1.get();
        a1 = ((a) (obj));
        File file = new File((new StringBuilder()).append(e.getBaseContext().getFilesDir()).append("/").append(h.c(b.b())).toString());
        a1 = ((a) (obj));
        int j = com.aviary.android.feather.cds.AviaryCdsService.a(e, b.b().b(), b.b(), file, c.getLastPathSegment(), ((InputStream) (obj)));
        if (j <= 0) goto _L4; else goto _L3
_L3:
        a1 = ((a) (obj));
        h.g(e.getBaseContext(), b.b());
        a1 = ((a) (obj));
        com.aviary.android.feather.cds.h.d(e.getBaseContext(), b.b());
_L6:
        com.aviary.android.feather.common.utils.d.a(((java.io.Closeable) (obj)));
          goto _L5
_L4:
        a1 = ((a) (obj));
        com.aviary.android.feather.cds.AviaryCdsService.a.Context("onUpdatedPackIcon result: %d", new Object[] {
            Integer.valueOf(j)
        });
        a1 = ((a) (obj));
        a.set(true);
          goto _L6
        Throwable throwable;
        throwable;
_L9:
        a1 = ((a) (obj));
        com.aviary.android.feather.cds.AviaryCdsService.a.Context("failed to update icon");
        a1 = ((a) (obj));
        throwable.printStackTrace();
        a1 = ((a) (obj));
        a.set(true);
        com.aviary.android.feather.common.utils.d.a(((java.io.Closeable) (obj)));
          goto _L5
        obj;
        a1 = null;
_L8:
        com.aviary.android.feather.common.utils.d.a(a1);
        throw obj;
        Exception exception;
        exception;
        a1;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        if (true) goto _L8; else goto _L7
_L7:
        throwable;
        exception = null;
          goto _L9
    }

    (AviaryCdsService aviarycdsservice, AtomicBoolean atomicboolean,  , Uri uri, AtomicInteger atomicinteger)
    {
        e = aviarycdsservice;
        a = atomicboolean;
        b = ;
        c = uri;
        d = atomicinteger;
        super();
    }
}
