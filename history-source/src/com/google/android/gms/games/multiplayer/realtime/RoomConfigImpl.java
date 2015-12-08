// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import com.google.android.gms.internal.jx;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            RoomConfig, RoomUpdateListener, RoomStatusUpdateListener, RealTimeMessageReceivedListener

public final class RoomConfigImpl extends RoomConfig
{

    private final String YG;
    private final int adW;
    private final RoomUpdateListener aeh;
    private final RoomStatusUpdateListener aei;
    private final RealTimeMessageReceivedListener aej;
    private final Bundle aem;
    private final boolean aen;
    private final String aeo[];

    RoomConfigImpl(RoomConfig.Builder builder)
    {
        aeh = builder.aeh;
        aei = builder.aei;
        aej = builder.aej;
        YG = builder.aek;
        adW = builder.adW;
        aem = builder.aem;
        aen = builder.aen;
        int i = builder.ael.size();
        aeo = (String[])builder.ael.toArray(new String[i]);
        if (aej == null)
        {
            jx.a(aen, "Must either enable sockets OR specify a message listener");
        }
    }

    public Bundle getAutoMatchCriteria()
    {
        return aem;
    }

    public String getInvitationId()
    {
        return YG;
    }

    public String[] getInvitedPlayerIds()
    {
        return aeo;
    }

    public RealTimeMessageReceivedListener getMessageReceivedListener()
    {
        return aej;
    }

    public RoomStatusUpdateListener getRoomStatusUpdateListener()
    {
        return aei;
    }

    public RoomUpdateListener getRoomUpdateListener()
    {
        return aeh;
    }

    public int getVariant()
    {
        return adW;
    }

    public boolean isSocketEnabled()
    {
        return aen;
    }
}
