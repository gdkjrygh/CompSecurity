// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

public final class au
    implements LocationListener
{
    public static interface a
    {

        public abstract void a(Location location);

        public abstract void a(String s);
    }


    private static au c = null;
    ArrayList a;
    private LocationManager b;

    private au(Context context)
    {
        a = new ArrayList();
        b = (LocationManager)context.getSystemService("location");
    }

    public static au a(Context context)
    {
        com/microsoft/advertising/android/au;
        JVM INSTR monitorenter ;
        if (c == null)
        {
            c = new au(context.getApplicationContext());
        }
        context = c;
        com/microsoft/advertising/android/au;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public final void a(a a1)
    {
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        this;
        JVM INSTR monitorenter ;
        if (a.size() == 0)
        {
            b.requestLocationUpdates("passive", 2000L, 0.0F, this);
        }
        if (!a.contains(a1))
        {
            a.add(a1);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        this;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public final void b(a a1)
    {
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        this;
        JVM INSTR monitorenter ;
        if (a.contains(a1))
        {
            a.remove(a1);
            if (a.size() == 0)
            {
                b.removeUpdates(this);
                c = null;
            }
        }
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        this;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public final void onLocationChanged(Location location)
    {
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            ((a)iterator.next()).a(location);
        } while (true);
    }

    public final void onProviderDisabled(String s)
    {
        s = a.iterator();
        do
        {
            if (!s.hasNext())
            {
                return;
            }
            ((a)s.next()).a("Location provider is disabled");
        } while (true);
    }

    public final void onProviderEnabled(String s)
    {
    }

    public final void onStatusChanged(String s, int i, Bundle bundle)
    {
        if (i != 0) goto _L2; else goto _L1
_L1:
        s = a.iterator();
_L5:
        if (s.hasNext()) goto _L3; else goto _L2
_L2:
        return;
_L3:
        ((a)s.next()).a("Location provider is out of service");
        if (true) goto _L5; else goto _L4
_L4:
    }

}
