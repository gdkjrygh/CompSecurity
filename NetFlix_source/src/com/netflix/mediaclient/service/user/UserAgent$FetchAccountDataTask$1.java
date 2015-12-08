// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.player.subtitles.TextStyle;
import com.netflix.mediaclient.service.webclient.model.leafs.AccountData;
import com.netflix.mediaclient.service.webclient.model.leafs.User;
import com.netflix.mediaclient.service.webclient.model.leafs.UserProfile;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.user:
//            SimpleUserAgentWebCallback, UserAgent, UserAgentStateManager

class  extends SimpleUserAgentWebCallback
{

    final is._cls0 this$1;

    public void onAccountDataFetched(AccountData accountdata, int i)
    {
        if (i == 0)
        {
            UserAgent.access$2802(_fld0, accountdata.getUserProfiles());
            UserAgent.access$2902(_fld0, accountdata.getUser());
            UserAgent.access$3002(_fld0, TextStyle.buildSubtitleSettings(UserAgent.access$2900(_fld0).getSubtitleDefaults()));
            UserProfile userprofile;
            for (Iterator iterator = UserAgent.access$2800(_fld0).iterator(); iterator.hasNext(); Log.d("nf_service_useragent", String.format("fetchAccountData profileName %s profileId %s socialStatus %s", new Object[] {
    userprofile.getFirstName(), userprofile.getProfileId(), Boolean.valueOf(userprofile.isSocialConnected())
})))
            {
                userprofile = (UserProfile)iterator.next();
            }

            if (UserAgent.access$700(_fld0) != null)
            {
                UserAgent.access$700(_fld0).accountDataFetched(accountdata);
            }
            UserAgent.access$3100(_fld0, UserAgent.access$2800(_fld0));
            UserAgent.access$3200(_fld0, UserAgent.access$2900(_fld0));
        } else
        {
            Log.e("nf_service_useragent", (new StringBuilder()).append("fetchAccountData failed (skipping user info update) with statusCode=").append(i).toString());
            if (UserAgent.access$700(_fld0) != null)
            {
                UserAgent.access$700(_fld0).accountDataFetchFailed(i, UserAgent.access$3300(_fld0));
                return;
            }
        }
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
