// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.uiaction.model;

import com.netflix.mediaclient.service.logging.client.model.DeviceUniqueId;
import com.netflix.mediaclient.service.logging.client.model.UIError;
import com.netflix.mediaclient.util.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.logging.uiaction.model:
//            BaseUIActionSessionEndedEvent

public final class SubmitPaymentEndedEvent extends BaseUIActionSessionEndedEvent
{

    public static final String ERROR_CODE = "errorCode";
    public static final String PAYMENT_TYPE = "paymentType";
    public static final String SUCCESS = "success";
    private static final String UIA_NAME = "submitPayment";
    private JSONObject mErrorCode;
    private com.netflix.mediaclient.servicemgr.UserActionLogging.PaymentType mPaymentType;
    private boolean mSuccess;

    public SubmitPaymentEndedEvent(DeviceUniqueId deviceuniqueid, long l, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview, com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname, com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason, UIError uierror, 
            boolean flag, com.netflix.mediaclient.servicemgr.UserActionLogging.PaymentType paymenttype, JSONObject jsonobject)
    {
        super("submitPayment", deviceuniqueid, l, modalview, commandname, completionreason, uierror);
        mSuccess = flag;
        mPaymentType = paymenttype;
        mErrorCode = jsonobject;
    }

    public SubmitPaymentEndedEvent(JSONObject jsonobject)
        throws JSONException
    {
        super(jsonobject);
        mPaymentType = com.netflix.mediaclient.servicemgr.UserActionLogging.PaymentType.valueOf(JsonUtils.getString(jsonobject, "paymentType", null));
        mSuccess = JsonUtils.getBoolean(jsonobject, "success", false);
        mErrorCode = JsonUtils.getJSONObject(jsonobject, "errorCode", null);
    }

    protected JSONObject getData()
        throws JSONException
    {
        JSONObject jsonobject = super.getData();
        if (mPaymentType != null)
        {
            jsonobject.put("paymentType", mPaymentType.name());
        }
        if (mErrorCode != null)
        {
            jsonobject.put("errorCode", mErrorCode);
        }
        jsonobject.put("success", mSuccess);
        return jsonobject;
    }

    public JSONObject getErrorCode()
    {
        return mErrorCode;
    }

    public com.netflix.mediaclient.servicemgr.UserActionLogging.PaymentType getPaymentType()
    {
        return mPaymentType;
    }

    public boolean isMemberEvent()
    {
        return false;
    }

    public boolean isSuccess()
    {
        return mSuccess;
    }
}
