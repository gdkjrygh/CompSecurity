// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchUpdateReceivedListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

final class Jb extends com.google.android.gms.internal.lback
{

    final GamesClientImpl IJ;
    private final String Jb;

    protected void a(Object obj)
    {
        b((OnTurnBasedMatchUpdateReceivedListener)obj);
    }

    protected void b(OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener)
    {
        onturnbasedmatchupdatereceivedlistener.onTurnBasedMatchRemoved(Jb);
    }

    protected void dx()
    {
    }

    ceivedListener(GamesClientImpl gamesclientimpl, OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener, String s)
    {
        IJ = gamesclientimpl;
        super(gamesclientimpl, onturnbasedmatchupdatereceivedlistener);
        Jb = s;
    }
}
