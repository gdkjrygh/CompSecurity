// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.g;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.location.internal:
//            o, h

public final class j
{
    private static final class a extends com.google.android.gms.location.m.a
    {

        private Handler a;

        private void a(int i, Object obj)
        {
            if (a == null)
            {
                Log.e("LocationClientHelper", "Received a data in client after calling removeLocationUpdates.");
                return;
            } else
            {
                Message message = Message.obtain();
                message.what = i;
                message.obj = obj;
                a.sendMessage(message);
                return;
            }
        }

        public final void a(LocationAvailability locationavailability)
        {
            a(1, locationavailability);
        }

        public final void a(LocationResult locationresult)
        {
            a(0, locationresult);
        }
    }

    private static final class b extends Handler
    {

        private final g a;

        public final void handleMessage(Message message)
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
            a.a(message);
        }

        public b(g g1)
        {
            a = g1;
        }
    }

    private static final class c extends com.google.android.gms.location.n.a
    {

        Handler a;

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

        c(g g)
        {
            boolean flag;
            if (Looper.myLooper() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            u.a(flag, "Can't create handler inside thread that has not called Looper.prepare()");
            a = new b(g);
        }
    }


    final o a;
    ContentProviderClient b;
    boolean c;
    Map d;
    Map e;
    private final Context f;

    public j(Context context, o o1)
    {
        b = null;
        c = false;
        d = new HashMap();
        e = new HashMap();
        f = context;
        a = o1;
    }

    public final Location a()
    {
        a.a();
        Location location;
        try
        {
            location = ((h)a.b()).b(f.getPackageName());
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
        return location;
    }

    final c a(g g)
    {
        Map map = d;
        map;
        JVM INSTR monitorenter ;
        c c2 = (c)d.get(g);
        c c1;
        c1 = c2;
        if (c2 != null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        c1 = new c(g);
        d.put(g, c1);
        map;
        JVM INSTR monitorexit ;
        return c1;
        g;
        map;
        JVM INSTR monitorexit ;
        throw g;
    }
}
