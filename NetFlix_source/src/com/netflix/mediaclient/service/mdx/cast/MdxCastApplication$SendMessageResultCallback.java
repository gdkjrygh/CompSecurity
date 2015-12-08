// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx.cast;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.service.mdx.cast:
//            MdxCastApplication

private final class <init>
    implements ResultCallback
{

    final MdxCastApplication this$0;

    public volatile void onResult(Result result)
    {
        onResult((Status)result);
    }

    public void onResult(Status status)
    {
        if (status.isSuccess())
        {
            Log.d(MdxCastApplication.access$000(), "SendMessage(), success");
            MdxCastApplication.access$200(MdxCastApplication.this).essageSent();
            return;
        } else
        {
            Log.d(MdxCastApplication.access$000(), "SendMessage(), failure");
            MdxCastApplication.access$200(MdxCastApplication.this).ailToSendMessage();
            return;
        }
    }

    private ()
    {
        this$0 = MdxCastApplication.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
