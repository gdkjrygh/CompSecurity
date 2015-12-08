// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.base;

import com.pinterest.schemas.event.EventAppState;

public final class _contextEnum extends Enum
{

    private static final BACKGROUND_OFFLINE $VALUES[];
    public static final BACKGROUND_OFFLINE BACKGROUND;
    public static final BACKGROUND_OFFLINE BACKGROUND_OFFLINE;
    public static final BACKGROUND_OFFLINE FOREGROUND;
    public static final BACKGROUND_OFFLINE FOREGROUND_OFFLINE;
    private final String _apiHeader;
    private final EventAppState _contextEnum;

    public static _contextEnum valueOf(String s)
    {
        return (_contextEnum)Enum.valueOf(com/pinterest/base/ApplicationInfo$State, s);
    }

    public static _contextEnum[] values()
    {
        return (_contextEnum[])$VALUES.clone();
    }

    public final String getApiHeader()
    {
        return _apiHeader;
    }

    public final EventAppState getContextEnum()
    {
        return _contextEnum;
    }

    static 
    {
        FOREGROUND = new <init>("FOREGROUND", 0, "active", EventAppState.ACTIVE);
        BACKGROUND = new <init>("BACKGROUND", 1, "background", EventAppState.BACKGROUND);
        FOREGROUND_OFFLINE = new <init>("FOREGROUND_OFFLINE", 2, "active_offline", EventAppState.ACTIVE_OFFLINE);
        BACKGROUND_OFFLINE = new <init>("BACKGROUND_OFFLINE", 3, "background_offline", EventAppState.BACKGROUND_OFFLINE);
        $VALUES = (new .VALUES[] {
            FOREGROUND, BACKGROUND, FOREGROUND_OFFLINE, BACKGROUND_OFFLINE
        });
    }

    private (String s, int i, String s1, EventAppState eventappstate)
    {
        super(s, i);
        _apiHeader = s1;
        _contextEnum = eventappstate;
    }
}
