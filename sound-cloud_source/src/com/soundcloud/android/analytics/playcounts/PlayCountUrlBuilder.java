// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics.playcounts;

import android.net.Uri;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.api.oauth.OAuth;
import com.soundcloud.android.api.oauth.Token;
import com.soundcloud.android.events.PlaybackSessionEvent;
import com.soundcloud.android.model.Urn;

class PlayCountUrlBuilder
{

    private static final String PUBLIC_API_BASE_URI = "https://api.soundcloud.com";
    private final AccountOperations accountOperations;
    private final OAuth oauth;

    PlayCountUrlBuilder(OAuth oauth1, AccountOperations accountoperations)
    {
        oauth = oauth1;
        accountOperations = accountoperations;
    }

    String buildUrl(PlaybackSessionEvent playbacksessionevent)
    {
        long l = playbacksessionevent.getTrackUrn().getNumericId();
        android.net.Uri.Builder builder = Uri.parse((new StringBuilder("https://api.soundcloud.com")).append(ApiEndpoints.LOG_PLAY.unencodedPath(new Object[] {
            Long.valueOf(l)
        })).toString()).buildUpon().appendQueryParameter("client_id", oauth.getClientId());
        Token token = accountOperations.getSoundCloudToken();
        if (token.valid())
        {
            builder.appendQueryParameter("oauth_token", token.getAccessToken());
        }
        playbacksessionevent = playbacksessionevent.get("policy");
        if (playbacksessionevent != null)
        {
            builder.appendQueryParameter("policy", playbacksessionevent);
        }
        return builder.toString();
    }
}
