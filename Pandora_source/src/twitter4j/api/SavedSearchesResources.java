// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.api;

import twitter4j.ResponseList;
import twitter4j.SavedSearch;
import twitter4j.TwitterException;

public interface SavedSearchesResources
{

    public abstract SavedSearch createSavedSearch(String s)
        throws TwitterException;

    public abstract SavedSearch destroySavedSearch(int i)
        throws TwitterException;

    public abstract ResponseList getSavedSearches()
        throws TwitterException;

    public abstract SavedSearch showSavedSearch(int i)
        throws TwitterException;
}
