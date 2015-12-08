// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.music.spotlets.FeatureIdentifier;

final class ang.Object
    implements android.view.nClickListener
{

    private ejz a;

    public final void onClick(View view)
    {
        fop.a(a.a, a.k, ClientEventFactory.a("artist", com.spotify.mobile.android.util.Event.SubEvent.X, null, null));
        view = dth.b(a.b.c());
        fos.a(a.a, a.k, com.spotify.mobile.android.util.viewuri.i.SubView.a, FeatureIdentifier.K, a.l, view);
    }

    (ejz ejz1)
    {
        a = ejz1;
        super();
    }
}
