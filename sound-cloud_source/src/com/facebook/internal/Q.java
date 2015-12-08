// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.facebook.internal:
//            P

final class Q extends Handler
{

    final P a;

    Q(P p)
    {
        a = p;
        super();
    }

    public final void handleMessage(Message message)
    {
        P p = a;
        if (message.what == p.d)
        {
            message = message.getData();
            if (message.getString("com.facebook.platform.status.ERROR_TYPE") != null)
            {
                p.b(null);
            } else
            {
                p.b(message);
            }
            p.a.unbindService(p);
        }
    }
}
