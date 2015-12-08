// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;

public abstract class WriteAwareParcelable
    implements Parcelable
{

    private volatile transient boolean mIsWrittenToParcel;

    public WriteAwareParcelable()
    {
        mIsWrittenToParcel = false;
    }

    public abstract void doWriteToParcel(Parcel parcel, int i);

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag;
        if (!mIsWrittenToParcel)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        mIsWrittenToParcel = true;
        doWriteToParcel(parcel, i);
    }
}
