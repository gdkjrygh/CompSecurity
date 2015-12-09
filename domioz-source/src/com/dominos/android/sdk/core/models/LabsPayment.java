// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models;

import com.dominos.android.sdk.common.GoogleWalletUtil;
import com.dominos.android.sdk.common.NumberUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.order.CreditCardType;
import com.dominos.android.sdk.common.dom.order.GiftCard;
import com.dominos.android.sdk.common.dom.useraccounts.AnonymousCreditCard;
import com.google.b.ab;
import com.google.b.t;
import com.google.b.w;
import com.google.b.z;
import java.util.ArrayList;
import java.util.List;
import org.a.a.a.a.f;
import org.a.a.a.a.g;

public class LabsPayment
{

    public static final String CASH_TYPE = "Cash";
    public static final String CHECK_TYPE = "Check";
    public static final String CREDIT_CARD_TOKEN_TYPE = "CreditCardToken";
    public static final String CREDIT_CARD_TYPE = "CreditCard";
    public static final String FAKE_EXPIRATION = "1223";
    public static final String FAKE_SECURITY_CODE = "111";
    public static final String GIFT_CARD_TYPE = "GiftCard";
    public static final String MASTERCARD = "MasterCard";
    public static final String TRADE_RECEIVABLE_TYPE = "TradeReceivable";
    public static final String UNKNOWN = "";
    public static final com.google.a.a.t toCreditCardTypeStringFn = new _cls2();
    public static final com.google.a.a.t toPaymentTypeStringFn = new _cls1();
    private double amount;
    private double balance;
    private String billingZip;
    private String cardId;
    private String cardType;
    private String expiration;
    private String expirationMonth;
    private String expirationYear;
    private boolean isDefault;
    private boolean isExpired;
    private String lastFour;
    private String nickName;
    private String number;
    private NumberUtil numberUtil;
    private String paymentType;
    private String postalCode;
    private String securityCode;
    private List statusItemList;
    private WalletPayment walletPayment;

    public LabsPayment()
    {
        paymentType = "";
        cardId = "";
        cardType = "";
        expiration = "";
        expirationMonth = "";
        expirationYear = "";
        number = "";
        postalCode = "";
        securityCode = "";
        nickName = "";
        lastFour = "";
        billingZip = "";
        numberUtil = new NumberUtil();
        statusItemList = new ArrayList();
    }

    public LabsPayment(GiftCard giftcard)
    {
        paymentType = "";
        cardId = "";
        cardType = "";
        expiration = "";
        expirationMonth = "";
        expirationYear = "";
        number = "";
        postalCode = "";
        securityCode = "";
        nickName = "";
        lastFour = "";
        billingZip = "";
        numberUtil = new NumberUtil();
        amount = numberUtil.doubleToFormattedDouble(Double.valueOf(giftcard.getAmount()));
        balance = giftcard.getBalance();
        paymentType = "GiftCard";
        number = giftcard.getFullCardNumber();
        securityCode = giftcard.getPin();
    }

    public LabsPayment(AnonymousCreditCard anonymouscreditcard)
    {
        paymentType = "";
        cardId = "";
        cardType = "";
        expiration = "";
        expirationMonth = "";
        expirationYear = "";
        number = "";
        postalCode = "";
        securityCode = "";
        nickName = "";
        lastFour = "";
        billingZip = "";
        numberUtil = new NumberUtil();
        amount = anonymouscreditcard.getAmount();
        paymentType = "CreditCard";
        cardType = anonymouscreditcard.getCreditCardType().getName();
        expirationMonth = anonymouscreditcard.getMonth();
        expirationYear = anonymouscreditcard.getYear();
        number = anonymouscreditcard.getFullCardNumber();
        postalCode = anonymouscreditcard.getZip();
        securityCode = anonymouscreditcard.getSecurityCode();
        nickName = anonymouscreditcard.getNickname();
        lastFour = anonymouscreditcard.getLastFour();
        billingZip = anonymouscreditcard.getZip();
        isDefault = anonymouscreditcard.isDefault();
    }

    public LabsPayment(LabsPayment labspayment)
    {
        paymentType = "";
        cardId = "";
        cardType = "";
        expiration = "";
        expirationMonth = "";
        expirationYear = "";
        number = "";
        postalCode = "";
        securityCode = "";
        nickName = "";
        lastFour = "";
        billingZip = "";
        numberUtil = new NumberUtil();
        amount = labspayment.amount;
        paymentType = labspayment.paymentType;
        cardId = labspayment.cardId;
        cardType = labspayment.cardType;
        expiration = labspayment.expiration;
        expirationMonth = labspayment.expirationMonth;
        expirationYear = labspayment.expirationYear;
        number = labspayment.number;
        postalCode = labspayment.postalCode;
        securityCode = labspayment.securityCode;
        nickName = labspayment.nickName;
        lastFour = labspayment.lastFour;
        billingZip = labspayment.billingZip;
        isDefault = labspayment.isDefault;
        isExpired = labspayment.isExpired;
        walletPayment = labspayment.walletPayment;
    }

