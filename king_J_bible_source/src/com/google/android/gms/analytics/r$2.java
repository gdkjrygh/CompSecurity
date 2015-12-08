// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.gms.analytics:
//            r, u

class sS
    implements android.os.ler.Callback
{

    final r sS;

    public boolean handleMessage(Message message)
    {
        if (1 == message.what && r.cn().equals(message.obj))
        {
            u.cy().t(true);
            sS.dispatchLocalHits();
            u.cy().t(false);
            if (r.b(sS) > 0 && !r.c(sS))
            {
                r.d(sS).sendMessageDelayed(r.d(sS).obtainMessage(1, r.cn()), r.b(sS) * 1000);
            }
        }
        return true;
    }

    (r r1)
    {
        sS = r1;
        super();
    }
}
