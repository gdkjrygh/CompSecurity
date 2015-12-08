// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.api;

import java.util.Map;
import twitter4j.ResponseList;
import twitter4j.TwitterAPIConfiguration;

public interface HelpResources
{

    public abstract TwitterAPIConfiguration getAPIConfiguration();

    public abstract ResponseList getLanguages();

    public abstract String getPrivacyPolicy();

    public abstract Map getRateLimitStatus();

    public transient abstract Map getRateLimitStatus(String as[]);

    public abstract String getTermsOfService();
}
