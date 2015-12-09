// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model;

import com.netflix.mediaclient.util.StringUtils;

public class SearchSuggestion
    implements com.netflix.mediaclient.servicemgr.SearchSuggestion
{

    public String title;

    public SearchSuggestion()
    {
    }

    public String getTitle()
    {
        return StringUtils.capitalizeFirstLetter(title);
    }

    public String toString()
    {
        return title;
    }
}
