// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.services;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

// Referenced classes of package com.qihoo.security.services:
//            ScanEngineService

static class a extends Handler
{

    final WeakReference a;

    public void handleMessage(Message message)
    {
        if ((ScanEngineService)a.get() != null)
        {
            switch (message.what)
            {
            default:
                return;

            case 1: // '\001'
                break;
            }
            if (ScanEngineService.a())
            {
                System.exit(0);
                return;
            }
        }
    }

    public (ScanEngineService scanengineservice)
    {
        a = new WeakReference(scanengineservice);
    }
}
