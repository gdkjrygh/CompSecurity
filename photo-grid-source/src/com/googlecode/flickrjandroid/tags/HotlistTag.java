// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.tags;


public class HotlistTag
{

    private static final long serialVersionUID = 12L;
    private int score;
    private String value;

    public HotlistTag()
    {
        score = 0;
    }

    public int getScore()
    {
        return score;
    }

    public String getValue()
    {
        return value;
    }

    public void setScore(int i)
    {
        score = i;
    }

    public void setScore(String s)
    {
        setScore(Integer.parseInt(s));
    }

    public void setValue(String s)
    {
        value = s;
    }

    public String toString()
    {
        return (new StringBuilder("HotlistTag [value=")).append(value).append(", score=").append(score).append("]").toString();
    }
}
