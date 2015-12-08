// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.internal.fq;

// Referenced classes of package com.google.android.gms.drive.events:
//            DriveEvent, ChangeEvent, ConflictEvent

public abstract class DriveEventService extends IntentService
{

    private final String mName;

    protected DriveEventService(String s)
    {
        super(s);
        mName = s;
    }

    public void a(ConflictEvent conflictevent)
    {
        Log.w("DriveEventService", (new StringBuilder()).append("Unhandled ConflictEvent: ").append(conflictevent).toString());
    }

    public void onChangeEvent(ChangeEvent changeevent)
    {
        Log.w("DriveEventService", (new StringBuilder()).append("Unhandled ChangeEvent: ").append(changeevent).toString());
    }

    protected final void onHandleIntent(Intent intent)
    {
        DriveEvent driveevent;
        intent.setExtrasClassLoader(getClassLoader());
        driveevent = (DriveEvent)intent.getParcelableExtra("event");
        driveevent.getType();
        JVM INSTR tableswitch 1 2: default 211
    //                   1 76
    //                   2 146;
           goto _L1 _L2 _L3
_L1:
        Log.w(mName, (new StringBuilder()).append("Unrecognized event: ").append(intent).toString());
        return;
_L3:
        fq.a(driveevent instanceof ConflictEvent, (new StringBuilder()).append("Unexpected event type: ").append(driveevent).toString());
        a((ConflictEvent)driveevent);
        return;
_L2:
        try
        {
            fq.a(driveevent instanceof ChangeEvent, (new StringBuilder()).append("Unexpected event type: ").append(driveevent).toString());
            onChangeEvent((ChangeEvent)driveevent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            Log.wtf(mName, (new StringBuilder()).append("Service does not implement listener for type:").append(driveevent.getType()).toString(), intent);
            return;
        }
        catch (Exception exception)
        {
            Log.w(mName, (new StringBuilder()).append("Error handling event: ").append(intent).toString(), exception);
        }
        return;
    }
}
