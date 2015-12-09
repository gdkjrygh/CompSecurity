// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.location.Location;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.location.j;
import com.google.android.gms.location.t;

// Referenced classes of package com.google.android.gms.internal:
//            jv

final class jw extends t
{

    private Handler a;

    jw(j j)
    {
        a = new jv(j);
    }

    public final void a(Location location)
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
}
