// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.music.spotlets.FeatureIdentifier;

final class ang.Object
    implements android.view.nClickListener
{

    private Context a;
    private Verified b;
    private FeatureIdentifier c;
    private FeatureIdentifier d;
    private Uri e;

    public final void onClick(View view)
    {
        dmz.a(fop);
        fop.a(a, b, new ClientEvent(com.spotify.mobile.android.util.Event.Event.ab, com.spotify.mobile.android.util.Event.SubEvent.G));
        dmz.a(fos);
        fos.a(a, b, com.spotify.mobile.android.util.viewuri.i.SubView.a, c, d, e);
    }

    (Context context, Verified verified, FeatureIdentifier featureidentifier, FeatureIdentifier featureidentifier1, Uri uri)
    {
        a = context;
        b = verified;
        c = featureidentifier;
        d = featureidentifier1;
        e = uri;
        super();
    }
}
