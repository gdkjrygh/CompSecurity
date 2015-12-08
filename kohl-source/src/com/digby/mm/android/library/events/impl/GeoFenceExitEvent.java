// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.events.impl;

import android.content.Context;
import com.digby.mm.android.library.events.IEvent;
import java.util.Iterator;
import java.util.Queue;

// Referenced classes of package com.digby.mm.android.library.events.impl:
//            AbstractEvent, GeoFenceEntryEvent

public class GeoFenceExitEvent extends AbstractEvent
{

    private static final String TYPE_ID = "GEOFENCE_EXIT";

    public GeoFenceExitEvent(Context context)
    {
        super(context);
    }

    public boolean addToQueue(Queue queue)
    {
label0:
        {
            if (queue == null || queue.size() <= 0)
            {
                break label0;
            }
            queue = queue.iterator();
            IEvent ievent;
            do
            {
                if (!queue.hasNext())
                {
                    break label0;
                }
                ievent = (IEvent)queue.next();
            } while (!(ievent instanceof GeoFenceEntryEvent) && !(ievent instanceof GeoFenceExitEvent));
            return false;
        }
        return true;
    }

    String getTypeID()
    {
        return "GEOFENCE_EXIT";
    }
}
