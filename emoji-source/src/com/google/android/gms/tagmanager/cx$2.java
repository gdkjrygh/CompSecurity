// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cx

class ahV
    implements android.os.er.Callback
{

    final cx ahV;

    public boolean handleMessage(Message message)
    {
        if (1 == message.what && cx.cJ().equals(message.obj))
        {
            ahV.cq();
            if (cx.b(ahV) > 0 && !cx.c(ahV))
            {
                cx.d(ahV).sendMessageDelayed(cx.d(ahV).obtainMessage(1, cx.cJ()), cx.b(ahV));
            }
        }
        return true;
    }

    (cx cx1)
    {
        ahV = cx1;
        super();
    }
}
