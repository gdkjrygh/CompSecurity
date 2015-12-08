// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.api;

import twitter4j.TwitterException;

public interface LegalResources
{

    public abstract String getPrivacyPolicy()
        throws TwitterException;

    public abstract String getTermsOfService()
        throws TwitterException;
}
