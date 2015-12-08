// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.api;

import twitter4j.Paging;
import twitter4j.ResponseList;
import twitter4j.Status;

public interface FavoritesResources
{

    public abstract Status createFavorite(long l);

    public abstract Status destroyFavorite(long l);

    public abstract ResponseList getFavorites();

    public abstract ResponseList getFavorites(long l);

    public abstract ResponseList getFavorites(long l, Paging paging);

    public abstract ResponseList getFavorites(String s);

    public abstract ResponseList getFavorites(String s, Paging paging);

    public abstract ResponseList getFavorites(Paging paging);
}
