// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid;

import java.util.ArrayList;

public class SearchResultList extends ArrayList
{

    private static final long serialVersionUID = 0x918029065e0645d9L;
    private int page;
    private int pages;
    private int perPage;
    private int total;

    public SearchResultList()
    {
    }

    public int getPage()
    {
        return page;
    }

    public int getPages()
    {
        return pages;
    }

    public int getPerPage()
    {
        return perPage;
    }

    public int getTotal()
    {
        return total;
    }

    public void setPage(int i)
    {
        page = i;
    }

    public void setPage(String s)
    {
        if (s != null && s.length() != 0)
        {
            setPage(Integer.parseInt(s));
        }
    }

    public void setPages(int i)
    {
        pages = i;
    }

    public void setPages(String s)
    {
        if (s != null && s.length() != 0)
        {
            setPages(Integer.parseInt(s));
        }
    }

    public void setPerPage(int i)
    {
        perPage = i;
    }

    public void setPerPage(String s)
    {
        if (s != null && s.length() != 0)
        {
            setPerPage(Integer.parseInt(s));
        }
    }

    public void setTotal(int i)
    {
        total = i;
    }

    public void setTotal(String s)
    {
        if (s != null && s.length() != 0)
        {
            setTotal(Integer.parseInt(s));
        }
    }
}
