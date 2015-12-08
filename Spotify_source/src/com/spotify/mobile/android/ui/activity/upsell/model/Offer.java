// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.upsell.model;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.ui.activity.upsell.consumables.ConsumablePeriod;
import cty;
import cur;
import java.util.Arrays;
import java.util.Map;

public class Offer
    implements JacksonModel
{

    private ConsumablePeriod mConsumablePeriod;
    private int mDuration;
    private DurationType mDurationType;
    private ImmutableMap mPrice;
    private ProductType mProductType;
    private boolean mTrial;

    public Offer(int i, DurationType durationtype, boolean flag, ProductType producttype, Map map)
    {
        this(i, durationtype, flag, producttype, map, null);
    }

    public Offer(int i, DurationType durationtype, boolean flag, ProductType producttype, Map map, ConsumablePeriod consumableperiod)
    {
        mDuration = i;
        mDurationType = durationtype;
        mTrial = flag;
        mProductType = producttype;
        durationtype = ImmutableMap.i();
        if (map != null && !map.isEmpty())
        {
            durationtype.a(map);
        }
        mPrice = durationtype.a();
        mConsumablePeriod = consumableperiod;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Offer)obj;
            if (!cty.a(Integer.valueOf(mDuration), Integer.valueOf(((Offer) (obj)).mDuration)))
            {
                return false;
            }
            if (!cty.a(mDurationType, ((Offer) (obj)).mDurationType))
            {
                return false;
            }
            if (!cty.a(Boolean.valueOf(mTrial), Boolean.valueOf(((Offer) (obj)).mTrial)))
            {
                return false;
            }
            if (!cty.a(mProductType, ((Offer) (obj)).mProductType))
            {
                return false;
            }
            if (!cty.a(getFormattedPrice(), ((Offer) (obj)).getFormattedPrice()))
            {
                return false;
            }
        }
        return true;
    }

    public ConsumablePeriod getConsumablePeriod()
    {
        return mConsumablePeriod;
    }

    public int getDuration()
    {
        return mDuration;
    }

    public DurationType getDurationType()
    {
        return mDurationType;
    }

    public String getFormattedPrice()
    {
        if (mPrice != null && mPrice.containsKey("formatted"))
        {
            return (String)mPrice.get("formatted");
        } else
        {
            return null;
        }
    }

    public ProductType getProductType()
    {
        return mProductType;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(mDuration), mDurationType, Boolean.valueOf(mTrial), mProductType
        });
    }

    public boolean isTrial()
    {
        return mTrial;
    }

    public void setConsumablePeriod(ConsumablePeriod consumableperiod)
    {
        mConsumablePeriod = consumableperiod;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(mDuration).append(" ").append(mDurationType).append(" ").append(mProductType).append(" for ");
        String s;
        if (mTrial)
        {
            s = "FREE";
        } else
        if (getFormattedPrice() == null)
        {
            s = "missing price";
        } else
        {
            s = getFormattedPrice();
        }
        return stringbuilder.append(s).toString();
    }
}
