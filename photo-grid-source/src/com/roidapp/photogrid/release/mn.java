// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.os.Handler;
import android.os.Message;
import com.roidapp.photogrid.common.y;

// Referenced classes of package com.roidapp.photogrid.release:
//            mm, ml, mp

final class mn extends Handler
{

    final mm a;

    mn(mm mm1)
    {
        a = mm1;
        super();
    }

    public final void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            a.a();
            return;

        case 2: // '\002'
            a.c(message.arg1, message.arg2);
            return;

        case 702: 
            a.l.sendEmptyMessage(15);
            y.a(a.h);
            return;

        case 700: 
            a.l.sendEmptyMessage(15);
            if (a.v != null)
            {
                a.v.N();
            }
            y.a(a.h, (String)message.obj);
            return;

        case 701: 
            a.l.sendEmptyMessage(15);
            if (a.v != null)
            {
                a.v.N();
            }
            y.b(a.h, (String)message.obj);
            return;

        case 703: 
            a.l.sendEmptyMessage(15);
            if (a.v != null)
            {
                a.v.N();
            }
            y.c(a.h, (String)message.obj);
            return;

        case 4: // '\004'
            a.a(false, false);
            return;

        case 6: // '\006'
            a.h();
            return;

        case 7: // '\007'
            a.e(message.arg1);
            return;

        case 8214: 
            a.e(message.arg1);
            return;

        case 8212: 
            a.a(false, true);
            return;

        case 8213: 
            a.g();
            return;
        }
    }
}
