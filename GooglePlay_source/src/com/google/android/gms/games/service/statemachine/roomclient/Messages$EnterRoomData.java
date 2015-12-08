// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.games.internal.ConnectionInfo;
import com.google.android.gms.games.service.WrappedGamesCallbacks;
import com.google.android.gms.games.service.statemachine.MessageBase;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            Messages, RtmpSessionLog, OneupRtmpCalls

public static abstract class clientId extends MessageBase
{

    public final WrappedGamesCallbacks callbacks;
    public final ClientContext clientContext;
    public final long clientId;
    public final Data connectNetworkData;
    public final Retry connectNetworkRetry = new Retry();
    public final Context context;
    public final boolean enableSockets;
    public final String externalGameId;
    public final etry loadLibrariesRetry = new etry();
    public final IBinder realTimeGameDeathBinder;
    public final RtmpSessionLog sessionLog;

    public abstract back getGameCallback();

    public abstract Runnable getOneupEnterCall(OneupRtmpCalls oneuprtmpcalls, com.google.android.gms.games.service.oomEnteredCallback oomenteredcallback, ConnectionInfo connectioninfo);

    protected back(int i, Context context1, ClientContext clientcontext, String s, WrappedGamesCallbacks wrappedgamescallbacks, IBinder ibinder, boolean flag, 
            long l, String s1, String s2)
    {
        super(29);
        sessionLog = new RtmpSessionLog(context1, clientcontext, i, s, flag);
        clientContext = clientcontext;
        context = context1;
        externalGameId = s;
        callbacks = wrappedgamescallbacks;
        realTimeGameDeathBinder = ibinder;
        enableSockets = flag;
        connectNetworkData = new Data(context1, s, s2, clientcontext, s1);
        clientId = l;
    }
}
