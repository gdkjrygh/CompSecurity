// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.os.Handler;
import android.os.Message;
import android.widget.RelativeLayout;

// Referenced classes of package com.roidapp.photogrid.release:
//            c

final class n extends Handler
{

    final c a;

    n(c c1)
    {
        a = c1;
        super();
    }

    public final void handleMessage(Message message)
    {
        super.handleMessage(message);
        c c1;
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            c1 = a;
            break;
        }
        message = ((Message) (message.obj));
        c.k(c1);
        c.l(a).setVisibility(4);
        c.m(a);
    }
}
