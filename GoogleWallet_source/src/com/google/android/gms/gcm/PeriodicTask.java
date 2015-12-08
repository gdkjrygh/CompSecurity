// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.gcm:
//            Task

public class PeriodicTask extends Task
{
    public static final class Builder extends Task.Builder
    {

        private long arF;
        private long arG;

        static long a(Builder builder)
        {
            return builder.arF;
        }

        static long b(Builder builder)
        {
            return builder.arG;
        }

        public final PeriodicTask build()
        {
            checkConditions();
            return new PeriodicTask(this);
        }

        protected final void checkConditions()
        {
            super.checkConditions();
            if (arF == -1L)
            {
                throw new IllegalArgumentException("Must call setPeriod(long) to establish an execution interval for this periodic task.");
            }
            if (arG == -1L)
            {
                arG = (long)((float)arF * 0.1F);
            }
        }

        public final Builder setFlex(long l)
        {
            arG = l;
            return this;
        }

        public final Builder setPeriod(long l)
        {
            arF = l;
            return this;
        }

        public final Builder setPersisted(boolean flag)
        {
            isPersisted = flag;
            return this;
        }

        public final Builder setService(Class class1)
        {
            gcmTaskService = class1.getName();
            return this;
        }

        public final Builder setTag(String s)
        {
            tag = s;
            return this;
        }

        public final Builder setUpdateCurrent(boolean flag)
        {
            updateCurrent = flag;
            return this;
        }

        public Builder()
        {
            arF = -1L;
            arG = -1L;
            isPersisted = true;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static PeriodicTask eZ(Parcel parcel)
        {
            return new PeriodicTask(parcel);
        }

        private static PeriodicTask[] hh(int i)
        {
            return new PeriodicTask[i];
        }

        public final Object createFromParcel(Parcel parcel)
        {
            return eZ(parcel);
        }

        public final Object[] newArray(int i)
        {
            return hh(i);
        }

    };
    private final long arD;
    private final long arE;

    PeriodicTask()
    {
        arD = -1L;
        arE = -1L;
    }

    private PeriodicTask(Parcel parcel)
    {
        super(parcel);
        arD = parcel.readLong();
        arE = parcel.readLong();
    }


    private PeriodicTask(Builder builder)
    {
        super(builder);
        arD = Builder.a(builder);
        arE = Builder.b(builder);
    }


    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeLong(arD);
        parcel.writeLong(arE);
    }

}
