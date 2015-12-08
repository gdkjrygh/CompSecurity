// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.eventshub.model;


public final class SourceType extends Enum
{

    public static final SourceType a;
    public static final SourceType b;
    private static final SourceType c[];
    final String mSourceName;

    private SourceType(String s, int i, String s1)
    {
        super(s, i);
        mSourceName = s1;
    }

    public static SourceType valueOf(String s)
    {
        return (SourceType)Enum.valueOf(com/spotify/mobile/android/spotlets/eventshub/model/SourceType, s);
    }

    public static SourceType[] values()
    {
        return (SourceType[])c.clone();
    }

    static 
    {
        a = new SourceType("POPULAR", 0, "popular");
        b = new SourceType("RECOMMENDATIONS", 1, "recommendation");
        c = (new SourceType[] {
            a, b
        });
    }
}
