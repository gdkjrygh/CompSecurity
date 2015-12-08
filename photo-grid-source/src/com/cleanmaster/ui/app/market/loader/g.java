// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market.loader;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.cleanmaster.ui.app.market.loader:
//            f, AsyncTaskEx

final class g extends Handler
{

    private g()
    {
    }

    g(byte byte0)
    {
        this();
    }

    public final void handleMessage(Message message)
    {
        f f1 = (f)message.obj;
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            AsyncTaskEx.c(f1.a, f1.b[0]);
            return;

        case 2: // '\002'
            f1.a.b(f1.b);
            break;
        }
    }
}
