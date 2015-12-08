// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.useraccounts;

import com.dominos.android.sdk.common.dom.order.CreditCardType;
import com.dominos.android.sdk.common.dom.order.Payment;
import com.google.a.b.av;
import com.google.a.b.aw;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class AnonymousCreditCard extends Payment
{

    private double amount;
    private final CreditCardType creditCardType;
    private final String fullCardNumber;
    private final boolean isDefault;
    private final String month;
    private final String nickname;
    private final String securityCode;
    private final String year;
    private final String zip;

    private AnonymousCreditCard(Builder builder)
    {
        nickname = builder.nickname;
        isDefault = builder.isDefault;
        fullCardNumber = builder.fullCardNumber;
        month = builder.month;
        year = builder.year;
        securityCode = builder.securityCode;
        zip = builder.zip;
        amount = builder.amount;
        if (builder.creditCardType == CreditCardType.UNKNOWN && fullCardNumber.length() > 0)
        {
            creditCardType = CreditCardType.fromCardNumber(fullCardNumber);
            return;
        } else
        {
            creditCardType = builder.creditCardType;
            return;
        }
    }

    AnonymousCreditCard(Builder builder, _cls1 _pcls1)
    {
        this(builder);
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof AnonymousCreditCard))
            {
                return false;
            }
            obj = (AnonymousCreditCard)obj;
            if (!nickname.equals(((AnonymousCreditCard) (obj)).nickname))
            {
                return false;
            }
            if (isDefault != ((AnonymousCreditCard) (obj)).isDefault)
            {
                return false;
            }
            if (!fullCardNumber.equals(((AnonymousCreditCard) (obj)).fullCardNumber))
            {
                return false;
            }
            if (!month.equals(((AnonymousCreditCard) (obj)).month))
            {
                return false;
            }
            if (!year.equals(((AnonymousCreditCard) (obj)).year))
            {
                return false;
            }
            if (!securityCode.equals(((AnonymousCreditCard) (obj)).securityCode))
            {
                return false;
            }
            if (!zip.equals(((AnonymousCreditCard) (obj)).zip))
            {
                return false;
            }
            if (Double.compare(amount, ((AnonymousCreditCard) (obj)).amount) != 0)
            {
                return false;
            }
            if (creditCardType != ((AnonymousCreditCard) (obj)).creditCardType)
            {
                return false;
            }
        }
        return true;
    }

    public double getAmount()
    {
        return amount;
    }

    public CreditCardType getCreditCardType()
    {
        return creditCardType;
    }

    public String getFullCardNumber()
    {
        return fullCardNumber;
    }

    public String getLastFour()
    {
        if (fullCardNumber == null)
        {
            return null;
        }
        if (fullCardNumber.length() < 4)
        {
            return fullCardNumber;
        } else
        {
            return fullCardNumber.substring(fullCardNumber.length() - 4);
        }
    }

    public String getMonth()
    {
        return month;
    }

    public String getNickname()
    {
        if (nickname == null || nickname.length() == 0)
        {
            return toString();
        } else
        {
            return nickname;
        }
    }

    public String getSecurityCode()
    {
        return securityCode;
    }

    public String getYear()
    {
        return year;
    }

    public String getZip()
    {
        return zip;
    }

    public int hashCode()
    {
        int j = nickname.hashCode();
        int k = fullCardNumber.hashCode();
        int l = month.hashCode();
        int i1 = year.hashCode();
        int j1 = securityCode.hashCode();
        int k1 = zip.hashCode();
        long l2 = Double.doubleToLongBits(amount);
        int l1 = (int)(l2 ^ l2 >>> 32);
        int i2 = creditCardType.ordinal();
        int i;
        if (isDefault)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return i + ((((((((j + 2449) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + i2) * 31;
    }

    public boolean isDefault()
    {
        return isDefault;
    }

    public Payment setAmount(double d)
    {
        amount = d;
        return this;
    }

    public JSONObject toJson()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("number", fullCardNumber);
        jsonobject.put("expirationMonth", month);
        jsonobject.put("expirationYear", year);
        jsonobject.put("securityCode", securityCode);
        jsonobject.put("billingZip", zip);
        jsonobject.put("isDefault", isDefault);
        jsonobject.put("nickName", nickname);
        return jsonobject;
    }

    public String toJsonString()
    {
        String s;
        try
        {
            s = toJson().toString();
        }
        catch (JSONException jsonexception)
        {
            return "";
        }
        return s;
    }

    public Map toMap()
    {
        String s;
        String s1;
        if (month.length() == 1)
        {
            s = (new StringBuilder("0")).append(month).toString();
        } else
        {
            s = month;
        }
        if (year.length() == 4)
        {
            s1 = year.substring(2);
        } else
        {
            s1 = year;
        }
        s = (new StringBuilder()).append(s).append(s1).toString();
        return av.h().a("Type", "CreditCard").a("Amount", Double.valueOf(amount)).a("Number", fullCardNumber).a("CardType", creditCardType.getName()).a("Expiration", s).a("SecurityCode", securityCode).a("PostalCode", zip).a();
    }

    private class Builder
    {

        private double amount;
        private CreditCardType creditCardType;
        private String fullCardNumber;
        private boolean isDefault;
        private String month;
        private String nickname;
        private String securityCode;
        private String year;
        private String zip;

        public AnonymousCreditCard build()
        {
            return new AnonymousCreditCard(this, null);
        }

        public Builder setAmount(double d)
        {
            amount = d;
            return this;
        }

        public Builder setDefault(boolean flag)
        {
            isDefault = flag;
            return this;
        }

        public Builder setFullNumber(String s)
        {
            fullCardNumber = s;
            return this;
        }

        public Builder setMonth(String s)
        {
            month = s;
            return this;
        }

        public Builder setNickname(String s)
        {
            nickname = s;
            return this;
        }

        public Builder setSecurityCode(String s)
        {
            securityCode = s;
            return this;
        }

        public Builder setType(CreditCardType creditcardtype)
        {
            creditCardType = creditcardtype;
            return this;
        }

        public Builder setYear(String s)
        {
            year = s;
            return this;
        }

        public Builder setZip(String s)
        {
            zip = s;
            return this;
        }










        public Builder()
        {
            fullCardNumber = "";
            month = "";
            year = "";
            securityCode = "";
            zip = "";
            nickname = "";
            amount = 0.0D;
            creditCardType = CreditCardType.fromString("");
            isDefault = false;
        }
    }

}
