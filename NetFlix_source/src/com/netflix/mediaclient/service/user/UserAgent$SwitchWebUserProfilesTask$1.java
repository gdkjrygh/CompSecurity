// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.webclient.model.leafs.UserBoundCookies;

// Referenced classes of package com.netflix.mediaclient.service.user:
//            SimpleUserAgentWebCallback, UserAgent, UserAgentStateManager

class this._cls1 extends SimpleUserAgentWebCallback
{

    final ailed this$1;

    public void onUserProfileSwitched(UserBoundCookies userboundcookies, int i)
    {
        if (i == 0)
        {
            Log.d("nf_service_useragent", String.format("switchWebUserProfile  netflixId %s secureNetflixId %s", new Object[] {
                userboundcookies.getUserBoundNetflixId(), userboundcookies.getUserBoundSecureNetflixId()
            }));
            if (UserAgent.access$700(_fld0) != null)
            {
                UserAgent.access$700(_fld0).profileSwitched(userboundcookies);
            }
        } else
        {
            Log.e("nf_service_useragent", (new StringBuilder()).append("switchWebUserProfile failed  with statusCode=").append(i).toString());
            if (UserAgent.access$700(_fld0) != null)
            {
                UserAgent.access$700(_fld0).profileSwitchedFailed(i);
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
