// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;

public final class lcf extends kbo
{

    private final long a = (long)hashCode();

    public lcf(Context context, Looper looper, kax kax, jyq jyq, jys jys)
    {
        super(context, looper, 54, kax, jyq, jys);
    }

    protected final IInterface a(IBinder ibinder)
    {
        return lcm.a(ibinder);
    }

    public final void a()
    {
        if (j())
        {
            try
            {
                ((lcl)o()).d(a);
            }
            catch (RemoteException remoteexception)
            {
                Log.w("NearbyConnectionsClient", "Failed to notify client disconnect.", remoteexception);
            }
        }
        super.a();
    }

    protected final String c()
    {
        return "com.google.android.gms.nearby.connection.service.START";
    }

    protected final String d()
    {
        return "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    }
}
