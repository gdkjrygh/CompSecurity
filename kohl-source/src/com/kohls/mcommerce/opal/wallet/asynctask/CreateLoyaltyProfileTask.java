// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.asynctask;

import android.content.Context;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.helper.adapter.listener.IAdapterListener;
import com.kohls.mcommerce.opal.wallet.manager.ListenerManager;
import com.kohls.mcommerce.opal.wallet.rest.UpdateLoyaltyProfileService;
import com.kohls.mcommerce.opal.wallet.rest.containers.LoyaltyProfileResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.ProfileData;
import java.lang.ref.WeakReference;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.asynctask:
//            BaseAsyncTask

public class CreateLoyaltyProfileTask extends BaseAsyncTask
{

    public CreateLoyaltyProfileTask(Context context)
    {
        super(context);
    }

    protected transient LoyaltyProfileResponse doInBackground(ProfileData aprofiledata[])
    {
        LoyaltyProfileResponse loyaltyprofileresponse = null;
        if (mContext != null)
        {
            if (!canAccessNetwork() || !hasErrors(loyaltyprofileresponse = (new UpdateLoyaltyProfileService(new WeakReference(mContext))).getUpdatedProfileData(aprofiledata[0], true)).booleanValue())
            {
                return loyaltyprofileresponse;
            }
        }
        return null;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((ProfileData[])aobj);
    }

    protected void onPostExecute(LoyaltyProfileResponse loyaltyprofileresponse)
    {
        if (loyaltyprofileresponse != null && loyaltyprofileresponse.isSuccess() && (mContext instanceof IAdapterListener))
        {
            KohlsPhoneApplication.getInstance().getAuthenticationUtils().updateProfile(loyaltyprofileresponse.getProfile().getLoyaltyId(), (IAdapterListener)mContext);
        }
        ListenerManager.getInstance().broadcastListener("updateloyaltydata", loyaltyprofileresponse);
        super.onPostExecute(loyaltyprofileresponse);
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((LoyaltyProfileResponse)obj);
    }
}
