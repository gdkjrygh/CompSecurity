// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.app.Activity;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.helper.error.Error;
import com.kohls.mcommerce.opal.helper.error.ErrorHelper;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.loyalty:
//            LoyaltyEnrollmentActivity

class val.kohlsError
    implements Runnable
{

    final LoyaltyEnrollmentActivity this$0;
    final Error val$kohlsError;

    public void run()
    {
        UtilityMethods.dismissDialog(4002);
        if (!ErrorHelper.isApplicationManagable(val$kohlsError))
        {
            ArrayList arraylist = new ArrayList();
            arraylist.add(val$kohlsError.getMessage());
            showError(arraylist);
            getActivity().setResult(0);
        }
    }

    ()
    {
        this$0 = final_loyaltyenrollmentactivity;
        val$kohlsError = Error.this;
        super();
    }
}
