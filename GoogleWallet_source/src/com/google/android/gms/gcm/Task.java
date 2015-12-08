// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.kn;

public abstract class Task
    implements Parcelable
{
    public static abstract class Builder
    {

        protected String gcmTaskService;
        protected boolean isPersisted;
        protected String tag;
        protected boolean updateCurrent;

        protected void checkConditions()
        {
            boolean flag1 = true;
            boolean flag;
            if (!TextUtils.isEmpty(tag))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            kn.b(flag, "Must provide a valid tag by calling setTag(String).");
            if (gcmTaskService != null)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            kn.b(flag, "Must provide an endpoint for this task by calling setService(ComponentName).");
        }

        public Builder()
        {
        }
    }


    private final String arH;
    private final boolean arI;
    private final boolean arJ;
    private final String mTag;

    Task()
    {
        arH = null;
        mTag = null;
        arI = false;
        arJ = false;
    }

    Task(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        arH = parcel.readString();
        mTag = parcel.readString();
        boolean flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        arI = flag;
        if (parcel.readInt() == 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        arJ = flag;
    }

    Task(Builder builder)
    {
        arH = builder.gcmTaskService;
        mTag = builder.tag;
        arI = builder.updateCurrent;
        arJ = builder.isPersisted;
    }

    public int describeContents()
    {
        return 0;
    }

    public final String getServiceName()
    {
        return arH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        parcel.writeString(arH);
        parcel.writeString(mTag);
        if (arI)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (arJ)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }
}
