// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models;

import com.dominos.android.sdk.common.core.Util;
import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;
import com.dominos.android.sdk.core.models.coupon.LabsCouponProductGroup;
import java.util.Comparator;
import java.util.List;
import org.a.a.a.a.b;
import org.a.a.a.a.c;
import org.a.a.a.a.f;

// Referenced classes of package com.dominos.android.sdk.core.models:
//            LabsProductLine

public class LabsCouponMatch
    implements Comparable
{

    public static Comparator byMatchTypeAndSeq = new _cls1();
    private final LabsCouponLine couponLine;
    private final LabsCouponProductGroup couponProductGroup;
    private LabsProductLine productLine;
    private final int seq;

    public LabsCouponMatch(LabsCouponLine labscouponline, LabsCouponProductGroup labscouponproductgroup, int i)
    {
        couponLine = (LabsCouponLine)Util.notNull(labscouponline);
        couponProductGroup = (LabsCouponProductGroup)Util.notNull(labscouponproductgroup);
        seq = Util.notNegative(i);
    }

    public int compareTo(LabsCouponMatch labscouponmatch)
    {
        return seq - labscouponmatch.seq;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((LabsCouponMatch)obj);
    }

    public boolean equals(Object obj)
    {
        return b.a(this, obj);
    }

    public LabsCouponLine getCouponLine()
    {
        return couponLine;
    }

    public LabsCouponProductGroup getCouponProductGroup()
    {
        return couponProductGroup;
    }

    public LabsProductLine getProductLine()
    {
        return productLine;
    }

    public int getSeq()
    {
        return seq;
    }

    public int hashCode()
    {
        return c.a(this);
    }

    public boolean matchesProductCode(String s)
    {
        return couponProductGroup.getProductCodes().contains(s);
    }

    public LabsCouponMatch setProductLine(LabsProductLine labsproductline)
    {
        productLine = labsproductline;
        return this;
    }

    public String toString()
    {
        return f.a(this);
    }


    private class _cls1
        implements Comparator
    {

        public final int compare(LabsCouponMatch labscouponmatch, LabsCouponMatch labscouponmatch1)
        {
            return (new a()).a(labscouponmatch.getSeq(), labscouponmatch1.getSeq()).a();
        }

        public final volatile int compare(Object obj, Object obj1)
        {
            return compare((LabsCouponMatch)obj, (LabsCouponMatch)obj1);
        }

        _cls1()
        {
        }
    }

}
