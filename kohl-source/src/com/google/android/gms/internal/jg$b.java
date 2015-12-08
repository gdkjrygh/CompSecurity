// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.location.LocationListener;

// Referenced classes of package com.google.android.gms.internal:
//            jg

private static class VL extends com.google.android.gms.location.VL
{

    private Handler VL;

    public void onLocationChanged(Location location)
    {
        if (VL == null)
        {
            Log.e("LocationClientHelper", "Received a location in client after calling removeLocationUpdates.");
            return;
        } else
        {
            Message message = Message.obtain();
            message.what = 1;
            message.obj = location;
            VL.sendMessage(message);
            return;
        }
    }

    public void release()
    {
        VL = null;
    }

    ionListener(LocationListener locationlistener, Looper looper)
    {
        if (looper == null)
        {
            locationlistener = new <init>(locationlistener);
        } else
        {
            locationlistener = new <init>(locationlistener, looper);
        }
        VL = locationlistener;
    }
}
