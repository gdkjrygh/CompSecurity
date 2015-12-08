// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models;


public class MultilineItem
{

    private String subtitle;
    private String title;

    public MultilineItem(String s)
    {
        this(s, "");
    }

    public MultilineItem(String s, String s1)
    {
        title = s;
        subtitle = s1;
    }

    public String getSubtitle()
    {
        return subtitle;
    }

    public String getTitle()
    {
        return title;
    }

    public void setSubTitle(String s)
    {
        subtitle = s;
    }

    public void setTitle(String s)
    {
        title = s;
    }
}
