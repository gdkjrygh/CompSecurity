// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.api;

import twitter4j.ResponseList;
import twitter4j.TwitterAPIConfiguration;
import twitter4j.TwitterException;

public interface HelpMethods
{
    public static interface Language
    {

        public abstract String getCode();

        public abstract String getName();

        public abstract String getStatus();
    }


    public abstract TwitterAPIConfiguration getAPIConfiguration()
        throws TwitterException;

    public abstract ResponseList getLanguages()
        throws TwitterException;

    public abstract boolean test()
        throws TwitterException;
}
