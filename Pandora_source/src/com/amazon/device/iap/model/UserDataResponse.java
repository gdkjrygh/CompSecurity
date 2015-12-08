// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.model;

import com.amazon.device.iap.internal.model.UserDataResponseBuilder;
import com.amazon.device.iap.internal.util.d;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.amazon.device.iap.model:
//            UserData, RequestId

public final class UserDataResponse
{
    public static final class RequestStatus extends Enum
    {

        private static final RequestStatus $VALUES[];
        public static final RequestStatus FAILED;
        public static final RequestStatus NOT_SUPPORTED;
        public static final RequestStatus SUCCESSFUL;

        public static RequestStatus valueOf(String s)
        {
            return (RequestStatus)Enum.valueOf(com/amazon/device/iap/model/UserDataResponse$RequestStatus, s);
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


    private static final String REQUEST_ID = "REQUEST_ID";
    private static final String REQUEST_STATUS = "REQUEST_STATUS";
    private static final String TO_STRING_FORMAT = "(%s, requestId: \"%s\", requestStatus: \"%s\", userData: \"%s\")";
    private static final String USER_DATA = "USER_DATA";
    private final RequestId requestId;
    private final RequestStatus requestStatus;
    private final UserData userData;

    public UserDataResponse(UserDataResponseBuilder userdataresponsebuilder)
    {
        d.a(userdataresponsebuilder.getRequestId(), "requestId");
        d.a(userdataresponsebuilder.getRequestStatus(), "requestStatus");
        requestId = userdataresponsebuilder.getRequestId();
        requestStatus = userdataresponsebuilder.getRequestStatus();
        userData = userdataresponsebuilder.getUserData();
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
        return jsonobject;
    }

    public String toString()
    {
        String s2 = super.toString();
        RequestId requestid = requestId;
        String s;
        String s1;
        if (requestStatus != null)
        {
            s = requestStatus.toString();
        } else
        {
            s = "null";
        }
        if (userData != null)
        {
            s1 = userData.toString();
        } else
        {
            s1 = "null";
        }
        return String.format("(%s, requestId: \"%s\", requestStatus: \"%s\", userData: \"%s\")", new Object[] {
            s2, requestid, s, s1
        });
    }
}
