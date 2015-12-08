// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

public final class bpa
    implements boo
{

    final Object a = new Object();
    final bpz b = new bpz() {

    };
    final bpc c = new bpc(this);

    public bpa()
    {
        bpz bpz1 = b;
        bpz1.d = c;
        if (((bpl) (bpz1)).d == null)
        {
            bpz1.a();
        }
    }

    public final bra a(bqu bqu1)
    {
        return bqu1.b(new bpe(bqu1, bqu1) {

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

            
            {
                d = bpa.this;
                c = bqu2;
                super(bqu1);
            }
        });
    }

    public final bra a(bqu bqu1, bor bor)
    {
        return bqu1.b(new bpe(bqu1, bqu1, bor) {

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

            
            {
                f = bpa.this;
                c = bqu2;
                d = bor;
                e = true;
                super(bqu1);
            }
        });
    }

    public final String a()
    {
        return ((bpl) (b)).c;
    }

    public final void a(CastDevice castdevice, String s)
    {
        b.a(s);
    }
}
