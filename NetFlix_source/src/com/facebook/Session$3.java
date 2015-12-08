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
        Runnable runnable;
        for (Iterator iterator = Session.access$300(Session.this).iterator(); iterator.hasNext(); Session.access$500(Session.access$400(Session.this), runnable))
        {
            runnable = new Runnable() {

                final Session._cls3 this$1;
                final Session.StatusCallback val$callback;

                public void run()
                {
                    callback.call(this$0, newState, exception);
                }

            
            {
                this$1 = Session._cls3.this;
                callback = statuscallback;
                super();
            }
            };
        }

    }

    te()
    {
        this$0 = final_session;
        val$newState = sessionstate;
        val$exception = Exception.this;
        super();
    }
}
