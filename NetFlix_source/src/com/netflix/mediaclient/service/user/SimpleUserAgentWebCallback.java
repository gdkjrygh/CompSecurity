// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user;

import com.netflix.mediaclient.service.webclient.model.leafs.AccountData;
import com.netflix.mediaclient.service.webclient.model.leafs.UserBoundCookies;
import com.netflix.mediaclient.service.webclient.model.leafs.UserProfile;

// Referenced classes of package com.netflix.mediaclient.service.user:
//            UserAgentWebCallback

public abstract class SimpleUserAgentWebCallback
    implements UserAgentWebCallback
{

    public SimpleUserAgentWebCallback()
    {
    }

    public void onAccountDataFetched(AccountData accountdata, int i)
    {
    }

    public void onConnectWithFacebook(int i, String s)
    {
    }

    public void onDisconnectWithFacebook(int i, String s)
    {
    }

    public void onDummyWebCallDone(int i)
    {
    }

    public void onPinVerified(boolean flag, int i)
    {
    }

    public void onProfileDataFetched(UserProfile userprofile, int i)
    {
    }

    public void onUserProfileSwitched(UserBoundCookies userboundcookies, int i)
    {
    }
}
