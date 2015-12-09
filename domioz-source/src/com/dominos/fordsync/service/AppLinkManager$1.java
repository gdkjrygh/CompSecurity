// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.service;

import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.dominos.android.sdk.common.LogUtil;

// Referenced classes of package com.dominos.fordsync.service:
//            AppLinkManager

class calling extends PhoneStateListener
{

    private boolean calling;
    final AppLinkManager this$0;

    public void onCallStateChanged(int i, String s)
    {
        AppLinkManager.access$002(AppLinkManager.this, true);
        LogUtil.d("FORDSYNC_AppLinkManager", (new StringBuilder("onCallStateChanged: ")).append(i).toString(), new Object[0]);
        if (i == 2)
        {
            calling = true;
        } else
        if (i == 0 && calling)
        {
            mTelephonyManager.listen(this, 0);
            AppLinkManager.access$002(AppLinkManager.this, false);
            calling = false;
            show("");
            return;
        }
    }

    ()
    {
        this$0 = AppLinkManager.this;
        super();
        calling = false;
    }
}
