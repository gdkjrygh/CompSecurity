// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.SystemClock;
import com.google.android.gms.internal.mc;

// Referenced classes of package com.google.android.gms.location:
//            Geofence

public static final class aeo
{

    private String XC;
    private int aeh;
    private long aei;
    private short aej;
    private double aek;
    private double ael;
    private float aem;
    private int aen;
    private int aeo;

    public Geofence build()
    {
        if (XC == null)
        {
            throw new IllegalArgumentException("Request ID not set.");
        }
        if (aeh == 0)
        {
            throw new IllegalArgumentException("Transitions types not set.");
        }
        if ((aeh & 4) != 0 && aeo < 0)
        {
            throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
        }
        if (aei == 0x8000000000000000L)
        {
            throw new IllegalArgumentException("Expiration not set.");
        }
        if (aej == -1)
        {
            throw new IllegalArgumentException("Geofence region not set.");
        }
        if (aen < 0)
        {
            throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
        } else
        {
            return new mc(XC, aeh, (short)1, aek, ael, aem, aei, aen, aeo);
        }
    }

    public aeo setCircularRegion(double d, double d1, float f)
    {
        aej = 1;
        aek = d;
        ael = d1;
        aem = f;
        return this;
    }

    public aem setExpirationDuration(long l)
    {
        if (l < 0L)
        {
            aei = -1L;
            return this;
        } else
        {
            aei = SystemClock.elapsedRealtime() + l;
            return this;
        }
    }

    public aei setLoiteringDelay(int i)
    {
        aeo = i;
        return this;
    }

    public aeo setNotificationResponsiveness(int i)
    {
        aen = i;
        return this;
    }

    public aen setRequestId(String s)
    {
        XC = s;
        return this;
    }

    public XC setTransitionTypes(int i)
    {
        aeh = i;
        return this;
    }

    public ()
    {
        XC = null;
        aeh = 0;
        aei = 0x8000000000000000L;
        aej = -1;
        aen = 0;
        aeo = -1;
    }
}
