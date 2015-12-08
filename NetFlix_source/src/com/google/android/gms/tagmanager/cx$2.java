// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cx

class aan
    implements android.os.er.Callback
{

    final cx aan;

    public boolean handleMessage(Message message)
    {
        if (1 == message.what && cx.cn().equals(message.obj))
        {
            aan.bW();
            if (cx.b(aan) > 0 && !cx.c(aan))
            {
                cx.d(aan).sendMessageDelayed(cx.d(aan).obtainMessage(1, cx.cn()), cx.b(aan));
            }
        }
        return true;
    }

    (cx cx1)
    {
        aan = cx1;
        super();
    }
}
