// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.api;

import java.io.File;
import java.io.InputStream;
import twitter4j.AccountSettings;
import twitter4j.AccountTotals;
import twitter4j.RateLimitStatus;
import twitter4j.TwitterException;
import twitter4j.User;

public interface AccountMethods
{

    public abstract AccountSettings getAccountSettings()
        throws TwitterException;

    public abstract AccountTotals getAccountTotals()
        throws TwitterException;

    public abstract RateLimitStatus getRateLimitStatus()
        throws TwitterException;

    public abstract AccountSettings updateAccountSettings(Integer integer, Boolean boolean1, String s, String s1, String s2, String s3)
        throws TwitterException;

    public abstract User updateProfile(String s, String s1, String s2, String s3)
        throws TwitterException;

    public abstract User updateProfileBackgroundImage(File file, boolean flag)
        throws TwitterException;

    public abstract User updateProfileBackgroundImage(InputStream inputstream, boolean flag)
        throws TwitterException;

    public abstract User updateProfileColors(String s, String s1, String s2, String s3, String s4)
        throws TwitterException;

    public abstract User updateProfileImage(File file)
        throws TwitterException;

    public abstract User updateProfileImage(InputStream inputstream)
        throws TwitterException;

    public abstract User verifyCredentials()
        throws TwitterException;
}
