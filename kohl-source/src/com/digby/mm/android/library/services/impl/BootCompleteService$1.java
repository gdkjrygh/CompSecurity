// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.services.impl;

import com.digby.mm.android.library.geofence.IGeoFence;
import com.digby.mm.android.library.geofence.IGeoFenceListReceiver;
import com.digby.mm.android.library.geoshape.IGeoShape;
import com.digby.mm.android.library.location.IGeofenceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.digby.mm.android.library.services.impl:
//            BootCompleteService

class this._cls0
    implements IGeoFenceListReceiver
{

    final BootCompleteService this$0;

    public void onReceive(List list)
    {
        list = list.iterator();
        ArrayList arraylist = new ArrayList();
        IGeoShape igeoshape;
        for (; list.hasNext(); arraylist.add(igeoshape.getGeoShapeForEntryTracking()))
        {
            igeoshape = ((IGeoFence)list.next()).getGeoShape();
            arraylist.add(igeoshape);
        }

        BootCompleteService.access$000(BootCompleteService.this).addGeofences(arraylist, true);
    }

    ()
    {
        this$0 = BootCompleteService.this;
        super();
    }
}
