// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.toast;

import android.content.Context;
import android.view.View;
import com.pinterest.activity.task.toast.view.ToastContainer;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.remote.BoardApi;
import com.pinterest.base.Application;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.task.toast:
//            BaseToast

public class InviteEmailToast extends BaseToast
{

    private String _boardId;
    private String _email;

    public InviteEmailToast(String s, String s1)
    {
        _boardId = s;
        _email = s1;
    }

    public View getView(ToastContainer toastcontainer)
    {
        setLayoutGravity(81);
        setMessage(Resources.string(0x7f070096));
        setSecondaryMessage(Resources.string(0x7f070599, new Object[] {
            _email
        }));
        setButtonText(Resources.string(0x7f0705b1));
        setImageResource(0x7f020182);
        return super.getView(toastcontainer);
    }

    public void onToastCancelled(Context context)
    {
        super.onToastCancelled(context);
        Pinalytics.a(ElementType.UNDO_BUTTON, ComponentType.TOAST);
        Application.forceShowToast(Resources.string(0x7f070095));
    }

    public void onToastCompleted(Context context)
    {
        super.onToastCompleted(context);
        BoardApi.a(_boardId, _email, new BoardEmailInviteResponseHandler(_email));
    }

    private class BoardEmailInviteResponseHandler extends BaseApiResponseHandler
    {

        private String _email;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            Application.forceShowToast(apiresponse.getMessageDetail());
        }

        public void onSuccess(ApiResponse apiresponse)
        {
        }

        public BoardEmailInviteResponseHandler(String s)
        {
            _email = s;
        }
    }

}
