// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.model;

import com.amazon.device.iap.internal.model.PurchaseResponseBuilder;
import com.amazon.device.iap.internal.util.d;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.amazon.device.iap.model:
//            UserData, Receipt, RequestId

public final class PurchaseResponse
{
    public static final class RequestStatus extends Enum
    {

        private static final RequestStatus $VALUES[];
        public static final RequestStatus ALREADY_PURCHASED;
        public static final RequestStatus FAILED;
        public static final RequestStatus INVALID_SKU;
        public static final RequestStatus NOT_SUPPORTED;
        public static final RequestStatus SUCCESSFUL;

        public static RequestStatus safeValueOf(String s)
        {
            if (d.a(s))
            {
                return null;
            }
            if ("ALREADY_ENTITLED".equalsIgnoreCase(s))
            {
                return ALREADY_PURCHASED;
            } else
            {
                return valueOf(s.toUpperCase());
            }
        }

        public static RequestStatus valueOf(String s)
        {
            return (RequestStatus)Enum.valueOf(com/amazon/device/iap/model/PurchaseResponse$RequestStatus, s);
        }

        public static RequestStatus[] values()
        {
            return (RequestStatus[])$VALUES.clone();
        }

        static 
        {
            SUCCESSFUL = new RequestStatus("SUCCESSFUL", 0);
            FAILED = new RequestStatus("FAILED", 1);
            INVALID_SKU = new RequestStatus("INVALID_SKU", 2);
            ALREADY_PURCHASED = new RequestStatus("ALREADY_PURCHASED", 3);
            NOT_SUPPORTED = new RequestStatus("NOT_SUPPORTED", 4);
            $VALUES = (new RequestStatus[] {
                SUCCESSFUL, FAILED, INVALID_SKU, ALREADY_PURCHASED, NOT_SUPPORTED
            });
        }

        private RequestStatus(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String RECEIPT = "receipt";
    private static final String REQUEST_ID = "requestId";
    private static final String REQUEST_STATUS = "requestStatus";
    private static final String TO_STRING_FORMAT = "(%s, requestId: \"%s\", purchaseRequestStatus: \"%s\", userId: \"%s\", receipt: %s)";
    private static final String USER_DATA = "userData";
    private final Receipt receipt;
    private final RequestId requestId;
    private final RequestStatus requestStatus;
    private final UserData userData;

    public PurchaseResponse(PurchaseResponseBuilder purchaseresponsebuilder)
    {
        d.a(purchaseresponsebuilder.getRequestId(), "requestId");
        d.a(purchaseresponsebuilder.getRequestStatus(), "requestStatus");
        if (purchaseresponsebuilder.getRequestStatus() == RequestStatus.SUCCESSFUL)
        {
            d.a(purchaseresponsebuilder.getReceipt(), "receipt");
            d.a(purchaseresponsebuilder.getUserData(), "userData");
        }
        requestId = purchaseresponsebuilder.getRequestId();
        userData = purchaseresponsebuilder.getUserData();
        receipt = purchaseresponsebuilder.getReceipt();
        requestStatus = purchaseresponsebuilder.getRequestStatus();
    }

    public Receipt getReceipt()
    {
        return receipt;
    }

    public RequestId getRequestId()
    {
        return requestId;
    }

    public RequestStatus getRequestStatus()
    {
        return requestStatus;
    }

    public UserData getUserData()
    {
        return userData;
    }

    public JSONObject toJSON()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("requestId", requestId);
        jsonobject.put("requestStatus", requestStatus);
        Object obj;
        if (userData != null)
        {
            obj = userData.toJSON();
        } else
        {
            obj = "";
        }
        jsonobject.put("userData", obj);
        if (getReceipt() != null)
        {
            obj = getReceipt().toJSON();
        } else
        {
            obj = "";
        }
        jsonobject.put("receipt", obj);
        return jsonobject;
    }

    public String toString()
    {
        String s1 = super.toString();
        RequestId requestid = requestId;
        String s;
        if (requestStatus != null)
        {
            s = requestStatus.toString();
        } else
        {
            s = "null";
        }
        return String.format("(%s, requestId: \"%s\", purchaseRequestStatus: \"%s\", userId: \"%s\", receipt: %s)", new Object[] {
            s1, requestid, s, userData, receipt
        });
    }
}
