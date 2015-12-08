// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

// Referenced classes of package com.kohls.mcommerce.opal.loyalty:
//            EditRewardsAddressActivity

class val.cityEditTxt
    implements android.view.dsAddressActivity._cls3
{

    final EditRewardsAddressActivity this$0;
    final EditText val$cityEditTxt;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            val$cityEditTxt.setFocusable(true);
            val$cityEditTxt.setFocusableInTouchMode(true);
            ((InputMethodManager)getSystemService("input_method")).showSoftInput(val$cityEditTxt, 0);
        }
        return false;
    }

    ()
    {
        this$0 = final_editrewardsaddressactivity;
        val$cityEditTxt = EditText.this;
        super();
    }
}
