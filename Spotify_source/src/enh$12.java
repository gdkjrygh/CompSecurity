// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.music.spotlets.FeatureIdentifier;

final class ng.Object
    implements android.view.ClickListener
{

    private enh a;

    public final void onClick(View view)
    {
        enh.h(a);
        fop.a(a.k(), enh.f(a), ClientEventFactory.a("artist", com.spotify.mobile.android.util.vent.SubEvent.X, null, null));
        view = dti.b(enh.l(a));
        enh.t(a);
        u u = a.k();
        com.spotify.mobile.android.util.viewuri.Verified verified = enh.f(a);
        com.spotify.mobile.android.util.viewuri..SubView subview = com.spotify.mobile.android.util.viewuri..SubView.a;
        FeatureIdentifier featureidentifier = FeatureIdentifier.l;
        FeatureIdentifier featureidentifier1 = enh.s(a);
        enh.j(a);
        fos.a(u, verified, subview, featureidentifier, featureidentifier1, view);
    }

    iew(enh enh1)
    {
        a = enh1;
        super();
    }
}
