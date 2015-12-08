// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.model;

import com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder;
import com.amazon.device.iap.internal.util.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.amazon.device.iap.model:
//            UserData, Receipt, RequestId

public final class PurchaseUpdatesResponse
{
    public static final class RequestStatus extends Enum
    {

        private static final RequestStatus $VALUES[];
        public static final RequestStatus FAILED;
        public static final RequestStatus NOT_SUPPORTED;
        public static final RequestStatus SUCCESSFUL;

        public static RequestStatus valueOf(String s)
        {
            return (RequestStatus)Enum.valueOf(com/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus, s);
        }

        public static RequestStatus[] values()
        {
            return (RequestStatus[])$VALUES.clone();
        }

        static 
        {
            SUCCESSFUL = new RequestStatus("SUCCESSFUL", 0);
            FAILED = new RequestStatus("FAILED", 1);
            NOT_SUPPORTED = new RequestStatus("NOT_SUPPORTED", 2);
            $VALUES = (new RequestStatus[] {
                SUCCESSFUL, FAILED, NOT_SUPPORTED
            });
        }

        private RequestStatus(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String HAS_MORE = "HAS_MORE";
    private static final String RECEIPTS = "RECEIPTS";
    private static final String REQUEST_ID = "REQUEST_ID";
    private static final String REQUEST_STATUS = "REQUEST_STATUS";
    private static final String TO_STRING_FORMAT = "(%s, requestId: \"%s\", requestStatus: \"%s\", userData: \"%s\", receipts: %s, hasMore: \"%b\")";
    private static final String USER_DATA = "USER_DATA";
    private final boolean hasMore;
    private final List receipts;
    private final RequestId requestId;
    private final RequestStatus requestStatus;
    private final UserData userData;

    public PurchaseUpdatesResponse(PurchaseUpdatesResponseBuilder purchaseupdatesresponsebuilder)
    {
        d.a(purchaseupdatesresponsebuilder.getRequestId(), "requestId");
        d.a(purchaseupdatesresponsebuilder.getRequestStatus(), "requestStatus");
        if (RequestStatus.SUCCESSFUL == purchaseupdatesresponsebuilder.getRequestStatus())
        {
            d.a(purchaseupdatesresponsebuilder.getUserData(), "userData");
            d.a(purchaseupdatesresponsebuilder.getReceipts(), "receipts");
        }
        requestId = purchaseupdatesresponsebuilder.getRequestId();
        requestStatus = purchaseupdatesresponsebuilder.getRequestStatus();
        userData = purchaseupdatesresponsebuilder.getUserData();
        Object obj;
        if (purchaseupdatesresponsebuilder.getReceipts() == null)
        {
            obj = new ArrayList();
        } else
        {
            obj = purchaseupdatesresponsebuilder.getReceipts();
        }
        receipts = ((List) (obj));
        hasMore = purchaseupdatesresponsebuilder.hasMore();
    }

    public List getReceipts()
    {
        return receipts;
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

    public boolean hasMore()
    {
        return hasMore;
    }

    public JSONObject toJSON()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("REQUEST_ID", requestId);
        jsonobject.put("REQUEST_STATUS", requestStatus);
        Object obj;
        if (userData != null)
        {
            obj = userData.toJSON();
        } else
        {
            obj = "";
        }
        jsonobject.put("USER_DATA", obj);
        obj = new JSONArray();
        if (receipts != null)
        {
            for (Iterator iterator = receipts.iterator(); iterator.hasNext(); ((JSONArray) (obj)).put(((Receipt)iterator.next()).toJSON())) { }
        }
        jsonobject.put("RECEIPTS", obj);
        jsonobject.put("HAS_MORE", hasMore);
        return jsonobject;
    }

    public String toString()
    {
        String s1 = super.toString();
        RequestId requestid = requestId;
        RequestStatus requeststatus = requestStatus;
        UserData userdata = userData;
        String s;
        if (receipts != null)
        {
            s = Arrays.toString(receipts.toArray());
        } else
        {
            s = "null";
        }
        return String.format("(%s, requestId: \"%s\", requestStatus: \"%s\", userData: \"%s\", receipts: %s, hasMore: \"%b\")", new Object[] {
            s1, requestid, requeststatus, userdata, s, Boolean.valueOf(hasMore)
        });
    }
}
