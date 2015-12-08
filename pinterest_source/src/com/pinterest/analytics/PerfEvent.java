// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.analytics;

import com.pinterest.api.RequestParams;
import com.pinterest.api.model.BatchRequest;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PerfEvent
{

    private String a;
    private RequestParams b;

    public PerfEvent(String s, RequestParams requestparams)
    {
        a = s;
        b = requestparams;
    }

    public final BatchRequest a()
    {
        BatchRequest batchrequest = new BatchRequest("POST", a);
        java.util.Map.Entry entry;
        for (Iterator iterator = b.a().entrySet().iterator(); iterator.hasNext(); batchrequest.setParams((String)entry.getKey(), new String[] {
    (String)entry.getValue()
}))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return batchrequest;
    }
}
