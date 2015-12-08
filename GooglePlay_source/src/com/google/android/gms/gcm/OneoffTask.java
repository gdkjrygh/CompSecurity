// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.gcm:
//            Task

public class OneoffTask extends Task
{
    public static final class Builder extends Task.Builder
    {

        public long windowEndSeconds;
        public long windowStartSeconds;

        public final OneoffTask build()
        {
            checkConditions();
            return new OneoffTask(this, (byte)0);
        }

        protected final void checkConditions()
        {
            super.checkConditions();
            if (windowStartSeconds == -1L || windowEndSeconds == -1L)
            {
                throw new IllegalArgumentException("Must specify an execution window using setExecutionWindow.");
            }
            if (windowStartSeconds >= windowEndSeconds)
            {
                throw new IllegalArgumentException("Window start must be shorter than window end.");
            } else
            {
                return;
            }
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

        public Builder()
        {
            windowStartSeconds = -1L;
            windowEndSeconds = -1L;
            isPersisted = false;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return new OneoffTask(parcel, (byte)0);
        }

        public final volatile Object[] newArray(int i)
        {
            return new OneoffTask[i];
        }

    };
    private final long mWindowEndSeconds;
    private final long mWindowStartSeconds;

    private OneoffTask(Parcel parcel)
    {
        super(parcel);
        mWindowStartSeconds = parcel.readLong();
        mWindowEndSeconds = parcel.readLong();
    }

    OneoffTask(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    private OneoffTask(Builder builder)
    {
        super(builder);
        mWindowStartSeconds = builder.windowStartSeconds;
        mWindowEndSeconds = builder.windowEndSeconds;
    }

    OneoffTask(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final void toBundle(Bundle bundle)
    {
        super.toBundle(bundle);
        bundle.putLong("window_start", mWindowStartSeconds);
        bundle.putLong("window_end", mWindowEndSeconds);
    }

    public String toString()
    {
        return (new StringBuilder()).append(super.toString()).append(" windowStart=").append(mWindowStartSeconds).append(" windowEnd=").append(mWindowEndSeconds).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeLong(mWindowStartSeconds);
        parcel.writeLong(mWindowEndSeconds);
    }

}
