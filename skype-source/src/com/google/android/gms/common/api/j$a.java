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
//            j, h, g, Status

public static final class <init> extends Handler
{

    public final void a(h h1, g g1)
    {
        sendMessage(obtainMessage(1, new Pair(h1, g1)));
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
            message = (h)((Pair) (obj)).first;
            obj = (g)((Pair) (obj)).second;
            try
            {
                message.onResult(((g) (obj)));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                j.b(((g) (obj)));
            }
            throw message;

        case 2: // '\002'
            ((j)message.obj).b(Status.d);
            return;
        }
    }

    public us()
    {
        this(Looper.getMainLooper());
    }

    public <init>(Looper looper)
    {
        super(looper);
    }
}
