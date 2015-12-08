// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.google.android.gms.tagmanager:
//            n, bh

private class WX extends Handler
{

    private final ainerHolder.ContainerAvailableListener WX;
    final n WY;

    public void bs(String s)
    {
        sendMessage(obtainMessage(1, s));
    }

    protected void bt(String s)
    {
        WX.onContainerAvailable(WY, s);
    }

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            bh.w("Don't know how to handle this message.");
            return;

        case 1: // '\001'
            bt((String)message.obj);
            break;
        }
    }

    public (n n1, ainerHolder.ContainerAvailableListener containeravailablelistener, Looper looper)
    {
        WY = n1;
        super(looper);
        WX = containeravailablelistener;
    }
}
