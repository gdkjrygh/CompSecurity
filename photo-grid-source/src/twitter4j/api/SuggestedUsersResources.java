// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.api;

import twitter4j.ResponseList;

public interface SuggestedUsersResources
{

    public abstract ResponseList getMemberSuggestions(String s);

    public abstract ResponseList getSuggestedUserCategories();

    public abstract ResponseList getUserSuggestions(String s);
}
