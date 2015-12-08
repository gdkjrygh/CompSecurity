// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.os.Bundle;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.ServerLogger;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.framework.view.activity.HomeActivity;
import com.kohls.mcommerce.opal.framework.vo.ErrorVO;
import com.kohls.mcommerce.opal.framework.vo.IValueObject;
import com.kohls.mcommerce.opal.framework.vo.UpdateAccountVO;
import com.kohls.mcommerce.opal.helper.adapter.AdapterProcedure;
import java.util.ArrayList;

// Referenced classes of package com.kohls.mcommerce.opal.loyalty:
//            LoyaltyEnrollmentActivity

class val.valueObject
    implements Runnable
{

    final LoyaltyEnrollmentActivity this$0;
    final IValueObject val$valueObject;

    public void run()
    {
        if (val$valueObject != null && isAdded() && (val$valueObject instanceof UpdateAccountVO))
        {
            UpdateAccountVO updateaccountvo = (UpdateAccountVO)val$valueObject;
            if (updateaccountvo.getErrors() != null && updateaccountvo.getErrors().size() > 0)
            {
                if (UtilityMethods.isAuthError(((ErrorVO)updateaccountvo.getErrors().get(0)).getCode()) || ((ErrorVO)updateaccountvo.getErrors().get(0)).getCode().equals("401") || ((ErrorVO)updateaccountvo.getErrors().get(0)).getCode().contains("access_token_expired"))
                {
                    ServerLogger.errorSignedOut(TAG, AdapterProcedure.GET_CUSTOMER_PROFILE.getProcedureName(), "due to error in success of ");
                    KohlsPhoneApplication.getInstance().getAuthenticationUtils().setUserSignInStatus(false);
                    if (getActivity() != null)
                    {
                        UtilityMethods.openAccountActivity(getActivity(), true, true);
                    }
                }
            } else
            {
                Bundle bundle = new Bundle();
                bundle.putString("info_bundle", getString(0x7f08039a));
                ((HomeActivity)getActivity()).attachLoyaltyConfirmationFragment(bundle);
            }
        }
        UtilityMethods.dismissDialog(4002);
    }

    ()
    {
        this$0 = final_loyaltyenrollmentactivity;
        val$valueObject = IValueObject.this;
        super();
    }
}
