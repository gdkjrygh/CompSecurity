// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.activity.notifications.NotificationCount;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.kit.log.PLog;
import com.pinterest.network.json.PinterestJsonObject;

public class  extends ApiResponseHandler
{

    public void onSuccess(ApiResponse apiresponse)
    {
        apiresponse = ((ApiResponse) (apiresponse.getData()));
        if (apiresponse instanceof PinterestJsonObject)
        {
            apiresponse = (PinterestJsonObject)apiresponse;
            int i = apiresponse.a("network", 0);
            int j = apiresponse.a("user", 0);
            int k = apiresponse.a("messages", 0);
            PLog.info("unseenNetworkStory %d unseenNotifications %d unseenConversations %d", new Object[] {
                Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k)
            });
            NotificationCount.setCounts(i, j, k);
        }
    }

    public ()
    {
    }
}
