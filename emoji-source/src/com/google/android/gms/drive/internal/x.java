// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.drive.events.DriveEvent;
import com.google.android.gms.internal.hm;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OnEventResponse

public class x extends ac.a
{
    private static class a extends Handler
    {

        public void a(com.google.android.gms.drive.events.DriveEvent.Listener listener, DriveEvent driveevent)
        {
            sendMessage(obtainMessage(1, new Pair(listener, driveevent)));
        }

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                Log.wtf("EventCallback", "Don't know how to handle this event");
                return;

            case 1: // '\001'
                message = (Pair)message.obj;
                break;
            }
            ((com.google.android.gms.drive.events.DriveEvent.Listener)((Pair) (message)).first).onEvent((DriveEvent)((Pair) (message)).second);
        }

        private a(Looper looper)
        {
            super(looper);
        }

    }


    private final int Iq;
    private final com.google.android.gms.drive.events.DriveEvent.Listener Jn;
    private final a Jo;

    public x(Looper looper, int i, com.google.android.gms.drive.events.DriveEvent.Listener listener)
    {
        Iq = i;
        Jn = listener;
        Jo = new a(looper);
    }

    public void a(OnEventResponse oneventresponse)
        throws RemoteException
    {
        boolean flag;
        if (Iq == oneventresponse.getEventType())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hm.A(flag);
        switch (oneventresponse.getEventType())
        {
        default:
            Log.w("EventCallback", (new StringBuilder()).append("Unexpected event type:").append(oneventresponse.getEventType()).toString());
            return;

        case 1: // '\001'
            Jo.a(Jn, oneventresponse.gw());
            return;

        case 2: // '\002'
            Jo.a(Jn, oneventresponse.gx());
            break;
        }
    }
}
