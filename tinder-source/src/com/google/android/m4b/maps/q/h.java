// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.q;

import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.m4b.maps.j.x;
import com.google.android.m4b.maps.o.m;
import com.google.android.m4b.maps.o.q;
import com.google.android.m4b.maps.o.r;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.m4b.maps.q:
//            p

public final class h
{
    static final class a extends com.google.android.m4b.maps.o.l.a
    {

        private static void a()
        {
            Log.e("LocationClientHelper", "Received a data in client after calling removeLocationUpdates.");
        }

        public final void a(m m)
        {
            a();
        }

        public final void a(r r)
        {
            a();
        }
    }

    static final class b extends Handler
    {

        private final q a;

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

        public b(q q1)
        {
            a = q1;
        }
    }

    static final class c extends com.google.android.m4b.maps.o.n.a
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

        c(q q)
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
            a = new b(q);
        }
    }


    final p a;
    boolean b;
    Map c;
    Map d;
    private final Context e;
    private ContentProviderClient f;

    public h(Context context, p p)
    {
        f = null;
        b = false;
        c = new HashMap();
        d = new HashMap();
        e = context;
        a = p;
    }

    final c a(q q)
    {
        Map map = c;
        map;
        JVM INSTR monitorenter ;
        c c2 = (c)c.get(q);
        c c1;
        c1 = c2;
        if (c2 != null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        c1 = new c(q);
        c.put(q, c1);
        map;
        JVM INSTR monitorexit ;
        return c1;
        q;
        map;
        JVM INSTR monitorexit ;
        throw q;
    }
}
