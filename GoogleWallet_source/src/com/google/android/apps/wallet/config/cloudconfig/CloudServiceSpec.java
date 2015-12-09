// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.config.cloudconfig;


public final class CloudServiceSpec
{

    private final String oauthScope;
    private final String urlPrefix;

    public CloudServiceSpec(String s, String s1)
    {
        oauthScope = s;
        urlPrefix = s1;
    }

    public final String getOauthScope()
    {
        return oauthScope;
    }

    public final String getUrlPrefix()
    {
        return urlPrefix;
    }
}
