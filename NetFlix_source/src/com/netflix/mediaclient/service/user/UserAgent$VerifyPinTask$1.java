// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user;

import android.os.Handler;

// Referenced classes of package com.netflix.mediaclient.service.user:
//            SimpleUserAgentWebCallback, UserAgent

class  extends SimpleUserAgentWebCallback
{

    final _cls1.val.statusCode this$1;

    public void onPinVerified(final boolean isPinValid, final int statusCode)
    {
        UserAgent.access$4100(_fld0).post(new Runnable() {

            final UserAgent.VerifyPinTask._cls1 this$2;
            final boolean val$isPinValid;
            final int val$statusCode;

            public void run()
            {
                getCallback().onPinVerified(isPinValid, statusCode);
            }

            
            {
                this$2 = UserAgent.VerifyPinTask._cls1.this;
                isPinValid = flag;
                statusCode = i;
                super();
            }
        });
    }

    _cls1.val.statusCode()
    {
        this$1 = this._cls1.this;
        super();
    }
}
