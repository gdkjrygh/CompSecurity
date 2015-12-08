// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.eventshub.model;


public final class EventSection extends Enum
{

    public static final EventSection a;
    public static final EventSection b;
    private static final EventSection c[];
    public int mSectionId;
    public int mTitleStringId;

    private EventSection(String s, int i, int j, int k)
    {
        super(s, i);
        mSectionId = j;
        mTitleStringId = k;
    }

    public static EventSection valueOf(String s)
    {
        return (EventSection)Enum.valueOf(com/spotify/mobile/android/spotlets/eventshub/model/EventSection, s);
    }

    public static EventSection[] values()
    {
        return (EventSection[])c.clone();
    }

    static 
    {
        a = new EventSection("RECOMMENDATIONS", 0, 0, 0x7f0802bf);
        b = new EventSection("POPULAR", 1, 1, 0x7f0802be);
        c = (new EventSection[] {
            a, b
        });
    }
}
