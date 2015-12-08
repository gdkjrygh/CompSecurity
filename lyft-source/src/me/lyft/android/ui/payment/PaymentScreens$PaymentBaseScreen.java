// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import com.lyft.scoop.IHaveParent;
import com.lyft.scoop.Screen;
import me.lyft.android.ui.MainScreens;

// Referenced classes of package me.lyft.android.ui.payment:
//            PaymentScreens

public class coupon extends PaymentScreens
    implements IHaveParent
{

    private String coupon;
    private int paymentMode;

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (super.equals(obj))
        {
            flag = flag1;
            if (coupon == ((coupon)obj).coupon)
            {
                flag = true;
            }
        }
        return flag;
    }

    public String getCoupon()
    {
        return coupon;
    }

    public volatile Screen getParent()
    {
        return getParent();
    }

    public MainScreens getParent()
    {
        return new me.lyft.android.ui.eScreen();
    }

    public int getPaymentMode()
    {
        return paymentMode;
    }

    public void resetCoupon()
    {
        coupon = null;
    }

    public A()
    {
        paymentMode = 0;
    }

    public paymentMode(int i)
    {
        paymentMode = 0;
        paymentMode = i;
    }

    public paymentMode(String s)
    {
        paymentMode = 0;
        coupon = s;
    }
}
