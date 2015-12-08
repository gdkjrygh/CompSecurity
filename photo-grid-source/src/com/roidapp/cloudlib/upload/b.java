// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.upload;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.roidapp.cloudlib.upload:
//            a

final class b extends Handler
{

    final a a;

    public b(a a1, Looper looper)
    {
        a = a1;
        super(looper);
    }

    public final void handleMessage(Message message)
    {
        a.a((Intent)message.obj);
        a.stopSelf(message.arg1);
    }
}
