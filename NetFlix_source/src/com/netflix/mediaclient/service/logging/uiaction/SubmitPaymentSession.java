// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.uiaction;

import com.netflix.mediaclient.service.logging.client.model.UIError;
import com.netflix.mediaclient.service.logging.uiaction.model.SubmitPaymentEndedEvent;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.logging.uiaction:
//            BaseUIActionSession

public final class SubmitPaymentSession extends BaseUIActionSession
{

    public static final String NAME = "submitPayment";

    public SubmitPaymentSession(com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        super(commandname, modalview);
    }

    public SubmitPaymentEndedEvent createEndedEvent(com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason, UIError uierror, boolean flag, com.netflix.mediaclient.servicemgr.UserActionLogging.PaymentType paymenttype, JSONObject jsonobject)
    {
        long l = System.currentTimeMillis();
        long l1 = mStarted;
        completionreason = new SubmitPaymentEndedEvent(mId, l - l1, mView, mAction, completionreason, uierror, flag, paymenttype, jsonobject);
        completionreason.setCategory(getCategory());
        completionreason.setSessionId(mId);
        return completionreason;
    }

    public String getName()
    {
        return "submitPayment";
    }
}
