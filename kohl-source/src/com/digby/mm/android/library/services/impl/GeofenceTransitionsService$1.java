// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.services.impl;

import com.digby.mm.android.library.utils.Logger;

// Referenced classes of package com.digby.mm.android.library.services.impl:
//            GeofenceTransitionsService

class this._cls0
    implements Runnable
{

    final GeofenceTransitionsService this$0;

    public void run()
    {
        Logger.Debug("MAX_SERVICE_LIVE_TIME exceed, stop service.", GeofenceTransitionsService.this);
        GeofenceTransitionsService.access$000(GeofenceTransitionsService.this);
    }

    ()
    {
        this$0 = GeofenceTransitionsService.this;
        super();
    }
}
