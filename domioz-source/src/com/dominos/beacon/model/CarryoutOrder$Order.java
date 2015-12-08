// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.model;

import android.os.Parcel;
import android.os.Parcelable;

public class statusCode
    implements Parcelable
{

    public static final android.os.utOrder.Order._cls1 CREATOR = new _cls1();
    String customerName;
    private String orderId;
    private String phoneNumber;
    private String statusCode;

    public int describeContents()
    {
        return 0;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public String getOrderId()
    {
        return orderId;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public String getStatusCode()
    {
        return statusCode;
    }

    public void setCustomerName(String s)
    {
        customerName = s;
    }

    public void setOrderId(String s)
    {
        orderId = s;
    }

    public void setPhoneNumber(String s)
    {
        phoneNumber = s;
    }

    public void setStatusCode(String s)
    {
        statusCode = s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(customerName);
        parcel.writeString(phoneNumber);
        parcel.writeString(orderId);
        parcel.writeString(statusCode);
    }


    private _cls1(Parcel parcel)
    {
        customerName = parcel.readString();
        phoneNumber = parcel.readString();
        orderId = parcel.readString();
        statusCode = parcel.readString();
    }

    statusCode(Parcel parcel, statusCode statuscode)
    {
        this(parcel);
    }

    public <init>(String s, String s1, String s2, String s3)
    {
        customerName = s;
        phoneNumber = s1;
        orderId = s2;
        statusCode = s3;
    }

    class _cls1
        implements android.os.Parcelable.Creator
    {

        public final CarryoutOrder.Order createFromParcel(Parcel parcel)
        {
            return new CarryoutOrder.Order(parcel, null);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final CarryoutOrder.Order[] newArray(int i)
        {
            return new CarryoutOrder.Order[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

            _cls1()
            {
            }
    }

}
