// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import com.google.common.a.fi;
import com.google.common.a.kl;

public final class c extends Enum
{

    private static final c $VALUES[];
    public static final fi ALL;
    public static final c CHAT_HEAD_ROLL;
    public static final c MOVING_BAR;
    public static final fi ON_OPEN_AND_TRANSITION_COUNT;
    public static final c ON_OPEN_COUNT;
    public static final fi ON_OPEN_COUNT_AND_CHAT_HEAD_ROLL;
    public static final c ON_TRANSITION_COUNT;
    public static final c STEADY_STATE_COUNT;
    public static final fi STEADY_STATE_COUNT_AND_CHAT_HEAD_ROLL;
    public static final c STEADY_STATE_GREEN_DOT;

    private c(String s, int i)
    {
        super(s, i);
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/facebook/orca/contacts/divebar/c, s);
    }

    public static c[] values()
    {
        return (c[])$VALUES.clone();
    }

    static 
    {
        ON_OPEN_COUNT = new c("ON_OPEN_COUNT", 0);
        ON_TRANSITION_COUNT = new c("ON_TRANSITION_COUNT", 1);
        STEADY_STATE_COUNT = new c("STEADY_STATE_COUNT", 2);
        STEADY_STATE_GREEN_DOT = new c("STEADY_STATE_GREEN_DOT", 3);
        CHAT_HEAD_ROLL = new c("CHAT_HEAD_ROLL", 4);
        MOVING_BAR = new c("MOVING_BAR", 5);
        $VALUES = (new c[] {
            ON_OPEN_COUNT, ON_TRANSITION_COUNT, STEADY_STATE_COUNT, STEADY_STATE_GREEN_DOT, CHAT_HEAD_ROLL, MOVING_BAR
        });
        ON_OPEN_AND_TRANSITION_COUNT = kl.a(ON_OPEN_COUNT, new c[] {
            ON_TRANSITION_COUNT
        });
        ON_OPEN_COUNT_AND_CHAT_HEAD_ROLL = kl.a(ON_OPEN_COUNT, new c[] {
            CHAT_HEAD_ROLL
        });
        STEADY_STATE_COUNT_AND_CHAT_HEAD_ROLL = kl.a(STEADY_STATE_COUNT, new c[] {
            CHAT_HEAD_ROLL
        });
        ALL = kl.a(ON_OPEN_COUNT, new c[] {
            ON_TRANSITION_COUNT, STEADY_STATE_COUNT, STEADY_STATE_GREEN_DOT, CHAT_HEAD_ROLL, MOVING_BAR
        });
    }
}
