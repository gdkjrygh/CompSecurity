// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.commands;

import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.api.ApiRequest;
import com.soundcloud.android.commands.BulkFetchCommand;
import com.soundcloud.android.utils.Urns;
import com.soundcloud.java.reflect.TypeToken;
import java.util.List;

public class FetchUsersCommand extends BulkFetchCommand
{

    public FetchUsersCommand(ApiClient apiclient)
    {
        super(apiclient);
    }

    FetchUsersCommand(ApiClient apiclient, int i)
    {
        super(apiclient, i);
    }

    protected ApiRequest buildRequest(List list)
    {
        return ApiRequest.get(ApiEndpoints.LEGACY_USERS.path()).forPublicApi().addQueryParam("ids", new Object[] {
            Urns.toJoinedIds(list, ",")
        }).addQueryParam("linked_partitioning", new Object[] {
            "1"
        }).build();
    }

    protected TypeToken provideResourceType()
    {
        return new _cls1();
    }

    private class _cls1 extends TypeToken
    {

        final FetchUsersCommand this$0;

        _cls1()
        {
            this$0 = FetchUsersCommand.this;
            super();
        }
    }

}
