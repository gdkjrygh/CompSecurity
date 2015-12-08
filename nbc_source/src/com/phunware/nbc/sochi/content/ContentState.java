// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.content;


public class ContentState
{
    public static final class CurrentContent extends Enum
    {

        private static final CurrentContent $VALUES[];
        public static final CurrentContent GOLFLIVE;
        public static final CurrentContent NBCSPORTSLIVE;
        public static final CurrentContent TELEMUNDO;

        public static CurrentContent valueOf(String s)
        {
            return (CurrentContent)Enum.valueOf(com/phunware/nbc/sochi/content/ContentState$CurrentContent, s);
        }

        public static CurrentContent[] values()
        {
            return (CurrentContent[])$VALUES.clone();
        }

        static 
        {
            NBCSPORTSLIVE = new CurrentContent("NBCSPORTSLIVE", 0);
            GOLFLIVE = new CurrentContent("GOLFLIVE", 1);
            TELEMUNDO = new CurrentContent("TELEMUNDO", 2);
            $VALUES = (new CurrentContent[] {
                NBCSPORTSLIVE, GOLFLIVE, TELEMUNDO
            });
        }

        private CurrentContent(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class EventState extends Enum
    {

        private static final EventState $VALUES[];
        public static final EventState FER;
        public static final EventState FUTURE;
        public static final EventState HIDDEN;
        public static final EventState LIVE;
        public static final EventState VOD;
        public static final EventState isLive;

        public static EventState valueOf(String s)
        {
            return (EventState)Enum.valueOf(com/phunware/nbc/sochi/content/ContentState$EventState, s);
        }

        public static EventState[] values()
        {
            return (EventState[])$VALUES.clone();
        }

        static 
        {
            VOD = new EventState("VOD", 0);
            LIVE = new EventState("LIVE", 1);
            FUTURE = new EventState("FUTURE", 2);
            HIDDEN = new EventState("HIDDEN", 3);
            isLive = new EventState("isLive", 4);
            FER = new EventState("FER", 5);
            $VALUES = (new EventState[] {
                VOD, LIVE, FUTURE, HIDDEN, isLive, FER
            });
        }

        private EventState(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class Status extends Enum
    {

        private static final Status $VALUES[];
        public static final Status EMBARGOED;
        public static final Status LIVE;
        public static final Status LIVE_EMBARGOED;
        public static final Status NON_SCHEDULED;
        public static final Status REPLAY;
        public static final Status SCHEDULED;
        public static final Status SCHEDULED_EMBARGOED;

        public static Status valueOf(String s)
        {
            return (Status)Enum.valueOf(com/phunware/nbc/sochi/content/ContentState$Status, s);
        }

        public static Status[] values()
        {
            return (Status[])$VALUES.clone();
        }

        static 
        {
            NON_SCHEDULED = new Status("NON_SCHEDULED", 0);
            SCHEDULED = new Status("SCHEDULED", 1);
            SCHEDULED_EMBARGOED = new Status("SCHEDULED_EMBARGOED", 2);
            LIVE = new Status("LIVE", 3);
            LIVE_EMBARGOED = new Status("LIVE_EMBARGOED", 4);
            EMBARGOED = new Status("EMBARGOED", 5);
            REPLAY = new Status("REPLAY", 6);
            $VALUES = (new Status[] {
                NON_SCHEDULED, SCHEDULED, SCHEDULED_EMBARGOED, LIVE, LIVE_EMBARGOED, EMBARGOED, REPLAY
            });
        }

        private Status(String s, int i)
        {
            super(s, i);
        }
    }


    public static final int EV_FAVORITES_SCREEN = 6;
    public static final int EV_REFRESH_SCREEN = 8;
    public static final int EV_SETTINGS_SCREEN = 7;
    public static final int GOLF_FAVORITES_SCREEN = 11;
    public static final int GOLF_REFRESH_SCREEN = 13;
    public static final int GOLF_SETTINGS_SCREEN = 12;
    public static final int GOLF_TOURS_SCREEN = 14;
    public static final int GOLF_TOUR_EURO = 7;
    public static final int GOLF_TOUR_LPGA = 9;
    public static final int GOLF_TOUR_PGA = 6;
    public static final int GOLF_TOUR_USGA = 8;
    public static final int LE_ALERTS_SCREEN = 6;
    public static final int LE_FAVORITES_SCREEN = 7;
    public static final int LE_REFRESH_SCREEN = 9;
    public static final int LE_SETTINGS_SCREEN = 8;
    public static final int LE_SPORTS = 10;
    public static final int NBC_HIGHLIGHTS_SCREEN = 2;
    public static final int NBC_HOME_SCREEN = 1;
    public static final int NBC_REPLAYS_SCREEN = 3;
    public static final int NBC_SCHEDULE_SCREEN = 4;

    public ContentState()
    {
    }

    public static EventState isLive(int i)
    {
        switch (i)
        {
        case 2: // '\002'
        case 4: // '\004'
        default:
            return EventState.HIDDEN;

        case 0: // '\0'
            return EventState.VOD;

        case 1: // '\001'
            return EventState.FUTURE;

        case 3: // '\003'
            return EventState.LIVE;

        case 5: // '\005'
            return EventState.FER;
        }
    }
}
