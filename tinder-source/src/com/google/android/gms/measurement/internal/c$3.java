// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            c, w, AppMetadata, u, 
//            j, t

final class a
    implements Runnable
{

    final c a;

    public final void run()
    {
        t t1 = a.b;
        if (t1 == null)
        {
            a.l().a.a("Discarding data. Failed to send app launch");
            return;
        }
        try
        {
            u u1 = a.f();
            t1.a(new AppMetadata(u1.a, u1.b(), u1.b, u1.c, j.y(), u1.o()));
            c.b(a);
            return;
        }
        catch (RemoteException remoteexception)
        {
            a.l().a.a("Failed to send app launch to AppMeasurementService", remoteexception);
        }
    }

    etadata(c c1)
    {
        a = c1;
        super();
    }
}
