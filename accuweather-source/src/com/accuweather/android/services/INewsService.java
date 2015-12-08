// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import com.accuweather.android.models.news.NewsResults;

public interface INewsService
{

    public abstract NewsResults retrieveNews(String s, String s1, boolean flag, String s2)
        throws Exception;
}
