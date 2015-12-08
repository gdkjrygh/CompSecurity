// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.gcm:
//            Task

public class OneoffTask extends Task
{
    public static final class Builder extends Task.Builder
    {

        private long arB;
        private long arC;

        static long a(Builder builder)
        {
            return builder.arB;
        }

        static long b(Builder builder)
        {
            return builder.arC;
        }

        public final OneoffTask build()
        {
            checkConditions();
            return new OneoffTask(this);
        }

        protected final void checkConditions()
        {
            super.checkConditions();
            if (arB == -1L || arC == -1L)
            {
                throw new IllegalArgumentException("Must specify an execution window using setExecutionWindow.");
            }
            if (arB >= arC)
            {
                throw new IllegalArgumentException("Window start must be shorter than window end.");
            } else
            {
                return;
            }
        }

        public final Builder setExecutionWindow(long l, long l1)
        {
            arB = l;
            arC = l1;
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
            arB = -1L;
            arC = -1L;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static OneoffTask eX(Parcel parcel)
        {
            return new OneoffTask(parcel);
        }

        private static OneoffTask[] hf(int i)
        {
            return new OneoffTask[i];
        }

        public final Object createFromParcel(Parcel parcel)
        {
            return eX(parcel);
        }

        public final Object[] newArray(int i)
        {
            return hf(i);
        }

    };
    private final long arA;
    private final long arz;

    OneoffTask()
    {
        arA = -1L;
        arz = -1L;
    }

    private OneoffTask(Parcel parcel)
    {
        super(parcel);
        arz = parcel.readLong();
        arA = parcel.readLong();
    }


    private OneoffTask(Builder builder)
    {
        super(builder);
        arz = Builder.a(builder);
        arA = Builder.b(builder);
    }


    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeLong(arz);
        parcel.writeLong(arA);
    }

}
