// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;
import java.io.IOException;

final class nit> extends bpe
{

    private bqu c;
    private bpa d;

    protected final void a(bqr bqr)
    {
        bqr = ((bqr) (d.a));
        bqr;
        JVM INSTR monitorenter ;
        d.c.a = c;
        d.b.a(a);
        d.c.a = null;
_L1:
        bqr;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        a(((brc) (b(new Status(2100)))));
        d.c.a = null;
          goto _L1
        obj;
        bqr;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        d.c.a = null;
        throw obj;
    }

    (bpa bpa1, bqu bqu, bqu bqu1)
    {
        d = bpa1;
        c = bqu1;
        super(bqu);
    }
}
