// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.graphics.drawable.Drawable;
import android.location.Location;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;

// Referenced classes of package com.kohls.mcommerce.opal.loyalty:
//            LoyaltyEnrollmentActivity

class val.editTextLeftIcon
    implements android.view.nrollmentActivity._cls4
{

    final LoyaltyEnrollmentActivity this$0;
    final Drawable val$editTextLeftIcon;
    final EditText val$view;

    public boolean onTouch(View view1, MotionEvent motionevent)
    {
        while (val$view.getCompoundDrawables() == null || motionevent.getAction() != 1 || motionevent.getX() <= (float)(val$view.getWidth() - val$view.getPaddingRight() - val$editTextLeftIcon.getIntrinsicWidth())) 
        {
            return false;
        }
        if (val$view.getId() != 0x7f0d0092) goto _L2; else goto _L1
_L1:
        if (UtilityMethods.canGetLocation(getActivity()))
        {
            view1 = LoyaltyEnrollmentActivity.access$1200(LoyaltyEnrollmentActivity.this);
            if (view1 != null)
            {
                if (UtilityMethods.isNetworkConnected(getActivity()))
                {
                    UtilityMethods.showKohlsProgressDialog(4002, null, getString(0x7f080436), null, true, false, false, 0, getActivity());
                    (new ocodeTask(LoyaltyEnrollmentActivity.this, null)).execute(new Double[] {
                        Double.valueOf(view1.getLatitude()), Double.valueOf(view1.getLongitude())
                    });
                } else
                {
                    Toast.makeText(getActivity(), 0x7f0803cd, 0).show();
                }
            } else
            {
                UtilityMethods.showKohlsProgressDialog(4002, null, getString(0x7f080436), null, true, false, false, 0, getActivity());
                LoyaltyEnrollmentActivity.access$1100(LoyaltyEnrollmentActivity.this);
            }
        } else
        {
            UtilityMethods.showSettingsAlert(getActivity());
        }
_L4:
        return true;
_L2:
        if (val$view.getId() == 0x7f0d007d)
        {
            setScannerListener(new stomScannerListener(LoyaltyEnrollmentActivity.this, null));
            startScan(1002);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    stomScannerListener()
    {
        this$0 = final_loyaltyenrollmentactivity;
        val$view = edittext;
        val$editTextLeftIcon = Drawable.this;
        super();
    }
}
