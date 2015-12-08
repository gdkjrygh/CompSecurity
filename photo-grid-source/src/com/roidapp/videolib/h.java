// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.roidapp.videolib:
//            g

final class h extends Handler
{

    final g a;

    h(g g1)
    {
        a = g1;
        super();
    }

    public final void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            g.a(a, true, "");
            return;

        case 2: // '\002'
            g.a(a, false, (String)message.obj);
            break;
        }
    }
}
