// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.notify;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

// Referenced classes of package com.qihoo.security.notify:
//            b

protected static final class nit> extends Handler
{

    private final WeakReference a;

    public void handleMessage(Message message)
    {
        if (a != null && a.get() != null && message != null)
        {
            ((b)a.get()).a(message);
        }
    }

    public (b b1)
    {
        a = new WeakReference(b1);
    }
}
