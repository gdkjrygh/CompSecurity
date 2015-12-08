// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.d;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private static final class Zr extends AbstractGamesCallbacks
{

    final d Zr;

    public void b(int i, int j, String s)
    {
        if (Zr != null)
        {
            Zr.a(new Zr(i, j, s));
        }
    }

    public (d d1)
    {
        Zr = d1;
    }
}
