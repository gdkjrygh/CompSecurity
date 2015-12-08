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
    final Exception val$exception;
    final SessionState val$newState;

    public void run()
    {
        List list = Session.access$1200(Session.this);
        list;
        JVM INSTR monitorenter ;
        _cls1 _lcls1;
        for (Iterator iterator = Session.access$1200(Session.this).iterator(); iterator.hasNext(); Session.access$1400(Session.access$1300(Session.this), _lcls1))
        {
            class _cls1
                implements Runnable
            {

                final Session._cls4 this$1;
                final Session.StatusCallback val$callback;

                public void run()
                {
                    callback.call(this$0, newState, exception);
                }

            _cls1()
            {
                this$1 = Session._cls4.this;
                callback = statuscallback;
                super();
            }
            }

            _lcls1 = new _cls1();
        }

        break MISSING_BLOCK_LABEL_69;
        Exception exception1;
        exception1;
        list;
        JVM INSTR monitorexit ;
        throw exception1;
        list;
        JVM INSTR monitorexit ;
    }

    te()
    {
        this$0 = final_session;
        val$newState = sessionstate;
        val$exception = Exception.this;
        super();
    }
}
