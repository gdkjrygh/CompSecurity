// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.SystemClock;
import com.google.android.gms.internal.ph;

// Referenced classes of package com.google.android.gms.location:
//            Geofence

public static final class att
{

    private String alx;
    private int atm;
    private long atn;
    private short ato;
    private double atp;
    private double atq;
    private float atr;
    private int ats;
    private int att;

    public final Geofence build()
    {
        if (alx == null)
        {
            throw new IllegalArgumentException("Request ID not set.");
        }
        if (atm == 0)
        {
            throw new IllegalArgumentException("Transitions types not set.");
        }
        if ((atm & 4) != 0 && att < 0)
        {
            throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
        }
        if (atn == 0x8000000000000000L)
        {
            throw new IllegalArgumentException("Expiration not set.");
        }
        if (ato == -1)
        {
            throw new IllegalArgumentException("Geofence region not set.");
        }
        if (ats < 0)
        {
            throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
        } else
        {
            return new ph(alx, atm, (short)1, atp, atq, atr, atn, ats, att);
        }
    }

    public final att setCircularRegion(double d, double d1, float f)
    {
        ato = 1;
        atp = d;
        atq = d1;
        atr = f;
        return this;
    }

    public final atr setExpirationDuration(long l)
    {
        if (l < 0L)
        {
            atn = -1L;
            return this;
        } else
        {
            atn = SystemClock.elapsedRealtime() + l;
            return this;
        }
    }

    public final atn setLoiteringDelay(int i)
    {
        att = i;
        return this;
    }

    public final att setRequestId(String s)
    {
        alx = s;
        return this;
    }

    public final alx setTransitionTypes(int i)
    {
        atm = i;
        return this;
    }

    public ()
    {
        alx = null;
        atm = 0;
        atn = 0x8000000000000000L;
        ato = -1;
        ats = 0;
        att = -1;
    }
}
