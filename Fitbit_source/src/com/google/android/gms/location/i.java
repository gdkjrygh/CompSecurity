// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.h;
import java.util.List;

// Referenced classes of package com.google.android.gms.location:
//            GeofencingRequest

public interface i
{

    public abstract com.google.android.gms.common.api.i a(h h, PendingIntent pendingintent);

    public abstract com.google.android.gms.common.api.i a(h h, GeofencingRequest geofencingrequest, PendingIntent pendingintent);

    public abstract com.google.android.gms.common.api.i a(h h, List list);

    public abstract com.google.android.gms.common.api.i a(h h, List list, PendingIntent pendingintent);
}
