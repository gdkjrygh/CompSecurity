// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.common.LogUtil;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AlertType;

// Referenced classes of package com.dominos.activities:
//            TrackerActivity

class this._cls0
    implements com.dominos.samsungtv.nOpenAppListener
{

    final TrackerActivity this$0;

    public void onAppNotFound()
    {
        mActivityHelper.showAlert(AlertType.SAMSUNG_TV_APP_NOT_FOUND);
    }

    public void onConnectFailed()
    {
        mActivityHelper.showAlert(AlertType.SAMSUNG_TV_APP_CONNECTION_ERROR);
    }

    public void onOpenFailed()
    {
        mActivityHelper.showAlert(AlertType.SAMSUNG_TV_APP_CONNECTION_ERROR);
    }

    public void onOpenSuccess()
    {
        LogUtil.d(TrackerActivity.access$200(), "success open samsung app", new Object[0]);
    }

    OpenAppListener()
    {
        this$0 = TrackerActivity.this;
        super();
    }
}
