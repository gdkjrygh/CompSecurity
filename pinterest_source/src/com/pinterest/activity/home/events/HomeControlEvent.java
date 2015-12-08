// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home.events;


public class HomeControlEvent
{

    private int _page;

    public HomeControlEvent(int i)
    {
        _page = 1;
        _page = i;
    }

    public int getPage()
    {
        return _page;
    }

    public void setPage(int i)
    {
        _page = i;
    }
}
