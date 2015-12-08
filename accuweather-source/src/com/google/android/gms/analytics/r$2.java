// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.gms.analytics:
//            r, u

class ud
    implements android.os.ler.Callback
{

    final r ud;

    public boolean handleMessage(Message message)
    {
        if (1 == message.what && r.cE().equals(message.obj))
        {
            u.cP().u(true);
            ud.dispatchLocalHits();
            u.cP().u(false);
            if (r.b(ud) > 0 && !r.c(ud))
            {
                r.d(ud).sendMessageDelayed(r.d(ud).obtainMessage(1, r.cE()), r.b(ud) * 1000);
            }
        }
        return true;
    }

    (r r1)
    {
        ud = r1;
        super();
    }
}
