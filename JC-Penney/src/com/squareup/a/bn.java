// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class bn extends Handler
{

    bn(Looper looper)
    {
        super(looper);
    }

    public void handleMessage(Message message)
    {
        sendMessageDelayed(obtainMessage(), 1000L);
    }
}
