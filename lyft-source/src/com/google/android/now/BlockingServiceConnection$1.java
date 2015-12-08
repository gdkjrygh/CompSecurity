// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.now;

import android.content.Context;
import android.util.Log;

// Referenced classes of package com.google.android.now:
//            BlockingServiceConnection

class a
    implements Runnable
{

    final Context a;
    final BlockingServiceConnection b;

    public void run()
    {
        if (BlockingServiceConnection.a(b))
        {
            a.unbindService(b);
            return;
        } else
        {
            Log.w("BlockingServiceConnection", "Service disconnected before unbinding");
            return;
        }
    }

    (BlockingServiceConnection blockingserviceconnection, Context context)
    {
        b = blockingserviceconnection;
        a = context;
        super();
    }
}
