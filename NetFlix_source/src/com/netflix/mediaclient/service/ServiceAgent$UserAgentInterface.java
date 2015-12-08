// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service;

import com.netflix.mediaclient.service.player.subtitles.TextStyle;
import com.netflix.mediaclient.service.user.UserAgentWebCallback;
import com.netflix.mediaclient.service.webclient.UserCredentialRegistry;
import com.netflix.mediaclient.servicemgr.UserProfile;

// Referenced classes of package com.netflix.mediaclient.service:
//            ServiceAgent

public static interface 
{

    public abstract void doDummyWebCall(UserAgentWebCallback useragentwebcallback);

    public abstract UserProfile getCurrentProfile();

    public abstract String getCurrentProfileId();

    public abstract String getGeoCountry();

    public abstract String getLanguagesInCsv();

    public abstract String getReqCountry();

    public abstract TextStyle getSubtitleDefaults();

    public abstract UserCredentialRegistry getUserCredentialRegistry();

    public abstract TextStyle getUserSubtitlePreferences();

    public abstract boolean isCurrentProfileIQEnabled();

    public abstract boolean isProfileSwitchingDisabled();

    public abstract boolean isUserLoggedIn();

    public abstract void logoutUser();

    public abstract void refreshProfileSwitchingStatus();
}
