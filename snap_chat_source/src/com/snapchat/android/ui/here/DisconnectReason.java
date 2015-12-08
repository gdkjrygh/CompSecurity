// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.here;


public final class DisconnectReason extends Enum
{

    private static final DisconnectReason $VALUES[];
    public static final DisconnectReason ADL_RELEASE;
    public static final DisconnectReason ALREADY_CONNECTED_TO_DIFFERENT_SCOPE;
    public static final DisconnectReason CONNECTION_LOST;
    public static final DisconnectReason HERE_BTN_RELEASED;
    public static final DisconnectReason L2S_SWIPE_OUT;
    public static final DisconnectReason ON_HIDDEN;
    public static final DisconnectReason ON_PAUSE;
    public static final DisconnectReason REMOTE_PEER_LEFT;
    public static final DisconnectReason SWIPE_CASH;

    private DisconnectReason(String s, int i)
    {
        super(s, i);
    }

    public static DisconnectReason valueOf(String s)
    {
        return (DisconnectReason)Enum.valueOf(com/snapchat/android/ui/here/DisconnectReason, s);
    }

    public static DisconnectReason[] values()
    {
        return (DisconnectReason[])$VALUES.clone();
    }

    static 
    {
        HERE_BTN_RELEASED = new DisconnectReason("HERE_BTN_RELEASED", 0);
        L2S_SWIPE_OUT = new DisconnectReason("L2S_SWIPE_OUT", 1);
        ON_PAUSE = new DisconnectReason("ON_PAUSE", 2);
        ON_HIDDEN = new DisconnectReason("ON_HIDDEN", 3);
        REMOTE_PEER_LEFT = new DisconnectReason("REMOTE_PEER_LEFT", 4);
        SWIPE_CASH = new DisconnectReason("SWIPE_CASH", 5);
        CONNECTION_LOST = new DisconnectReason("CONNECTION_LOST", 6);
        ALREADY_CONNECTED_TO_DIFFERENT_SCOPE = new DisconnectReason("ALREADY_CONNECTED_TO_DIFFERENT_SCOPE", 7);
        ADL_RELEASE = new DisconnectReason("ADL_RELEASE", 8);
        $VALUES = (new DisconnectReason[] {
            HERE_BTN_RELEASED, L2S_SWIPE_OUT, ON_PAUSE, ON_HIDDEN, REMOTE_PEER_LEFT, SWIPE_CASH, CONNECTION_LOST, ALREADY_CONNECTED_TO_DIFFERENT_SCOPE, ADL_RELEASE
        });
    }
}
