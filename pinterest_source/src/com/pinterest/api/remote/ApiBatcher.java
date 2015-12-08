// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.model.Batch;
import com.pinterest.api.model.BatchRequest;
import java.util.List;

// Referenced classes of package com.pinterest.api.remote:
//            BaseApi

public class ApiBatcher
    implements Runnable
{

    private final List a;
    private final int b = 20;
    private final BatchRequestBuilder c;
    private final BaseApiResponseHandler d;
    private final String e;

    public ApiBatcher(List list, BatchRequestBuilder batchrequestbuilder, BaseApiResponseHandler baseapiresponsehandler, String s)
    {
        a = list;
        c = batchrequestbuilder;
        d = baseapiresponsehandler;
        e = s;
    }

    public void run()
    {
        int k = (int)Math.ceil((1.0D * (double)a.size()) / (double)b);
        for (int i = 0; i < k; i++)
        {
            int l = b * i;
            int i1 = Math.min(b, a.size() - l);
            List list = a;
            Batch batch = new Batch();
            for (int j = 0; j < i1; j++)
            {
                Object obj = list.get(l + j);
                batch.add(c.build(obj).toRequest());
            }

            BaseApi.c("batch/", batch.toRequestParam(), d, e);
        }

    }

    private class BatchRequestBuilder
    {

        public abstract BatchRequest build(Object obj);
    }

}
