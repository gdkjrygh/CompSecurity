// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.schemas.event.EventType;
import java.util.HashMap;

public class ViewTagRequest extends StringRequest
{

    private String a;

    public ViewTagRequest(String s, String s1)
    {
        super(0, s, null, null, null);
        a = s1;
    }

    protected Response parseNetworkResponse(NetworkResponse networkresponse)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("status_code", String.valueOf(networkresponse.statusCode));
        Pinalytics.a(EventType.VIEW_TAG_PINGED, a, hashmap);
        return super.parseNetworkResponse(networkresponse);
    }
}
