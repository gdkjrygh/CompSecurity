// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import com.google.android.gms.games.service.WrappedGamesCallbacks;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            InRoomState

final class mOwner
{

    public final WrappedGamesCallbacks mCallbacks;
    public final String mOwner;
    final mOwner this$1;

    public (WrappedGamesCallbacks wrappedgamescallbacks, String s)
    {
        this$1 = this._cls1.this;
        super();
        mCallbacks = wrappedgamescallbacks;
        mOwner = s;
    }
}
