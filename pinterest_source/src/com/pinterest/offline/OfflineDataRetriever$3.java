// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.offline;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.BoardFeed;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.kit.log.PLog;

// Referenced classes of package com.pinterest.offline:
//            OfflineDataRetriever

class iResponse extends com.pinterest.api.remote.sponse
{

    final OfflineDataRetriever a;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        Object obj = null;
        super.onFailure(throwable, apiresponse);
        throwable = obj;
        if (apiresponse.getCode() == 10)
        {
            PLog.log("OfflineDataRetriever", "User Board bookmark not found", new Object[0]);
            throwable = OfflineDataRetriever.a(0, null, MyUser.getUid());
            ModelHelper.setSyncJob(throwable);
            OfflineDataRetriever.c(a);
        }
        OfflineDataRetriever.a(a, throwable);
    }

    public void onSuccess(Feed feed)
    {
        super.onSuccess(feed);
        PLog.log("OfflineDataRetriever", (new StringBuilder("Grabbed ")).append(feed.getCount()).append(" boards").toString(), new Object[0]);
        OfflineDataRetriever.a(a, (BoardFeed)feed);
    }

    iResponse(OfflineDataRetriever offlinedataretriever)
    {
        a = offlinedataretriever;
        super();
    }
}
