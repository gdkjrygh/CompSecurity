// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

final class etj extends Handler
{

    private WeakReference a;

    public etj(eti eti1)
    {
        a = new WeakReference(eti1);
    }

    public final void handleMessage(Message message)
    {
        message = (eti)a.get();
        if (message != null)
        {
            for (message = eti.c(message).b.iterator(); message.hasNext(); ((etm)message.next()).a()) { }
            removeMessages(0);
            sendEmptyMessageDelayed(0, 5000L);
        }
    }
}
