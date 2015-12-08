// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.s;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.g;

// Referenced classes of package com.google.android.gms.internal:
//            ji

public final class jh
    implements g
{

    public jh()
    {
    }

    public final s a(l l1, GeofencingRequest geofencingrequest, PendingIntent pendingintent)
    {
        return l1.b(new ji(this, l1, geofencingrequest, pendingintent));
    }
}
