// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.entity;


public class Lyric
{

    private String Lyric;
    private int LyricTime;

    public Lyric()
    {
    }

    public String getLyric()
    {
        return Lyric;
    }

    public int getLyricTime()
    {
        return LyricTime;
    }

    public void setLyric(String s)
    {
        Lyric = s;
    }

    public void setLyricTime(int i)
    {
        LyricTime = i;
    }
}
