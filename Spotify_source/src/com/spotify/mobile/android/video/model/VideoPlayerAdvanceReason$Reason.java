// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.video.model;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class mReasonString extends Enum
{

    public static final bleReason a;
    public static final bleReason b;
    private static Map c;
    private static final bleReason d[];
    String mReasonString;

    public static mReasonString valueOf(String s)
    {
        return (mReasonString)Enum.valueOf(com/spotify/mobile/android/video/model/VideoPlayerAdvanceReason$Reason, s);
    }

    public static mReasonString[] values()
    {
        return (mReasonString[])d.clone();
    }

    static 
    {
        a = new <init>("FINISHED", 0, "finished");
        b = new <init>("UNPLAYABLE", 1, "unplayable");
        d = (new d[] {
            a, b
        });
        c = new HashMap();
        bleReason blereason;
        for (Iterator iterator = EnumSet.allOf(com/spotify/mobile/android/video/model/VideoPlayerAdvanceReason$UnplayableReason).iterator(); iterator.hasNext(); c.put(blereason.mReasonString, blereason))
        {
            blereason = (bleReason)iterator.next();
        }

    }

    private bleReason(String s, int i, String s1)
    {
        super(s, i);
        mReasonString = s1;
    }
}
