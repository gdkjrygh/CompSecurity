// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchUpdateReceivedListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class Zb
    implements com.google.android.gms.common.api.ier
{

    private final String Zb;

    public void a(OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener)
    {
        onturnbasedmatchupdatereceivedlistener.onTurnBasedMatchRemoved(Zb);
    }

    public void c(Object obj)
    {
        a((OnTurnBasedMatchUpdateReceivedListener)obj);
    }

    public void gG()
    {
    }

    ceivedListener(String s)
    {
        Zb = s;
    }
}
