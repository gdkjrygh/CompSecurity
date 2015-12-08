// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;


public final class ScreenElement extends Enum
{

    private static final ScreenElement $VALUES[];
    public static final ScreenElement LIST;
    public static final ScreenElement PLAYER;
    private final String trackingTag;

    private ScreenElement(String s, int i, String s1)
    {
        super(s, i);
        trackingTag = s1;
    }

    public static ScreenElement valueOf(String s)
    {
        return (ScreenElement)Enum.valueOf(com/soundcloud/android/analytics/ScreenElement, s);
    }

    public static ScreenElement[] values()
    {
        return (ScreenElement[])$VALUES.clone();
    }

    public final String get()
    {
        return trackingTag;
    }

    static 
    {
        PLAYER = new ScreenElement("PLAYER", 0, "player");
        LIST = new ScreenElement("LIST", 1, "list");
        $VALUES = (new ScreenElement[] {
            PLAYER, LIST
        });
    }
}
