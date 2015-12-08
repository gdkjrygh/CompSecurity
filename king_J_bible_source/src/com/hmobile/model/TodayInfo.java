// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.model;


public class TodayInfo
{

    public int BookCount;
    public String BookName;
    public int ChapterCount;
    public String TodayDate;
    public String TodayVerse;
    public int VerseCount;

    public TodayInfo()
    {
        TodayVerse = "";
        BookName = "";
        BookCount = 0;
        ChapterCount = 0;
        VerseCount = 0;
    }

    public void saveTodayInfo()
    {
    }
}
