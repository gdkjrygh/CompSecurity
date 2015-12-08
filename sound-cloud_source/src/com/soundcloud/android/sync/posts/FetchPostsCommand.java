// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.posts;

import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.api.ApiRequest;
import com.soundcloud.android.api.model.ModelCollection;
import com.soundcloud.android.commands.LegacyCommand;
import com.soundcloud.android.model.PostProperty;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

// Referenced classes of package com.soundcloud.android.sync.posts:
//            ApiPostItem

class FetchPostsCommand extends LegacyCommand
{

    private final ApiClient apiClient;

    FetchPostsCommand(ApiClient apiclient)
    {
        apiClient = apiclient;
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public NavigableSet call()
        throws Exception
    {
        Object obj = ApiRequest.get(((ApiEndpoints)input).path()).forPrivateApi(1).build();
        Object obj1 = (ModelCollection)apiClient.fetchMappedResponse(((ApiRequest) (obj)), new _cls1());
        obj = new TreeSet(PostProperty.COMPARATOR);
        for (obj1 = ((ModelCollection) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((NavigableSet) (obj)).add(((ApiPostItem)((Iterator) (obj1)).next()).toPropertySet())) { }
        return ((NavigableSet) (obj));
    }

    private class _cls1 extends TypeToken
    {

        final FetchPostsCommand this$0;

        _cls1()
        {
            this$0 = FetchPostsCommand.this;
            super();
        }
    }

}
