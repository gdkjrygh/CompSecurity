// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.geofence.impl;

import com.digby.mm.android.library.events.IEventResponse;
import com.digby.mm.android.library.events.impl.AbstractEventResponseHandler;
import com.digby.mm.android.library.exception.DigbyException;

// Referenced classes of package com.digby.mm.android.library.geofence.impl:
//            GetGeoFencesTask

class Handler extends AbstractEventResponseHandler
{

    final GetGeoFencesTask this$0;

    public void onError(DigbyException digbyexception)
    {
        GetGeoFencesTask.access$102(GetGeoFencesTask.this, false);
        GetGeoFencesTask.access$002(GetGeoFencesTask.this, true);
    }

    public void onResponse(IEventResponse ieventresponse)
    {
        GetGeoFencesTask.access$002(GetGeoFencesTask.this, true);
    }

    Handler()
    {
        this$0 = GetGeoFencesTask.this;
        super();
    }
}
