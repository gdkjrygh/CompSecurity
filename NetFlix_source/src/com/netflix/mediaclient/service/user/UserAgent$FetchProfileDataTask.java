// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.player.subtitles.TextStyle;
import com.netflix.mediaclient.service.webclient.model.leafs.UserProfile;
import com.netflix.mediaclient.util.StringUtils;

// Referenced classes of package com.netflix.mediaclient.service.user:
//            UserAgent, UserWebClient, UserAgentWebCallback, SimpleUserAgentWebCallback

private class profileId
    implements Runnable
{

    String profileId;
    final UserAgent this$0;
    private final UserAgentWebCallback webClientCallback = new SimpleUserAgentWebCallback() {

        final UserAgent.FetchProfileDataTask this$1;

        public void onProfileDataFetched(UserProfile userprofile, int i)
        {
            if (i == 0 && UserAgent.access$3400(this$0, userprofile))
            {
                if (!StringUtils.safeEquals(UserAgent.access$3500(this$0).toString(), userprofile.toString()))
                {
                    UserAgent.access$3600(this$0, userprofile);
                    if (!StringUtils.safeEquals(UserAgent.access$3500(this$0).getLanguagesInCsv(), userprofile.getLanguagesInCsv()))
                    {
                        Log.d("nf_service_useragent", "onProfileDataFetched language changed, update ");
                        UserAgent.access$3700(this$0, userprofile.getLanguages());
                    }
                    UserAgent.access$3802(this$0, TextStyle.buildSubtitleSettings(userprofile.getSubtitlePreference()));
                    UserAgent.access$3502(this$0, userprofile);
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

            
            {
                this$1 = UserAgent.FetchProfileDataTask.this;
                super();
            }
    };

    public void run()
    {
        UserAgent.access$2700(UserAgent.this).fetchProfileData(profileId, webClientCallback);
    }

    public t>(String s, UserAgentWebCallback useragentwebcallback)
    {
        this$0 = UserAgent.this;
        super();
        profileId = s;
    }
}
