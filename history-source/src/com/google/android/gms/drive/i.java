// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.jx;

public abstract class i
    implements Parcelable
{

    private volatile transient boolean OW;

    public i()
    {
        OW = false;
    }

    protected abstract void I(Parcel parcel, int j);

    public final boolean iB()
    {
        return OW;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        boolean flag;
        if (!iB())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.K(flag);
        OW = true;
        I(parcel, j);
    }
}
