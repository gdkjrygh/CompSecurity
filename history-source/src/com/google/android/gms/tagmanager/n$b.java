// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.google.android.gms.tagmanager:
//            n, bh

private class aqz extends Handler
{

    final n aqA;
    private final ainerHolder.ContainerAvailableListener aqz;

    public void cu(String s)
    {
        sendMessage(obtainMessage(1, s));
    }

    protected void cv(String s)
    {
        aqz.onContainerAvailable(aqA, s);
    }

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            bh.T("Don't know how to handle this message.");
            return;

        case 1: // '\001'
            cv((String)message.obj);
            break;
        }
    }

    public (n n1, ainerHolder.ContainerAvailableListener containeravailablelistener, Looper looper)
    {
        aqA = n1;
        super(looper);
        aqz = containeravailablelistener;
    }
}
