// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.commands;

import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.api.ApiMapperException;
import com.soundcloud.android.api.ApiRequest;
import com.soundcloud.android.api.ApiRequestException;
import com.soundcloud.android.rx.ScSchedulers;
import com.soundcloud.java.collections.Iterables;
import com.soundcloud.java.reflect.TypeToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import rx.b;

// Referenced classes of package com.soundcloud.android.commands:
//            LegacyCommand

public abstract class BulkFetchCommand extends LegacyCommand
{

    private static final int DEFAULT_PAGE_SIZE = 200;
    private final ApiClient apiClient;
    private final int pageSize;

    public BulkFetchCommand(ApiClient apiclient)
    {
        this(apiclient, 200);
    }

    public BulkFetchCommand(ApiClient apiclient, int i)
    {
        apiClient = apiclient;
        pageSize = i;
    }

    public abstract ApiRequest buildRequest(List list);

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public Collection call()
        throws ApiRequestException, IOException, ApiMapperException
    {
        int i = 0;
        ArrayList arraylist = new ArrayList(((List)input).size());
        int j;
        do
        {
            int k = pageSize;
            int l = ((List)input).size();
            j = i + 1;
            l = Math.min(l, pageSize * j);
            ApiRequest apirequest = buildRequest(((List)input).subList(i * k, l));
            Iterables.addAll(arraylist, (Iterable)apiClient.fetchMappedResponse(apirequest, provideResourceType()));
            i = j;
        } while (j * pageSize < ((List)input).size());
        return arraylist;
    }

    public abstract TypeToken provideResourceType();

    public b toObservable()
    {
        return super.toObservable().subscribeOn(ScSchedulers.HIGH_PRIO_SCHEDULER);
    }
}
