// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.location.k;

// Referenced classes of package com.google.android.gms.internal:
//            cg

private static class a extends com.google.android.gms.location.a
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

    (k k, Looper looper)
    {
        if (looper == null)
        {
            k = new <init>(k);
        } else
        {
            k = new <init>(k, looper);
        }
        a = k;
    }
}
