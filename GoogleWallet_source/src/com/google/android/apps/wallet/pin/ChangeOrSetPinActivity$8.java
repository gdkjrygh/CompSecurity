// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.view.Window;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import com.google.android.apps.wallet.util.accessibility.AccessibilityUtil;
import com.google.android.apps.wallet.util.proto.Protos;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            CloudPinCallback, ChangeOrSetPinActivity

final class this._cls0 extends CloudPinCallback
{

    final ChangeOrSetPinActivity this$0;

    private void onSuccess(com.google.wallet.proto.api.Response response)
    {
        if (response.callError == null)
        {
            userEventLogger.log(28, 119);
            accessibilityUtil.announce(getWindow().getDecorView(), getString(com.google.android.apps.walletnfcrel.ed_message));
            response = ChangeOrSetPinActivity.access$900(ChangeOrSetPinActivity.this);
            if (response != null)
            {
                WLog.ifmt(ChangeOrSetPinActivity.access$500(), "continuing to success component: %s", new Object[] {
                    response.toString()
                });
                startActivity(response);
            }
            finish();
            return;
        }
        String s = ChangeOrSetPinActivity.access$500();
        String s1 = String.valueOf(response.callError.errorCode);
        WLog.e(s, (new StringBuilder(String.valueOf(s1).length() + 36)).append("SetPinResponse contains error code: ").append(s1).toString());
        switch (Protos.valueWithDefault(response.callError.errorCode, 0))
        {
        default:
            throw new IllegalStateException();

        case 2: // '\002'
            ChangeOrSetPinActivity.access$1000(ChangeOrSetPinActivity.this, com.google.android.apps.walletnfcrel.title, com.google.android.apps.walletnfcrel.message, "dialog_pin_already_set");
            ChangeOrSetPinActivity.access$400(ChangeOrSetPinActivity.this);
            ChangeOrSetPinActivity.access$300(ChangeOrSetPinActivity.this, true);
            return;

        case 1: // '\001'
            break;
        }
        if (response.callError.title != null && response.callError.content != null)
        {
            ChangeOrSetPinActivity.access$1100(ChangeOrSetPinActivity.this, response.callError.title, response.callError.content);
        }
        ChangeOrSetPinActivity.access$400(ChangeOrSetPinActivity.this);
        ChangeOrSetPinActivity.access$300(ChangeOrSetPinActivity.this, true);
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((com.google.wallet.proto.api.Response)obj);
    }

    e(FragmentActivity fragmentactivity, String s)
    {
        this$0 = ChangeOrSetPinActivity.this;
        super(fragmentactivity, s);
    }
}
