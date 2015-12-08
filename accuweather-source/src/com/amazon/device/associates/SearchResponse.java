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
//            ShoppingServiceResponse, an, Product, RequestId

public class SearchResponse extends ShoppingServiceResponse
{
    public static final class Status extends Enum
    {

        public static final Status FAILED;
        public static final Status INVALID_PARAMETER;
        public static final Status NOT_SUPPORTED;
        public static final Status SUCCESSFUL;
        private static final Status a[];

        public static Status valueOf(String s)
        {
            return (Status)Enum.valueOf(com/amazon/device/associates/SearchResponse$Status, s);
        }

        public static Status[] values()
        {
            return (Status[])a.clone();
        }

        static 
        {
            SUCCESSFUL = new Status("SUCCESSFUL", 0);
            INVALID_PARAMETER = new Status("INVALID_PARAMETER", 1);
            FAILED = new Status("FAILED", 2);
            NOT_SUPPORTED = new Status("NOT_SUPPORTED", 3);
            a = (new Status[] {
                SUCCESSFUL, INVALID_PARAMETER, FAILED, NOT_SUPPORTED
            });
        }

        private Status(String s, int i)
        {
            super(s, i);
        }
    }


    private final Status a;
    private final List b;
    private final int c;
    private final int d;

    SearchResponse(RequestId requestid, Status status)
    {
        this(requestid, status, ((List) (new ArrayList())), 0, 0);
    }

    SearchResponse(RequestId requestid, Status status, List list, int i, int j)
    {
        super(requestid);
        an.a(status, "status");
        an.a(list, "products");
        a = status;
        b = list;
        c = i;
        d = j;
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
            jsonobject.put("status", a);
        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
        jsonarray = null;
        if (b != null)
        {
            jsonarray = new JSONArray();
            for (iterator = b.iterator(); iterator.hasNext(); jsonarray.put(((Product)iterator.next()).a())) { }
        }
        jsonobject.put("products", jsonarray);
        jsonobject.put("page", c);
        jsonobject.put("totalPages", d);
        return jsonobject;
    }

    public int getPage()
    {
        return c;
    }

    public List getProducts()
    {
        return Collections.unmodifiableList(b);
    }

    public Status getStatus()
    {
        return a;
    }

    public int getTotalPages()
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
