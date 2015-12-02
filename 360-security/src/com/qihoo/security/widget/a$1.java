// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.qihoo.security.widget:
//            a

class a extends Handler
{

    final a a;

    public void handleMessage(Message message)
    {
        super.handleMessage(message);
        message.what;
        JVM INSTR tableswitch 0 0: default 28
    //                   0 29;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (!com.qihoo.security.widget.a.a(a))
        {
            com.qihoo.security.widget.a.b(a).a(com.qihoo.security.widget.a.a(a));
            if (com.qihoo.security.widget.a.b(a) != null)
            {
                com.qihoo.security.widget.a.b(a).b(true);
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    (a a1)
    {
        a = a1;
        super();
    }
}
