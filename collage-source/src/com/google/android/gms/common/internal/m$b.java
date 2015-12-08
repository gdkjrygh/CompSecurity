// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.common.internal:
//            m

final class a extends Handler
{

    final m a;

    private void a(Message message)
    {
        message = (a)message.obj;
        message.b();
        message.d();
    }

    private boolean b(Message message)
    {
        return message.what == 2 || message.what == 1 || message.what == 5 || message.what == 6;
    }

    public void handleMessage(Message message)
    {
        if (a.zzadE.get() != message.arg1)
        {
            if (b(message))
            {
                a(message);
            }
            return;
        }
        if ((message.what == 1 || message.what == 5 || message.what == 6) && !a.isConnecting())
        {
            a(message);
            return;
        }
        if (message.what == 3)
        {
            message = new ConnectionResult(message.arg2, null);
            m.zza(a).a(message);
            a.onConnectionFailed(message);
            return;
        }
        if (message.what == 4)
        {
            m.zza(a, 4, null);
            if (m.zzb(a) != null)
            {
                m.zzb(a).onConnectionSuspended(message.arg2);
            }
            a.onConnectionSuspended(message.arg2);
            m.zza(a, 4, 1, null);
            return;
        }
        if (message.what == 2 && !a.isConnected())
        {
            a(message);
            return;
        }
        if (b(message))
        {
            ((b)message.obj).c();
            return;
        } else
        {
            Log.wtf("GmsClient", "Don't know how to handle this message.");
            return;
        }
    }

    public ult(m m1, Looper looper)
    {
        a = m1;
        super(looper);
    }
}
