// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;


// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PlayerActivity

protected static final class mName extends Enum
{

    private static final ACTIVITY_PLAYER_READY $VALUES[];
    public static final ACTIVITY_PLAYER_READY ACTIVITY_NOTREADY;
    public static final ACTIVITY_PLAYER_READY ACTIVITY_PLAYER_READY;
    public static final ACTIVITY_PLAYER_READY ACTIVITY_SRVCMNGR_READY;
    int mActivityState;
    String mName;

    public static mName valueOf(String s)
    {
        return (mName)Enum.valueOf(com/netflix/mediaclient/ui/player/PlayerActivity$PlayerActivityState, s);
    }

    public static mName[] values()
    {
        return (mName[])$VALUES.clone();
    }

    protected String getName()
    {
        return mName;
    }

    protected int getState()
    {
        return mActivityState;
    }

    static 
    {
        ACTIVITY_NOTREADY = new <init>("ACTIVITY_NOTREADY", 0, 0, "NOTREADY");
        ACTIVITY_SRVCMNGR_READY = new <init>("ACTIVITY_SRVCMNGR_READY", 1, 1, "SRVCMNGR_READY");
        ACTIVITY_PLAYER_READY = new <init>("ACTIVITY_PLAYER_READY", 2, 2, "PLAYER_READY");
        $VALUES = (new .VALUES[] {
            ACTIVITY_NOTREADY, ACTIVITY_SRVCMNGR_READY, ACTIVITY_PLAYER_READY
        });
    }

    private (String s, int i, int j, String s1)
    {
        super(s, i);
        mActivityState = j;
        mName = s1;
    }
}