    private String formatExpirationFieldPart(String s)
    {
        if (s.length() <= 0)
        {
            return "00";
        }
        if (s.length() == 1)
        {
            return (new StringBuilder("0")).append(s).toString();
        }
        if (s.length() == 4)
        {
            return s.substring(2);
        } else
        {
            return s.substring(0, 2);
        }
    }

    public static LabsPayment parseCreditCardObject(z z1)
    {
        LabsPayment labspayment = new LabsPayment();
        if (z1.a("id"))
        {
            labspayment.setCardId(z1.b("id").c());
        }
        if (z1.a("cardType"))
        {
            labspayment.setCardType(z1.b("cardType").c());
        }
        if (z1.a("expirationMonth"))
        {
            labspayment.setExpirationMonth(z1.b("expirationMonth").c());
        }
        if (z1.a("expirationYear"))
        {
            labspayment.setExpirationYear(z1.b("expirationYear").c());
        }
        if (z1.a("lastFour"))
        {
            labspayment.setLastFour(z1.b("lastFour").c());
        }
        if (z1.a("billingZip"))
        {
            labspayment.setBillingZip(z1.b("billingZip").c());
        }
        if (z1.a("isDefault"))
        {
            labspayment.setDefault(z1.b("isDefault").g());
        }
        if (z1.a("isExpired"))
        {
            labspayment.setExpired(z1.b("isExpired").g());
        }
        if (z1.a("nickName"))
        {
            labspayment.setNickName(z1.b("nickName").c());
        }
        return labspayment;
    }

