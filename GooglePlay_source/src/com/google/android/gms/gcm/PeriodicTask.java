// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.gcm:
//            Task

public class PeriodicTask extends Task
{
    public static final class Builder extends Task.Builder
    {

        public long flexInSeconds;
        public long periodInSeconds;

        public final PeriodicTask build()
        {
            checkConditions();
            return new PeriodicTask(this, (byte)0);
        }

        protected final void checkConditions()
        {
            super.checkConditions();
            if (periodInSeconds == -1L)
            {
                throw new IllegalArgumentException("Must call setPeriod(long) to establish an execution interval for this periodic task.");
            }
            if (periodInSeconds <= 0L)
            {
                throw new IllegalArgumentException((new StringBuilder("Period set cannot be less or equal to 0: ")).append(periodInSeconds).toString());
            }
            if (flexInSeconds == -1L)
            {
                flexInSeconds = (long)((float)periodInSeconds * 0.1F);
            } else
            if (flexInSeconds > periodInSeconds)
            {
                flexInSeconds = periodInSeconds;
                return;
            }
        }

        public final Builder setExtras(Bundle bundle)
        {
            extras = bundle;
            return this;
        }

        public final Builder setRequiresCharging$24191f8f()
        {
            requiresCharging = true;
            return this;
        }

        public final Builder setService(String s)
        {
            gcmTaskService = s;
            return this;
        }

        public final Builder setTag(String s)
        {
            tag = s;
            return this;
        }

        public final Builder setUpdateCurrent$24191f8f()
        {
            updateCurrent = true;
            return this;
        }

        public Builder()
        {
            periodInSeconds = -1L;
            flexInSeconds = -1L;
            isPersisted = true;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return new PeriodicTask(parcel, (byte)0);
        }

        public final volatile Object[] newArray(int i)
        {
            return new PeriodicTask[i];
        }

    };
    protected long mFlexInSeconds;
    protected long mIntervalInSeconds;

    private PeriodicTask(Parcel parcel)
    {
        super(parcel);
        mIntervalInSeconds = -1L;
        mFlexInSeconds = -1L;
        mIntervalInSeconds = parcel.readLong();
        mFlexInSeconds = Math.min(parcel.readLong(), mIntervalInSeconds);
    }

    PeriodicTask(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    private PeriodicTask(Builder builder)
    {
        super(builder);
        mIntervalInSeconds = -1L;
        mFlexInSeconds = -1L;
        mIntervalInSeconds = builder.periodInSeconds;
        mFlexInSeconds = Math.min(builder.flexInSeconds, mIntervalInSeconds);
    }

    PeriodicTask(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final void toBundle(Bundle bundle)
    {
        super.toBundle(bundle);
        bundle.putLong("period", mIntervalInSeconds);
        bundle.putLong("period_flex", mFlexInSeconds);
    }

    public String toString()
    {
        return (new StringBuilder()).append(super.toString()).append(" period=").append(mIntervalInSeconds).append(" flex=").append(mFlexInSeconds).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeLong(mIntervalInSeconds);
        parcel.writeLong(mFlexInSeconds);
    }

}
