// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.drive.internal.OnEventResponse;
import com.google.android.gms.drive.internal.v;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.drive.events:
//            ChangeListener, CompletionListener, DriveEvent, ChangeEvent, 
//            CompletionEvent

public abstract class DriveEventService extends Service
    implements ChangeListener, CompletionListener
{
    final class a extends Handler
    {

        final DriveEventService NZ;

        static Message a(a a1)
        {
            return a1.hW();
        }

        static Message a(a a1, OnEventResponse oneventresponse)
        {
            return a1.b(oneventresponse);
        }

        private Message b(OnEventResponse oneventresponse)
        {
            return obtainMessage(1, oneventresponse);
        }

        private Message hW()
        {
            return obtainMessage(2);
        }

        public void handleMessage(Message message)
        {
            v.n("DriveEventService", (new StringBuilder()).append("handleMessage message type:").append(message.what).toString());
            switch (message.what)
            {
            default:
                v.p("DriveEventService", (new StringBuilder()).append("Unexpected message type:").append(message.what).toString());
                return;

            case 1: // '\001'
                DriveEventService.a(NZ, (OnEventResponse)message.obj);
                return;

            case 2: // '\002'
                getLooper().quit();
                break;
            }
        }

        a()
        {
            NZ = DriveEventService.this;
            super();
        }
    }

    final class b extends com.google.android.gms.drive.internal.ad.a
    {

        final DriveEventService NZ;

        public void c(OnEventResponse oneventresponse)
            throws RemoteException
        {
            synchronized (NZ)
            {
                v.n("DriveEventService", (new StringBuilder()).append("onEvent: ").append(oneventresponse).toString());
                o.i(NZ.NW);
                DriveEventService.a(NZ);
                oneventresponse = a.a(NZ.NW, oneventresponse);
                NZ.NW.sendMessage(oneventresponse);
            }
            return;
            oneventresponse;
            driveeventservice;
            JVM INSTR monitorexit ;
            throw oneventresponse;
        }

        b()
        {
            NZ = DriveEventService.this;
            super();
        }
    }


    public static final String ACTION_HANDLE_EVENT = "com.google.android.gms.drive.events.HANDLE_EVENT";
    private CountDownLatch NV;
    a NW;
    int NX;
    private final String mName;

    protected DriveEventService()
    {
        this("DriveEventService");
    }

    protected DriveEventService(String s)
    {
        NX = -1;
        mName = s;
    }

    static void a(DriveEventService driveeventservice)
        throws SecurityException
    {
        driveeventservice.hV();
    }

    static void a(DriveEventService driveeventservice, OnEventResponse oneventresponse)
    {
        driveeventservice.a(oneventresponse);
    }

    private void a(OnEventResponse oneventresponse)
    {
        oneventresponse = oneventresponse.ih();
        v.n("DriveEventService", (new StringBuilder()).append("handleEventMessage: ").append(oneventresponse).toString());
        oneventresponse.getType();
        JVM INSTR tableswitch 1 2: default 130
    //                   1 83
    //                   2 121;
           goto _L1 _L2 _L3
_L1:
        v.p(mName, (new StringBuilder()).append("Unhandled event: ").append(oneventresponse).toString());
        return;
_L2:
        try
        {
            onChange((ChangeEvent)oneventresponse);
            return;
        }
        catch (Exception exception)
        {
            v.a(mName, exception, (new StringBuilder()).append("Error handling event: ").append(oneventresponse).toString());
        }
        return;
_L3:
        onCompletion((CompletionEvent)oneventresponse);
        return;
    }

    static CountDownLatch b(DriveEventService driveeventservice)
    {
        return driveeventservice.NV;
    }

    private boolean bc(int i)
    {
        String as[];
        boolean flag;
        boolean flag1;
        flag1 = false;
        as = getPackageManager().getPackagesForUid(i);
        flag = flag1;
        if (as == null) goto _L2; else goto _L1
_L1:
        int j;
        j = as.length;
        i = 0;
_L7:
        flag = flag1;
        if (i >= j) goto _L2; else goto _L3
_L3:
        if (!"com.google.android.gms".equals(as[i])) goto _L5; else goto _L4
_L4:
        flag = true;
_L2:
        return flag;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void hV()
        throws SecurityException
    {
        int i = getCallingUid();
        if (i == NX)
        {
            return;
        }
        if (GooglePlayServicesUtil.b(getPackageManager(), "com.google.android.gms") && bc(i))
        {
            NX = i;
            return;
        } else
        {
            throw new SecurityException("Caller is not GooglePlayServices");
        }
    }

    protected int getCallingUid()
    {
        return Binder.getCallingUid();
    }

    public final IBinder onBind(Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        if (!"com.google.android.gms.drive.events.HANDLE_EVENT".equals(intent.getAction())) goto _L2; else goto _L1
_L1:
        if (NW != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        intent = new CountDownLatch(1);
        NV = new CountDownLatch(1);
        (new Thread(intent) {

            final CountDownLatch NY;
            final DriveEventService NZ;

            public void run()
            {
                Looper.prepare();
                NZ.NW = NZ. new a();
                NY.countDown();
                v.n("DriveEventService", "Bound and starting loop");
                Looper.loop();
                v.n("DriveEventService", "Finished loop");
                DriveEventService.b(NZ).countDown();
                return;
                Exception exception;
                exception;
                DriveEventService.b(NZ).countDown();
                throw exception;
            }

            
            {
                NZ = DriveEventService.this;
                NY = countdownlatch;
                super();
            }
        }).start();
        intent.await(5000L, TimeUnit.MILLISECONDS);
        intent = (new b()).asBinder();
_L4:
        this;
        JVM INSTR monitorexit ;
        return intent;
        intent;
        throw new RuntimeException("Unable to start event handler", intent);
        intent;
        this;
        JVM INSTR monitorexit ;
        throw intent;
_L2:
        intent = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onChange(ChangeEvent changeevent)
    {
        v.p(mName, (new StringBuilder()).append("Unhandled change event: ").append(changeevent).toString());
    }

    public void onCompletion(CompletionEvent completionevent)
    {
        v.p(mName, (new StringBuilder()).append("Unhandled completion event: ").append(completionevent).toString());
    }

    public void onDestroy()
    {
        this;
        JVM INSTR monitorenter ;
        v.n("DriveEventService", "onDestroy");
        if (NW == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        Message message = a.a(NW);
        NW.sendMessage(message);
        NW = null;
        Exception exception;
        try
        {
            NV.await(5000L, TimeUnit.MILLISECONDS);
        }
        catch (InterruptedException interruptedexception) { }
        NV = null;
        super.onDestroy();
        this;
        JVM INSTR monitorexit ;
        return;
        exception;
        throw exception;
    }

    public boolean onUnbind(Intent intent)
    {
        return true;
    }
}
