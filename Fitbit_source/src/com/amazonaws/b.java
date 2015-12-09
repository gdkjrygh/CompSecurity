// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws;

import com.amazonaws.auth.g;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.amazonaws:
//            RequestClientOptions

public abstract class b
{

    private g credentials;
    private String delegationToken;
    private final RequestClientOptions requestClientOptions = new RequestClientOptions();
    private com.amazonaws.metrics.g requestMetricCollector;

    public b()
    {
    }

    public String a()
    {
        return delegationToken;
    }

    public void a(g g)
    {
        credentials = g;
    }

    public void a(com.amazonaws.metrics.g g)
    {
        requestMetricCollector = g;
    }

    public void a(String s)
    {
        delegationToken = s;
    }

    public g b()
    {
        return credentials;
    }

    public b b(com.amazonaws.metrics.g g)
    {
        a(g);
        return this;
    }

    public Map c()
    {
        HashMap hashmap = new HashMap();
        if (delegationToken != null)
        {
            hashmap.put("SecurityToken", delegationToken);
        }
        return hashmap;
    }

    public RequestClientOptions d()
    {
        return requestClientOptions;
    }

    public com.amazonaws.metrics.g e()
    {
        return requestMetricCollector;
    }
}
