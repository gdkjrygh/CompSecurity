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
import com.google.android.gms.internal.fq;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OnEventResponse

public class s extends w.a
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


    private final int ES;
    private final a FA;
    private final com.google.android.gms.drive.events.DriveEvent.Listener Fz;

    public s(Looper looper, int i, com.google.android.gms.drive.events.DriveEvent.Listener listener)
    {
        ES = i;
        Fz = listener;
        FA = new a(looper);
    }

    public void a(OnEventResponse oneventresponse)
        throws RemoteException
    {
        boolean flag;
        if (ES == oneventresponse.getEventType())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fq.x(flag);
        switch (oneventresponse.getEventType())
        {
        default:
            Log.w("EventCallback", (new StringBuilder()).append("Unexpected event type:").append(oneventresponse.getEventType()).toString());
            return;

        case 1: // '\001'
            FA.a(Fz, oneventresponse.fL());
            return;

        case 2: // '\002'
            FA.a(Fz, oneventresponse.fM());
            break;
        }
    }
}
