// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import com.google.android.gms.common.internal.ap;
import com.google.android.gms.internal.zzpk;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.location:
//            GeofencingRequest, e

public final class i
{

    private final List a = new ArrayList();
    private int b;

    public i()
    {
        b = 5;
    }

    public final i a()
    {
        b = 1;
        return this;
    }

    public final i a(e e)
    {
        ap.a(e, "geofence can't be null.");
        ap.b(e instanceof zzpk, "Geofence must be created using Geofence.Builder.");
        a.add((zzpk)e);
        return this;
    }

    public final GeofencingRequest b()
    {
        boolean flag;
        if (!a.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ap.b(flag, "No geofence has been added to this request.");
        return new GeofencingRequest(a, b, (byte)0);
    }
}
