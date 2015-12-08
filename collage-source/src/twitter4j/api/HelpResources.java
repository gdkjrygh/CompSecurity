// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.api;

import java.util.Map;
import twitter4j.ResponseList;
import twitter4j.TwitterAPIConfiguration;
import twitter4j.TwitterException;

public interface HelpResources
{

    public abstract TwitterAPIConfiguration getAPIConfiguration()
        throws TwitterException;

    public abstract ResponseList getLanguages()
        throws TwitterException;

    public abstract String getPrivacyPolicy()
        throws TwitterException;

    public abstract Map getRateLimitStatus()
        throws TwitterException;

    public transient abstract Map getRateLimitStatus(String as[])
        throws TwitterException;

    public abstract String getTermsOfService()
        throws TwitterException;

    // Unreferenced inner class twitter4j/api/HelpResources$Language
    /* block-local class not found */
    class Language {}

}
