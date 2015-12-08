// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.api;

import com.pinterest.activity.commerce.dialog.CommerceErrorDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.task.event.ToastEvent;
import com.pinterest.activity.task.toast.SimpleToast;
import com.pinterest.base.Events;
import com.pinterest.model.api.ApiErrorResponse;
import com.pinterest.model.common.Error;
import com.pinterest.model.common.ErrorBody;
import com.pinterest.network.api.PinterestCallback;
import com.pinterest.network.api.PinterestError;
import org.apache.commons.lang3.StringUtils;
import retrofit.RetrofitError;

public abstract class PinterestCallbackWithDefaultFailure extends PinterestCallback
{

    private static final String CART_LOCKED_ERROR = "CART_LOCKED_ERROR";
    private static final String DEFAULT_COMMERCE_MESSAGE = "none";

    public PinterestCallbackWithDefaultFailure()
    {
    }

    private void displayErrorToast(String s)
    {
        s = new SimpleToast(s);
        s.setLayoutGravity(81);
        Events.post(new ToastEvent(s));
    }

    public void failure(PinterestError pinteresterror)
    {
        ApiErrorResponse apierrorresponse = pinteresterror.a();
        if (apierrorresponse != null)
        {
            Object obj = (ErrorBody)apierrorresponse.getData();
            if (obj != null)
            {
                obj = ((ErrorBody) (obj)).getErrorMsg();
                if (!StringUtils.isEmpty(((CharSequence) (obj))) && ((String) (obj)).equals("CART_LOCKED_ERROR"))
                {
                    return;
                }
            }
            obj = apierrorresponse.getError();
            if (obj != null)
            {
                if (!StringUtils.isEmpty(((Error) (obj)).getTitle()) && !StringUtils.isEmpty(((Error) (obj)).getBody()))
                {
                    Events.post(new DialogEvent(CommerceErrorDialog.newInstance(((Error) (obj)).getTitle(), ((Error) (obj)).getBody())));
                    return;
                }
                if (!StringUtils.isEmpty(((Error) (obj)).getMessage()) && !((Error) (obj)).getMessage().toLowerCase().equals("none"))
                {
                    displayErrorToast(((Error) (obj)).getMessage());
                    return;
                }
            }
            if (!StringUtils.isEmpty(apierrorresponse.getMessage()))
            {
                displayErrorToast(apierrorresponse.getMessage());
                return;
            }
            if (!StringUtils.isEmpty(apierrorresponse.getMessageDetail()))
            {
                displayErrorToast(apierrorresponse.getMessageDetail());
                return;
            }
        }
        displayErrorToast(pinteresterror.b().getMessage());
    }
}
