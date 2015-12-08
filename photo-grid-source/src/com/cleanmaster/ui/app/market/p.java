// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.webkit.WebView;

// Referenced classes of package com.cleanmaster.ui.app.market:
//            o

final class p extends Handler
{

    final o a;

    p(o o1, Looper looper)
    {
        a = o1;
        super(looper);
    }

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 2: default 28
    //                   1 29
    //                   2 53;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        o.a(a, true);
        o.a(a, (String)message.obj);
        return;
_L3:
        if (o.a(a) != null)
        {
            o.a(a).stopLoading();
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
