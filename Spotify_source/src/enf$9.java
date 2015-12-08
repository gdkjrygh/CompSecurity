// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.music.spotlets.FeatureIdentifier;

final class ang.Object
    implements android.view.nClickListener
{

    private enf a;

    public final void onClick(View view)
    {
        enf.e(a);
        fop.a(a.k(), enf.b(a), ClientEventFactory.a("album", com.spotify.mobile.android.util.Event.SubEvent.X, null, null));
        view = dti.d(enf.f(a));
        enf.h(a);
        u u = a.k();
        com.spotify.mobile.android.util.viewuri.Verified verified = enf.b(a);
        com.spotify.mobile.android.util.viewuri.i.SubView subview = com.spotify.mobile.android.util.viewuri.i.SubView.a;
        FeatureIdentifier featureidentifier = FeatureIdentifier.j;
        FeatureIdentifier featureidentifier1 = enf.g(a);
        enf.a(a);
        fos.a(u, verified, subview, featureidentifier, featureidentifier1, view);
    }

    (enf enf1)
    {
        a = enf1;
        super();
    }
}
