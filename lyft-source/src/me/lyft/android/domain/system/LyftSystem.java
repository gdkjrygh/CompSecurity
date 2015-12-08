// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.system;

import me.lyft.android.common.Objects;

public class LyftSystem
{

    String region;
    String shortMessage;

    public LyftSystem(String s, String s1)
    {
        region = s;
        shortMessage = s1;
    }

    public static LyftSystem empty()
    {
        return new LyftSystem("", "");
    }

    public String getRegion()
    {
        return (String)Objects.firstNonNull(region, "");
    }

    public String getShortMessage()
    {
        return (String)Objects.firstNonNull(shortMessage, "");
    }
}
