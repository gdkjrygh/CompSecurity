// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.api;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.webkit.WebView;
import com.adobe.adobepass.accessenabler.utils.Log;

// Referenced classes of package com.adobe.adobepass.accessenabler.api:
//            PassiveAuthnWebView, AccessEnablerContext, AccessEnablerService

class this._cls0 extends CountDownTimer
{

    final PassiveAuthnWebView this$0;

    public void onFinish()
    {
        Log.d("PassiveAuthnService", "Timer - Time has elapsed.");
        if (PassiveAuthnWebView.access$000(PassiveAuthnWebView.this).passiveAuthnState == ssiveAuthnState.PASSIVE_IN_PROGRESS)
        {
            Log.d("PassiveAuthnService", "Timer - Ending passive flow.");
            PassiveAuthnWebView.access$300(PassiveAuthnWebView.this).stopLoading();
            Intent intent = new Intent(PassiveAuthnWebView.access$200(PassiveAuthnWebView.this), com/adobe/adobepass/accessenabler/api/AccessEnablerService);
            Bundle bundle = new Bundle();
            bundle.putInt("op_code", 12);
            intent.putExtras(bundle);
            PassiveAuthnWebView.access$200(PassiveAuthnWebView.this).startService(intent);
        }
    }

    public void onTick(long l)
    {
    }

    ssiveAuthnState(long l, long l1)
    {
        this$0 = PassiveAuthnWebView.this;
        super(l, l1);
    }
}
