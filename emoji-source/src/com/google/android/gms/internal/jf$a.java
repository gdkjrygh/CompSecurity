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
//            jf

private static class VN extends Handler
{

    private final LocationListener VN;

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            Log.e("LocationClientHelper", "unknown message in LocationHandler.handleMessage");
            return;

        case 1: // '\001'
            message = new Location((Location)message.obj);
            break;
        }
        VN.onLocationChanged(message);
    }

    public ionListener(LocationListener locationlistener)
    {
        VN = locationlistener;
    }

    public ionListener(LocationListener locationlistener, Looper looper)
    {
        super(looper);
        VN = locationlistener;
    }
}
