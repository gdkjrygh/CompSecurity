// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.content.DialogInterface;
import android.content.Intent;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.wallet.manager.ListenerManager;
import com.kohls.mcommerce.opal.wallet.rest.containers.LoyaltyProfileResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.ProfileData;
import com.kohls.mcommerce.opal.wallet.util.RewardCache;

// Referenced classes of package com.kohls.mcommerce.opal.loyalty:
//            SharePointsCompleteActivity, SharePointsActivity

class val.isMutipleerror
    implements android.content.ner
{

    final SharePointsCompleteActivity this$0;
    final boolean val$isMutipleerror;

    public void onDismiss(DialogInterface dialoginterface)
    {
        finish();
        if (val$isMutipleerror)
        {
            ListenerManager.getInstance().setDataAvailable(true);
            dialoginterface = RewardCache.get(KohlsPhoneApplication.getInstance());
            if (dialoginterface != null && dialoginterface.getProfile() != null)
            {
                dialoginterface = dialoginterface.getProfile().getPointBalance();
                Intent intent = new Intent(getApplicationContext(), com/kohls/mcommerce/opal/loyalty/SharePointsActivity);
                intent.putExtra("point_balance", dialoginterface);
                intent.putExtra("myrewards", true);
                startActivity(intent);
            }
        }
    }

    esponse()
    {
        this$0 = final_sharepointscompleteactivity;
        val$isMutipleerror = Z.this;
        super();
    }
}
