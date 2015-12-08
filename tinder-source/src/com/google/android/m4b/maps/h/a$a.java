// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.h;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;

// Referenced classes of package com.google.android.m4b.maps.h:
//            a, q

public static final class <init> extends Handler
{

    public final void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            Log.wtf("AbstractPendingResult", "Don't know how to handle this message.");
            return;

        case 1: // '\001'
            message = (Pair)message.obj;
            Object obj = ((Pair) (message)).first;
            message = ((Message) (((Pair) (message)).second));
            return;

        case 2: // '\002'
            ((a)message.obj).b(q.c);
            break;
        }
    }

    public ()
    {
        this(Looper.getMainLooper());
    }

    public <init>(Looper looper)
    {
        super(looper);
    }
}
