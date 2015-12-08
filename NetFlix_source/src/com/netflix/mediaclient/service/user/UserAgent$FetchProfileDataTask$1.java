// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.player.subtitles.TextStyle;
import com.netflix.mediaclient.service.webclient.model.leafs.UserProfile;
import com.netflix.mediaclient.util.StringUtils;

// Referenced classes of package com.netflix.mediaclient.service.user:
//            SimpleUserAgentWebCallback, UserAgent

class  extends SimpleUserAgentWebCallback
{

    final is._cls0 this$1;

    public void onProfileDataFetched(UserProfile userprofile, int i)
    {
        if (i == 0 && UserAgent.access$3400(_fld0, userprofile))
        {
            if (!StringUtils.safeEquals(UserAgent.access$3500(_fld0).toString(), userprofile.toString()))
            {
                UserAgent.access$3600(_fld0, userprofile);
                if (!StringUtils.safeEquals(UserAgent.access$3500(_fld0).getLanguagesInCsv(), userprofile.getLanguagesInCsv()))
                {
                    Log.d("nf_service_useragent", "onProfileDataFetched language changed, update ");
                    UserAgent.access$3700(_fld0, userprofile.getLanguages());
                }
                UserAgent.access$3802(_fld0, TextStyle.buildSubtitleSettings(userprofile.getSubtitlePreference()));
                UserAgent.access$3502(_fld0, userprofile);
                return;
            } else
            {
                Log.d("nf_service_useragent", "onProfileDataFetched nothing changed ignore.. ");
                return;
            }
        } else
        {
            Log.e("nf_service_useragent", (new StringBuilder()).append("Ignore onProfileDataFetched failed (skipping userProfile update) with statusCode=").append(i).toString());
            return;
        }
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
