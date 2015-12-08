// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.api;

import twitter4j.ResponseList;
import twitter4j.SavedSearch;

public interface SavedSearchesResources
{

    public abstract SavedSearch createSavedSearch(String s);

    public abstract SavedSearch destroySavedSearch(int i);

    public abstract ResponseList getSavedSearches();

    public abstract SavedSearch showSavedSearch(int i);
}
