// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import ape;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook:
//            Session, SessionState

final class 
    implements Runnable
{

    final SessionState a;
    final Exception b;
    final Session c;

    public final void run()
    {
        List list = Session.b(c);
        list;
        JVM INSTR monitorenter ;
        Runnable runnable;
        for (Iterator iterator = Session.b(c).iterator(); iterator.hasNext(); Session.a(Session.c(c), runnable))
        {
            runnable = new Runnable((ape)iterator.next()) {

                private ape a;
                private Session._cls3 b;

                public final void run()
                {
                    a.a(b.c, b.a, b.b);
                }

            
            {
                b = Session._cls3.this;
                a = ape1;
                super();
            }
            };
        }

        break MISSING_BLOCK_LABEL_69;
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
        list;
        JVM INSTR monitorexit ;
    }

    te(Session session, SessionState sessionstate, Exception exception)
    {
        c = session;
        a = sessionstate;
        b = exception;
        super();
    }
}
