// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class d.os.Looper extends Handler
{

    public final void handleMessage(Message message)
    {
        sendMessageDelayed(obtainMessage(), 1000L);
    }

    (Looper looper)
    {
        super(looper);
    }
}
