// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.retouch;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.roidapp.imagelib.retouch:
//            m, t, u

final class s extends Handler
{

    final m a;

    private s(m m1)
    {
        a = m1;
        super();
    }

    s(m m1, byte byte0)
    {
        this(m1);
    }

    public final void handleMessage(Message message)
    {
        super.handleMessage(message);
        switch (message.what)
        {
        default:
            return;

        case 1026: 
            m.a(a, message.arg1);
            m.b(a, message.arg2);
            return;

        case 1029: 
            if (m.a(a) != null)
            {
                m.a(a).b();
            }
            m.b(a).set(false);
            return;

        case 1027: 
            (new Thread(new u(a, a.getActivity(), m.c(a), m.d(a), message.arg1))).start();
            return;

        case 1028: 
            m.a(a).a((Uri)message.obj);
            return;
        }
    }
}
