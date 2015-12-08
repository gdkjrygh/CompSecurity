// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

final class mxi extends Handler
{

    private final WeakReference a;

    mxi(mxg mxg1)
    {
        a = new WeakReference(mxg1);
    }

    public final void handleMessage(Message message)
    {
        if (message.what == 0)
        {
            message = (mxg)a.get();
            if (message != null)
            {
                mxg.a(message);
            }
        }
    }
}
