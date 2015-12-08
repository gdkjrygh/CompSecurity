// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.util.Log;
import android.util.LongSparseArray;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class bkj
    implements aje
{

    private final ahq a;
    private final Uri b;
    private final cma c;
    private final bkb d;
    private final bki e;
    private bke f;

    bkj(bke bke1, ahq ahq1, Uri uri, cma cma1, bkb bkb1, bki bki1)
    {
        f = bke1;
        super();
        a = ahq1;
        b = uri;
        c = cma1;
        d = bkb1;
        e = bki1;
    }

    private void b()
    {
        a.a();
        bke.e(f).g.a(aiw.c);
        bke.e(f).a(null);
    }

    public final void a()
    {
        Object obj = bke.c(f);
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        long l;
        b();
        l = d.a;
        obj1 = c.b;
        cmj cmj1 = c.c;
        obj1.c = l;
        if (!bke.d(f))
        {
            break MISSING_BLOCK_LABEL_158;
        }
        Log.e(bke.a(), "Cancel received while running detection graph");
        obj1 = cmj1.a.values().iterator();
_L2:
        LongSparseArray longsparsearray;
        int i;
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_138;
        }
        longsparsearray = (LongSparseArray)((Iterator) (obj1)).next();
        i = longsparsearray.size() - 1;
_L4:
        if (i < 0) goto _L2; else goto _L1
_L1:
        if (longsparsearray.keyAt(i) < l) goto _L2; else goto _L3
_L3:
        longsparsearray.removeAt(i);
        i--;
          goto _L4
        e.b(b, c);
_L6:
        obj;
        JVM INSTR monitorexit ;
        return;
        obj1.b = l;
        e.a(b, c);
        if (true) goto _L6; else goto _L5
_L5:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(Exception exception)
    {
        Log.e(bke.a(), "Error while running detection graph", exception);
        synchronized (bke.c(f))
        {
            b();
        }
        e.a(b, exception);
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
