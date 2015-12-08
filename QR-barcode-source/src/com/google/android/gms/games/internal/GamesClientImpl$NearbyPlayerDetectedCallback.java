// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.OnNearbyPlayerDetectedListener;
import com.google.android.gms.games.Player;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private final class  extends com.google.android.gms.common.internal.Y
{

    private final Player Xl;

    protected void a(OnNearbyPlayerDetectedListener onnearbyplayerdetectedlistener)
    {
        onnearbyplayerdetectedlistener.a(Xl);
    }

    protected void g(Object obj)
    {
        a((OnNearbyPlayerDetectedListener)obj);
    }

    protected void gT()
    {
    }
}
