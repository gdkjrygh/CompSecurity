// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.nn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.location:
//            GeofencingRequest, Geofence

public static final class agp
{

    private final List ago = new ArrayList();
    private int agp;

    public static int ew(int i)
    {
        return i & 7;
    }

    public agp addGeofence(Geofence geofence)
    {
        jx.b(geofence, "geofence can't be null.");
        jx.b(geofence instanceof nn, "Geofence must be created using Geofence.Builder.");
        ago.add((nn)geofence);
        return this;
    }

    public ago addGeofences(List list)
    {
        if (list != null && !list.isEmpty())
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                Geofence geofence = (Geofence)list.next();
                if (geofence != null)
                {
                    addGeofence(geofence);
                }
            }
        }
        return this;
    }

    public GeofencingRequest build()
    {
        boolean flag;
        if (!ago.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.b(flag, "No geofence has been added to this request.");
        return new GeofencingRequest(ago, agp, null);
    }

    public agp setInitialTrigger(int i)
    {
        agp = ew(i);
        return this;
    }

    public ()
    {
        agp = 5;
    }
}
