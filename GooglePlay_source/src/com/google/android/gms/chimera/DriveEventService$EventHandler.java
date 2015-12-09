// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.chimera;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.drive.internal.DriveLog;
import com.google.android.gms.drive.internal.OnEventResponse;

// Referenced classes of package com.google.android.gms.chimera:
//            DriveEventService

final class this._cls0 extends Handler
{

    final DriveEventService this$0;

    public final void handleMessage(Message message)
    {
        DriveLog.d("DriveEventService", (new StringBuilder("handleMessage message type:")).append(message.what).toString());
        switch (message.what)
        {
        default:
            DriveLog.w("DriveEventService", (new StringBuilder("Unexpected message type:")).append(message.what).toString());
            return;

        case 1: // '\001'
            DriveEventService.access$000(DriveEventService.this, (OnEventResponse)message.obj);
            return;

        case 2: // '\002'
            getLooper().quit();
            break;
        }
    }



    ()
    {
        this$0 = DriveEventService.this;
        super();
    }
}
