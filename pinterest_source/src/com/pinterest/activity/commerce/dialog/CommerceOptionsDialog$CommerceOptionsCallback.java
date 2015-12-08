// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.dialog;

import com.pinterest.activity.commerce.api.PinterestCallbackWithDefaultFailure;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.base.Events;
import com.pinterest.model.api.ApiResponse;
import com.pinterest.network.api.PinterestError;
import retrofit.client.Response;

// Referenced classes of package com.pinterest.activity.commerce.dialog:
//            CommerceOptionsDialog

class <init> extends PinterestCallbackWithDefaultFailure
{

    final CommerceOptionsDialog this$0;

    public void failure(PinterestError pinteresterror)
    {
        Events.post(new DialogEvent(null));
        super.failure(pinteresterror);
    }

    public void success(ApiResponse apiresponse, Response response)
    {
        Events.post(new DialogEvent(null));
        dismiss();
    }

    public volatile void success(Object obj, Response response)
    {
        success((ApiResponse)obj, response);
    }

    private ()
    {
        this$0 = CommerceOptionsDialog.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
