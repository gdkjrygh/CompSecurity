// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.book;


final class SearchBookContentsResult
{

    private static String query = null;
    private final String pageId;
    private final String pageNumber;
    private final String snippet;
    private final boolean validSnippet;

    SearchBookContentsResult(String s, String s1, String s2, boolean flag)
    {
        pageId = s;
        pageNumber = s1;
        snippet = s2;
        validSnippet = flag;
    }

    public static String getQuery()
    {
        return query;
    }

    public static void setQuery(String s)
    {
        query = s;
    }

    public String getPageId()
    {
        return pageId;
    }

    public String getPageNumber()
    {
        return pageNumber;
    }

    public String getSnippet()
    {
        return snippet;
    }

    public boolean getValidSnippet()
    {
        return validSnippet;
    }

}
