// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.content.res.Resources;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Spinner;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.common.value.ConstantValues;
import com.kohls.mcommerce.opal.framework.vo.CityAndState;
import java.util.Arrays;

// Referenced classes of package com.kohls.mcommerce.opal.loyalty:
//            LoyaltyEnrollmentActivity

private class <init> extends AsyncTask
{

    final LoyaltyEnrollmentActivity this$0;

    protected transient CityAndState doInBackground(Double adouble[])
    {
        return LoyaltyEnrollmentActivity.access$1600(LoyaltyEnrollmentActivity.this, adouble[0], adouble[1]);
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Double[])aobj);
    }

    protected void onPostExecute(CityAndState cityandstate)
    {
        UtilityMethods.dismissDialog(4002);
        if (cityandstate == null || TextUtils.isEmpty(cityandstate.getCity()) && TextUtils.isEmpty(cityandstate.getState()))
        {
            UtilityMethods.showToast(getActivity(), getResources().getString(0x7f08019b), 1);
        } else
        {
            LoyaltyEnrollmentActivity.access$1700(LoyaltyEnrollmentActivity.this).setText(cityandstate.getCity());
            int i;
            if (LoyaltyEnrollmentActivity.access$1800(LoyaltyEnrollmentActivity.this) == com.kohls.mcommerce.opal.common.util.._fld0)
            {
                i = Arrays.binarySearch(ConstantValues.STATES_CODE, cityandstate.getState());
            } else
            {
                i = Arrays.binarySearch(ConstantValues.ARMED_FORCE_STATES_CODE, cityandstate.getState());
            }
            LoyaltyEnrollmentActivity.access$1900(LoyaltyEnrollmentActivity.this).setSelection(Math.abs(i), true);
        }
        super.onPostExecute(cityandstate);
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((CityAndState)obj);
    }

    private ()
    {
        this$0 = LoyaltyEnrollmentActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
