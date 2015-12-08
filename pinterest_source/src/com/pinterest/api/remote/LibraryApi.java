// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.ApiFields;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.model.Batch;
import com.pinterest.api.model.BatchRequest;
import com.pinterest.base.Device;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.pinterest.api.remote:
//            BaseApi

public class LibraryApi extends BaseApi
{

    public static void a(ArrayList arraylist, BaseApiResponseHandler baseapiresponsehandler, String s)
    {
        Batch batch = new Batch();
        for (int i = 0; i < arraylist.size(); i++)
        {
            BatchRequest batchrequest = new BatchRequest("GET", String.format("/v3/boards/%s/interests/", new Object[] {
                arraylist.get(i)
            }));
            HashMap hashmap = new HashMap();
            hashmap.put("fields", ApiFields.L);
            hashmap.put("view_constraint", "LIBRARY");
            hashmap.put("deduping_enabled", "true");
            batchrequest.setParams(hashmap);
            batch.add(batchrequest.toRequest());
        }

        c("batch/", batch.toRequestParam(), baseapiresponsehandler, s);
    }

    public static void d(String s, String s1, BaseApiResponseHandler baseapiresponsehandler, String s2)
    {
        Batch batch = new Batch();
        BatchRequest batchrequest = new BatchRequest("GET", String.format("/v3/users/%s/boards/feed/", new Object[] {
            s
        }));
        HashMap hashmap = new HashMap();
        hashmap.put("fields", ApiFields.K);
        hashmap.put("page_size", Device.getPageSizeStringBoard());
        hashmap.put("sort", s1);
        batchrequest.setParams(hashmap);
        s = new BatchRequest("GET", String.format("/v3/users/%s/pins/liked/", new Object[] {
            s
        }));
        s1 = new HashMap();
        s1.put("fields", ApiFields.M);
        s1.put("page_size", "6");
        s.setParams(s1);
        batch.add(batchrequest.toRequest());
        batch.add(s.toRequest());
        c("batch/", batch.toRequestParam(), baseapiresponsehandler, s2);
    }
}
