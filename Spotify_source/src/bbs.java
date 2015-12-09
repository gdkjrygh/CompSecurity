// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class bbs extends Handler
{

    private bbo a;

    public bbs(bbo bbo1, Looper looper)
    {
        a = bbo1;
        super(looper);
    }

    public final void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            throw new RuntimeException();

        case 1: // '\001'
            break MISSING_BLOCK_LABEL_86;

        case 0: // '\0'
            break;
        }
          goto _L1
        Object obj;
        obj;
_L2:
        a.c.obtainMessage(message.what, obj).sendToTarget();
        return;
_L1:
        obj = a.b.a(a.d, (android.media.MediaDrm.ProvisionRequest)message.obj);
          goto _L2
        obj = a.b.a(a.d, (android.media.MediaDrm.KeyRequest)message.obj);
          goto _L2
    }
}
