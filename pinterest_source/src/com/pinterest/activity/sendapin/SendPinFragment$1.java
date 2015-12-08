// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendapin;

import android.view.View;
import com.pinterest.base.Constants;
import com.pinterest.base.Device;

// Referenced classes of package com.pinterest.activity.sendapin:
//            SendPinFragment

class val.wrapper
    implements Runnable
{

    final SendPinFragment this$0;
    final View val$wrapper;

    public void run()
    {
        if (Device.isTablet() || Device.isLandscape())
        {
            android.widget.Params params = (android.widget.Params)val$wrapper.getLayoutParams();
            params.width = Constants.SHEET_MAX_WIDTH;
            params.gravity = 1;
            return;
        } else
        {
            val$wrapper.getLayoutParams().width = (int)Device.getScreenWidth();
            return;
        }
    }

    ()
    {
        this$0 = final_sendpinfragment;
        val$wrapper = View.this;
        super();
    }
}
