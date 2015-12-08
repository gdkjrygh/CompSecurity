// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.order;

import android.os.Parcel;
import android.os.Parcelable;
import com.dominos.android.sdk.common.NumberUtil;
import com.dominos.android.sdk.core.models.json.GiftCardSerializer;
import com.google.a.b.av;
import com.google.a.b.aw;
import com.google.b.k;
import com.google.b.r;
import java.util.ArrayList;
import java.util.Map;

// Referenced classes of package com.dominos.android.sdk.common.dom.order:
//            Payment

public class GiftCard extends Payment
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private double amount;
    private double balance;
    private String fullCardNumber;
    private NumberUtil numberUtil;
    private String pin;
    private int status;
    private ArrayList statusItems;

    private GiftCard(Parcel parcel)
    {
        numberUtil = new NumberUtil();
        setFullCardNumber(parcel.readString());
        setPin(parcel.readString());
        setAmount(parcel.readDouble());
        setBalance(Double.valueOf(parcel.readDouble()));
        setStatus(parcel.readInt());
        setStatusItems(parcel.readArrayList(java/lang/String.getClassLoader()));
    }

    GiftCard(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    private GiftCard(Builder builder)
    {
        numberUtil = new NumberUtil();
        fullCardNumber = builder.fullCardNumber;
        pin = builder.pin;
        amount = builder.amount;
        balance = builder.balance;
        status = builder.status;
        statusItems = builder.statusItems;
    }

    GiftCard(Builder builder, _cls1 _pcls1)
    {
        this(builder);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof GiftCard))
            {
                return false;
            }
            obj = (GiftCard)obj;
            if (!fullCardNumber.equals(((GiftCard) (obj)).fullCardNumber))
            {
                return false;
            }
            if (!pin.equals(((GiftCard) (obj)).pin))
            {
                return false;
            }
        }
        return true;
    }

    public double getAmount()
    {
        return numberUtil.doubleToFormattedDouble(Double.valueOf(amount));
    }

    public double getBalance()
    {
        return numberUtil.doubleToFormattedDouble(Double.valueOf(balance));
    }

    public String getFullCardNumber()
    {
        return fullCardNumber;
    }

    public String getLastThree()
    {
        if (fullCardNumber == null)
        {
            return null;
        }
        if (fullCardNumber.length() < 3)
        {
            return fullCardNumber;
        } else
        {
            return (new StringBuilder("**** - ")).append(fullCardNumber.substring(fullCardNumber.length() - 3)).toString();
        }
    }

    public String getPin()
    {
        return pin;
    }

    public int getStatus()
    {
        return status;
    }

    public ArrayList getStatusItems()
    {
        return statusItems;
    }

    public int hashCode()
    {
        return (fullCardNumber.hashCode() + 2449) * 31 + pin.hashCode();
    }

    public Payment setAmount(double d)
    {
        amount = d;
        return this;
    }

    public void setBalance(Double double1)
    {
        balance = double1.doubleValue();
    }

    public void setFullCardNumber(String s)
    {
        fullCardNumber = s;
    }

    public void setPin(String s)
    {
        pin = s;
    }

    public void setStatus(int i)
    {
        status = i;
    }

    public void setStatusItems(ArrayList arraylist)
    {
        statusItems = arraylist;
    }

    public String toJson(GiftCard giftcard)
    {
        return (new r()).a(com/dominos/android/sdk/common/dom/order/GiftCard, new GiftCardSerializer()).f().b(giftcard, com/dominos/android/sdk/common/dom/order/GiftCard);
    }

    public String toJsonString()
    {
        return "";
    }

    public Map toMap()
    {
        return av.h().a("Type", "GiftCard").a("Amount", Double.valueOf(amount)).a("Number", fullCardNumber).a("Pin", pin).a("Balance", Double.valueOf(balance)).a("Status", Integer.valueOf(status)).a("StatusItems", statusItems).a();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(fullCardNumber);
        parcel.writeString(pin);
        parcel.writeDouble(amount);
        parcel.writeDouble(balance);
        parcel.writeInt(status);
        parcel.writeStringList(statusItems);
    }


    private class Builder
    {

        private double amount;
        private double balance;
        private String fullCardNumber;
        private String pin;
        private int status;
        private ArrayList statusItems;

        public GiftCard build()
        {
            return new GiftCard(this, null);
        }

        public Builder setAmount(double d)
        {
            amount = d;
            return this;
        }

        public Builder setBalance(double d)
        {
            balance = d;
            return this;
        }

        public Builder setFullNumber(String s)
        {
            fullCardNumber = s;
            return this;
        }

        public Builder setPin(String s)
        {
            pin = s;
            return this;
        }

        public Builder setStatus(int i)
        {
            status = i;
            return this;
        }

        public Builder setStatusItems(ArrayList arraylist)
        {
            statusItems = arraylist;
            return this;
        }







        public Builder()
        {
            fullCardNumber = "";
            pin = "";
            amount = 0.0D;
            balance = 0.0D;
            status = 0;
        }
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final GiftCard createFromParcel(Parcel parcel)
        {
            return new GiftCard(parcel, null);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final GiftCard[] newArray(int i)
        {
            return new GiftCard[i];
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
