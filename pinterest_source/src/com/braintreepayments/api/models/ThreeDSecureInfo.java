// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;

public class ThreeDSecureInfo
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private boolean a;
    private boolean b;

    public ThreeDSecureInfo()
    {
    }

    private ThreeDSecureInfo(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        if (parcel.readByte() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        b = flag;
    }

    ThreeDSecureInfo(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        byte byte0;
        if (a)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        if (b)
        {
            byte0 = flag;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
    }


    /* member class not found */
    class _cls1 {}

}
