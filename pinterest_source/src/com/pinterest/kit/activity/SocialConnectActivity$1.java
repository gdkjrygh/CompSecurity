// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.activity;

import android.os.Bundle;
import com.facebook.widget.FacebookDialog;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.remote.AccountApi;
import com.pinterest.base.Application;
import com.pinterest.kit.activity.events.SocialShareEvent;
import com.pinterest.kit.log.PLog;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.kit.activity:
//            SocialConnectActivity

class this._cls0
    implements com.facebook.widget.vity._cls1
{

    final SocialConnectActivity this$0;

    public void onComplete(com.facebook.widget.ll ll, Bundle bundle)
    {
        boolean flag = false;
        if (_lastShare == null)
        {
            return;
        }
        ll = FacebookDialog.getNativeDialogCompletionGesture(bundle);
        PLog.info((new StringBuilder("FB share Success: ")).append(ll).append(" ").append(_lastShare.id).toString(), new Object[0]);
        if ("post".equalsIgnoreCase(ll))
        {
            flag = true;
            Application.showToast(0x7f07051f);
        } else
        if ("cancel".equalsIgnoreCase(ll))
        {
            return;
        }
        Pinalytics.a(EventType.PIN_SHARE_FACEBOOK, _lastShare.id);
        AccountApi.a(_lastShare, flag);
    }

    public void onError(com.facebook.widget.ll ll, Exception exception, Bundle bundle)
    {
        if (MyUser.isConnectedToFacebook())
        {
            Application.showToast(0x7f07051e);
        }
    }

    ()
    {
        this$0 = SocialConnectActivity.this;
        super();
    }
}
