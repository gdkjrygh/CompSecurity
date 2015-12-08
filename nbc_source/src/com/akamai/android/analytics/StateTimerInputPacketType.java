// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;


final class StateTimerInputPacketType extends Enum
{

    public static final StateTimerInputPacketType AD_COMPLETE;
    public static final StateTimerInputPacketType AD_END;
    public static final StateTimerInputPacketType AD_ERROR;
    public static final StateTimerInputPacketType AD_FIRST_QUARTILE;
    public static final StateTimerInputPacketType AD_LOADED;
    public static final StateTimerInputPacketType AD_MIDPOINT;
    public static final StateTimerInputPacketType AD_STARTED;
    public static final StateTimerInputPacketType AD_STOPPED;
    public static final StateTimerInputPacketType AD_THIRD_QUARTILE;
    public static final StateTimerInputPacketType BUFFER_END;
    public static final StateTimerInputPacketType BUFFER_START;
    public static final StateTimerInputPacketType CONNECT;
    public static final StateTimerInputPacketType DEBUG;
    private static final StateTimerInputPacketType ENUM$VALUES[];
    public static final StateTimerInputPacketType ERROR;
    public static final StateTimerInputPacketType FULL_SCREEN;
    public static final StateTimerInputPacketType GIVEMEABEACON;
    public static final StateTimerInputPacketType GIVEMEACOMPLETEBEACONRESET;
    public static final StateTimerInputPacketType GIVEMEAERRORBEACONRESET;
    public static final StateTimerInputPacketType GIVEMEAHEARTBEATBEACON;
    public static final StateTimerInputPacketType GIVEMEAPLAYBEACONRESET;
    public static final StateTimerInputPacketType INIT;
    public static final StateTimerInputPacketType PAUSE;
    public static final StateTimerInputPacketType PLAY;
    public static final StateTimerInputPacketType PLAY_END;
    public static final StateTimerInputPacketType PLAY_END_POSTROLL;
    public static final StateTimerInputPacketType REMOVELISTENER;
    public static final StateTimerInputPacketType RESUME_BUFFER;
    public static final StateTimerInputPacketType SEEK_END;
    public static final StateTimerInputPacketType SEEK_START;
    public static final StateTimerInputPacketType SETDATAFEEDBACK;
    public static final StateTimerInputPacketType SWITCHED_TO;
    public static final StateTimerInputPacketType SWITCH_REQUESTED;
    public static final StateTimerInputPacketType TITLE_SWITCHED;

    private StateTimerInputPacketType(String s, int i)
    {
        super(s, i);
    }

    public static StateTimerInputPacketType valueOf(String s)
    {
        return (StateTimerInputPacketType)Enum.valueOf(com/akamai/android/analytics/StateTimerInputPacketType, s);
    }

    public static StateTimerInputPacketType[] values()
    {
        StateTimerInputPacketType astatetimerinputpackettype[] = ENUM$VALUES;
        int i = astatetimerinputpackettype.length;
        StateTimerInputPacketType astatetimerinputpackettype1[] = new StateTimerInputPacketType[i];
        System.arraycopy(astatetimerinputpackettype, 0, astatetimerinputpackettype1, 0, i);
        return astatetimerinputpackettype1;
    }

    static 
    {
        INIT = new StateTimerInputPacketType("INIT", 0);
        CONNECT = new StateTimerInputPacketType("CONNECT", 1);
        BUFFER_START = new StateTimerInputPacketType("BUFFER_START", 2);
        BUFFER_END = new StateTimerInputPacketType("BUFFER_END", 3);
        PLAY = new StateTimerInputPacketType("PLAY", 4);
        PAUSE = new StateTimerInputPacketType("PAUSE", 5);
        RESUME_BUFFER = new StateTimerInputPacketType("RESUME_BUFFER", 6);
        SEEK_START = new StateTimerInputPacketType("SEEK_START", 7);
        SEEK_END = new StateTimerInputPacketType("SEEK_END", 8);
        ERROR = new StateTimerInputPacketType("ERROR", 9);
        PLAY_END = new StateTimerInputPacketType("PLAY_END", 10);
        PLAY_END_POSTROLL = new StateTimerInputPacketType("PLAY_END_POSTROLL", 11);
        SWITCH_REQUESTED = new StateTimerInputPacketType("SWITCH_REQUESTED", 12);
        SWITCHED_TO = new StateTimerInputPacketType("SWITCHED_TO", 13);
        FULL_SCREEN = new StateTimerInputPacketType("FULL_SCREEN", 14);
        AD_LOADED = new StateTimerInputPacketType("AD_LOADED", 15);
        AD_STARTED = new StateTimerInputPacketType("AD_STARTED", 16);
        AD_FIRST_QUARTILE = new StateTimerInputPacketType("AD_FIRST_QUARTILE", 17);
        AD_MIDPOINT = new StateTimerInputPacketType("AD_MIDPOINT", 18);
        AD_THIRD_QUARTILE = new StateTimerInputPacketType("AD_THIRD_QUARTILE", 19);
        AD_COMPLETE = new StateTimerInputPacketType("AD_COMPLETE", 20);
        AD_STOPPED = new StateTimerInputPacketType("AD_STOPPED", 21);
        AD_END = new StateTimerInputPacketType("AD_END", 22);
        AD_ERROR = new StateTimerInputPacketType("AD_ERROR", 23);
        GIVEMEABEACON = new StateTimerInputPacketType("GIVEMEABEACON", 24);
        GIVEMEAERRORBEACONRESET = new StateTimerInputPacketType("GIVEMEAERRORBEACONRESET", 25);
        GIVEMEACOMPLETEBEACONRESET = new StateTimerInputPacketType("GIVEMEACOMPLETEBEACONRESET", 26);
        GIVEMEAHEARTBEATBEACON = new StateTimerInputPacketType("GIVEMEAHEARTBEATBEACON", 27);
        GIVEMEAPLAYBEACONRESET = new StateTimerInputPacketType("GIVEMEAPLAYBEACONRESET", 28);
        SETDATAFEEDBACK = new StateTimerInputPacketType("SETDATAFEEDBACK", 29);
        DEBUG = new StateTimerInputPacketType("DEBUG", 30);
        REMOVELISTENER = new StateTimerInputPacketType("REMOVELISTENER", 31);
        TITLE_SWITCHED = new StateTimerInputPacketType("TITLE_SWITCHED", 32);
        ENUM$VALUES = (new StateTimerInputPacketType[] {
            INIT, CONNECT, BUFFER_START, BUFFER_END, PLAY, PAUSE, RESUME_BUFFER, SEEK_START, SEEK_END, ERROR, 
            PLAY_END, PLAY_END_POSTROLL, SWITCH_REQUESTED, SWITCHED_TO, FULL_SCREEN, AD_LOADED, AD_STARTED, AD_FIRST_QUARTILE, AD_MIDPOINT, AD_THIRD_QUARTILE, 
            AD_COMPLETE, AD_STOPPED, AD_END, AD_ERROR, GIVEMEABEACON, GIVEMEAERRORBEACONRESET, GIVEMEACOMPLETEBEACONRESET, GIVEMEAHEARTBEATBEACON, GIVEMEAPLAYBEACONRESET, SETDATAFEEDBACK, 
            DEBUG, REMOVELISTENER, TITLE_SWITCHED
        });
    }
}
