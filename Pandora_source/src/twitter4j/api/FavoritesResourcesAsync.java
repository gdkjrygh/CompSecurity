// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.api;

import twitter4j.Paging;

public interface FavoritesResourcesAsync
{

    public abstract void createFavorite(long l);

    public abstract void destroyFavorite(long l);

    public abstract void getFavorites();

    public abstract void getFavorites(long l);

    public abstract void getFavorites(long l, Paging paging);

    public abstract void getFavorites(String s);

    public abstract void getFavorites(String s, Paging paging);

    public abstract void getFavorites(Paging paging);
}
