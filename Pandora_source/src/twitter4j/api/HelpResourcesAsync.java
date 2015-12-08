// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.api;


public interface HelpResourcesAsync
{

    public abstract void getAPIConfiguration();

    public abstract void getLanguages();

    public abstract void getPrivacyPolicy();

    public abstract void getRateLimitStatus();

    public transient abstract void getRateLimitStatus(String as[]);

    public abstract void getTermsOfService();
}
