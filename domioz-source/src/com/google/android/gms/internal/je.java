// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.location.Location;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.s;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.d;
import com.google.android.gms.location.j;
import com.google.android.gms.location.k;

// Referenced classes of package com.google.android.gms.internal:
//            jy, jf

public final class je
    implements d
{

    public je()
    {
    }

    public final Location a(l l1)
    {
        l1 = k.a(l1);
        try
        {
            l1 = l1.m();
        }
        // Misplaced declaration of an exception variable
        catch (l l1)
        {
            return null;
        }
        return l1;
    }

    public final s a(l l1, LocationRequest locationrequest, j j)
    {
        return l1.b(new jf(this, l1, locationrequest, j));
    }
}
