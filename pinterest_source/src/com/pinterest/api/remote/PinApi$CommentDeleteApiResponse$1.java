// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.base.Events;
import com.pinterest.common.async.BackgroundTask;
import com.pinterest.schemas.event.EventType;

class a extends BackgroundTask
{

    final ommentUid a;

    public void run()
    {
        com.pinterest.api.model.Comment comment = ModelHelper.getComment(a.ommentUid);
        ModelHelper.deletePinComment(a.ommentUid);
        Pinalytics.a(EventType.PIN_DELETE_COMMENT, a.ommentUid);
        Events.post(new com.pinterest.api.model.commentUid(comment, true));
    }

    ( )
    {
        a = ;
        super();
    }
}
