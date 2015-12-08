// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.google.android.gms.tagmanager:
//            n, bh

private class aeG extends Handler
{

    private final ainerHolder.ContainerAvailableListener aeG;
    final n aeH;

    public void bK(String s)
    {
        sendMessage(obtainMessage(1, s));
    }

    protected void bL(String s)
    {
        aeG.onContainerAvailable(aeH, s);
    }

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            bh.A("Don't know how to handle this message.");
            return;

        case 1: // '\001'
            bL((String)message.obj);
            break;
        }
    }

    public (n n1, ainerHolder.ContainerAvailableListener containeravailablelistener, Looper looper)
    {
        aeH = n1;
        super(looper);
        aeG = containeravailablelistener;
    }
}
