// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.l;
import com.google.android.gms.location.GeofencingRequest;

// Referenced classes of package com.google.android.gms.internal:
//            jk, jy, jj, jh

final class ji extends jk
{

    final GeofencingRequest b;
    final PendingIntent c;
    final jh d;

    ji(jh jh, l l, GeofencingRequest geofencingrequest, PendingIntent pendingintent)
    {
        d = jh;
        b = geofencingrequest;
        c = pendingintent;
        super(l);
    }

    protected final void b(h h)
    {
        h = (jy)h;
        jj jj1 = new jj(this);
        h.a(b, c, jj1);
    }
}
