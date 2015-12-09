// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.widget.ListView;
import com.spotify.mobile.android.spotlets.collection.util.CollectionState;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;

final class eza
    implements ezc
{

    final eyz a;
    private android.view.View.OnClickListener b;

    eza(eyz eyz1)
    {
        a = eyz1;
        super();
        b = new android.view.View.OnClickListener() {

            private eza a;

            public final void onClick(View view)
            {
                view = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.U);
                eyz.v(a.a);
                fop.a(((fzv) (a.a)).p, eyz.b(a.a), view);
                eyz.x(a.a);
                view = ((fzv) (a.a)).p;
                Verified verified = eyz.b(a.a);
                com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview = com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a;
                FeatureIdentifier featureidentifier = FeatureIdentifier.R;
                FeatureIdentifier featureidentifier1 = a.a.i;
                android.net.Uri uri = eyz.m(a.a);
                eyz.w(a.a);
                fos.a(view, verified, subview, featureidentifier, featureidentifier1, uri);
            }

            
            {
                a = eza.this;
                super();
            }
        };
    }

    private void a(Context context, Verified verified, com.spotify.mobile.android.util.ClientEvent.Event event)
    {
        eyz.v(a);
        fop.a(context, verified, new ClientEvent(event, com.spotify.mobile.android.util.ClientEvent.SubEvent.F));
    }

    public final android.view.View.OnClickListener a()
    {
        return b;
    }

    public final void a(View view)
    {
        a.b(view);
    }

    public final void a(ListView listview)
    {
        eyz.a(a, listview);
    }

    public final void a(CollectionState collectionstate)
    {
        Verified verified = ViewUri.am.a(eyz.j(a));
        switch (eyz._cls5.a[collectionstate.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            a(((fzv) (a)).p, verified, com.spotify.mobile.android.util.ClientEvent.Event.K);
            eyz.a(a, true);
            return;

        case 2: // '\002'
            a(((fzv) (a)).p, verified, com.spotify.mobile.android.util.ClientEvent.Event.L);
            eyz.a(a, true);
            return;

        case 3: // '\003'
            a(((fzv) (a)).p, verified, com.spotify.mobile.android.util.ClientEvent.Event.M);
            break;
        }
        eyz.a(a, false);
    }
}
