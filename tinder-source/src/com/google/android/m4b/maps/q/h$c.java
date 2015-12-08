// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.q;

import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.m4b.maps.j.x;
import com.google.android.m4b.maps.o.q;

// Referenced classes of package com.google.android.m4b.maps.q:
//            h

static final class <init> extends com.google.android.m4b.maps.o.<init>
{

    private Handler a;

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

    (q q)
    {
        boolean flag;
        if (Looper.myLooper() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        x.a(flag, "Can't create handler inside thread that has not called Looper.prepare()");
        a = new <init>(q);
    }
}