    public static List parseSavedPaymentList(String s)
    {
        ArrayList arraylist = new ArrayList();
        new ab();
        s = (t)ab.a(s);
        for (int i = 0; i < s.a(); i++)
        {
            arraylist.add(parseCreditCardObject(s.a(i).h()));
        }

        return arraylist;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (LabsPayment)obj;
            if (Double.compare(((LabsPayment) (obj)).amount, amount) != 0)
            {
                return false;
            }
            if (isDefault != ((LabsPayment) (obj)).isDefault)
            {
                return false;
            }
            if (isExpired != ((LabsPayment) (obj)).isExpired)
            {
                return false;
            }
            if (!billingZip.equals(((LabsPayment) (obj)).billingZip))
            {
                return false;
            }
            if (!cardId.equals(((LabsPayment) (obj)).cardId))
            {
                return false;
            }
            if (!cardType.equals(((LabsPayment) (obj)).cardType))
            {
                return false;
            }
            if (!expiration.equals(((LabsPayment) (obj)).expiration))
            {
                return false;
            }
            if (!expirationMonth.equals(((LabsPayment) (obj)).expirationMonth))
            {
                return false;
            }
            if (!expirationYear.equals(((LabsPayment) (obj)).expirationYear))
            {
                return false;
            }
            if (!lastFour.equals(((LabsPayment) (obj)).lastFour))
            {
                return false;
            }
            if (!nickName.equals(((LabsPayment) (obj)).nickName))
            {
                return false;
            }
            if (!number.equals(((LabsPayment) (obj)).number))
            {
                return false;
            }
            if (!paymentType.equals(((LabsPayment) (obj)).paymentType))
            {
                return false;
            }
            if (!postalCode.equals(((LabsPayment) (obj)).postalCode))
            {
                return false;
            }
            if (!securityCode.equals(((LabsPayment) (obj)).securityCode))
            {
                return false;
            }
            if (walletPayment == null ? ((LabsPayment) (obj)).walletPayment != null : !walletPayment.equals(((LabsPayment) (obj)).walletPayment))
            {
                return false;
            }
            if (!securityCode.equals(((LabsPayment) (obj)).securityCode))
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

    public String getBillingZip()
    {
        return billingZip;
    }

    public String getCardId()
    {
        return cardId;
    }

    public String getCardType()
    {
        return cardType;
    }

    public String getExpiration()
    {
        if (StringHelper.isNotEmpty(expiration))
        {
            return expiration;
        } else
        {
            return (new StringBuilder()).append(formatExpirationFieldPart(getExpirationMonth())).append(formatExpirationFieldPart(getExpirationYear())).toString();
        }
    }

    public String getExpirationMonth()
    {
        return expirationMonth;
    }

    public String getExpirationYear()
    {
        return expirationYear;
    }

    public String getLastFour()
    {
        return lastFour;
    }

    public String getNickName()
    {
        return nickName;
    }

    public String getNumber()
    {
        return number;
    }

    public String getPaymentType()
    {
        if (StringHelper.isNotEmpty(paymentType))
        {
            return paymentType;
        }
        if (StringHelper.isNotEmpty(cardId))
        {
            return "CreditCardToken";
        }
        if (StringHelper.isNotEmpty(cardType))
        {
            return "CreditCard";
        } else
        {
            return "Cash";
        }
    }

    public String getPostalCode()
    {
        return postalCode;
    }

    public String getSecurityCode()
    {
        return securityCode;
    }

    public List getStatusItemList()
    {
        return statusItemList;
    }

    public WalletPayment getWalletPayment()
    {
        return walletPayment;
    }

    public int hashCode()
    {
        int j = 1;
        int k = 0;
        long l4 = Double.doubleToLongBits(amount);
        int l = (int)(l4 ^ l4 >>> 32);
        int i1 = paymentType.hashCode();
        int j1 = cardId.hashCode();
        int k1 = cardType.hashCode();
        int l1 = expiration.hashCode();
        int i2 = expirationMonth.hashCode();
        int j2 = expirationYear.hashCode();
        int k2 = number.hashCode();
        int l2 = postalCode.hashCode();
        int i3 = securityCode.hashCode();
        int j3 = nickName.hashCode();
        int k3 = lastFour.hashCode();
        int l3 = billingZip.hashCode();
        int i;
        if (isDefault)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (!isExpired)
        {
            j = 0;
        }
        if (walletPayment != null)
        {
            k = walletPayment.hashCode();
        }
        return ((i + ((((((((((((l * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31 + j3) * 31 + k3) * 31 + l3) * 31) * 31 + j) * 31 + k;
    }

    public boolean isDefault()
    {
        return isDefault;
    }

    public boolean isExpired()
    {
        return isExpired;
    }

    public void setAmount(double d)
    {
        amount = d;
    }

    public void setBillingZip(String s)
    {
        billingZip = s;
    }

    public void setCardId(String s)
    {
        cardId = s;
    }

    public void setCardType(String s)
    {
        cardType = s;
    }

    public void setDefault(boolean flag)
    {
        isDefault = flag;
    }

    public void setExpiration(String s)
    {
        expiration = s;
    }

    public void setExpirationMonth(String s)
    {
        expirationMonth = s;
    }

    public void setExpirationYear(String s)
    {
        expirationYear = s;
    }

    public void setExpired(boolean flag)
    {
        isExpired = flag;
    }

    public void setLastFour(String s)
    {
        lastFour = s;
    }

    public void setNickName(String s)
    {
        nickName = s;
    }

    public void setNumber(String s)
    {
        number = s;
    }

    public void setPaymentType(String s)
    {
        paymentType = s;
    }

    public void setPostalCode(String s)
    {
        postalCode = s;
    }

    public void setSecurityCode(String s)
    {
        securityCode = s;
    }

    public void setStatusItemList(List list)
    {
        statusItemList = list;
    }

    public void setWalletFromGwPaymentDesc(String as[])
    {
        GoogleWalletUtil googlewalletutil = new GoogleWalletUtil();
        walletPayment = new WalletPayment();
        walletPayment.cardNumber = googlewalletutil.getCardLastFour(as);
        walletPayment.cardType = googlewalletutil.getCardType(as);
    }

    public void setWalletPayment(WalletPayment walletpayment)
    {
        walletPayment = walletpayment;
    }

    public String toString()
    {
        return f.b(this, g.d);
    }

    public z toUpdateJsonObject()
    {
        z z1 = new z();
        z1.a("lastFour", getLastFour());
        z1.a("cardType", getCardType());
        z1.a("expirationMonth", getExpirationMonth());
        z1.a("expirationYear", getExpirationYear());
        z1.a("billingZip", getBillingZip());
        z1.a("isDefault", Boolean.valueOf(isDefault()));
        z1.a("nickName", getNickName());
        return z1;
    }


    private class WalletPayment
    {

        public static final String WALLET_TYPE = "Google";
        public String cardNumber;
        public String cardType;
        final LabsPayment this$0;

        public WalletPayment()
        {
            this$0 = LabsPayment.this;
            super();
        }
    }


    private class _cls1
        implements com.google.a.a.t
    {

        public final volatile Object apply(Object obj)
        {
            return apply((LabsPayment)obj);
        }

        public final String apply(LabsPayment labspayment)
        {
            return labspayment.getPaymentType();
        }

        _cls1()
        {
        }
    }


    private class _cls2
        implements com.google.a.a.t
    {

        public final volatile Object apply(Object obj)
        {
            return apply((LabsPayment)obj);
        }

        public final String apply(LabsPayment labspayment)
        {
            return labspayment.getCardType();
        }

        _cls2()
        {
        }
    }

}
