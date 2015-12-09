// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.api;

import twitter4j.Paging;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.TwitterException;

public interface FavoritesResources
{

    public abstract Status createFavorite(long l)
        throws TwitterException;

    public abstract Status destroyFavorite(long l)
        throws TwitterException;

    public abstract ResponseList getFavorites()
        throws TwitterException;

    public abstract ResponseList getFavorites(long l)
        throws TwitterException;

    public abstract ResponseList getFavorites(long l, Paging paging)
        throws TwitterException;

    public abstract ResponseList getFavorites(String s)
        throws TwitterException;

    public abstract ResponseList getFavorites(String s, Paging paging)
        throws TwitterException;

    public abstract ResponseList getFavorites(Paging paging)
        throws TwitterException;
}
