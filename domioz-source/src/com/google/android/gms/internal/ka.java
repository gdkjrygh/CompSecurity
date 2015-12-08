// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.location.aa;
import com.google.android.gms.location.z;

// Referenced classes of package com.google.android.gms.internal:
//            jm, kb, jy, jz

final class ka extends jm
{

    private z a;
    private aa b;
    private jy c;

    public ka(z z, jy jy1)
    {
        a = z;
        b = null;
        c = jy1;
    }

    public final void a(int i, PendingIntent pendingintent)
    {
        if (c == null)
        {
            Log.wtf("LocationClientImpl", "onRemoveGeofencesByPendingIntentResult called multiple times");
            return;
        } else
        {
            jy jy1 = c;
            jy jy2 = c;
            jy2.getClass();
            jy1.a(new kb(jy2, b, i, pendingintent));
            c = null;
            a = null;
            b = null;
            return;
        }
    }

    public final void a(int i, String as[])
    {
        if (c == null)
        {
            Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times");
            return;
        } else
        {
            jy jy1 = c;
            jy jy2 = c;
            jy2.getClass();
            jy1.a(new jz(jy2, a, i, as));
            c = null;
            a = null;
            b = null;
            return;
        }
    }

    public final void b(int i, String as[])
    {
        if (c == null)
        {
            Log.wtf("LocationClientImpl", "onRemoveGeofencesByRequestIdsResult called multiple times");
            return;
        } else
        {
            jy jy1 = c;
            jy jy2 = c;
            jy2.getClass();
            jy1.a(new kb(jy2, b, i, as));
            c = null;
            a = null;
            b = null;
            return;
        }
    }
}
