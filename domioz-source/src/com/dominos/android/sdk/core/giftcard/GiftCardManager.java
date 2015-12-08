// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.giftcard;

import com.dominos.android.sdk.common.Manager;
import com.dominos.android.sdk.common.NumberUtil;
import com.dominos.android.sdk.common.dom.order.GiftCard;
import com.dominos.android.sdk.core.models.LabsOrder;
import java.util.ArrayList;
import java.util.Iterator;

public class GiftCardManager extends Manager
{

    private static final int GIFT_CARD_QUANTITY_LIMIT = 2;
    private ArrayList mGiftCardList;
    private NumberUtil mNumberUtil;
    private ArrayList mTempGiftCardList;

    public GiftCardManager()
    {
        mNumberUtil = new NumberUtil();
    }

    public void addGiftCard(GiftCard giftcard)
    {
        if (mTempGiftCardList == null)
        {
            mTempGiftCardList = new ArrayList();
            mTempGiftCardList.add(giftcard);
        } else
        if (mTempGiftCardList.size() < 2)
        {
            mTempGiftCardList.add(giftcard);
            return;
        }
    }

    public void deleteGiftCardList()
    {
        mGiftCardList = null;
    }

    public void deleteTempGiftCardList()
    {
        mTempGiftCardList = null;
    }

    public ArrayList getGiftCardList()
    {
        return mGiftCardList;
    }

    public String getName()
    {
        return "gift_card_manager";
    }

    public double getOtherCardAmount(GiftCard giftcard)
    {
        double d1;
        if (mTempGiftCardList != null)
        {
            Iterator iterator = mTempGiftCardList.iterator();
            double d = 0.0D;
            do
            {
                d1 = d;
                if (!iterator.hasNext())
                {
                    break;
                }
                GiftCard giftcard1 = (GiftCard)iterator.next();
                if (!giftcard.equals(giftcard1))
                {
                    d = giftcard1.getAmount() + d;
                }
            } while (true);
        } else
        {
            d1 = 0.0D;
        }
        return mNumberUtil.doubleToFormattedDouble(Double.valueOf(d1));
    }

    public double getRemainingBalaceMinusThisCard(LabsOrder labsorder, GiftCard giftcard)
    {
        return mNumberUtil.doubleToFormattedDouble(Double.valueOf(labsorder.getPrice() - getOtherCardAmount(giftcard)));
    }

    public double getRemainingBalance(LabsOrder labsorder)
    {
        return mNumberUtil.doubleToFormattedDouble(Double.valueOf(labsorder.getPrice() - getTotalGiftCardAmount()));
    }

    public double getRemainingTempBalance(LabsOrder labsorder)
    {
        return mNumberUtil.doubleToFormattedDouble(Double.valueOf(labsorder.getPrice() - getTotalTempGiftCardAmount()));
    }

    public ArrayList getTempGiftCardList()
    {
        return mTempGiftCardList;
    }

    public double getTotalGiftCardAmount()
    {
        double d1;
        if (mGiftCardList != null)
        {
            Iterator iterator = mGiftCardList.iterator();
            double d = 0.0D;
            do
            {
                d1 = d;
                if (!iterator.hasNext())
                {
                    break;
                }
                d = ((GiftCard)iterator.next()).getAmount() + d;
            } while (true);
        } else
        {
            d1 = 0.0D;
        }
        return mNumberUtil.doubleToFormattedDouble(Double.valueOf(d1));
    }

    public double getTotalTempGiftCardAmount()
    {
        double d1;
        if (mTempGiftCardList != null)
        {
            Iterator iterator = mTempGiftCardList.iterator();
            double d = 0.0D;
            do
            {
                d1 = d;
                if (!iterator.hasNext())
                {
                    break;
                }
                d = ((GiftCard)iterator.next()).getAmount() + d;
            } while (true);
        } else
        {
            d1 = 0.0D;
        }
        return mNumberUtil.doubleToFormattedDouble(Double.valueOf(d1));
    }

    public void loadTempGiftCardList()
    {
        mTempGiftCardList = mGiftCardList;
    }

    protected void onSessionSet()
    {
    }

    public void removeGiftCard(GiftCard giftcard)
    {
        mTempGiftCardList.remove(giftcard);
        if (mTempGiftCardList.size() == 0)
        {
            mTempGiftCardList = null;
        }
    }

    public void saveGiftCardList()
    {
        mGiftCardList = mTempGiftCardList;
    }
}
