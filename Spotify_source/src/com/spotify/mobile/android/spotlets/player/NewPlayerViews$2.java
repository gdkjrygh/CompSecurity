// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.player;

import eqh;
import gbe;

// Referenced classes of package com.spotify.mobile.android.spotlets.player:
//            NewPlayerViews

final class b extends gbe
{

    private NewPlayerViews b;

    protected final void a(int i)
    {
        NewPlayerViews.a(b, i);
    }

    protected final void a(long l, long l1)
    {
        b.a(l, l1, NewPlayerViews.a(b));
    }

    A(NewPlayerViews newplayerviews, eqh eqh)
    {
        b = newplayerviews;
        super(eqh);
    }
}
