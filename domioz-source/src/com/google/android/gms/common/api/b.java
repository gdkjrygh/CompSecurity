// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;

// Referenced classes of package com.google.android.gms.common.api:
//            v, u, a

public final class b extends Handler
{

    public b()
    {
        this(Looper.getMainLooper());
    }

    public b(Looper looper)
    {
        super(looper);
    }

    public final void a(v v1, u u1)
    {
        sendMessage(obtainMessage(1, new Pair(v1, u1)));
    }

    public final void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            Log.wtf("AbstractPendingResult", "Don't know how to handle this message.");
            return;

        case 1: // '\001'
            Object obj = (Pair)message.obj;
            message = (v)((Pair) (obj)).first;
            obj = (u)((Pair) (obj)).second;
            try
            {
                message.onResult(((u) (obj)));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                com.google.android.gms.common.api.a.b(((u) (obj)));
            }
            throw message;

        case 2: // '\002'
            ((a)message.obj).d();
            return;
        }
    }
}
