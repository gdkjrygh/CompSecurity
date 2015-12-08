// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.loyalty;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.dominos.android.sdk.core.models.loyalty:
//            History, LoyaltyCoupon, Potential

public class Loyalty
    implements Parcelable
{

    public static final String ACTIVE = "ACTIVE";
    public static final String CLOSED = "CLOSED";
    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static final String ENROLL = "ENROLL";
    public static final String OPTOUT = "OPTOUT";
    public static final String STATUS_FAIL = "Fail";
    public static final String STATUS_SUCCESS = "Success";
    public static final String SUSPENDED = "SUSPENDED";
    private String accountStatus;
    private String command;
    private String customerId;
    private String enrollDate;
    private List history;
    private String lastActivityDate;
    private List loyaltyCoupons;
    private boolean loyaltyCustomer;
    private int pendingPointBalance;
    private String pointExpirationDate;
    private Potential potential;
    private String status;
    private int vestedPointBalance;

    public Loyalty()
    {
    }

    private Loyalty(Parcel parcel)
    {
        boolean flag = true;
        super();
        Bundle bundle;
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        setLoyaltyCustomer(flag);
        setCommand(parcel.readString());
        setEnrollDate(parcel.readString());
        setStatus(parcel.readString());
        setAccountStatus(parcel.readString());
        setPendingPointBalance(parcel.readInt());
        setVestedPointBalance(parcel.readInt());
        setCustomerId(parcel.readString());
        setLastActivityDate(parcel.readString());
        setPointExpirationDate(parcel.readString());
        bundle = parcel.readBundle();
        bundle.setClassLoader(com/dominos/android/sdk/core/models/loyalty/History.getClassLoader());
        history = bundle.getParcelableArrayList("history");
        bundle.setClassLoader(com/dominos/android/sdk/core/models/loyalty/LoyaltyCoupon.getClassLoader());
        loyaltyCoupons = bundle.getParcelableArrayList("loyaltyCoupons");
        potential = (Potential)parcel.readParcelable(com/dominos/android/sdk/core/models/loyalty/Potential.getClassLoader());
    }

    Loyalty(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAccountStatus()
    {
        return accountStatus;
    }

    public String getCommand()
    {
        return command;
    }

    public String getCustomerId()
    {
        return customerId;
    }

    public String getEnrollDate()
    {
        return enrollDate;
    }

    public List getHistory()
    {
        return history;
    }

    public String getLastActivityDate()
    {
        return lastActivityDate;
    }

    public List getLoyaltyCoupons()
    {
        return loyaltyCoupons;
    }

    public int getPendingPointBalance()
    {
        return pendingPointBalance;
    }

    public String getPointExpirationDate()
    {
        return pointExpirationDate;
    }

    public Potential getPotential()
    {
        return potential;
    }

    public String getStatus()
    {
        return status;
    }

    public int getVestedPointBalance()
    {
        return vestedPointBalance;
    }

    public boolean isLoyaltyCustomer()
    {
        return loyaltyCustomer;
    }

    public void setAccountStatus(String s)
    {
        accountStatus = s;
    }

    public void setCommand(String s)
    {
        command = s;
    }

    public void setCustomerId(String s)
    {
        customerId = s;
    }

    public void setEnrollDate(String s)
    {
        enrollDate = s;
    }

    public void setHistory(List list)
    {
        history = list;
    }

    public void setLastActivityDate(String s)
    {
        lastActivityDate = s;
    }

    public void setLoyaltyCoupons(List list)
    {
        loyaltyCoupons = list;
    }

    public void setLoyaltyCustomer(boolean flag)
    {
        loyaltyCustomer = flag;
    }

    public void setPendingPointBalance(int i)
    {
        pendingPointBalance = i;
    }

    public void setPointExpirationDate(String s)
    {
        pointExpirationDate = s;
    }

    public void setPotential(Potential potential1)
    {
        potential = potential1;
    }

    public void setStatus(String s)
    {
        status = s;
    }

    public void setVestedPointBalance(int i)
    {
        vestedPointBalance = i;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ArrayList arraylist;
        Bundle bundle;
        int j;
        if (loyaltyCustomer)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        parcel.writeInt(j);
        parcel.writeString(command);
        parcel.writeString(enrollDate);
        parcel.writeString(status);
        parcel.writeString(accountStatus);
        parcel.writeInt(pendingPointBalance);
        parcel.writeInt(vestedPointBalance);
        parcel.writeString(customerId);
        parcel.writeString(lastActivityDate);
        parcel.writeString(pointExpirationDate);
        bundle = new Bundle();
        if (history != null)
        {
            arraylist = (ArrayList)history;
        } else
        {
            arraylist = new ArrayList();
        }
        bundle.putParcelableArrayList("history", arraylist);
        if (history != null)
        {
            arraylist = (ArrayList)loyaltyCoupons;
        } else
        {
            arraylist = new ArrayList();
        }
        bundle.putParcelableArrayList("loyaltyCoupons", arraylist);
        parcel.writeBundle(bundle);
        parcel.writeParcelable(potential, i);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final Loyalty createFromParcel(Parcel parcel)
        {
            return new Loyalty(parcel, null);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final Loyalty[] newArray(int i)
        {
            return new Loyalty[i];
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
