// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.content.res.Resources;
import android.os.AsyncTask;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.analytics.utils.enums.ScreenNames;
import com.kohls.mcommerce.opal.common.util.Logger;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.helper.analytics.AnalyticsHelper;
import com.kohls.mcommerce.opal.wallet.rest.RewardService;
import com.kohls.mcommerce.opal.wallet.rest.containers.ReferFriendResponse;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            Yes2YouInviteFriendActivity

private class <init> extends AsyncTask
{

    final Yes2YouInviteFriendActivity this$0;

    protected transient ReferFriendResponse doInBackground(String as[])
    {
        Logger.debug("Yes2YouInviteFriendsActivity", "doInBackGround() START");
        Object obj = null;
        if (as != null && as.length > 0)
        {
            as = (new RewardService(new WeakReference(Yes2YouInviteFriendActivity.this))).postReferFriend(as[0]);
        } else
        {
            Logger.debug("Yes2YouInviteFriendsActivity", "Input is NULL, DEBUG it.");
            as = obj;
        }
        Logger.debug("Yes2YouInviteFriendsActivity", "doInBackGround() END");
        return as;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    public boolean hasError(ReferFriendResponse referfriendresponse)
    {
        boolean flag = false;
        if (referfriendresponse == null)
        {
            Yes2YouInviteFriendActivity.access$800(Yes2YouInviteFriendActivity.this).setText(0x7f080135);
            flag = true;
        } else
        {
            List list = referfriendresponse.getErrors();
            String s = referfriendresponse.getSuccess();
            if (list == null || s == null)
            {
                Yes2YouInviteFriendActivity.access$800(Yes2YouInviteFriendActivity.this).setText(0x7f080135);
                Yes2YouInviteFriendActivity.access$602(Yes2YouInviteFriendActivity.this, referfriendresponse.getErrorType()._mth0());
                return true;
            }
            if (list.size() != 0 && !s.equalsIgnoreCase("true"))
            {
                Yes2YouInviteFriendActivity.access$800(Yes2YouInviteFriendActivity.this).setText(0x7f080135);
                Yes2YouInviteFriendActivity.access$602(Yes2YouInviteFriendActivity.this, ((com.kohls.mcommerce.opal.wallet.rest.responses.k.this._cls0)list.get(0))._mth0());
                return true;
            }
            referfriendresponse = ((com.kohls.mcommerce.opal.wallet.rest.containers..this._cls0)referfriendresponse.getReferres().get(0)).();
            if (referfriendresponse != null)
            {
                if (referfriendresponse.ssage() != null && !referfriendresponse.ssage().isEmpty())
                {
                    Yes2YouInviteFriendActivity.access$400(Yes2YouInviteFriendActivity.this).setBackground(getResources().getDrawable(0x7f020005));
                    Yes2YouInviteFriendActivity.access$800(Yes2YouInviteFriendActivity.this).setText(referfriendresponse.ssage());
                } else
                {
                    Yes2YouInviteFriendActivity.access$800(Yes2YouInviteFriendActivity.this).setText(0x7f080135);
                }
                Yes2YouInviteFriendActivity.access$602(Yes2YouInviteFriendActivity.this, referfriendresponse.de());
                return true;
            }
        }
        return flag;
    }

    protected void onPostExecute(ReferFriendResponse referfriendresponse)
    {
        super.onPostExecute(referfriendresponse);
        Logger.debug("Yes2YouInviteFriendsActivity", "onPostExecute() START");
        if (hasError(referfriendresponse))
        {
            Yes2YouInviteFriendActivity.access$500(Yes2YouInviteFriendActivity.this);
            referfriendresponse = new HashMap();
            referfriendresponse.put("error.code", Yes2YouInviteFriendActivity.access$600(Yes2YouInviteFriendActivity.this));
            AnalyticsHelper.sendAnalyticsForRewards(ScreenNames.REWARDS_LANDING_PAGE, referfriendresponse);
        } else
        {
            Yes2YouInviteFriendActivity.access$700(Yes2YouInviteFriendActivity.this);
            referfriendresponse = new HashMap();
            referfriendresponse.put("actions.loyaltyinvite", "1");
            AnalyticsHelper.sendAnalyticsForRewards(ScreenNames.REWARDS_INVITE_FRIEND_SUCCESS, referfriendresponse);
        }
        Yes2YouInviteFriendActivity.access$400(Yes2YouInviteFriendActivity.this).setEnabled(true);
        findViewById(0x7f0d012c).setEnabled(true);
        UtilityMethods.dismissDialog(4002);
        Logger.debug("Yes2YouInviteFriendsActivity", "onPostExecute() END");
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((ReferFriendResponse)obj);
    }

    protected void onPreExecute()
    {
        super.onPreExecute();
        UtilityMethods.showKohlsProgressDialog(4002, null, "Sending Invite", null, true, false, false, 0, Yes2YouInviteFriendActivity.this);
        findViewById(0x7f0d012c).setEnabled(false);
        Yes2YouInviteFriendActivity.access$400(Yes2YouInviteFriendActivity.this).setEnabled(false);
    }

    private a()
    {
        this$0 = Yes2YouInviteFriendActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
