// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Comment;
import com.pinterest.base.Events;
import com.pinterest.common.async.BackgroundTask;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.schemas.event.EventType;

class b extends BackgroundTask
{

    public Comment a;
    final ApiResponse b;
    final b c;

    public void onFinish()
    {
        if (a != null)
        {
            Events.post(new com.pinterest.api.model..a(a));
            c.Success(a);
            Pinalytics.a(EventType.PIN_COMMENT, a.getUid());
        }
    }

    public void run()
    {
        a = Comment.make(cess._mth100(c), (PinterestJsonObject)b.getData());
    }

    ( , ApiResponse apiresponse)
    {
        c = ;
        b = apiresponse;
        super();
    }
}
