// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.location.LocationRequest;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal:
//            pj, pc

public final class pd
{
    static final class b extends com.google.android.gms.location.b.a
    {

        private Handler avE;

        public final void onLocationChanged(Location location)
        {
            if (avE == null)
            {
                Log.e("LocationClientHelper", "Received a location in client after calling removeLocationUpdates.");
                return;
            } else
            {
                Message message = Message.obtain();
                message.what = 1;
                message.obj = location;
                avE.sendMessage(message);
                return;
            }
        }
    }


    private final pj FU;
    private HashMap FZ;
    private ContentProviderClient avB;
    private boolean avC;
    private final Context mContext;

    public pd(Context context, pj pj1)
    {
        avB = null;
        avC = false;
        FZ = new HashMap();
        mContext = context;
        FU = pj1;
    }

    private void setMockMode(boolean flag)
        throws RemoteException
    {
        FU.dR();
        ((pc)FU.iP()).setMockMode(flag);
        avC = flag;
    }

    public final Location getLastLocation()
    {
        FU.dR();
        Location location;
        try
        {
            location = ((pc)FU.iP()).cB(mContext.getPackageName());
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
        return location;
    }

    public final void pv()
    {
        if (!avC)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        setMockMode(false);
        return;
        RemoteException remoteexception;
        remoteexception;
        throw new IllegalStateException(remoteexception);
    }

    public final void removeAllListeners()
    {
        Object obj = FZ;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = FZ.values().iterator();
_L2:
        b b1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_79;
            }
            b1 = (b)iterator.next();
        } while (b1 == null);
        ((pc)FU.iP()).a(b1);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalStateException(((Throwable) (obj)));
        }
        FZ.clear();
        obj;
        JVM INSTR monitorexit ;
    }

    public final void removeLocationUpdates(PendingIntent pendingintent)
        throws RemoteException
    {
        FU.dR();
        ((pc)FU.iP()).b(pendingintent);
    }

    public final void requestLocationUpdates(LocationRequest locationrequest, PendingIntent pendingintent)
        throws RemoteException
    {
        FU.dR();
        ((pc)FU.iP()).a(locationrequest, pendingintent);
    }
}
