// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ride;

import me.lyft.android.common.INullable;

public class RideStatus
    implements INullable
{

    private final Status status;

    public RideStatus(Status status1)
    {
        status = status1;
    }

    public static RideStatus empty()
    {
        return NullRideStatus.getInstance();
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof RideStatus)
        {
            if (status == ((RideStatus) (obj = (RideStatus)obj)).status)
            {
                return true;
            }
        }
        return false;
    }

    public Status getStatus()
    {
        return status;
    }

    public boolean isAccepted()
    {
        return status == Status.ACCEPTED || status == Status.APPROACHING;
    }

    public boolean isActive()
    {
        return isPending() || isAccepted() || isArrived() || isPickedUp() || isDroppedOff();
    }

    public boolean isArrived()
    {
        return status == Status.ARRIVED;
    }

    public boolean isCanceled()
    {
        return status == Status.CANCELED;
    }

    public boolean isCompleted()
    {
        return status == Status.COMPLETED;
    }

    public boolean isDroppedOff()
    {
        return status == Status.DROPPEDOFF;
    }

    public boolean isIdle()
    {
        return status == Status.IDLE;
    }

    public boolean isInProgress()
    {
        return isAccepted() || isArrived() || isPickedUp() || isDroppedOff();
    }

    public boolean isLapsed()
    {
        return status == Status.LAPSED;
    }

    public boolean isNull()
    {
        return false;
    }

    public boolean isPending()
    {
        return status == Status.PENDING;
    }

    public boolean isPickedUp()
    {
        return status == Status.PICKEDUP;
    }

    public String toString()
    {
        if (status == null)
        {
            return null;
        } else
        {
            return status.toString();
        }
    }

    private class NullRideStatus extends RideStatus
    {
        private class Status extends Enum
        {

            private static final Status $VALUES[];
            public static final Status ACCEPTED;
            public static final Status APPROACHING;
            public static final Status ARRIVED;
            public static final Status CANCELED;
            public static final Status COMPLETED;
            public static final Status DROPPEDOFF;
            public static final Status IDLE;
            public static final Status LAPSED;
            public static final Status PENDING;
            public static final Status PICKEDUP;
            public static final Status PROCESSED;
            private String value;

            public static Status valueOf(String s)
            {
                return (Status)Enum.valueOf(me/lyft/android/domain/ride/RideStatus$Status, s);
            }

            public static Status[] values()
            {
                return (Status[])$VALUES.clone();
            }

            public String toString()
            {
                return value;
            }

            static 
            {
                IDLE = new Status("IDLE", 0, "idle");
                LAPSED = new Status("LAPSED", 1, "lapsed");
                PENDING = new Status("PENDING", 2, "pending");
                ACCEPTED = new Status("ACCEPTED", 3, "accepted");
                APPROACHING = new Status("APPROACHING", 4, "approaching");
                CANCELED = new Status("CANCELED", 5, "canceled");
                ARRIVED = new Status("ARRIVED", 6, "arrived");
                PICKEDUP = new Status("PICKEDUP", 7, "pickedUp");
                DROPPEDOFF = new Status("DROPPEDOFF", 8, "droppedOff");
                COMPLETED = new Status("COMPLETED", 9, "completed");
                PROCESSED = new Status("PROCESSED", 10, "processed");
                $VALUES = (new Status[] {
                    IDLE, LAPSED, PENDING, ACCEPTED, APPROACHING, CANCELED, ARRIVED, PICKEDUP, DROPPEDOFF, COMPLETED, 
                    PROCESSED
                });
            }

            private Status(String s, int i, String s1)
            {
                super(s, i);
                value = s1;
            }
        }


        private static final RideStatus INSTANCE = new NullRideStatus();

        public static RideStatus getInstance()
        {
            return INSTANCE;
        }

        public boolean isNull()
        {
            return true;
        }


        private NullRideStatus()
        {
            super(Status.IDLE);
        }
    }

}
