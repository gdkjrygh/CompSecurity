// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.ui.fragments.logic.Flags;

public final class ezk
{

    boolean a;
    private final u b;
    private final dwh c;
    private final Flags d;
    private final fjm e;
    private final View f;

    public ezk(u u, dwh dwh, Flags flags, fjm fjm, View view)
    {
        ctz.a(u);
        ctz.a(dwh);
        ctz.a(flags);
        ctz.a(fjm);
        ctz.a(view);
        b = u;
        c = dwh;
        d = flags;
        e = fjm;
        f = view;
    }

    public final void a(PlayerState playerstate)
    {
        gci.a(playerstate, c, d, b, e, f);
    }
}
