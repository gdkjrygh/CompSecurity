// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;

final class ang.Object
    implements android.view.nClickListener
{

    private fdg a;

    public final void onClick(View view)
    {
        view = ViewUri.al;
        Object obj = new ClientEvent(com.spotify.mobile.android.util.Event.Event.O, com.spotify.mobile.android.util.Event.SubEvent.U);
        fdg.m(a);
        fop.a(a.k(), view, ((ClientEvent) (obj)));
        obj = dtm.a(fdg.a(a));
        fdg.o(a);
        u u = a.k();
        com.spotify.mobile.android.util.viewuri.i.SubView subview = com.spotify.mobile.android.util.viewuri.i.SubView.a;
        FeatureIdentifier featureidentifier = FeatureIdentifier.z;
        FeatureIdentifier featureidentifier1 = fdg.n(a);
        fdg.b(a);
        fos.a(u, view, subview, featureidentifier, featureidentifier1, ((android.net.Uri) (obj)));
    }

    (fdg fdg1)
    {
        a = fdg1;
        super();
    }
}
