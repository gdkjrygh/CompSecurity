// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.payment;

import me.lyft.android.common.INullable;
import me.lyft.android.common.Objects;

// Referenced classes of package me.lyft.android.domain.payment:
//            CreditCardChargeAccount, CreditLineChargeAccount, FacebookChargeAccount, PayPalChargeAccount, 
//            WalletChargeAccount

public abstract class ChargeAccount
    implements INullable
{

    public static final String BUSINESS_TYPE = "business";
    public static final String CUSTOM_TYPE = "custom";
    public static final int MAX_NUMBER_OF_CARDS = 3;
    public static final String PERSONAL_LABEL = "Personal";
    public static final String PERSONAL_TYPE = "personal";
    private Boolean failed;
    private String id;
    private Boolean isDefault;
    private String label;
    private String labelType;

    public ChargeAccount()
    {
    }

    public String getId()
    {
        return (String)Objects.firstNonNull(id, "");
    }

    public String getLabel()
    {
        return (String)Objects.firstNonNull(label, "Personal");
    }

    public String getLabelType()
    {
        return (String)Objects.firstNonNull(labelType, "personal");
    }

    public boolean isCreditCard()
    {
        return this instanceof CreditCardChargeAccount;
    }

    public boolean isCreditLine()
    {
        return this instanceof CreditLineChargeAccount;
    }

    public Boolean isDefault()
    {
        return (Boolean)Objects.firstNonNull(isDefault, Boolean.FALSE);
    }

    public boolean isFacebook()
    {
        return this instanceof FacebookChargeAccount;
    }

    public Boolean isFailed()
    {
        return (Boolean)Objects.firstNonNull(failed, Boolean.FALSE);
    }

    public boolean isNull()
    {
        return false;
    }

    public boolean isPayPal()
    {
        return this instanceof PayPalChargeAccount;
    }

    public boolean isWallet()
    {
        return this instanceof WalletChargeAccount;
    }

    public void setDefault(Boolean boolean1)
    {
        isDefault = boolean1;
    }

    public void setFailed(Boolean boolean1)
    {
        failed = boolean1;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setLabel(String s)
    {
        label = s;
    }

    public void setLabelType(String s)
    {
        labelType = s;
    }
}
