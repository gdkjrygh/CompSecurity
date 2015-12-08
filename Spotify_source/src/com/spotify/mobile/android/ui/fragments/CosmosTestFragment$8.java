// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.fragments;

import ctw;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.ui.fragments:
//            CosmosTestFragment

final class a
    implements com.spotify.mobile.android.cosmos.player.v2.
{

    private String a;
    private CosmosTestFragment b;

    public final void onPlayForbidden(List list)
    {
        CosmosTestFragment.a(b, "player", (new StringBuilder("playback forbidden: ")).append(ctw.a(',').a(list)).toString());
    }

    public final void onPlaySuccess()
    {
        CosmosTestFragment.b(b, true);
        CosmosTestFragment.a(b, "player", a);
    }

    ck(CosmosTestFragment cosmostestfragment, String s)
    {
        b = cosmostestfragment;
        a = s;
        super();
    }
}
