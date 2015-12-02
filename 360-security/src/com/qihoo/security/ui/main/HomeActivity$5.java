// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.main;

import android.os.Handler;
import android.os.Message;
import com.qihoo360.mobilesafe.b.q;

// Referenced classes of package com.qihoo.security.ui.main:
//            HomeActivity

class a extends Handler
{

    final HomeActivity a;

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            q.a().a((String)message.obj);
            break;
        }
    }

    (HomeActivity homeactivity)
    {
        a = homeactivity;
        super();
    }
}
