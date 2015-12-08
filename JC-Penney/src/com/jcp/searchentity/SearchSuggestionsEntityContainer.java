// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.searchentity;

import java.io.Serializable;

public class SearchSuggestionsEntityContainer
    implements Serializable
{

    private String count;
    private String searchTerm;
    private String suggestions[];

    public SearchSuggestionsEntityContainer()
    {
    }

    public String getCount()
    {
        return count;
    }

    public String getSearchTerm()
    {
        return searchTerm;
    }

    public String[] getSuggestions()
    {
        return suggestions;
    }

    public void setCount(String s)
    {
        count = s;
    }

    public void setSearchTerm(String s)
    {
        searchTerm = s;
    }

    public void setSuggestions(String as[])
    {
        suggestions = as;
    }
}
