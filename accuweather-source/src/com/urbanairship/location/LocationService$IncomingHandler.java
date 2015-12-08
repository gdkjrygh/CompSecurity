// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.location;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.urbanairship.Logger;

// Referenced classes of package com.urbanairship.location:
//            LocationService

protected class this._cls0 extends Handler
{

    final LocationService this$0;

    public void handleMessage(Message message)
    {
        Logger.verbose((new StringBuilder()).append("Location service received message: ").append(message).toString());
        switch (message.what)
        {
        case 3: // '\003'
        case 4: // '\004'
        default:
            Logger.error((new StringBuilder()).append("Unexpected message sent to location service: ").append(message).toString());
            return;

        case 2: // '\002'
            LocationService.access$200(LocationService.this, message);
            return;

        case 1: // '\001'
            LocationService.access$300(LocationService.this, message);
            return;

        case 5: // '\005'
            LocationService.access$400(LocationService.this, message);
            return;

        case 6: // '\006'
            LocationService.access$500(LocationService.this, message);
            return;

        case 7: // '\007'
            LocationService.access$600(LocationService.this, (Intent)message.obj);
            break;
        }
        stopSelf(message.arg1);
    }

    public (Looper looper)
    {
        this$0 = LocationService.this;
        super(looper);
    }
}
