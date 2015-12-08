// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.likes;

import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.api.ApiRequest;
import com.soundcloud.android.api.model.ModelCollection;
import com.soundcloud.android.commands.LegacyCommand;
import com.soundcloud.android.likes.LikeProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.utils.PropertySets;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class PushLikesCommand extends LegacyCommand
{

    private final ApiClient apiClient;
    private final ApiEndpoints endpoint;
    private final TypeToken typeToken;

    PushLikesCommand(ApiClient apiclient, ApiEndpoints apiendpoints, TypeToken typetoken)
    {
        apiClient = apiclient;
        endpoint = apiendpoints;
        typeToken = typetoken;
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public Collection call()
        throws Exception
    {
        Object obj = new ArrayList(((Collection)input).size());
        for (Iterator iterator = ((Collection)input).iterator(); iterator.hasNext(); ((List) (obj)).add(Collections.singletonMap("target_urn", ((Urn)((PropertySet)iterator.next()).get(LikeProperty.TARGET_URN)).toString()))) { }
        obj = Collections.singletonMap("likes", obj);
        obj = ApiRequest.post(endpoint.path()).forPrivateApi(1).withContent(obj).build();
        return PropertySets.toPropertySets(((ModelCollection)apiClient.fetchMappedResponse(((ApiRequest) (obj)), typeToken)).getCollection());
    }
}
