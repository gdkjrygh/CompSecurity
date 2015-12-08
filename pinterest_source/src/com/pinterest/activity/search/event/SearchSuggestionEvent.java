// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.event;


public class SearchSuggestionEvent
{

    private String _query;
    private SuggestionType _type;

    public SearchSuggestionEvent(String s)
    {
        _query = s;
    }

    public SearchSuggestionEvent(String s, SuggestionType suggestiontype)
    {
        _query = s;
        _type = suggestiontype;
    }

    public String getQuery()
    {
        return _query;
    }

    public SuggestionType getType()
    {
        return _type;
    }

    public void setQuery(String s)
    {
        _query = s;
    }

    public void setType(SuggestionType suggestiontype)
    {
        _type = suggestiontype;
    }
}
