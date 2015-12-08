// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat2;

import com.snapchat.android.model.chat.ChatConversation;
import java.util.ArrayList;
import java.util.Iterator;

public final class PresenceBarStateController
{
    public static final class PresenceBarState extends Enum
    {

        private static final PresenceBarState $VALUES[];
        public static final PresenceBarState LISTENING;
        public static final PresenceBarState NOTHING;
        public static final PresenceBarState PRESENT;
        public static final PresenceBarState RINGING;
        public static final PresenceBarState SOMETHING;
        public static final PresenceBarState TALKING;
        public static final PresenceBarState VIDEO;

        public static PresenceBarState valueOf(String s)
        {
            return (PresenceBarState)Enum.valueOf(com/snapchat/android/fragments/chat2/PresenceBarStateController$PresenceBarState, s);
        }

        public static PresenceBarState[] values()
        {
            return (PresenceBarState[])$VALUES.clone();
        }

        static 
        {
            NOTHING = new PresenceBarState("NOTHING", 0);
            PRESENT = new PresenceBarState("PRESENT", 1);
            SOMETHING = new PresenceBarState("SOMETHING", 2);
            RINGING = new PresenceBarState("RINGING", 3);
            LISTENING = new PresenceBarState("LISTENING", 4);
            TALKING = new PresenceBarState("TALKING", 5);
            VIDEO = new PresenceBarState("VIDEO", 6);
            $VALUES = (new PresenceBarState[] {
                NOTHING, PRESENT, SOMETHING, RINGING, LISTENING, TALKING, VIDEO
            });
        }

        private PresenceBarState(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface a
    {

        public abstract void a(PresenceBarState presencebarstate);

        public abstract void a(ChatConversation chatconversation);

        public abstract void setSinkId(String s);
    }

    public static interface b
    {

        public abstract PresenceBarState a();
    }


    private static final PresenceBarStateController b = new PresenceBarStateController();
    public a a;
    private ArrayList c;
    private PresenceBarState d;

    private PresenceBarStateController()
    {
        c = new ArrayList();
        d = PresenceBarState.NOTHING;
    }

    public static PresenceBarStateController a()
    {
        return b;
    }

    public final void a(b b1)
    {
        c.add(b1);
    }

    public final void b()
    {
        PresenceBarState presencebarstate = PresenceBarState.NOTHING;
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            b b1 = (b)iterator.next();
            if (presencebarstate.compareTo(b1.a()) < 0)
            {
                presencebarstate = b1.a();
            }
        } while (true);
        if (d != presencebarstate)
        {
            d = presencebarstate;
            a.a(d);
        }
    }

}
