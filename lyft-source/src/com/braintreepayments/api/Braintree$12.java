// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api;

import android.os.Handler;
import com.braintreepayments.api.exceptions.ErrorWithResponse;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.braintreepayments.api:
//            Braintree

class rorWithResponse
    implements tenerCallback
{

    final Braintree this$0;
    final ErrorWithResponse val$error;

    public void execute()
    {
        final orListener listener;
        for (Iterator iterator = Braintree.access$1100(Braintree.this).iterator(); iterator.hasNext(); Braintree.access$800(Braintree.this).post(new Runnable() {

        final Braintree._cls12 this$1;
        final Braintree.ErrorListener val$listener;

        public void run()
        {
            listener.onRecoverableError(error);
        }

            
            {
                this$1 = Braintree._cls12.this;
                listener = errorlistener;
                super();
            }
    }))
        {
            listener = (orListener)iterator.next();
        }

    }

    public boolean hasListeners()
    {
        return !Braintree.access$1100(Braintree.this).isEmpty();
    }

    rorWithResponse()
    {
        this$0 = final_braintree;
        val$error = ErrorWithResponse.this;
        super();
    }
}
