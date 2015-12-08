// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.SystemClock;
import com.google.android.gms.internal.nn;

public interface Geofence
{
    public static final class Builder
    {

        private String Zt;
        private int agd;
        private long age;
        private short agf;
        private double agg;
        private double agh;
        private float agi;
        private int agj;
        private int agk;

        public Geofence build()
        {
            if (Zt == null)
            {
                throw new IllegalArgumentException("Request ID not set.");
            }
            if (agd == 0)
            {
                throw new IllegalArgumentException("Transitions types not set.");
            }
            if ((agd & 4) != 0 && agk < 0)
            {
                throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
            }
            if (age == 0x8000000000000000L)
            {
                throw new IllegalArgumentException("Expiration not set.");
            }
            if (agf == -1)
            {
                throw new IllegalArgumentException("Geofence region not set.");
            }
            if (agj < 0)
            {
                throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
            } else
            {
                return new nn(Zt, agd, (short)1, agg, agh, agi, age, agj, agk);
            }
        }

        public Builder setCircularRegion(double d, double d1, float f)
        {
            agf = 1;
            agg = d;
            agh = d1;
            agi = f;
            return this;
        }

        public Builder setExpirationDuration(long l)
        {
            if (l < 0L)
            {
                age = -1L;
                return this;
            } else
            {
                age = SystemClock.elapsedRealtime() + l;
                return this;
            }
        }

        public Builder setLoiteringDelay(int i)
        {
            agk = i;
            return this;
        }

        public Builder setNotificationResponsiveness(int i)
        {
            agj = i;
            return this;
        }

        public Builder setRequestId(String s)
        {
            Zt = s;
            return this;
        }

        public Builder setTransitionTypes(int i)
        {
            agd = i;
            return this;
        }

        public Builder()
        {
            Zt = null;
            agd = 0;
            age = 0x8000000000000000L;
            agf = -1;
            agj = 0;
            agk = -1;
        }
    }


    public static final int GEOFENCE_TRANSITION_DWELL = 4;
    public static final int GEOFENCE_TRANSITION_ENTER = 1;
    public static final int GEOFENCE_TRANSITION_EXIT = 2;
    public static final long NEVER_EXPIRE = -1L;

    public abstract String getRequestId();
}
