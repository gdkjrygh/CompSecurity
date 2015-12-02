// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.main;

import android.os.Handler;
import android.os.Message;
import com.qihoo.security.support.b;

// Referenced classes of package com.qihoo.security.ui.main:
//            BoosterFragment

class a extends Handler
{

    final BoosterFragment a;

    public void handleMessage(Message message)
    {
        if (!a.isAdded())
        {
            return;
        }
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            sendEmptyMessageDelayed(1, 60000L);
            break;
        }
        b.c(11002);
        BoosterFragment.a(a, false);
        a.a(false);
    }

    (BoosterFragment boosterfragment)
    {
        a = boosterfragment;
        super();
    }
}
