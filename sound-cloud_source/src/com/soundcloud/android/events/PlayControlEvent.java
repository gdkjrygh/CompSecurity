// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;


// Referenced classes of package com.soundcloud.android.events:
//            TrackingEvent

public final class PlayControlEvent extends TrackingEvent
{

    private static final String ACTION_CLOSE = "close";
    private static final String ACTION_PAUSE = "pause";
    private static final String ACTION_PLAY = "play";
    private static final String ACTION_PREV = "prev";
    private static final String ACTION_SCRUB = "scrub";
    private static final String ACTION_SKIP = "skip";
    private static final String ATTRIBUTE_ACTION = "action";
    private static final String ATTRIBUTE_LOCATION = "location";
    private static final String ATTRIBUTE_TAP_OR_SWIPE = "tap or swipe";
    public static final String EXTRA_EVENT_SOURCE = "play_event_source";
    private static final String SKIP_TYPE_SWIPE = "swipe";
    private static final String SKIP_TYPE_TAP = "tap";
    public static final String SOURCE_FOOTER_PLAYER = "footer_player";
    public static final String SOURCE_FULL_PLAYER = "full_player";
    public static final String SOURCE_NOTIFICATION = "notification";
    public static final String SOURCE_REMOTE = "lockscreen";
    public static final String SOURCE_WIDGET = "widget";

    protected PlayControlEvent()
    {
        super("default", -1L);
    }

    public static PlayControlEvent close(String s)
    {
        return (PlayControlEvent)(new PlayControlEvent()).put("action", "close").put("tap or swipe", "tap").put("location", s);
    }

    private static String getSourcePlayerFrom(boolean flag)
    {
        if (flag)
        {
            return "full_player";
        } else
        {
            return "footer_player";
        }
    }

    public static PlayControlEvent pause(String s)
    {
        return toggle(s, true);
    }

    public static PlayControlEvent play(String s)
    {
        return toggle(s, false);
    }

    public static PlayControlEvent previous(String s)
    {
        return tap(s, false);
    }

    public static PlayControlEvent scrub(String s)
    {
        return (PlayControlEvent)(new PlayControlEvent()).put("action", "scrub").put("location", s);
    }

    public static PlayControlEvent skip(String s)
    {
        return tap(s, true);
    }

    public static PlayControlEvent skipAd()
    {
        return (PlayControlEvent)(new PlayControlEvent()).put("action", "skip_ad_button").put("tap or swipe", "tap").put("location", "full_player");
    }

    private static PlayControlEvent swipe(boolean flag, boolean flag1)
    {
        PlayControlEvent playcontrolevent = new PlayControlEvent();
        String s;
        if (flag1)
        {
            s = "skip";
        } else
        {
            s = "prev";
        }
        return (PlayControlEvent)playcontrolevent.put("action", s).put("tap or swipe", "swipe").put("location", getSourcePlayerFrom(flag));
    }

    public static PlayControlEvent swipePrevious(boolean flag)
    {
        return swipe(flag, false);
    }

    public static PlayControlEvent swipeSkip(boolean flag)
    {
        return swipe(flag, true);
    }

    private static PlayControlEvent tap(String s, boolean flag)
    {
        PlayControlEvent playcontrolevent = new PlayControlEvent();
        String s1;
        if (flag)
        {
            s1 = "skip";
        } else
        {
            s1 = "prev";
        }
        return (PlayControlEvent)playcontrolevent.put("action", s1).put("tap or swipe", "tap").put("location", s);
    }

    public static PlayControlEvent toggle(String s, boolean flag)
    {
        PlayControlEvent playcontrolevent = new PlayControlEvent();
        String s1;
        if (flag)
        {
            s1 = "pause";
        } else
        {
            s1 = "play";
        }
        return (PlayControlEvent)playcontrolevent.put("action", s1).put("tap or swipe", "tap").put("location", s);
    }

    public final String toString()
    {
        return String.format("PlayControlEvent with attributes %s", new Object[] {
            attributes.toString()
        });
    }
}
