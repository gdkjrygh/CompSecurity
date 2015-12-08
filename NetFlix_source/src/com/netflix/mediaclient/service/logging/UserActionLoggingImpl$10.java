// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.client.model.DataContext;
import com.netflix.mediaclient.service.logging.client.model.UIError;
import com.netflix.mediaclient.service.logging.uiaction.SubmitPaymentSession;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            UserActionLoggingImpl, EventHandler

class val.dataContext
    implements Runnable
{

    final UserActionLoggingImpl this$0;
    final DataContext val$dataContext;
    final UIError val$error;
    final JSONObject val$errorCode;
    final com.netflix.mediaclient.servicemgr.Type val$paymentType;
    final com.netflix.mediaclient.servicemgr.Reason val$reason;
    final boolean val$success;

    public void run()
    {
        Log.d("nf_log", "SubmitPayment session ended");
        if (UserActionLoggingImpl.access$1100(UserActionLoggingImpl.this) == null)
        {
            Log.w("nf_log", "SubmitPayment session does NOT exist!");
            return;
        }
        com.netflix.mediaclient.service.logging.uiaction.model.SubmitPaymentEndedEvent submitpaymentendedevent = UserActionLoggingImpl.access$1100(UserActionLoggingImpl.this).createEndedEvent(val$reason, val$error, val$success, val$paymentType, val$errorCode);
        if (submitpaymentendedevent == null)
        {
            Log.d("nf_log", "SubmitPayment session still waits on session id, do not post at this time.");
            return;
        } else
        {
            UserActionLoggingImpl.access$100(UserActionLoggingImpl.this, submitpaymentendedevent, val$dataContext, UserActionLoggingImpl.access$1100(UserActionLoggingImpl.this).getView());
            UserActionLoggingImpl.access$200(UserActionLoggingImpl.this).removeSession(UserActionLoggingImpl.access$1100(UserActionLoggingImpl.this));
            Log.d("nf_log", "SubmitPayment session end event posting...");
            UserActionLoggingImpl.access$200(UserActionLoggingImpl.this).post(submitpaymentendedevent);
            UserActionLoggingImpl.access$1102(UserActionLoggingImpl.this, null);
            Log.d("nf_log", "SubmitPayment session end event posted.");
            return;
        }
    }

    n()
    {
        this$0 = final_useractionloggingimpl;
        val$reason = reason1;
        val$error = uierror;
        val$success = flag;
        val$paymentType = type;
        val$errorCode = jsonobject;
        val$dataContext = DataContext.this;
        super();
    }
}
