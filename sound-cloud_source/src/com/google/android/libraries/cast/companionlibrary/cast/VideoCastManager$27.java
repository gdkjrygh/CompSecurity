// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast:
//            VideoCastManager

class this._cls0
    implements ResultCallback
{

    final VideoCastManager this$0;

    public volatile void onResult(Result result)
    {
        onResult((Status)result);
    }

    public void onResult(Status status)
    {
        if (!status.isSuccess())
        {
            VideoCastManager.access$700(VideoCastManager.this, status.getStatusCode());
        }
    }

    Q()
    {
        this$0 = VideoCastManager.this;
        super();
    }
}
