// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.gms.analytics:
//            v, y

class zg
    implements android.os.ler.Callback
{

    final v zg;

    public boolean handleMessage(Message message)
    {
        if (1 == message.what && v.ez().equals(message.obj))
        {
            y.eK().D(true);
            zg.dispatchLocalHits();
            y.eK().D(false);
            if (v.b(zg) > 0 && !v.c(zg))
            {
                v.d(zg).sendMessageDelayed(v.d(zg).obtainMessage(1, v.ez()), v.b(zg) * 1000);
            }
        }
        return true;
    }

    (v v1)
    {
        zg = v1;
        super();
    }
}
