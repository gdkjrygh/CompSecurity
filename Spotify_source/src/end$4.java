// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.spotify.mobile.android.util.ClientEventFactory;

final class ang.Object
    implements android.view.nClickListener
{

    private end a;

    public final void onClick(View view)
    {
        a.a(ClientEventFactory.a("tracks", com.spotify.mobile.android.util.Event.SubEvent.X, null, null));
        view = (new com.spotify.mobile.android.cosmos.player.v2.tions.Builder()).playerOptionsOverride(true, false, false).build();
        ((epi)end.s(a)).a(view, end.w(a));
    }

    (end end1)
    {
        a = end1;
        super();
    }
}
