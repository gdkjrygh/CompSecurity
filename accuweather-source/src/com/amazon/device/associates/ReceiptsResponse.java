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
//            ShoppingServiceResponse, an, Receipt, Offset, 
//            RequestId

public class ReceiptsResponse extends ShoppingServiceResponse
{
    public static final class Status extends Enum
    {

        public static final Status FAILED;
        public static final Status NOT_SUPPORTED;
        public static final Status NO_MORE_DATA;
        public static final Status SUCCESSFUL;
        private static final Status a[];

        public static Status valueOf(String s)
        {
            return (Status)Enum.valueOf(com/amazon/device/associates/ReceiptsResponse$Status, s);
        }

        public static Status[] values()
        {
            return (Status[])a.clone();
        }

        static 
        {
            SUCCESSFUL = new Status("SUCCESSFUL", 0);
            FAILED = new Status("FAILED", 1);
            NO_MORE_DATA = new Status("NO_MORE_DATA", 2);
            NOT_SUPPORTED = new Status("NOT_SUPPORTED", 3);
            a = (new Status[] {
                SUCCESSFUL, FAILED, NO_MORE_DATA, NOT_SUPPORTED
            });
        }

        private Status(String s, int i)
        {
            super(s, i);
        }
    }


    private final Status a;
    private final List b;
    private final Offset c;
    private final boolean d;

    ReceiptsResponse(RequestId requestid, Status status)
    {
        this(requestid, status, ((List) (new ArrayList())), null, false);
    }

    ReceiptsResponse(RequestId requestid, Status status, List list, Offset offset, boolean flag)
    {
        super(requestid);
        an.a(list, "receipts");
        an.a(status, "status");
        a = status;
        b = list;
        c = offset;
        d = flag;
    }

    protected boolean a()
    {
        return a == Status.NOT_SUPPORTED;
    }

    JSONObject b()
    {
        JSONObject jsonobject = new JSONObject();
        JSONArray jsonarray;
        Iterator iterator;
        try
        {
            jsonobject.put("requestId", getRequestId());
        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
        jsonarray = null;
        if (b != null)
        {
            jsonarray = new JSONArray();
            for (iterator = b.iterator(); iterator.hasNext(); jsonarray.put(((Receipt)iterator.next()).a())) { }
        }
        jsonobject.put("receipts", jsonarray);
        jsonobject.put("nextOffset", c);
        jsonobject.put("hasMore", d);
        return jsonobject;
    }

    public Offset getNextOffset()
    {
        return c;
    }

    public List getReceipts()
    {
        return Collections.unmodifiableList(b);
    }

    public Status getStatus()
    {
        return a;
    }

    public boolean hasMore()
    {
        return d;
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
