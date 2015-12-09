// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.internal.ap;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.j;
import com.google.android.gms.location.z;

// Referenced classes of package com.google.android.gms.internal:
//            jb, ju, iz, ka, 
//            jo

public final class jy extends jb
{

    private final ju e;
    private final iz f;

    public jy(Context context, Looper looper, n n, o o, String s, String s1)
    {
        this(context, looper, n, o, s, s1, (byte)0);
    }

    private jy(Context context, Looper looper, n n, o o, String s, String s1, byte byte0)
    {
        super(context, looper, n, o, s);
        e = new ju(context, d);
        f = iz.a(context, s1, d);
    }

    public final void a(GeofencingRequest geofencingrequest, PendingIntent pendingintent, z z)
    {
        k();
        ap.a(geofencingrequest, "geofencingRequest can't be null.");
        ap.a(pendingintent, "PendingIntent must be specified.");
        ap.a(z, "OnAddGeofencesResultListener not provided.");
        z = new ka(z, this);
        ((jo)l()).a(geofencingrequest, pendingintent, z);
    }

    public final void a(LocationRequest locationrequest, j j)
    {
        synchronized (e)
        {
            e.a(locationrequest, j);
        }
        return;
        locationrequest;
        ju1;
        JVM INSTR monitorexit ;
        throw locationrequest;
    }

    public final void b()
    {
        ju ju1 = e;
        ju1;
        JVM INSTR monitorenter ;
        boolean flag = c();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        e.b();
        e.c();
_L1:
        super.b();
        ju1;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", ((Throwable) (obj)));
          goto _L1
        obj;
        ju1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public final Location m()
    {
        return e.a();
    }
}
