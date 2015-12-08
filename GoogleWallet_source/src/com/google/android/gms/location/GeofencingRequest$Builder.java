// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import com.google.android.gms.internal.kn;
import com.google.android.gms.internal.ph;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.location:
//            GeofencingRequest, Geofence

public static final class aty
{

    private final List atx = new ArrayList();
    private int aty;

    private aty addGeofence(Geofence geofence)
    {
        kn.b(geofence, "geofence can't be null.");
        kn.b(geofence instanceof ph, "Geofence must be created using Geofence.Builder.");
        atx.add((ph)geofence);
        return this;
    }

    private static int hr(int i)
    {
        return i & 7;
    }

    public final atx addGeofences(List list)
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

    public final GeofencingRequest build()
    {
        boolean flag;
        if (!atx.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        kn.b(flag, "No geofence has been added to this request.");
        return new GeofencingRequest(atx, aty, null);
    }

    public final aty setInitialTrigger(int i)
    {
        aty = hr(i);
        return this;
    }

    public ()
    {
        aty = 5;
    }
}
