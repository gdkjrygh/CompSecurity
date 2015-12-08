// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.power;

import android.os.Parcel;
import android.os.Parcelable;
import com.dominos.android.sdk.common.core.MapNode;
import com.dominos.android.sdk.common.core.Seq;
import com.dominos.android.sdk.common.core.Util;
import com.dominos.android.sdk.common.dom.order.CreditCardType;
import com.dominos.android.sdk.common.dom.order.PaymentType;
import com.dominos.android.sdk.common.dom.order.WalletType;
import com.dominos.android.sdk.core.models.json.StoreProfileDeserializer;
import com.google.a.b.be;
import com.google.b.k;
import com.google.b.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.a.a.a.a.b;
import org.a.a.a.a.c;
import org.a.a.a.a.f;

public class StoreProfile
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static final StoreProfile EMPTY = (new Builder()).build();
    private final be acceptableCreditCardTypes;
    private final be acceptablePaymentTypes;
    private final be acceptableWalletTypes;
    private final String addressDescription;
    private final String carryoutHoursDescription;
    private final double cashLimit;
    private final String deliveryHoursDescription;
    private final boolean isAvsEnabled;
    private final boolean isCarryoutAvailable;
    private final boolean isDeliveryAvailable;
    private final boolean isGoogleWalletAvailable;
    private final boolean isOnline;
    private final boolean isOpen;
    private final boolean isPop;
    private final String minimumDeliveryOrderAmount;
    private final String phone;
    private final String storeId;

    private StoreProfile(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        acceptableCreditCardTypes = be.g();
        acceptablePaymentTypes = be.g();
        acceptableWalletTypes = be.g();
        addressDescription = parcel.readString();
        phone = parcel.readString();
        storeId = parcel.readString();
        minimumDeliveryOrderAmount = parcel.readString();
        cashLimit = parcel.readDouble();
        carryoutHoursDescription = parcel.readString();
        deliveryHoursDescription = parcel.readString();
        boolean flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isCarryoutAvailable = flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isDeliveryAvailable = flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isOnline = flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isOpen = flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isGoogleWalletAvailable = flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isAvsEnabled = flag;
        if (parcel.readInt() == 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        isPop = flag;
    }

    StoreProfile(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    private StoreProfile(String s, String s1, String s2, be be1, be be2, be be3, String s3, 
            double d, String s4, String s5, boolean flag, boolean flag1, boolean flag2, 
            boolean flag3, boolean flag4, boolean flag5, boolean flag6)
    {
        storeId = (String)Util.notNull(s);
        addressDescription = (String)Util.notNull(s1);
        phone = (String)Util.notNull(s2);
        acceptablePaymentTypes = (be)Util.notNull(be1);
        acceptableCreditCardTypes = (be)Util.notNull(be2);
        acceptableWalletTypes = (be)Util.notNull(be3);
        minimumDeliveryOrderAmount = (String)Util.notNull(s3);
        cashLimit = ((Double)Util.notNull(Double.valueOf(d))).doubleValue();
        carryoutHoursDescription = (String)Util.notNull(s4);
        deliveryHoursDescription = (String)Util.notNull(s5);
        isCarryoutAvailable = flag;
        isDeliveryAvailable = flag1;
        isOpen = flag3;
        isOnline = flag2;
        isGoogleWalletAvailable = flag4;
        isAvsEnabled = flag5;
        isPop = flag6;
    }

    StoreProfile(String s, String s1, String s2, be be1, be be2, be be3, String s3, 
            double d, String s4, String s5, boolean flag, boolean flag1, boolean flag2, 
            boolean flag3, boolean flag4, boolean flag5, boolean flag6, _cls1 _pcls1)
    {
        this(s, s1, s2, be1, be2, be3, s3, d, s4, s5, flag, flag1, flag2, flag3, flag4, flag5, flag6);
    }

    public static final StoreProfile from(String s)
    {
        return (StoreProfile)(new r()).a(com/dominos/android/sdk/common/power/StoreProfile, new StoreProfileDeserializer()).f().a(s, com/dominos/android/sdk/common/power/StoreProfile);
    }

    public static StoreProfile from(Map map)
    {
        map = new MapNode(map);
        Builder builder = (new Builder()).setStoreId(map.getText("StoreID")).setAddressDescription(map.getText("AddressDescription", "")).setPhone(map.getText("Phone", "")).setAcceptablePaymentTypes(Util.seq(map.getListText("AcceptablePaymentTypes", Collections.EMPTY_LIST)).transform(PaymentType.fromStringFn).toImmutableSet()).setAcceptableCreditCardTypes(Util.seq(standardizeCreditCardTypeNames(map.getListText("AcceptableCreditCards", Collections.EMPTY_LIST))).transform(CreditCardType.fromStringFn).toImmutableSet()).setAcceptableWalletTypes(Util.seq(map.getListText("AcceptableWalletTypes", Collections.EMPTY_LIST)).transform(WalletType.fromStringFn).toImmutableSet()).setMinimumDeliveryAmount(map.getText("MinimumDeliveryOrderAmount", "")).setCashLimit(map.getDbl("CashLimit", Double.valueOf(0.0D)).doubleValue()).setCarryoutHoursDescription(map.get("ServiceHoursDescription").getText("Carryout", "")).setDeliveryHoursDescription(map.get("ServiceHoursDescription").getText("Delivery", ""));
        boolean flag;
        if (map.getBool("AllowCarryoutOrders", Boolean.valueOf(false)).booleanValue() && map.getBool("IsOnlineNow", Boolean.valueOf(false)).booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        builder = builder.setCarryoutAvailable(flag);
        if (map.getBool("AllowDeliveryOrders", Boolean.valueOf(false)).booleanValue() && map.getBool("IsOnlineNow", Boolean.valueOf(false)).booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return builder.setDeliveryAvailable(flag).setOpen(map.getBool("IsOpen", Boolean.valueOf(false)).booleanValue()).setOnline(map.getBool("IsOnlineNow", Boolean.valueOf(false)).booleanValue()).setIsGoogleWalletAvailable().setIsAvsEnabled(map.getBool("IsAVSEnabled", Boolean.valueOf(true)).booleanValue()).setPop(map.getBool("Pop", Boolean.valueOf(false)).booleanValue()).build();
    }

    public static List standardizeCreditCardTypeNames(List list)
    {
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext();)
        {
            String s = (String)list.next();
            if (s.equalsIgnoreCase("American Express"))
            {
                arraylist.add("AMEX");
            } else
            if (s.equalsIgnoreCase("Diner's Club"))
            {
                arraylist.add("DINERS");
            } else
            if (s.equalsIgnoreCase("Discover Card"))
            {
                arraylist.add("DISCOVER");
            } else
            {
                arraylist.add(s.toUpperCase());
            }
        }

        return arraylist;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return b.a(this, obj);
    }

    public be getAcceptableCreditCardTypes()
    {
        return acceptableCreditCardTypes;
    }

    public be getAcceptablePaymentTypes()
    {
        return acceptablePaymentTypes;
    }

    public be getAcceptableWalletTypes()
    {
        return acceptableWalletTypes;
    }

    public String getAddressDescription()
    {
        return addressDescription;
    }

    public String getCarryoutHoursDescription()
    {
        return carryoutHoursDescription;
    }

    public double getCashLimit()
    {
        return cashLimit;
    }

    public String getDeliveryHoursDescription()
    {
        return deliveryHoursDescription;
    }

    public String getMinimumDeliveryOrderAmount()
    {
        return minimumDeliveryOrderAmount;
    }

    public String getPhone()
    {
        return phone;
    }

    public String getStoreId()
    {
        return storeId;
    }

    public int hashCode()
    {
        return c.a(this);
    }

    public boolean isAvsEnabled()
    {
        return isAvsEnabled;
    }

    public boolean isCarryoutAvailable()
    {
        return isCarryoutAvailable;
    }

    public boolean isDeliveryAvailable()
    {
        return isDeliveryAvailable;
    }

    public boolean isGoogleWalletAvailable()
    {
        return isGoogleWalletAvailable;
    }

    public boolean isOnline()
    {
        return isOnline;
    }

    public boolean isOpen()
    {
        return isOpen;
    }

    public boolean isPop()
    {
        return isPop;
    }

    public String toString()
    {
        return f.a(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        parcel.writeString(addressDescription);
        parcel.writeString(phone);
        parcel.writeString(storeId);
        parcel.writeString(minimumDeliveryOrderAmount);
        parcel.writeDouble(cashLimit);
        parcel.writeString(carryoutHoursDescription);
        parcel.writeString(deliveryHoursDescription);
        if (isCarryoutAvailable)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (isDeliveryAvailable)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (isOnline)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (isOpen)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (isGoogleWalletAvailable)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (isAvsEnabled)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (isPop)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }


    private class Builder
    {

        private be acceptableCreditCardTypes;
        private be acceptablePaymentTypes;
        private be acceptableWalletTypes;
        private String addressDescription;
        private String carryoutHoursDescription;
        private double cashLimit;
        private String deliveryHoursDescription;
        private boolean isAvsEnabled;
        private boolean isCarryoutAvailable;
        private boolean isDeliveryAvailable;
        private boolean isGoogleWalletAvailable;
        private boolean isOnline;
        private boolean isOpen;
        private boolean isPop;
        private String minimumDeliveryAmount;
        private String phone;
        private String storeId;

        public StoreProfile build()
        {
            return new StoreProfile(storeId, addressDescription, phone, acceptablePaymentTypes, acceptableCreditCardTypes, acceptableWalletTypes, minimumDeliveryAmount, cashLimit, carryoutHoursDescription, deliveryHoursDescription, isCarryoutAvailable, isDeliveryAvailable, isOnline, isOpen, isGoogleWalletAvailable, isAvsEnabled, isPop, null);
        }

        public Builder setAcceptableCreditCardTypes(be be1)
        {
            acceptableCreditCardTypes = be1;
            return this;
        }

        public Builder setAcceptablePaymentTypes(be be1)
        {
            acceptablePaymentTypes = be1;
            return this;
        }

        public Builder setAcceptableWalletTypes(be be1)
        {
            acceptableWalletTypes = be1;
            return this;
        }

        public Builder setAddressDescription(String s)
        {
            addressDescription = s;
            return this;
        }

        public Builder setCarryoutAvailable(boolean flag)
        {
            isCarryoutAvailable = flag;
            return this;
        }

        public Builder setCarryoutHoursDescription(String s)
        {
            carryoutHoursDescription = s;
            return this;
        }

        public Builder setCashLimit(double d)
        {
            cashLimit = d;
            return this;
        }

        public Builder setDeliveryAvailable(boolean flag)
        {
            isDeliveryAvailable = flag;
            return this;
        }

        public Builder setDeliveryHoursDescription(String s)
        {
            deliveryHoursDescription = s;
            return this;
        }

        public Builder setIsAvsEnabled(boolean flag)
        {
            isAvsEnabled = flag;
            return this;
        }

        public Builder setIsGoogleWalletAvailable()
        {
            if (acceptableWalletTypes != null && !acceptableWalletTypes.isEmpty() && acceptableWalletTypes.contains(WalletType.GOOGLE))
            {
                isGoogleWalletAvailable = true;
                return this;
            } else
            {
                isGoogleWalletAvailable = false;
                return this;
            }
        }

        public Builder setMinimumDeliveryAmount(String s)
        {
            minimumDeliveryAmount = s;
            return this;
        }

        public Builder setOnline(boolean flag)
        {
            isOnline = flag;
            return this;
        }

        public Builder setOpen(boolean flag)
        {
            isOpen = flag;
            return this;
        }

        public Builder setPhone(String s)
        {
            phone = s;
            return this;
        }

        public Builder setPop(boolean flag)
        {
            isPop = flag;
            return this;
        }

        public Builder setStoreId(String s)
        {
            storeId = s;
            return this;
        }

        public Builder()
        {
            acceptableCreditCardTypes = be.g();
            acceptablePaymentTypes = be.g();
            acceptableWalletTypes = be.g();
            addressDescription = "";
            phone = "";
            storeId = "";
            minimumDeliveryAmount = "";
            cashLimit = 0.0D;
            carryoutHoursDescription = "";
            deliveryHoursDescription = "";
        }
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final StoreProfile createFromParcel(Parcel parcel)
        {
            return new StoreProfile(parcel, null);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final StoreProfile[] newArray(int i)
        {
            return new StoreProfile[i];
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
