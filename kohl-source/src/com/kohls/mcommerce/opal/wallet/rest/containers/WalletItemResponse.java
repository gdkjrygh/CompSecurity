// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.rest.containers;

import android.text.TextUtils;
import java.io.Serializable;

public class WalletItemResponse
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private int couponState;
    private String deleted;
    private String description;
    private String disclaimer;
    private String effectiveEndDate;
    private String effectiveStartDate;
    private String giftCardNum;
    private String giftable;
    private String id;
    private boolean isAnimationPending;
    private boolean isCardFlipped;
    private boolean isNewItem;
    private boolean isShortTermOffer;
    private String notifications;
    private String pin;
    private String promoCode;
    private boolean shareable;
    private String typeCode;
    private String value;
    private String valueAsOf;

    public WalletItemResponse()
    {
        isNewItem = false;
        isAnimationPending = true;
        isShortTermOffer = false;
        isCardFlipped = false;
    }

    public int getCouponState()
    {
        return couponState;
    }

    public String getDeleted()
    {
        return deleted;
    }

    public String getDescription()
    {
        return description;
    }

    public String getDisclaimer()
    {
        return disclaimer;
    }

    public String getEffectiveEndDate()
    {
        return effectiveEndDate;
    }

    public String getEffectiveStartDate()
    {
        return effectiveStartDate;
    }

    public String getGiftCardNum()
    {
        return giftCardNum;
    }

    public String getGiftable()
    {
        return giftable;
    }

    public String getId()
    {
        return id;
    }

    public String getNotifications()
    {
        return notifications;
    }

    public String getPin()
    {
        return pin;
    }

    public String getPromoCode()
    {
        return promoCode;
    }

    public boolean getShareable()
    {
        return shareable;
    }

    public String getTypeCode()
    {
        return typeCode;
    }

    public String getValue()
    {
        if (!TextUtils.isEmpty(value))
        {
            return value;
        } else
        {
            return "0.00";
        }
    }

    public String getValueAsOf()
    {
        if (!TextUtils.isEmpty(valueAsOf))
        {
            return valueAsOf;
        } else
        {
            return "0.00";
        }
    }

    public boolean isAnimationPending()
    {
        return isAnimationPending;
    }

    public boolean isCardFlipped()
    {
        return isCardFlipped;
    }

    public boolean isNewItem()
    {
        return isNewItem;
    }

    public boolean isShortTermOffer()
    {
        return isShortTermOffer;
    }

    public void setAnimationPending(boolean flag)
    {
        isAnimationPending = flag;
    }

    public void setCardFlipped(boolean flag)
    {
        isCardFlipped = flag;
    }

    public void setCouponState(int i)
    {
        couponState = i;
    }

    public void setDeleted(String s)
    {
        deleted = s;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setDisclaimer(String s)
    {
        disclaimer = s;
    }

    public void setEffectiveEndDate(String s)
    {
        effectiveEndDate = s;
    }

    public void setEffectiveStartDate(String s)
    {
        effectiveStartDate = s;
    }

    public void setGiftCardNum(String s)
    {
        giftCardNum = s;
    }

    public void setGiftable(String s)
    {
        giftable = s;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setNewItem(boolean flag)
    {
        isNewItem = flag;
    }

    public void setNotifications(String s)
    {
        notifications = s;
    }

    public void setPin(String s)
    {
        pin = s;
    }

    public void setPromoCode(String s)
    {
        promoCode = s;
    }

    public void setShareable(boolean flag)
    {
        shareable = flag;
    }

    public void setShortTermOffer(boolean flag)
    {
        isShortTermOffer = flag;
    }

    public void setTypeCode(String s)
    {
        typeCode = s;
    }

    public void setValue(String s)
    {
        value = s;
    }

    public void setValueAsOf(String s)
    {
        valueAsOf = s;
    }
}
