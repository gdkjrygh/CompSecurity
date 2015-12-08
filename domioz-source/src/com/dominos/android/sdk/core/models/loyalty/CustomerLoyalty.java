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
//            LoyaltyCoupon

public class CustomerLoyalty
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private String accountStatus;
    private String command;
    private String customerId;
    private String enrollDate;
    private String lastActivityDate;
    private List loyaltyCoupons;
    private boolean loyaltyCustomer;
    private int pendingPointBalance;
    private String pointExpirationDate;
    private String status;
    private int vestedPointBalance;

    public CustomerLoyalty()
    {
    }

    private CustomerLoyalty(Parcel parcel)
    {
        boolean flag = true;
        super();
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
        parcel = parcel.readBundle();
        parcel.setClassLoader(com/dominos/android/sdk/core/models/loyalty/LoyaltyCoupon.getClassLoader());
        loyaltyCoupons = parcel.getParcelableArrayList("loyaltyCoupons");
    }

    CustomerLoyalty(Parcel parcel, _cls1 _pcls1)
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
        if (loyaltyCustomer)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
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
        if (loyaltyCoupons != null)
        {
            arraylist = (ArrayList)loyaltyCoupons;
        } else
        {
            arraylist = new ArrayList();
        }
        bundle.putParcelableArrayList("loyaltyCoupons", arraylist);
        parcel.writeBundle(bundle);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final CustomerLoyalty createFromParcel(Parcel parcel)
        {
            return new CustomerLoyalty(parcel, null);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final CustomerLoyalty[] newArray(int i)
        {
            return new CustomerLoyalty[i];
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
