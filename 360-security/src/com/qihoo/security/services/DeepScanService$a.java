// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.services;

import android.os.Handler;
import android.os.Message;
import com.qihoo.security.engine.b.c;
import java.lang.ref.WeakReference;

// Referenced classes of package com.qihoo.security.services:
//            DeepScanService, d

private class a extends Handler
{

    final WeakReference a;
    final DeepScanService b;

    public void handleMessage(Message message)
    {
        DeepScanService deepscanservice = (DeepScanService)a.get();
        if (deepscanservice != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        switch (message.what)
        {
        default:
            return;

        case 4: // '\004'
            continue; /* Loop/switch isn't completed */

        case 1: // '\001'
            if (DeepScanService.a)
            {
                if (b.d.e != null)
                {
                    b.d.e.c();
                }
                System.exit(0);
                return;
            }
            break;

        case 2: // '\002'
            deepscanservice.d.e.a();
            return;

        case 3: // '\003'
            deepscanservice.d.c();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (b.d.e == null) goto _L1; else goto _L4
_L4:
        b.d.e.b();
        return;
    }

    public (DeepScanService deepscanservice, DeepScanService deepscanservice1)
    {
        b = deepscanservice;
        super();
        a = new WeakReference(deepscanservice1);
    }
}
