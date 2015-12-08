// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.common.api:
//            d

private final class Ku extends Handler
{

    final d Ku;

    public void handleMessage(Message message)
    {
        boolean flag = true;
        if (message.what != 1)
        {
            flag = false;
        }
        jx.L(flag);
        Ku.b((Ku)message.obj);
    }

    public (d d1, Looper looper)
    {
        Ku = d1;
        super(looper);
    }
}
