// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.OnNearbyPlayerDetectedListener;
import com.google.android.gms.games.Player;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class 
    implements com.google.android.gms.common.api.ier
{

    private final Player Ze;

    public void a(OnNearbyPlayerDetectedListener onnearbyplayerdetectedlistener)
    {
        onnearbyplayerdetectedlistener.a(Ze);
    }

    public void c(Object obj)
    {
        a((OnNearbyPlayerDetectedListener)obj);
    }

    public void gG()
    {
    }
}
