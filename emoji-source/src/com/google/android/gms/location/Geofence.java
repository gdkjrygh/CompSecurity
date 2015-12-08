// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.SystemClock;
import com.google.android.gms.internal.jh;

public interface Geofence
{
    public static final class Builder
    {

        private String OB;
        private int Va;
        private long Vb;
        private short Vc;
        private double Vd;
        private double Ve;
        private float Vf;
        private int Vg;
        private int Vh;

        public Geofence build()
        {
            if (OB == null)
            {
                throw new IllegalArgumentException("Request ID not set.");
            }
            if (Va == 0)
            {
                throw new IllegalArgumentException("Transitions types not set.");
            }
            if ((Va & 4) != 0 && Vh < 0)
            {
                throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
            }
            if (Vb == 0x8000000000000000L)
            {
                throw new IllegalArgumentException("Expiration not set.");
            }
            if (Vc == -1)
            {
                throw new IllegalArgumentException("Geofence region not set.");
            }
            if (Vg < 0)
            {
                throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
            } else
            {
                return new jh(OB, Va, (short)1, Vd, Ve, Vf, Vb, Vg, Vh);
            }
        }

        public Builder setCircularRegion(double d, double d1, float f)
        {
            Vc = 1;
            Vd = d;
            Ve = d1;
            Vf = f;
            return this;
        }

        public Builder setExpirationDuration(long l)
        {
            if (l < 0L)
            {
                Vb = -1L;
                return this;
            } else
            {
                Vb = SystemClock.elapsedRealtime() + l;
                return this;
            }
        }

        public Builder setLoiteringDelay(int i)
        {
            Vh = i;
            return this;
        }

        public Builder setNotificationResponsiveness(int i)
        {
            Vg = i;
            return this;
        }

        public Builder setRequestId(String s)
        {
            OB = s;
            return this;
        }

        public Builder setTransitionTypes(int i)
        {
            Va = i;
            return this;
        }

        public Builder()
        {
            OB = null;
            Va = 0;
            Vb = 0x8000000000000000L;
            Vc = -1;
            Vg = 0;
            Vh = -1;
        }
    }


    public static final int GEOFENCE_TRANSITION_DWELL = 4;
    public static final int GEOFENCE_TRANSITION_ENTER = 1;
    public static final int GEOFENCE_TRANSITION_EXIT = 2;
    public static final long NEVER_EXPIRE = -1L;

    public abstract String getRequestId();
}
