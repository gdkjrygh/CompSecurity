// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook:
//            Session, SessionState

class 
    implements Runnable
{

    final Session this$0;
    private final Exception val$exception;
    private final SessionState val$newState;

    public void run()
    {
        List list = Session.access$12(Session.this);
        list;
        JVM INSTR monitorenter ;
        Iterator iterator = Session.access$12(Session.this).iterator();
_L2:
        if (iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_35;
        }
        return;
        Runnable runnable = new Runnable() {

            final Session._cls4 this$1;
            private final Session.StatusCallback val$callback;
            private final Exception val$exception;
            private final SessionState val$newState;

            public void run()
            {
                callback.call(this$0, newState, exception);
            }

            
            {
                this$1 = Session._cls4.this;
                callback = statuscallback;
                newState = sessionstate;
                exception = exception1;
                super();
            }
        };
        Session.access$14(Session.access$13(Session.this), runnable);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception1;
        exception1;
        list;
        JVM INSTR monitorexit ;
        throw exception1;
    }


    te()
    {
        this$0 = final_session;
        val$newState = sessionstate;
        val$exception = Exception.this;
        super();
    }
}
