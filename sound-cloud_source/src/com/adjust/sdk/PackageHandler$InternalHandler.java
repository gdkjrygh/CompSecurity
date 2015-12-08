// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

// Referenced classes of package com.adjust.sdk:
//            PackageHandler, ActivityPackage

private static final class packageHandlerReference extends Handler
{

    private static final int ADD = 2;
    private static final int INIT = 1;
    private static final int SEND_FIRST = 4;
    private static final int SEND_NEXT = 3;
    private final WeakReference packageHandlerReference;

    public final void handleMessage(Message message)
    {
        super.handleMessage(message);
        PackageHandler packagehandler = (PackageHandler)packageHandlerReference.get();
        if (packagehandler == null)
        {
            return;
        }
        switch (message.arg1)
        {
        default:
            return;

        case 1: // '\001'
            PackageHandler.access$000(packagehandler);
            return;

        case 2: // '\002'
            PackageHandler.access$100(packagehandler, (ActivityPackage)message.obj);
            return;

        case 4: // '\004'
            PackageHandler.access$200(packagehandler);
            return;

        case 3: // '\003'
            PackageHandler.access$300(packagehandler);
            return;
        }
    }

    protected (Looper looper, PackageHandler packagehandler)
    {
        super(looper);
        packageHandlerReference = new WeakReference(packagehandler);
    }
}
