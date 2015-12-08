// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user;


// Referenced classes of package com.netflix.mediaclient.service.user:
//            UserAgentWebCallback

public interface UserWebClient
{

    public abstract void connectWithFacebook(String s, UserAgentWebCallback useragentwebcallback);

    public abstract void disconnectFromFacebook(UserAgentWebCallback useragentwebcallback);

    public abstract void doDummyWebCall(UserAgentWebCallback useragentwebcallback);

    public abstract void fetchAccountData(UserAgentWebCallback useragentwebcallback);

    public abstract void fetchProfileData(String s, UserAgentWebCallback useragentwebcallback);

    public abstract boolean isSynchronous();

    public abstract void switchWebUserProfile(String s, UserAgentWebCallback useragentwebcallback);

    public abstract void verifyPin(String s, UserAgentWebCallback useragentwebcallback);
}
