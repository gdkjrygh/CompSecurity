// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public class CarryoutOrder
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private boolean checkedIn;
    private List order;
    private String status;
    private StatusItems statusItems;

    private CarryoutOrder(Parcel parcel)
    {
        order = new ArrayList();
        checkedIn = ((Boolean)parcel.readValue(null)).booleanValue();
        parcel.readList(order, com/dominos/beacon/model/CarryoutOrder$Order.getClassLoader());
        parcel.readParcelable(com/dominos/beacon/model/CarryoutOrder$StatusItems.getClassLoader());
    }

    CarryoutOrder(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    public CarryoutOrder(List list)
    {
        order = list;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean getCheckedIn()
    {
        return checkedIn;
    }

    public List getOrder()
    {
        return order;
    }

    public StatusItems getStatusItems()
    {
        return statusItems;
    }

    public void setCheckedIn(boolean flag)
    {
        checkedIn = flag;
    }

    public void setOrder(List list)
    {
        order = list;
    }

    public void setStatusItems(StatusItems statusitems)
    {
        statusItems = statusitems;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(Boolean.valueOf(checkedIn));
        parcel.writeList(order);
        parcel.writeParcelable(statusItems, i);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final CarryoutOrder createFromParcel(Parcel parcel)
        {
            return new CarryoutOrder(parcel, null);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final CarryoutOrder[] newArray(int i)
        {
            return new CarryoutOrder[i];
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
