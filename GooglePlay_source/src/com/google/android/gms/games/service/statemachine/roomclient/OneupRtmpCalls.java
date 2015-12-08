// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.games.internal.ConnectionInfo;
import com.google.android.gms.games.server.api.RoomLeaveDiagnostics;
import java.util.ArrayList;

public interface OneupRtmpCalls
{

    public abstract void createRoom(Context context, ClientContext clientcontext, com.google.android.gms.games.service.PlayGamesAsyncService.RoomEnteredCallback roomenteredcallback, String s, int i, String as[], Bundle bundle, 
            ConnectionInfo connectioninfo);

    public abstract void joinRoom(Context context, ClientContext clientcontext, com.google.android.gms.games.service.PlayGamesAsyncService.RoomEnteredCallback roomenteredcallback, String s, String s1, ConnectionInfo connectioninfo);

    public abstract void leaveRoom(Context context, ClientContext clientcontext, com.google.android.gms.games.service.PlayGamesAsyncService.RoomLeftCallback roomleftcallback, String s, String s1, RoomLeaveDiagnostics roomleavediagnostics);

    public abstract void reportP2pStatus(Context context, ClientContext clientcontext, com.google.android.gms.games.service.PlayGamesAsyncService.P2pStatusReportCallback p2pstatusreportcallback, String s, ArrayList arraylist);
}
