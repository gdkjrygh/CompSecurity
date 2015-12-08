// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangeListener;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.CompletionListener;
import com.google.android.gms.drive.events.DriveEvent;
import com.google.android.gms.drive.events.c;
import com.google.android.gms.internal.jx;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OnEventResponse, w

public class aa extends ag.a
{
    private static class a extends Handler
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

        private a(Looper looper, Context context)
        {
            super(looper);
            mContext = context;
        }

    }


    private final int Pm;
    private final c Qw;
    private final a Qx;
    private final List Qy = new ArrayList();

    public aa(Looper looper, Context context, int i, c c1)
    {
        Pm = i;
        Qw = c1;
        Qx = new a(looper, context);
    }

    public void bw(int i)
    {
        Qy.add(Integer.valueOf(i));
    }

    public boolean bx(int i)
    {
        return Qy.contains(Integer.valueOf(i));
    }

    public void c(OnEventResponse oneventresponse)
        throws RemoteException
    {
        oneventresponse = oneventresponse.iQ();
        boolean flag;
        if (Pm == oneventresponse.getType())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.K(flag);
        jx.K(Qy.contains(Integer.valueOf(oneventresponse.getType())));
        Qx.a(Qw, oneventresponse);
    }
}
