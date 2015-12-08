// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.player.subtitles;


// Referenced classes of package com.netflix.mediaclient.service.player.subtitles:
//            TextStyle

public final class SubtitleTextNode
{

    private int mLineBreaks;
    private TextStyle mStyle;
    private String mText;

    SubtitleTextNode(TextStyle textstyle, String s, int i)
    {
        mStyle = textstyle;
        mText = s;
        mLineBreaks = i;
    }

    public int getLineBreaks()
    {
        return mLineBreaks;
    }

    public TextStyle getStyle()
    {
        return mStyle;
    }

    public String getText()
    {
        return mText;
    }

    public String toString()
    {
        return (new StringBuilder()).append("SubtitleTextNode [mStyle=").append(mStyle).append(", mText=").append(mText).append(", mLineBreaks=").append(mLineBreaks).append("]").toString();
    }
}
