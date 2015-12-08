// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.roidapp.photogrid.common:
//            ap

final class aq extends Handler
{

    final ap a;

    aq(ap ap1)
    {
        a = ap1;
        super();
    }

    public final void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            if (ap.a(a) != null)
            {
                ap.a(a).setVisibility(4);
            }
            if (ap.b(a) != null)
            {
                ap.b(a).setImageDrawable(ap.c(a));
            }
            sendEmptyMessageDelayed(2, 600L);
            return;

        case 2: // '\002'
            break;
        }
        if (ap.a(a) != null)
        {
            ap.a(a).setVisibility(0);
        }
        if (ap.b(a) != null)
        {
            ap.b(a).setImageDrawable(ap.d(a));
        }
        sendEmptyMessageDelayed(1, 600L);
    }
}
