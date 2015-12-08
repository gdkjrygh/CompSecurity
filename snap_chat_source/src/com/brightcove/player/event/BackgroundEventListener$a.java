// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.event;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

// Referenced classes of package com.brightcove.player.event:
//            BackgroundEventListener, Event

static final class a extends Handler
{

    private final WeakReference a;

    static String a(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 2: // '\002'
            return "MESSAGE_PROCESS_EVENT";

        case 1: // '\001'
            return "MESSAGE_SHUTDOWN";
        }
    }

    static String b(int i)
    {
        return a(i);
    }

    public final void handleMessage(Message message)
    {
        BackgroundEventListener backgroundeventlistener = (BackgroundEventListener)a.get();
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            if (android.os.dEventListener.a.a >= 18)
            {
                getLooper().quitSafely();
            } else
            {
                getLooper().quit();
            }
            BackgroundEventListener.a(backgroundeventlistener);
            return;

        case 2: // '\002'
            backgroundeventlistener.backgroundProcessEvent((Event)message.obj);
            return;
        }
    }

    (BackgroundEventListener backgroundeventlistener)
    {
        a = new WeakReference(backgroundeventlistener);
    }
}
