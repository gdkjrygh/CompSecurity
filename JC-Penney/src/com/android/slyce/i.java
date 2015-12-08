// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.slyce.f.b;
import java.lang.ref.WeakReference;

class i extends Handler
{

    private WeakReference a;

    public i(b b1)
    {
        super(Looper.getMainLooper());
        a = new WeakReference(b1);
    }

    public void handleMessage(Message message)
    {
        b b1 = (b)a.get();
        if (b1 != null)
        {
            b1.a((String)message.obj);
        }
    }
}
