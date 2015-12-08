// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.amazon.device.associates:
//            ShoppingServiceResponse, an, Receipt, RequestId

public class PurchaseResponse extends ShoppingServiceResponse
{
    public static final class Status extends Enum
    {

        public static final Status FAILED;
        public static final Status INVALID_ID;
        public static final Status NOT_SUPPORTED;
        public static final Status PENDING;
        public static final Status SUCCESSFUL;
        private static final Status a[];

        public static Status valueOf(String s)
        {
            return (Status)Enum.valueOf(com/amazon/device/associates/PurchaseResponse$Status, s);
        }

        public static Status[] values()
        {
            return (Status[])a.clone();
        }

        static 
        {
            SUCCESSFUL = new Status("SUCCESSFUL", 0);
            FAILED = new Status("FAILED", 1);
            PENDING = new Status("PENDING", 2);
            INVALID_ID = new Status("INVALID_ID", 3);
            NOT_SUPPORTED = new Status("NOT_SUPPORTED", 4);
            a = (new Status[] {
                SUCCESSFUL, FAILED, PENDING, INVALID_ID, NOT_SUPPORTED
            });
        }

        private Status(String s, int i)
        {
            super(s, i);
        }
    }


    private final Status a;
    private final List b;

    PurchaseResponse(RequestId requestid, Status status)
    {
        this(requestid, status, ((List) (new ArrayList())));
    }

    PurchaseResponse(RequestId requestid, Status status, List list)
    {
        super(requestid);
        an.a(status, "status");
        a = status;
        b = list;
    }

    protected boolean a()
    {
        return a == Status.NOT_SUPPORTED;
    }

    JSONObject b()
    {
        JSONObject jsonobject = new JSONObject();
        JSONArray jsonarray;
        try
        {
            jsonobject.put("requestId", getRequestId());
            jsonobject.put("status", a.toString());
            jsonarray = new JSONArray();
            for (Iterator iterator = b.iterator(); iterator.hasNext(); jsonarray.put(((Receipt)iterator.next()).a())) { }
        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
        jsonobject.put("receipts", jsonarray);
        return jsonobject;
    }

    public List getReceipts()
    {
        return Collections.unmodifiableList(b);
    }

    public Status getStatus()
    {
        return a;
    }

    public String toString()
    {
        String s;
        try
        {
            s = b().toString(4);
        }
        catch (JSONException jsonexception)
        {
            return null;
        }
        return s;
    }
}
