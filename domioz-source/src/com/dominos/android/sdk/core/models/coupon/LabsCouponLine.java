// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.coupon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.a.a.a.a.f;
import org.a.a.a.a.g;
import org.c.d.d;

// Referenced classes of package com.dominos.android.sdk.core.models.coupon:
//            Coupon

public class LabsCouponLine
{

    private static List couponErrors = Arrays.asList(new String[] {
        "CouponExclusivityViolation", "CouponIsInvalidForDayPart", "CouponIsInvalidForDayOfWeek", "UsageCountViolation", "InvalidServiceMethodForCoupon", "BelowMinimumOrderAmount", "CouponIsNotEffectiveOrExpired"
    });
    private Coupon coupon;
    private int id;
    private String label;
    private int status;
    private List statusItemList;

    public LabsCouponLine()
    {
    }

    public LabsCouponLine(LabsCouponLine labscouponline)
    {
        coupon = new Coupon(labscouponline.coupon);
        id = labscouponline.id;
        status = labscouponline.status;
        if (labscouponline.statusItemList != null)
        {
            statusItemList = new ArrayList(labscouponline.statusItemList);
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (LabsCouponLine)obj;
            if (id != ((LabsCouponLine) (obj)).id)
            {
                return false;
            }
            if (coupon == null ? ((LabsCouponLine) (obj)).coupon != null : !coupon.equals(((LabsCouponLine) (obj)).coupon))
            {
                return false;
            }
            if (label == null ? ((LabsCouponLine) (obj)).label != null : !label.equals(((LabsCouponLine) (obj)).label))
            {
                return false;
            }
        }
        return true;
    }

    public Coupon getCoupon()
    {
        return coupon;
    }

    public int getId()
    {
        return id;
    }

    public String getLabel()
    {
        return label;
    }

    public int getStatus()
    {
        return status;
    }

    public List getStatusItemList()
    {
        return statusItemList;
    }

    public boolean hasError()
    {
label0:
        {
            if (d.isEmpty(statusItemList))
            {
                return false;
            }
            Iterator iterator = statusItemList.iterator();
            String s;
label1:
            do
            {
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    s = (String)((Map)iterator.next()).get("Code");
                } while (s == null);
                Iterator iterator1 = couponErrors.iterator();
                do
                {
                    if (!iterator1.hasNext())
                    {
                        continue label1;
                    }
                } while (!s.equalsIgnoreCase((String)iterator1.next()));
                return true;
            } while (getStatus() == 0 || "Unfulfilled".equalsIgnoreCase(s));
            return true;
        }
        return false;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        int k;
        if (coupon != null)
        {
            i = coupon.hashCode();
        } else
        {
            i = 0;
        }
        k = id;
        if (label != null)
        {
            j = label.hashCode();
        }
        return (i * 31 + k) * 31 + j;
    }

    public boolean isFulfilled()
    {
        if (statusItemList != null)
        {
            for (Iterator iterator = statusItemList.iterator(); iterator.hasNext();)
            {
                Map map = (Map)iterator.next();
                if (map.containsKey("Code") && ((String)map.get("Code")).trim().equalsIgnoreCase("Unfulfilled"))
                {
                    return false;
                }
            }

            return true;
        } else
        {
            return false;
        }
    }

    public void setCoupon(Coupon coupon1)
    {
        coupon = coupon1;
    }

    public void setId(int i)
    {
        id = i;
    }

    public void setLabel(String s)
    {
        label = s;
    }

    public void setStatus(int i)
    {
        status = i;
    }

    public void setStatusItemList(List list)
    {
        statusItemList = list;
    }

    public String toString()
    {
        return f.b(this, g.d);
    }

}
