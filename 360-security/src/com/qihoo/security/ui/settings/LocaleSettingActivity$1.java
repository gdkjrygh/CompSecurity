// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.settings;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.qihoo.security.ui.settings:
//            LocaleSettingActivity, a

class a extends Handler
{

    final LocaleSettingActivity a;

    public void handleMessage(Message message)
    {
        super.handleMessage(message);
        message.what;
        JVM INSTR tableswitch 3 3: default 28
    //                   3 29;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (LocaleSettingActivity.a(a) != null)
        {
            LocaleSettingActivity.a(a).a();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    (LocaleSettingActivity localesettingactivity)
    {
        a = localesettingactivity;
        super();
    }
}
