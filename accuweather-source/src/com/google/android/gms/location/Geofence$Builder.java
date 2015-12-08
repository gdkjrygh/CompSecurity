// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.SystemClock;
import com.google.android.gms.internal.ji;

// Referenced classes of package com.google.android.gms.location:
//            Geofence

public static final class Ve
{

    private String Oy;
    private int UX;
    private long UY;
    private short UZ;
    private double Va;
    private double Vb;
    private float Vc;
    private int Vd;
    private int Ve;

    public Geofence build()
    {
        if (Oy == null)
        {
            throw new IllegalArgumentException("Request ID not set.");
        }
        if (UX == 0)
        {
            throw new IllegalArgumentException("Transitions types not set.");
        }
        if ((UX & 4) != 0 && Ve < 0)
        {
            throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
        }
        if (UY == 0x8000000000000000L)
        {
            throw new IllegalArgumentException("Expiration not set.");
        }
        if (UZ == -1)
        {
            throw new IllegalArgumentException("Geofence region not set.");
        }
        if (Vd < 0)
        {
            throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
        } else
        {
            return new ji(Oy, UX, (short)1, Va, Vb, Vc, UY, Vd, Ve);
        }
    }

    public Ve setCircularRegion(double d, double d1, float f)
    {
        UZ = 1;
        Va = d;
        Vb = d1;
        Vc = f;
        return this;
    }

    public Vc setExpirationDuration(long l)
    {
        if (l < 0L)
        {
            UY = -1L;
            return this;
        } else
        {
            UY = SystemClock.elapsedRealtime() + l;
            return this;
        }
    }

    public UY setLoiteringDelay(int i)
    {
        Ve = i;
        return this;
    }

    public Ve setNotificationResponsiveness(int i)
    {
        Vd = i;
        return this;
    }

    public Vd setRequestId(String s)
    {
        Oy = s;
        return this;
    }

    public Oy setTransitionTypes(int i)
    {
        UX = i;
        return this;
    }

    public ()
    {
        Oy = null;
        UX = 0;
        UY = 0x8000000000000000L;
        UZ = -1;
        Vd = 0;
        Ve = -1;
    }
}
