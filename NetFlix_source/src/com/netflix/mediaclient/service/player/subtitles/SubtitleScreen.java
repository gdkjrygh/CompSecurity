// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.player.subtitles;

import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.player.subtitles:
//            SubtitleParser

public class SubtitleScreen
{

    public static final int DEFAULT_SUBTITLE_SCREEN_UPDATE = 2000;
    private List mDisplayLaterBlocks;
    private List mDisplayNowBlocks;
    private String mId;
    private SubtitleParser mParser;
    private int mUpdateTimeout;

    public SubtitleScreen(SubtitleParser subtitleparser, List list, List list1, int i)
    {
        mId = String.valueOf(System.currentTimeMillis());
        mUpdateTimeout = 2000;
        mId = (new StringBuilder()).append("").append(hashCode()).toString();
        mParser = subtitleparser;
        mDisplayLaterBlocks = list1;
        mDisplayNowBlocks = list;
        mUpdateTimeout = i;
    }

    public List getDisplayLaterBlocks()
    {
        return mDisplayLaterBlocks;
    }

    public List getDisplayNowBlocks()
    {
        return mDisplayNowBlocks;
    }

    public String getId()
    {
        return mId;
    }

    public SubtitleParser getParser()
    {
        return mParser;
    }

    public int getUpdateTimeout()
    {
        return mUpdateTimeout;
    }
}
