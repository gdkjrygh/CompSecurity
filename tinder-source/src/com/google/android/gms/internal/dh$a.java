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
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.g;

// Referenced classes of package com.google.android.gms.internal:
//            dh

public static final class <init> extends Handler
{

    public final void a(g g1, f f1)
    {
        sendMessage(obtainMessage(1, new Pair(g1, f1)));
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
            message = (g)((Pair) (obj)).first;
            obj = (f)((Pair) (obj)).second;
            try
            {
                message.a(((f) (obj)));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                dh.b(((f) (obj)));
            }
            throw message;

        case 2: // '\002'
            ((dh)message.obj).b(Status.d);
            return;
        }
    }

    public tus()
    {
        this(Looper.getMainLooper());
    }

    public <init>(Looper looper)
    {
        super(looper);
    }
}
