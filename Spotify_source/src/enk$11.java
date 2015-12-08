// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.music.spotlets.FeatureIdentifier;

final class ng.Object
    implements android.view.ClickListener
{

    private enk a;

    public final void onClick(View view)
    {
        enk.n(a);
        fop.a(a.k(), enk.b(a), ClientEventFactory.a("tracks", com.spotify.mobile.android.util.vent.SubEvent.X, null, null));
        view = dti.a(enk.o(a), enk.f(a).b());
        enk.q(a);
        u u = a.k();
        com.spotify.mobile.android.util.viewuri.Verified verified = enk.b(a);
        com.spotify.mobile.android.util.viewuri..SubView subview = com.spotify.mobile.android.util.viewuri..SubView.a;
        FeatureIdentifier featureidentifier = FeatureIdentifier.s;
        FeatureIdentifier featureidentifier1 = enk.p(a);
        enk.a(a);
        fos.a(u, verified, subview, featureidentifier, featureidentifier1, view);
    }

    iew(enk enk1)
    {
        a = enk1;
        super();
    }
}
