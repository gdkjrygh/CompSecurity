// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.gms.analytics:
//            r, u

class ug
    implements android.os.ler.Callback
{

    final r ug;

    public boolean handleMessage(Message message)
    {
        if (1 == message.what && r.cJ().equals(message.obj))
        {
            u.cU().u(true);
            ug.dispatchLocalHits();
            u.cU().u(false);
            if (r.b(ug) > 0 && !r.c(ug))
            {
                r.d(ug).sendMessageDelayed(r.d(ug).obtainMessage(1, r.cJ()), r.b(ug) * 1000);
            }
        }
        return true;
    }

    (r r1)
    {
        ug = r1;
        super();
    }
}
