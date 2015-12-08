// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.SystemClock;
import com.google.android.gms.internal.fa;

public interface Geofence
{
    public static final class Builder
    {

        private String oA;
        private int oB;
        private long oC;
        private short oD;
        private double oE;
        private double oF;
        private float oG;
        private int oH;
        private int oI;

        public Geofence build()
        {
            if (oA == null)
            {
                throw new IllegalArgumentException("Request ID not set.");
            }
            if (oB == 0)
            {
                throw new IllegalArgumentException("Transitions types not set.");
            }
            if ((oB & 4) != 0 && oI < 0)
            {
                throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
            }
            if (oC == 0x8000000000000000L)
            {
                throw new IllegalArgumentException("Expiration not set.");
            }
            if (oD == -1)
            {
                throw new IllegalArgumentException("Geofence region not set.");
            }
            if (oH < 0)
            {
                throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
            } else
            {
                return new fa(oA, oB, (short)1, oE, oF, oG, oC, oH, oI);
            }
        }

        public Builder setCircularRegion(double d, double d1, float f)
        {
            oD = 1;
            oE = d;
            oF = d1;
            oG = f;
            return this;
        }

        public Builder setExpirationDuration(long l)
        {
            if (l < 0L)
            {
                oC = -1L;
                return this;
            } else
            {
                oC = SystemClock.elapsedRealtime() + l;
                return this;
            }
        }

        public Builder setLoiteringDelay(int i)
        {
            oI = i;
            return this;
        }

        public Builder setNotificationResponsiveness(int i)
        {
            oH = i;
            return this;
        }

        public Builder setRequestId(String s)
        {
            oA = s;
            return this;
        }

        public Builder setTransitionTypes(int i)
        {
            oB = i;
            return this;
        }

        public Builder()
        {
            oA = null;
            oB = 0;
            oC = 0x8000000000000000L;
            oD = -1;
            oH = 0;
            oI = -1;
        }
    }


    public static final int GEOFENCE_TRANSITION_DWELL = 4;
    public static final int GEOFENCE_TRANSITION_ENTER = 1;
    public static final int GEOFENCE_TRANSITION_EXIT = 2;
    public static final long NEVER_EXPIRE = -1L;

    public abstract String getRequestId();
}
