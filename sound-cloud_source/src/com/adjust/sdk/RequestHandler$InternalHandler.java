// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

// Referenced classes of package com.adjust.sdk:
//            RequestHandler, ActivityPackage

private static final class requestHandlerReference extends Handler
{

    private static final int SEND = 0x11ad0;
    private final WeakReference requestHandlerReference;

    public final void handleMessage(Message message)
    {
        super.handleMessage(message);
        RequestHandler requesthandler = (RequestHandler)requestHandlerReference.get();
        if (requesthandler == null)
        {
            return;
        }
        switch (message.arg1)
        {
        default:
            return;

        case 72400: 
            RequestHandler.access$000(requesthandler, (ActivityPackage)message.obj);
            break;
        }
    }

    protected (Looper looper, RequestHandler requesthandler)
    {
        super(looper);
        requestHandlerReference = new WeakReference(requesthandler);
    }
}
