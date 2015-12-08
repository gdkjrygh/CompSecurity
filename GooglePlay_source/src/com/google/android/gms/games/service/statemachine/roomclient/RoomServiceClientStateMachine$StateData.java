// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import com.google.android.gms.games.internal.IRoomService;
import com.google.android.gms.games.internal.IRoomServiceCallbacks;
import com.google.android.gms.games.service.ConnectNetworkAuthenticator;
import com.google.android.gms.games.service.statemachine.MessageTokenHelper;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            RoomServiceClientStateMachine, OneupRtmpCalls

protected static final class n
{

    public ConnectNetworkAuthenticator mAuthenticator;
    public final AtomicInteger mMessageToken = new AtomicInteger();
    public OneupRtmpCalls mOneup;
    public IRoomService mRoomAndroidService;
    public IRoomServiceCallbacks roomServiceCallbacks;
    public n roomServiceConnection;
    public final MessageTokenHelper roomServiceGoneToken = new MessageTokenHelper();

    protected n()
    {
    }
}
