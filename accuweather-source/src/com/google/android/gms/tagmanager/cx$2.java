// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cx

class ahS
    implements android.os.er.Callback
{

    final cx ahS;

    public boolean handleMessage(Message message)
    {
        if (1 == message.what && cx.cE().equals(message.obj))
        {
            ahS.cl();
            if (cx.b(ahS) > 0 && !cx.c(ahS))
            {
                cx.d(ahS).sendMessageDelayed(cx.d(ahS).obtainMessage(1, cx.cE()), cx.b(ahS));
            }
        }
        return true;
    }

    (cx cx1)
    {
        ahS = cx1;
        super();
    }
}
