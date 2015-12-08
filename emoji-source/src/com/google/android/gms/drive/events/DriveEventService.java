// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.app.IntentService;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.internal.hm;
import java.util.concurrent.LinkedBlockingDeque;

// Referenced classes of package com.google.android.gms.drive.events:
//            DriveEvent, ChangeEvent, FileConflictEvent

public abstract class DriveEventService extends IntentService
{

    private static final LinkedBlockingDeque Ih = new LinkedBlockingDeque();
    private final String mName;

    protected DriveEventService()
    {
        this("DriveEventService");
    }

    protected DriveEventService(String s)
    {
        super(s);
        mName = s;
    }

    private void a(DriveEvent driveevent)
    {
        driveevent.getType();
        JVM INSTR tableswitch 1 2: default 173
    //                   1 56
    //                   2 117;
           goto _L1 _L2 _L3
_L1:
        Log.w(mName, (new StringBuilder()).append("Unrecognized event: ").append(driveevent).toString());
        return;
_L3:
        hm.a(driveevent instanceof FileConflictEvent, "Unexpected event type: %s", new Object[] {
            driveevent
        });
        a((FileConflictEvent)driveevent);
        return;
_L2:
        try
        {
            hm.a(driveevent instanceof ChangeEvent, "Unexpected event type: %s", new Object[] {
                driveevent
            });
            onChangeEvent((ChangeEvent)driveevent);
            return;
        }
        catch (ClassCastException classcastexception)
        {
            Log.wtf(mName, (new StringBuilder()).append("Service does not implement listener for type:").append(driveevent.getType()).toString(), classcastexception);
            return;
        }
        catch (Exception exception)
        {
            Log.w(mName, (new StringBuilder()).append("Error handling event: ").append(driveevent).toString(), exception);
        }
        return;
    }

    static LinkedBlockingDeque gn()
    {
        return Ih;
    }

    public void a(FileConflictEvent fileconflictevent)
    {
        Log.w("DriveEventService", (new StringBuilder()).append("Unhandled FileConflictEvent: ").append(fileconflictevent).toString());
    }

    public IBinder onBind(Intent intent)
    {
        return new Binder() {

            final DriveEventService Ii;

            protected boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            {
                Log.d("DriveEventService", "onTransact");
                parcel = (DriveEvent)parcel.readParcelable(Ii.getClassLoader());
                DriveEventService.gn().add(parcel);
                Ii.startService(new Intent(Ii, Ii.getClass()));
                return true;
            }

            
            {
                Ii = DriveEventService.this;
                super();
            }
        };
    }

    public void onChangeEvent(ChangeEvent changeevent)
    {
        Log.w("DriveEventService", (new StringBuilder()).append("Unhandled ChangeEvent: ").append(changeevent).toString());
    }

    protected final void onHandleIntent(Intent intent)
    {
        intent.setExtrasClassLoader(getClassLoader());
        DriveEvent driveevent = (DriveEvent)intent.getParcelableExtra("event");
        intent = driveevent;
        if (driveevent == null)
        {
            intent = (DriveEvent)Ih.poll();
        }
        if (intent != null)
        {
            a(intent);
            return;
        } else
        {
            Log.e("DriveEventService", "The event queue is unexpectedly empty.");
            return;
        }
    }

}
