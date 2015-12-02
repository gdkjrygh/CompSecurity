// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.settings;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.qihoo.security.ui.settings:
//            AboutUsActivity

class a extends Handler
{

    final AboutUsActivity a;

    public void handleMessage(Message message)
    {
        super.handleMessage(message);
        switch (message.what)
        {
        default:
            return;

        case 0: // '\0'
            AboutUsActivity.a(a, false);
            break;
        }
    }

    (AboutUsActivity aboutusactivity)
    {
        a = aboutusactivity;
        super();
    }
}
