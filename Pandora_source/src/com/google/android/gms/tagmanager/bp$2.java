// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.gms.tagmanager:
//            bp

class a
    implements android.os.er.Callback
{

    final bp a;

    public boolean handleMessage(Message message)
    {
        if (1 == message.what && bp.c().equals(message.obj))
        {
            a.dispatch();
            if (bp.b(a) > 0 && !bp.c(a))
            {
                bp.d(a).sendMessageDelayed(bp.d(a).obtainMessage(1, bp.c()), bp.b(a));
            }
        }
        return true;
    }

    (bp bp1)
    {
        a = bp1;
        super();
    }
}
