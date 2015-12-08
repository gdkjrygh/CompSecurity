// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user;

import com.netflix.mediaclient.service.webclient.model.leafs.AccountData;
import com.netflix.mediaclient.service.webclient.model.leafs.UserBoundCookies;
import com.netflix.mediaclient.service.webclient.model.leafs.UserProfile;

public interface UserAgentWebCallback
{

    public abstract void onAccountDataFetched(AccountData accountdata, int i);

    public abstract void onConnectWithFacebook(int i, String s);

    public abstract void onDisconnectWithFacebook(int i, String s);

    public abstract void onDummyWebCallDone(int i);

    public abstract void onPinVerified(boolean flag, int i);

    public abstract void onProfileDataFetched(UserProfile userprofile, int i);

    public abstract void onUserProfileSwitched(UserBoundCookies userboundcookies, int i);
}
