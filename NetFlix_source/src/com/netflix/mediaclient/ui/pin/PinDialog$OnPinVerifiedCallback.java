// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.pin;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;

// Referenced classes of package com.netflix.mediaclient.ui.pin:
//            PinDialog, PinVerifier

private class > extends LoggingManagerCallback
{

    final PinDialog this$0;

    public void onPinVerified(boolean flag, int i)
    {
        super.onPinVerified(flag, i);
        PinDialog.access$1000(PinDialog.this, false);
        Log.d("nf_pin", String.format("onPinVerified isPinValid:%b, statusCode:%d", new Object[] {
            Boolean.valueOf(flag), Integer.valueOf(i)
        }));
        if (i == 0 && !flag)
        {
            retryOnPinFailure();
            return;
        }
        dismissDialog();
        if (i == 0)
        {
            PinVerifier.getInstance().registerPinVerifyEvent();
            PinDialog.notifyCallerPinVerified((NetflixActivity)getActivity(), PinDialog.access$1100(PinDialog.this));
            return;
        } else
        {
            PinDialog.access$1200((NetflixActivity)getActivity(), i);
            return;
        }
    }

    public ()
    {
        this$0 = PinDialog.this;
        super("nf_pin");
    }
}
