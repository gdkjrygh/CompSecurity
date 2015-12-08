// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import ape;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook:
//            Session, SessionState

final class a
    implements Runnable
{

    private ape a;
    private b b;

    public final void run()
    {
        a.a(b.b, b.b, b.b);
    }

    ( , ape ape1)
    {
        b = ;
        a = ape1;
        super();
    }

    // Unreferenced inner class com/facebook/Session$3

/* anonymous class */
    final class Session._cls3
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
            Session._cls3._cls1 _lcls1;
            for (Iterator iterator = Session.b(c).iterator(); iterator.hasNext(); Session.a(Session.c(c), _lcls1))
            {
                _lcls1 = new Session._cls3._cls1(this, (ape)iterator.next());
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

            
            {
                c = session;
                a = sessionstate;
                b = exception;
                super();
            }
    }

}
