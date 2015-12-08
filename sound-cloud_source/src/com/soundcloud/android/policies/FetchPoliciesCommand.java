// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.policies;

import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.api.ApiRequest;
import com.soundcloud.android.api.model.ModelCollection;
import com.soundcloud.android.commands.LegacyCommand;
import com.soundcloud.android.utils.Urns;
import com.soundcloud.java.collections.MoreCollections;
import java.util.Collection;

class FetchPoliciesCommand extends LegacyCommand
{

    private final ApiClient apiClient;

    FetchPoliciesCommand(ApiClient apiclient)
    {
        apiClient = apiclient;
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public Collection call()
        throws Exception
    {
        ApiRequest apirequest = ApiRequest.post(ApiEndpoints.POLICIES.path()).withContent(MoreCollections.transform((Collection)input, Urns.toStringFunc())).forPrivateApi(1).build();
        return ((ModelCollection)apiClient.fetchMappedResponse(apirequest, new _cls1())).getCollection();
    }

    private class _cls1 extends TypeToken
    {

        final FetchPoliciesCommand this$0;

        _cls1()
        {
            this$0 = FetchPoliciesCommand.this;
            super();
        }
    }

}
