// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.gms.analytics:
//            at, y

class a
    implements android.os.er.Callback
{

    final at a;

    public boolean handleMessage(Message message)
    {
        if (1 == message.what && at.f().equals(message.obj))
        {
            y.a().a(true);
            a.a();
            y.a().a(false);
            if (at.b(a) > 0 && !at.c(a))
            {
                at.d(a).sendMessageDelayed(at.d(a).obtainMessage(1, at.f()), at.b(a) * 1000);
            }
        }
        return true;
    }

    (at at1)
    {
        a = at1;
        super();
    }
}
