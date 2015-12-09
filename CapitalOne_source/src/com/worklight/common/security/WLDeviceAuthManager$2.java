// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common.security;

import android.webkit.WebView;

// Referenced classes of package com.worklight.common.security:
//            WLDeviceAuthManager

class this._cls0
    implements Runnable
{

    final WLDeviceAuthManager this$0;

    public void run()
    {
        WLDeviceAuthManager.access$0(WLDeviceAuthManager.this).loadUrl("javascript:WL.DiagnosticDialog.showDialog(WL.ClientMessages.wlclientInitFailure, WL.ClientMessages.deviceAuthenticationFail, false, false);");
    }

    _cls9()
    {
        this$0 = WLDeviceAuthManager.this;
        super();
    }
}
