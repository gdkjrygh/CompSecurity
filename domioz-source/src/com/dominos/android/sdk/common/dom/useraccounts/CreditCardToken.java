// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.useraccounts;

import com.dominos.android.sdk.common.dom.order.Payment;
import com.google.a.b.av;
import com.google.a.b.aw;
import com.google.b.ab;
import com.google.b.t;
import com.google.b.w;
import com.google.b.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class CreditCardToken extends Payment
{

    private final String billingZip;
    private final String cardType;
    private final int expirationMonth;
    private final int expirationYear;
    private final String id;
    private boolean isDefault;
    private boolean isExpired;
    private final String lastFour;
    private String nickName;

    private CreditCardToken(Builder builder)
    {
        id = builder.id;
        lastFour = builder.lastFour;
        expirationMonth = builder.expirationMonth;
        expirationYear = builder.expirationYear;
        billingZip = builder.billingZip;
        cardType = builder.cardType;
        nickName = builder.nickName;
        isDefault = builder.isDefault;
        isExpired = builder.isExpired;
    }

    CreditCardToken(Builder builder, _cls1 _pcls1)
    {
        this(builder);
    }

    public static List parseCreditCardList(String s)
    {
        new ab();
        ArrayList arraylist = new ArrayList();
        s = (t)ab.a(s);
        for (int i = 0; i < s.a(); i++)
        {
            arraylist.add(parseCreditCardObject(s.a(i).h()));
        }

        return arraylist;
    }

    public static List parseCreditCardList(JSONArray jsonarray)
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < jsonarray.length(); i++)
        {
            arraylist.add(parseCreditCardObject((JSONObject)jsonarray.get(i)));
        }

        return arraylist;
    }

    public static CreditCardToken parseCreditCardObject(z z1)
    {
        boolean flag1 = false;
        Builder builder = new Builder();
        String s;
        int i;
        boolean flag;
        if (z1.a("id"))
        {
            s = z1.b("id").c();
        } else
        {
            s = "";
        }
        builder.setId(s);
        if (z1.a("cardType"))
        {
            s = z1.b("cardType").c();
        } else
        {
            s = "";
        }
        builder.setCardType(s);
        if (z1.a("expirationMonth"))
        {
            i = z1.b("expirationMonth").f();
        } else
        {
            i = 0;
        }
        builder.setExpirationMonth(i);
        if (z1.a("expirationYear"))
        {
            i = z1.b("expirationYear").f();
        } else
        {
            i = 0;
        }
        builder.setExpirationYear(i);
        if (z1.a("lastFour"))
        {
            s = z1.b("lastFour").c();
        } else
        {
            s = "";
        }
        builder.setLastFour(s);
        if (z1.a("billingZip"))
        {
            s = z1.b("billingZip").c();
        } else
        {
            s = "";
        }
        builder.setBillingZip(s);
        if (z1.a("isDefault"))
        {
            flag = z1.b("isDefault").g();
        } else
        {
            flag = false;
        }
        builder.setDefault(flag);
        flag = flag1;
        if (z1.a("isExpired"))
        {
            flag = z1.b("isExpired").g();
        }
        builder.setExpired(flag);
        if (z1.a("nickName"))
        {
            z1 = z1.b("nickName").c();
        } else
        {
            z1 = "";
        }
        builder.setNickName(z1);
        return builder.build();
    }

    public static CreditCardToken parseCreditCardObject(JSONObject jsonobject)
    {
        Builder builder = new Builder();
        builder.setId(jsonobject.optString("id"));
        builder.setCardType(jsonobject.optString("cardType"));
        builder.setExpirationMonth(jsonobject.optInt("expirationMonth"));
        builder.setExpirationYear(jsonobject.optInt("expirationYear"));
        builder.setLastFour(jsonobject.optString("lastFour"));
        builder.setBillingZip(jsonobject.optString("billingZip"));
        builder.setDefault(jsonobject.optBoolean("isDefault"));
        builder.setExpired(jsonobject.optBoolean("isExpired"));
        builder.setNickName(jsonobject.optString("nickName"));
        return builder.build();
    }

    public static CreditCardToken parseCreditCardToken(String s)
    {
        new ab();
        return parseCreditCardObject((z)ab.a(s));
    }

    public double getAmount()
    {
        return 0.0D;
    }

    public String getBillingZip()
    {
        return billingZip;
    }

    public String getCardType()
    {
        return cardType;
    }

    public int getExpirationMonth()
    {
        return expirationMonth;
    }

    public int getExpirationYear()
    {
        return expirationYear;
    }

    public String getId()
    {
        return id;
    }

    public String getLastFour()
    {
        return lastFour;
    }

    public String getNickName()
    {
        return nickName;
    }

    public String getNickNameLimitedLength(int i)
    {
        if (nickName.length() > i)
        {
            return nickName.substring(0, i).concat("...");
        } else
        {
            return nickName;
        }
    }

    public boolean isDefault()
    {
        return isDefault;
    }

    public boolean isExpired()
    {
        return isExpired;
    }

    public Payment setAmount(double d)
    {
        return this;
    }

    public Payment setNickName(String s)
    {
        nickName = s;
        return this;
    }

    public Map toMap()
    {
        return av.h().a("Type", "CreditCard").a("CardID", id).a();
    }

    public JSONObject toUpdateJson()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("lastFour", getLastFour());
        jsonobject.put("cardType", getCardType());
        jsonobject.put("expirationMonth", getExpirationMonth());
        jsonobject.put("expirationYear", getExpirationYear());
        jsonobject.put("billingZip", getBillingZip());
        jsonobject.put("isDefault", isDefault());
        jsonobject.put("nickName", getNickName());
        return jsonobject;
    }

    private class Builder
    {

        private String billingZip;
        private String cardType;
        private int expirationMonth;
        private int expirationYear;
        private String id;
        private boolean isDefault;
        private boolean isExpired;
        private String lastFour;
        private String nickName;

        public CreditCardToken build()
        {
            return new CreditCardToken(this, null);
        }

        public Builder setBillingZip(String s)
        {
            billingZip = s;
            return this;
        }

        public Builder setCardType(String s)
        {
            cardType = s;
            return this;
        }

        public Builder setDefault(boolean flag)
        {
            isDefault = flag;
            return this;
        }

        public Builder setExpirationMonth(int i)
        {
            expirationMonth = i;
            return this;
        }

        public Builder setExpirationYear(int i)
        {
            expirationYear = i;
            return this;
        }

        public Builder setExpired(boolean flag)
        {
            isExpired = flag;
            return this;
        }

        public Builder setId(String s)
        {
            id = s;
            return this;
        }

        public Builder setLastFour(String s)
        {
            lastFour = s;
            return this;
        }

        public Builder setNickName(String s)
        {
            nickName = s;
            return this;
        }










        public Builder()
        {
            isDefault = false;
        }
    }

}
