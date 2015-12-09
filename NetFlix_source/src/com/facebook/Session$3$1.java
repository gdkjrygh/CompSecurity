// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook:
//            Session, SessionState

class usCallback
    implements Runnable
{

    final l.exception this$1;
    final usCallback val$callback;

    public void run()
    {
        val$callback.call(_fld0, newState, exception);
    }

    usCallback()
    {
        this$1 = final_uscallback;
        val$callback = usCallback.this;
        super();
    }

    // Unreferenced inner class com/facebook/Session$3

/* anonymous class */
    class Session._cls3
        implements Runnable
    {

        final Session this$0;
        final Exception val$exception;
        final SessionState val$newState;

        public void run()
        {
            Session._cls3._cls1 _lcls1;
            for (Iterator iterator = Session.access$300(Session.this).iterator(); iterator.hasNext(); Session.access$500(Session.access$400(Session.this), _lcls1))
            {
                _lcls1 = ((Session.StatusCallback)iterator.next()). new Session._cls3._cls1();
            }

        }

            
            {
                this$0 = final_session;
                newState = sessionstate;
                exception = Exception.this;
                super();
            }
    }

}
