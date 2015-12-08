// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.adapter;

import com.pinterest.api.model.BatchRequest;
import com.pinterest.api.model.User;
import java.util.HashMap;

// Referenced classes of package com.pinterest.adapter:
//            PeopleListAdapter

class equestBuilder
    implements com.pinterest.api.remote.estBuilder
{

    final PeopleListAdapter this$0;
    final com.pinterest.api.remote.estBuilder val$userBatchRequestBuilder;

    public BatchRequest build(User user)
    {
        PeopleListAdapter.access$000(PeopleListAdapter.this).put(user.getUid(), user);
        return val$userBatchRequestBuilder.build(user.getUid());
    }

    public volatile BatchRequest build(Object obj)
    {
        return build((User)obj);
    }

    equestBuilder()
    {
        this$0 = final_peoplelistadapter;
        val$userBatchRequestBuilder = com.pinterest.api.remote.estBuilder.this;
        super();
    }
}
