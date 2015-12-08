// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.iid;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.google.android.gms.iid:
//            MessengerCompat, InstanceIDListenerService

final class b extends Handler
{

    final InstanceIDListenerService a;

    b(InstanceIDListenerService instanceidlistenerservice, Looper looper)
    {
        a = instanceidlistenerservice;
        super(looper);
    }

    public final void handleMessage(Message message)
    {
        InstanceIDListenerService.a(a, message, MessengerCompat.a(message));
    }
}
