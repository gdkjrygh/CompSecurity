// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.service;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.qihoo.security.locale.d;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.b.q;

// Referenced classes of package com.qihoo.security.opti.trashclear.service:
//            e

private class a extends Handler
{

    final e a;

    public void handleMessage(Message message)
    {
        super.handleMessage(message);
        long l;
        switch (message.what)
        {
        default:
            return;

        case 0: // '\0'
            l = ((Long)message.obj).longValue();
            break;
        }
        q.a().a(d.a().a(0x7f0c0228, new Object[] {
            Utils.getHumanReadableSizeMore(l)
        }), 0x7f020144);
    }

    public (e e1, Looper looper)
    {
        a = e1;
        super(looper);
    }
}
