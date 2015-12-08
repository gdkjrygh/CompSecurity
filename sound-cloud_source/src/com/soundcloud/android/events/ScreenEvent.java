// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import com.soundcloud.android.explore.ExploreGenre;
import com.soundcloud.android.main.Screen;

// Referenced classes of package com.soundcloud.android.events:
//            TrackingEvent

public final class ScreenEvent extends TrackingEvent
{

    public static final String KEY_GENRE = "genre";
    public static final String KEY_SCREEN = "screen";

    private ScreenEvent(String s)
    {
        super("default", System.currentTimeMillis());
        put("screen", s);
    }

    public static ScreenEvent create(Screen screen)
    {
        return new ScreenEvent(screen.get());
    }

    public static ScreenEvent create(String s)
    {
        return new ScreenEvent(s);
    }

    public static ScreenEvent create(String s, ExploreGenre exploregenre)
    {
        return (ScreenEvent)(new ScreenEvent(s)).put("genre", exploregenre.getTitle());
    }

    public final String getScreenTag()
    {
        return get("screen");
    }

    public final String toString()
    {
        return (new StringBuilder("user entered ")).append(getScreenTag()).toString();
    }
}
