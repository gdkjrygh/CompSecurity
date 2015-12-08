// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.toast;

import com.pinterest.activity.notifications.util.RecentConversations;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.base.Application;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.EventType;

class _objectToSend extends BaseApiResponseHandler
{

    private SendableObject _objectToSend;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        Application.forceShowToast(Resources.string(0x7f07050e));
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        Pinalytics.a(EventType.PIN_SEND, _objectToSend.getUid());
        RecentConversations.refresh();
    }

    public (SendableObject sendableobject)
    {
        _objectToSend = sendableobject;
    }
}
