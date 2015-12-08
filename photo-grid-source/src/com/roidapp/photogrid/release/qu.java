// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.roidapp.photogrid.release:
//            RetouchActivity

final class qu extends Handler
{

    final RetouchActivity a;

    private qu(RetouchActivity retouchactivity)
    {
        a = retouchactivity;
        super();
    }

    qu(RetouchActivity retouchactivity, byte byte0)
    {
        this(retouchactivity);
    }

    public final void handleMessage(Message message)
    {
        super.handleMessage(message);
        switch (message.what)
        {
        default:
            return;

        case 1026: 
            a.a = message.arg1;
            break;
        }
        a.b = message.arg2;
    }
}
