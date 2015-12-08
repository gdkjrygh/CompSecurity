// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.api.s;

// Referenced classes of package com.google.android.gms.internal:
//            tq

public final class tr extends Handler
{

    public tr()
    {
        this(Looper.getMainLooper());
    }

    public tr(Looper looper)
    {
        super(looper);
    }

    public final void a(s s1, r r1)
    {
        sendMessage(obtainMessage(1, new Pair(s1, r1)));
    }

    public final void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            Log.wtf("BasePendingResult", (new StringBuilder("Don't know how to handle message: ")).append(message.what).toString(), new Exception());
            return;

        case 1: // '\001'
            Object obj = (Pair)message.obj;
            message = (s)((Pair) (obj)).first;
            obj = (r)((Pair) (obj)).second;
            try
            {
                message.a(((r) (obj)));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                tq.b(((r) (obj)));
            }
            throw message;

        case 2: // '\002'
            ((tq)message.obj).c(Status.d);
            return;
        }
    }
}
