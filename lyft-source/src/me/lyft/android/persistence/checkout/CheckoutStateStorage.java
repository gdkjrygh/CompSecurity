// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.persistence.checkout;

import android.content.SharedPreferences;
import me.lyft.android.LyftApplication;

// Referenced classes of package me.lyft.android.persistence.checkout:
//            ICheckoutStateStorage

public class CheckoutStateStorage
    implements ICheckoutStateStorage
{

    private static final String SELECTED_CHARGE_ACCOUNT_ID = "selected_charge_account_id";
    private static final String SELECTED_COUPON_ID = "selected_coupon_id";
    private static final String SELECTED_TIP = "selected_tip";
    private final SharedPreferences preferences;

    public CheckoutStateStorage(LyftApplication lyftapplication)
    {
        preferences = lyftapplication.getSharedPreferences("checkout_state", 0);
    }

    private String getString(String s)
    {
        return preferences.getString(s, "");
    }

    private void putString(String s, String s1)
    {
        preferences.edit().putString(s, s1).apply();
    }

    public String getSelectedChargeAccountId()
    {
        return getString("selected_charge_account_id");
    }

    public String getSelectedCouponId()
    {
        return getString("selected_coupon_id");
    }

    public int getSelectedTip()
    {
        return preferences.getInt("selected_tip", 0);
    }

    public void reset()
    {
        preferences.edit().remove("selected_tip").remove("selected_charge_account_id").remove("selected_coupon_id").apply();
    }

    public void setSelectedChargeAccountId(String s)
    {
        putString("selected_charge_account_id", s);
    }

    public void setSelectedCouponId(String s)
    {
        putString("selected_coupon_id", s);
    }

    public void setSelectedTip(int i)
    {
        preferences.edit().putInt("selected_tip", i).apply();
    }
}
