// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.recommendations;

import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.api.ApiMapperException;
import com.soundcloud.android.api.ApiRequest;
import com.soundcloud.android.api.ApiRequestException;
import com.soundcloud.android.api.model.ModelCollection;
import com.soundcloud.propeller.WriteResult;
import java.io.IOException;
import java.util.concurrent.Callable;

// Referenced classes of package com.soundcloud.android.sync.recommendations:
//            StoreRecommendationsCommand

public class RecommendationsSyncer
    implements Callable
{

    private final ApiClient apiClient;
    private final StoreRecommendationsCommand storeRecommendationsCommand;

    public RecommendationsSyncer(ApiClient apiclient, StoreRecommendationsCommand storerecommendationscommand)
    {
        apiClient = apiclient;
        storeRecommendationsCommand = storerecommendationscommand;
    }

    private ModelCollection getApiRecommendations(ApiRequest apirequest)
        throws IOException, ApiRequestException, ApiMapperException
    {
        return (ModelCollection)apiClient.fetchMappedResponse(apirequest, new _cls1());
    }

    public Boolean call()
        throws Exception
    {
        ModelCollection modelcollection = getApiRecommendations(ApiRequest.get(ApiEndpoints.RECOMMENDATIONS.path()).forPrivateApi(1).build());
        return Boolean.valueOf(((WriteResult)storeRecommendationsCommand.call(modelcollection)).success());
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    private class _cls1 extends TypeToken
    {

        final RecommendationsSyncer this$0;

        _cls1()
        {
            this$0 = RecommendationsSyncer.this;
            super();
        }
    }

}
