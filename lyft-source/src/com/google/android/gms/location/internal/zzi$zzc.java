// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.location.LocationListener;

class a extends com.google.android.gms.location..zzi.zzc
{

    private Handler a;

    public void a()
    {
        a = null;
    }

    public void a(Location location)
    {
        if (a == null)
        {
            Log.e("LocationClientHelper", "Received a location in client after calling removeLocationUpdates.");
            return;
        } else
        {
            Message message = Message.obtain();
            message.what = 1;
            message.obj = location;
            a.sendMessage(message);
            return;
        }
    }

    (LocationListener locationlistener, Looper looper)
    {
        if (looper == null)
        {
            boolean flag;
            if (Looper.myLooper() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.a(flag, "Can't create handler inside thread that has not called Looper.prepare()");
        }
        if (looper == null)
        {
            locationlistener = new <init>(locationlistener);
        } else
        {
            locationlistener = new <init>(locationlistener, looper);
        }
        a = locationlistener;
    }
}
