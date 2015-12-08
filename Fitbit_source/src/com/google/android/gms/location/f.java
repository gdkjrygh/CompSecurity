// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;

// Referenced classes of package com.google.android.gms.location:
//            LocationRequest, k

public interface f
{

    public static final String a = "com.google.android.location.LOCATION";
    public static final String b = "mockLocation";

    public abstract Location a(h h);

    public abstract i a(h h, PendingIntent pendingintent);

    public abstract i a(h h, Location location);

    public abstract i a(h h, LocationRequest locationrequest, PendingIntent pendingintent);

    public abstract i a(h h, LocationRequest locationrequest, k k);

    public abstract i a(h h, LocationRequest locationrequest, k k, Looper looper);

    public abstract i a(h h, k k);

    public abstract i a(h h, boolean flag);
}
