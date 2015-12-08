// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.payment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.common.Objects;
import me.lyft.android.infrastructure.lyft.payment.CouponDTO;

// Referenced classes of package me.lyft.android.domain.payment:
//            Coupon, MoneyMapper

public class CouponMapper
{

    public CouponMapper()
    {
    }

    public static Coupon fromCouponDTO(CouponDTO coupondto)
    {
        if (coupondto == null)
        {
            return null;
        } else
        {
            Coupon coupon = new Coupon();
            coupon.setId((String)Objects.firstNonNull(coupondto.getId(), ""));
            coupon.setMoney(MoneyMapper.fromMoneyDTO(coupondto.getMoney()));
            coupon.setLineItemTitle((String)Objects.firstNonNull(coupondto.getLineItemTitle(), ""));
            return coupon;
        }
    }

    public static List fromCouponDTOs(List list)
    {
        if (list == null || list.isEmpty())
        {
            return Collections.emptyList();
        }
        ArrayList arraylist = new ArrayList(list.size());
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Coupon coupon = fromCouponDTO((CouponDTO)list.next());
            if (coupon != null)
            {
                arraylist.add(coupon);
            }
        } while (true);
        return arraylist;
    }
}
