// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.music.spotlets.FeatureIdentifier;

final class ang.Object
    implements android.view.nClickListener
{

    private eza a;

    public final void onClick(View view)
    {
        view = new ClientEvent(com.spotify.mobile.android.util.Event.Event.O, com.spotify.mobile.android.util.Event.SubEvent.U);
        eyz.v(a.a);
        fop.a(((fzv) (a.a)).p, eyz.b(a.a), view);
        eyz.x(a.a);
        view = ((fzv) (a.a)).p;
        com.spotify.mobile.android.util.viewuri.Verified verified = eyz.b(a.a);
        com.spotify.mobile.android.util.viewuri.i.SubView subview = com.spotify.mobile.android.util.viewuri.i.SubView.a;
        FeatureIdentifier featureidentifier = FeatureIdentifier.R;
        FeatureIdentifier featureidentifier1 = a.a.i;
        android.net.Uri uri = eyz.m(a.a);
        eyz.w(a.a);
        fos.a(view, verified, subview, featureidentifier, featureidentifier1, uri);
    }

    (eza eza1)
    {
        a = eza1;
        super();
    }
}
