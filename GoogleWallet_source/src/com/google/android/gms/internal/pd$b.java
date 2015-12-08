// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.location.Location;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

// Referenced classes of package com.google.android.gms.internal:
//            pd

static final class  extends com.google.android.gms.location.
{

    private Handler avE;

    public final void onLocationChanged(Location location)
    {
        if (avE == null)
        {
            Log.e("LocationClientHelper", "Received a location in client after calling removeLocationUpdates.");
            return;
        } else
        {
            Message message = Message.obtain();
            message.what = 1;
            message.obj = location;
            avE.sendMessage(message);
            return;
        }
    }
}
