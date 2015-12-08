// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.service;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.arist.c.a;

// Referenced classes of package com.arist.service:
//            MediaButtonReceiver

final class d extends Handler
{

    Context a;
    final MediaButtonReceiver b;

    public d(MediaButtonReceiver mediabuttonreceiver, Context context)
    {
        b = mediabuttonreceiver;
        super();
        a = context;
    }

    public final void handleMessage(Message message)
    {
        if (message.what == 0)
        {
            a.sendBroadcast(new Intent(a.b));
        } else
        {
            if (1 == message.what)
            {
                a.sendBroadcast(new Intent(a.g));
                return;
            }
            if (2 == message.what)
            {
                a.sendBroadcast(new Intent(a.f));
                return;
            }
        }
    }
}
