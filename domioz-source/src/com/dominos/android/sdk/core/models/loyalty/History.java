// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.loyalty;

import android.os.Parcel;
import android.os.Parcelable;
import com.dominos.android.sdk.common.StringHelper;

public class History
    implements Parcelable
{

    public static final String ACTIVE = "ACTIVE";
    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static final String PENDING = "PENDING";
    private String description;
    private boolean isHeader;
    private String orderNumber;
    private String pointBalance;
    private String pointStatus;
    private String points;
    private String transactionDate;
    private double transactionTotal;
    private String transactionType;
    private HistoryHeaderType type;

    private History(Parcel parcel)
    {
        setTransactionDate(parcel.readString());
        setTransactionType(parcel.readString());
        setPoints(parcel.readString());
        setPointBalance(parcel.readString());
        setPointStatus(parcel.readString());
        setDescription(parcel.readString());
        setOrderNumber(parcel.readString());
        setTransactionTotal(parcel.readDouble());
    }

    History(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    public History(HistoryHeaderType historyheadertype)
    {
        type = historyheadertype;
        isHeader = true;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getDescription()
    {
        return description;
    }

    public String getOrderNumber()
    {
        return orderNumber;
    }

    public String getPointBalance()
    {
        return pointBalance;
    }

    public String getPointStatus()
    {
        return pointStatus;
    }

    public String getPoints()
    {
        return points;
    }

    public String getTransactionDate()
    {
        return transactionDate;
    }

    public double getTransactionTotal()
    {
        return transactionTotal;
    }

    public String getTransactionType()
    {
        return transactionType;
    }

    public HistoryHeaderType getType()
    {
        return type;
    }

    public boolean isActive()
    {
        return StringHelper.equalsIgnoreCase(getPointStatus(), "ACTIVE");
    }

    public boolean isHeader()
    {
        return isHeader;
    }

    public boolean isPending()
    {
        return StringHelper.equalsIgnoreCase(getPointStatus(), "PENDING");
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setOrderNumber(String s)
    {
        orderNumber = s;
    }

    public void setPointBalance(String s)
    {
        pointBalance = s;
    }

    public void setPointStatus(String s)
    {
        pointStatus = s;
    }

    public void setPoints(String s)
    {
        points = s;
    }

    public void setTransactionDate(String s)
    {
        transactionDate = s;
    }

    public void setTransactionTotal(double d)
    {
        transactionTotal = d;
    }

    public void setTransactionType(String s)
    {
        transactionType = s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(transactionDate);
        parcel.writeString(transactionType);
        parcel.writeString(points);
        parcel.writeString(pointBalance);
        parcel.writeString(pointStatus);
        parcel.writeString(description);
        parcel.writeString(orderNumber);
        parcel.writeDouble(transactionTotal);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final History createFromParcel(Parcel parcel)
        {
            return new History(parcel, null);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final History[] newArray(int i)
        {
            return new History[i];
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
