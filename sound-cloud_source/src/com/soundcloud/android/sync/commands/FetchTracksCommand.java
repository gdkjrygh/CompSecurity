// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.commands;

import android.support.v4.util.ArrayMap;
import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.api.ApiRequest;
import com.soundcloud.android.commands.BulkFetchCommand;
import com.soundcloud.android.utils.Urns;
import com.soundcloud.java.reflect.TypeToken;
import java.util.List;

public class FetchTracksCommand extends BulkFetchCommand
{

    public FetchTracksCommand(ApiClient apiclient)
    {
        super(apiclient);
    }

    FetchTracksCommand(ApiClient apiclient, int i)
    {
        super(apiclient, i);
    }

    protected ApiRequest buildRequest(List list)
    {
        ArrayMap arraymap = new ArrayMap(1);
        arraymap.put("urns", Urns.toString(list));
        return ApiRequest.post(ApiEndpoints.TRACKS_FETCH.path()).forPrivateApi(1).withContent(arraymap).build();
    }

    protected TypeToken provideResourceType()
    {
        return new _cls1();
    }

    private class _cls1 extends TypeToken
    {

        final FetchTracksCommand this$0;

        _cls1()
        {
            this$0 = FetchTracksCommand.this;
            super();
        }
    }

}
