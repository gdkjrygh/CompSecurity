// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import android.support.v4.app.FragmentActivity;
import com.google.android.apps.wallet.util.proto.Protos;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            CloudPinCallback, ChangeOrSetPinActivity, ResetPinDialog

final class this._cls0 extends CloudPinCallback
{

    final ChangeOrSetPinActivity this$0;

    private void onSuccess(com.google.wallet.proto.api.ifyResponse ifyresponse)
    {
        if (ifyresponse.callError == null)
        {
            ChangeOrSetPinActivity.access$702(ChangeOrSetPinActivity.this, 0);
            ChangeOrSetPinActivity.access$300(ChangeOrSetPinActivity.this, true);
            return;
        }
        if (Protos.valuesEqual(ifyresponse.callError.errorCode, 3))
        {
            resetPinDialog.showPinLocked(getSupportFragmentManager());
            return;
        } else
        {
            int _tmp = ChangeOrSetPinActivity.access$708(ChangeOrSetPinActivity.this);
            ChangeOrSetPinActivity.access$200(ChangeOrSetPinActivity.this);
            ChangeOrSetPinActivity.access$300(ChangeOrSetPinActivity.this, true);
            return;
        }
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((com.google.wallet.proto.api.ifyResponse)obj);
    }

    onse(FragmentActivity fragmentactivity, String s)
    {
        this$0 = ChangeOrSetPinActivity.this;
        super(fragmentactivity, s);
    }
}
