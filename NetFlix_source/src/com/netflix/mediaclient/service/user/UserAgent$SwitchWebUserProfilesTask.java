// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.webclient.model.leafs.UserBoundCookies;

// Referenced classes of package com.netflix.mediaclient.service.user:
//            UserAgent, UserWebClient, UserAgentWebCallback, SimpleUserAgentWebCallback, 
//            UserAgentStateManager

private class profileId
    implements Runnable
{

    String profileId;
    final UserAgent this$0;
    private final UserAgentWebCallback webClientCallback = new SimpleUserAgentWebCallback() {

        final UserAgent.SwitchWebUserProfilesTask this$1;

        public void onUserProfileSwitched(UserBoundCookies userboundcookies, int i)
        {
            if (i == 0)
            {
                Log.d("nf_service_useragent", String.format("switchWebUserProfile  netflixId %s secureNetflixId %s", new Object[] {
                    userboundcookies.getUserBoundNetflixId(), userboundcookies.getUserBoundSecureNetflixId()
                }));
                if (UserAgent.access$700(this$0) != null)
                {
                    UserAgent.access$700(this$0).profileSwitched(userboundcookies);
                }
            } else
            {
                Log.e("nf_service_useragent", (new StringBuilder()).append("switchWebUserProfile failed  with statusCode=").append(i).toString());
                if (UserAgent.access$700(this$0) != null)
                {
                    UserAgent.access$700(this$0).profileSwitchedFailed(i);
                    return;
                }
            }
        }

            
            {
                this$1 = UserAgent.SwitchWebUserProfilesTask.this;
                super();
            }
    };

    public void run()
    {
        UserAgent.access$2700(UserAgent.this).switchWebUserProfile(profileId, webClientCallback);
    }

    public _cls1.this._cls1(String s)
    {
        this$0 = UserAgent.this;
        super();
        profileId = s;
    }
}
