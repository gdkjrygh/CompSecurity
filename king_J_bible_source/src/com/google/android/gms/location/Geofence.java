// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.SystemClock;
import com.google.android.gms.internal.hd;

public interface Geofence
{
    public static final class Builder
    {

        private String Jo;
        private int NU;
        private long NV;
        private short NW;
        private double NX;
        private double NY;
        private float NZ;
        private int Oa;
        private int Ob;

        public Geofence build()
        {
            if (Jo == null)
            {
                throw new IllegalArgumentException("Request ID not set.");
            }
            if (NU == 0)
            {
                throw new IllegalArgumentException("Transitions types not set.");
            }
            if ((NU & 4) != 0 && Ob < 0)
            {
                throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
            }
            if (NV == 0x8000000000000000L)
            {
                throw new IllegalArgumentException("Expiration not set.");
            }
            if (NW == -1)
            {
                throw new IllegalArgumentException("Geofence region not set.");
            }
            if (Oa < 0)
            {
                throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
            } else
            {
                return new hd(Jo, NU, (short)1, NX, NY, NZ, NV, Oa, Ob);
            }
        }

        public Builder setCircularRegion(double d, double d1, float f)
        {
            NW = 1;
            NX = d;
            NY = d1;
            NZ = f;
            return this;
        }

        public Builder setExpirationDuration(long l)
        {
            if (l < 0L)
            {
                NV = -1L;
                return this;
            } else
            {
                NV = SystemClock.elapsedRealtime() + l;
                return this;
            }
        }

        public Builder setLoiteringDelay(int i)
        {
            Ob = i;
            return this;
        }

        public Builder setNotificationResponsiveness(int i)
        {
            Oa = i;
            return this;
        }

        public Builder setRequestId(String s)
        {
            Jo = s;
            return this;
        }

        public Builder setTransitionTypes(int i)
        {
            NU = i;
            return this;
        }

        public Builder()
        {
            Jo = null;
            NU = 0;
            NV = 0x8000000000000000L;
            NW = -1;
            Oa = 0;
            Ob = -1;
        }
    }


    public static final int GEOFENCE_TRANSITION_DWELL = 4;
    public static final int GEOFENCE_TRANSITION_ENTER = 1;
    public static final int GEOFENCE_TRANSITION_EXIT = 2;
    public static final long NEVER_EXPIRE = -1L;

    public abstract String getRequestId();
}
