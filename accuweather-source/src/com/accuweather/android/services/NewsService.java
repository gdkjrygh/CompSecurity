// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import com.accuweather.android.models.news.NewsResults;
import com.accuweather.android.parsers.NewsParser;

// Referenced classes of package com.accuweather.android.services:
//            BaseDataRetrievalService, INewsService

public class NewsService extends BaseDataRetrievalService
    implements INewsService
{

    private static final String JSON_NEWS_FEED_URL = "http://syndicate.accuweather.com/v2/news.json?fullstory=true";
    private NewsParser newsParser;

    public NewsService()
    {
        newsParser = new NewsParser();
    }

    public NewsResults retrieveNews(String s, String s1, boolean flag, String s2)
        throws Exception
    {
        return (NewsResults)parse("http://syndicate.accuweather.com/v2/news.json?fullstory=true", newsParser);
    }
}
