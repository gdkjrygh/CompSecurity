// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v1;

import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

public class PlayerState
    implements JacksonModel
{

    public final Action action;
    public String contextUri;
    public double durationInMs;
    public Integer index;
    public boolean loading;
    public String nextPageUrl;
    public PlayOptions options;
    public PlayOrigin origin;
    public boolean playing;
    public double positionInMs;
    public String trackUri;
    public List tracks;

    public PlayerState()
    {
        this(Action.UNKNOWN);
    }

    public PlayerState(Action action1)
    {
        action = action1;
    }

    // Unreferenced inner class com/spotify/mobile/android/cosmos/player/v1/PlayerState$1

/* anonymous class */
    class _cls1
    {

        static final int $SwitchMap$com$spotify$mobile$android$cosmos$player$v1$PlayerState$Action[];

        static 
        {
            $SwitchMap$com$spotify$mobile$android$cosmos$player$v1$PlayerState$Action = new int[Action.values().length];
            try
            {
                $SwitchMap$com$spotify$mobile$android$cosmos$player$v1$PlayerState$Action[Action.PLAY.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$spotify$mobile$android$cosmos$player$v1$PlayerState$Action[Action.RESUME.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$spotify$mobile$android$cosmos$player$v1$PlayerState$Action[Action.PAUSE.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$spotify$mobile$android$cosmos$player$v1$PlayerState$Action[Action.SKIP_PREV.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$spotify$mobile$android$cosmos$player$v1$PlayerState$Action[Action.SKIP_NEXT.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$spotify$mobile$android$cosmos$player$v1$PlayerState$Action[Action.UPDATE.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class Action extends Enum
    {

        private static final Action $VALUES[];
        public static final Action PAUSE;
        public static final Action PLAY;
        public static final Action RESUME;
        public static final Action SKIP_NEXT;
        public static final Action SKIP_PREV;
        public static final Action UNKNOWN;
        public static final Action UPDATE;

        public static Action fromJson(String s)
        {
            return valueOf(s.toUpperCase(Locale.US));
        }

        public static Action valueOf(String s)
        {
            return (Action)Enum.valueOf(com/spotify/mobile/android/cosmos/player/v1/PlayerState$Action, s);
        }

        public static Action[] values()
        {
            return (Action[])$VALUES.clone();
        }

        public final String toJson()
        {
            return name().toLowerCase(Locale.US);
        }

        public final String toString()
        {
    class _cls1
    {

        static final int $SwitchMap$com$spotify$mobile$android$cosmos$player$v1$PlayerState$Action[];

        static 
        {
            $SwitchMap$com$spotify$mobile$android$cosmos$player$v1$PlayerState$Action = new int[Action.values().length];
            try
            {
                $SwitchMap$com$spotify$mobile$android$cosmos$player$v1$PlayerState$Action[Action.PLAY.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$spotify$mobile$android$cosmos$player$v1$PlayerState$Action[Action.RESUME.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$spotify$mobile$android$cosmos$player$v1$PlayerState$Action[Action.PAUSE.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$spotify$mobile$android$cosmos$player$v1$PlayerState$Action[Action.SKIP_PREV.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$spotify$mobile$android$cosmos$player$v1$PlayerState$Action[Action.SKIP_NEXT.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$spotify$mobile$android$cosmos$player$v1$PlayerState$Action[Action.UPDATE.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

            switch (_cls1..SwitchMap.com.spotify.mobile.android.cosmos.player.v1.PlayerState.Action[ordinal()])
            {
            default:
                return name();

            case 1: // '\001'
                return "play";

            case 2: // '\002'
                return "resume";

            case 3: // '\003'
                return "pause";

            case 4: // '\004'
                return "skip_prev";

            case 5: // '\005'
                return "skip_next";

            case 6: // '\006'
                return "update";
            }
        }

        static 
        {
            UNKNOWN = new Action("UNKNOWN", 0);
            PLAY = new Action("PLAY", 1);
            RESUME = new Action("RESUME", 2);
            PAUSE = new Action("PAUSE", 3);
            SKIP_PREV = new Action("SKIP_PREV", 4);
            SKIP_NEXT = new Action("SKIP_NEXT", 5);
            UPDATE = new Action("UPDATE", 6);
            $VALUES = (new Action[] {
                UNKNOWN, PLAY, RESUME, PAUSE, SKIP_PREV, SKIP_NEXT, UPDATE
            });
        }

        private Action(String s, int i)
        {
            super(s, i);
        }
    }

}
