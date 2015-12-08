// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.gms.analytics:
//            q, t

class yp
    implements android.os.ler.Callback
{

    final q yp;

    public boolean handleMessage(Message message)
    {
        if (1 == message.what && q.ee().equals(message.obj))
        {
            t.ep().B(true);
            yp.dispatchLocalHits();
            t.ep().B(false);
            if (q.b(yp) > 0 && !q.c(yp))
            {
                q.d(yp).sendMessageDelayed(q.d(yp).obtainMessage(1, q.ee()), q.b(yp) * 1000);
            }
        }
        return true;
    }

    (q q1)
    {
        yp = q1;
        super();
    }
}
