// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.cast.companionlibrary.utils.LogUtils;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast:
//            BaseCastManager

class this._cls0
    implements ResultCallback
{

    final BaseCastManager this$0;

    public volatile void onResult(Result result)
    {
        onResult((Status)result);
    }

    public void onResult(Status status)
    {
        if (!status.isSuccess())
        {
            LogUtils.LOGD(BaseCastManager.access$100(), "stopApplication -> onResult: stopping application failed");
            onApplicationStopFailed(status.getStatusCode());
            return;
        } else
        {
            LogUtils.LOGD(BaseCastManager.access$100(), "stopApplication -> onResult Stopped application successfully");
            return;
        }
    }

    ()
    {
        this$0 = BaseCastManager.this;
        super();
    }
}
