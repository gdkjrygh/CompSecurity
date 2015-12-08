// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.asynctask;

import android.content.Context;
import android.text.TextUtils;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.ConfigurationUtils;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.common.util.crypt.CryptUtil;
import com.kohls.mcommerce.opal.helper.preference.PreferenceHelper;
import com.kohls.mcommerce.opal.wallet.manager.ListenerManager;
import com.kohls.mcommerce.opal.wallet.rest.UpdateLoyaltyProfileService;
import com.kohls.mcommerce.opal.wallet.rest.containers.LoyaltyProfileResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.ProfileData;
import java.lang.ref.WeakReference;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.asynctask:
//            BaseAsyncTask

public class UpdateLoyaltyProfileTask extends BaseAsyncTask
{

    private boolean isUpdateProfileRequired;

    public UpdateLoyaltyProfileTask(Context context)
    {
        super(context);
        isUpdateProfileRequired = true;
    }

    public UpdateLoyaltyProfileTask(Context context, boolean flag)
    {
        super(context);
        isUpdateProfileRequired = true;
        isUpdateProfileRequired = flag;
    }

    protected transient LoyaltyProfileResponse doInBackground(ProfileData aprofiledata[])
    {
        Object obj1 = null;
        if (mContext == null)
        {
            return null;
        }
        Object obj = obj1;
        if (canAccessNetwork())
        {
            UpdateLoyaltyProfileService updateloyaltyprofileservice = new UpdateLoyaltyProfileService(new WeakReference(mContext));
            if (aprofiledata != null && aprofiledata.length > 0 && aprofiledata[0] != null && TextUtils.isEmpty(aprofiledata[0].getLoyaltyId()))
            {
                obj = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getLoyaltyIDFromPref();
                aprofiledata[0].setLoyaltyId(((String) (obj)));
            }
            obj = obj1;
            if (!TextUtils.isEmpty(aprofiledata[0].getLoyaltyId()))
            {
                obj = updateloyaltyprofileservice.getUpdatedProfileData(aprofiledata[0], false);
            }
        }
        return ((LoyaltyProfileResponse) (obj));
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((ProfileData[])aobj);
    }

    protected void onPostExecute(LoyaltyProfileResponse loyaltyprofileresponse)
    {
        if (isUpdateProfileRequired && !hasErrors(loyaltyprofileresponse).booleanValue())
        {
            String s = loyaltyprofileresponse.getProfile().getLoyaltyId();
            CryptUtil cryptutil = new CryptUtil(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getKrj());
            if (!TextUtils.isEmpty(s))
            {
                s = cryptutil.doCrypto(s);
                KohlsPhoneApplication.getInstance().getKohlsPref().setLoyaltyID(s);
            }
        }
        ListenerManager.getInstance().broadcastListener("updateloyaltydata", loyaltyprofileresponse);
        super.onPostExecute(loyaltyprofileresponse);
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((LoyaltyProfileResponse)obj);
    }
}
