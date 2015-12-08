// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.app.PendingIntent;

// Referenced classes of package com.google.android.gms.location:
//            LocationClient

public static interface 
{

    public abstract void onRemoveGeofencesByPendingIntentResult(int i, PendingIntent pendingintent);

    public abstract void onRemoveGeofencesByRequestIdsResult(int i, String as[]);
}
