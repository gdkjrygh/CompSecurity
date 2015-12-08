// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.location;

import android.app.PendingIntent;
import com.urbanairship.PendingResult;

// Referenced classes of package com.urbanairship.location:
//            LocationRequestOptions

interface LocationAdapter
{

    public abstract void cancelLocationUpdates(PendingIntent pendingintent);

    public abstract boolean connect();

    public abstract void disconnect();

    public abstract void requestLocationUpdates(LocationRequestOptions locationrequestoptions, PendingIntent pendingintent);

    public abstract PendingResult requestSingleLocation(LocationRequestOptions locationrequestoptions);
}
