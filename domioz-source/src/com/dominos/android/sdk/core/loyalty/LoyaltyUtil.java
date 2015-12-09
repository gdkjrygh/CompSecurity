// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.loyalty;

import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.power.StoreProfile;
import com.dominos.android.sdk.core.models.coupon.Coupon;
import com.dominos.android.sdk.core.models.coupon.CouponTags;
import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;
import com.dominos.android.sdk.core.models.loyalty.Earn;
import com.dominos.android.sdk.core.models.loyalty.LoyaltyCoupon;
import com.dominos.android.sdk.core.models.loyalty.Potential;
import com.dominos.android.sdk.core.models.loyalty.PricePlaceLoyalty;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LoyaltyUtil
{

    public LoyaltyUtil()
    {
    }

    public static int getNumberOfPotentialTotalPoints(PricePlaceLoyalty priceplaceloyalty)
    {
        if (priceplaceloyalty != null)
        {
            priceplaceloyalty = priceplaceloyalty.getPotential();
            if (priceplaceloyalty != null)
            {
                priceplaceloyalty = priceplaceloyalty.getEarn();
                if (priceplaceloyalty != null)
                {
                    return priceplaceloyalty.getTotalPoints();
                }
            }
        }
        return 0;
    }

    public static boolean isLoyaltyCoupon(Coupon coupon)
    {
        if (coupon != null)
        {
            CouponTags coupontags = coupon.getTags();
            if (coupontags == null)
            {
                return coupon instanceof LoyaltyCoupon;
            } else
            {
                return StringHelper.isNotEmpty(coupontags.getLoyaltyPoints());
            }
        } else
        {
            return false;
        }
    }

    public static boolean isLoyaltyCouponLine(LabsCouponLine labscouponline)
    {
        return labscouponline != null && isLoyaltyCoupon(labscouponline.getCoupon());
    }

    public static boolean isPointsAboutToExpire(String s, Date date, int i)
    {
        Object obj = null;
        try
        {
            s = (new SimpleDateFormat("yyyy-MM-dd")).parse(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = obj;
        }
        if (s != null)
        {
            long l = s.getTime();
            long l1 = date.getTime();
            if (i > (int)TimeUnit.DAYS.convert(l - l1, TimeUnit.MILLISECONDS))
            {
                return true;
            }
        }
        return false;
    }

    public static boolean isStoreALoyaltyStore(StoreProfile storeprofile)
    {
        return storeprofile == null || StringHelper.isEmpty(storeprofile.getStoreId()) || storeprofile.isPop();
    }

    public static int loyaltyCouponListSize(List list)
    {
        list = list.iterator();
        int i = 0;
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            if (isLoyaltyCouponLine((LabsCouponLine)list.next()))
            {
                i++;
            }
        } while (true);
        return i;
    }
}
