// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;
import java.io.IOException;

final class nit> extends bpe
{

    private bqu c;
    private bor d;
    private boolean e;
    private bpa f;

    protected final void a(bqr bqr)
    {
        bqr = ((bqr) (f.a));
        bqr;
        JVM INSTR monitorenter ;
        f.c.a = c;
        f.b.a(a, d, e);
        f.c.a = null;
_L1:
        bqr;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        a(((brc) (b(new Status(2100)))));
        f.c.a = null;
          goto _L1
        obj;
        bqr;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        f.c.a = null;
        throw obj;
    }

    (bpa bpa1, bqu bqu, bqu bqu1, bor bor)
    {
        f = bpa1;
        c = bqu1;
        d = bor;
        e = true;
        super(bqu);
    }
}
