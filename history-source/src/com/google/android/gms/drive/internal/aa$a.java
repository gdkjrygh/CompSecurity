// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangeListener;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.CompletionListener;
import com.google.android.gms.drive.events.DriveEvent;
import com.google.android.gms.drive.events.c;

// Referenced classes of package com.google.android.gms.drive.internal:
//            aa, w

private static class <init> extends Handler
{

    private final Context mContext;

    public void a(c c1, DriveEvent driveevent)
    {
        sendMessage(obtainMessage(1, new Pair(c1, driveevent)));
    }

    public void handleMessage(Message message)
    {
        Object obj;
        switch (message.what)
        {
        default:
            w.e(mContext, "EventCallback", "Don't know how to handle this event");
            return;

        case 1: // '\001'
            obj = (Pair)message.obj;
            break;
        }
        message = (c)((Pair) (obj)).first;
        obj = (DriveEvent)((Pair) (obj)).second;
        switch (((DriveEvent) (obj)).getType())
        {
        default:
            w.o("EventCallback", (new StringBuilder()).append("Unexpected event: ").append(obj).toString());
            return;

        case 1: // '\001'
            ((ChangeListener)message).onChange((ChangeEvent)obj);
            return;

        case 2: // '\002'
            ((CompletionListener)message).onCompletion((CompletionEvent)obj);
            break;
        }
    }

    private ent(Looper looper, Context context)
    {
        super(looper);
        mContext = context;
    }

    mContext(Looper looper, Context context, mContext mcontext)
    {
        this(looper, context);
    }
}
