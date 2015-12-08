// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import com.spotify.mobile.android.spotlets.openaccess.model.Album;
import com.spotify.mobile.android.spotlets.openaccess.model.Image;
import com.spotify.mobile.android.spotlets.openaccess.model.Track;
import com.spotify.mobile.android.spotlets.openaccess.model.Tracks;
import com.spotify.mobile.android.ui.stuff.ContentViewManager;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import java.util.HashMap;
import java.util.Locale;

public final class exi extends exg
    implements exk
{

    private static final exp ai = new exp() {

        public final boolean a()
        {
            return false;
        }

        public final boolean b()
        {
            return true;
        }

    };
    private ftg Y;
    private exo Z;
    private dja a;
    private LoadingView aa;
    private ContentViewManager ab;
    private Button ac;
    private exv ad;
    private gdy ae;
    private exw af;
    private Verified ag;
    private exx ah;
    private exj b;

    public exi()
    {
        ad = (exv)dmz.a(exv);
        ae = (gdy)dmz.a(gdy);
        af = (exw)dmz.a(exw);
        ah = new exx() {

            private exi a;

            public final void a(Track track, float f1)
            {
                track.setProgress(f1);
                exz.a(exi.a(a).f(), track, f1);
            }

            
            {
                a = exi.this;
                super();
            }
        };
    }

    static dja a(exi exi1)
    {
        return exi1.a;
    }

    public static exi a(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("uri", s);
        s = new exi();
        s.f(bundle);
        return s;
    }

    private void a()
    {
        if (ae.a())
        {
            ab.a(false);
            ab.c(false);
            ab.a(aa);
            a.b().setVisibility(8);
            if (b == null)
            {
                b = new exj(k().getApplicationContext(), this);
            }
            Object obj = new SpotifyLink(g().getString("uri"));
            exj exj1 = b;
            obj = ((SpotifyLink) (obj)).b();
            exj1.a.a((new StringBuilder("/v1/albums/")).append(((String) (obj))).toString(), new HashMap(), new exj._cls1(exj1));
            return;
        } else
        {
            ab.c(false);
            ab.a(true);
            return;
        }
    }

    static Verified b(exi exi1)
    {
        return exi1.ag;
    }

    static exv c(exi exi1)
    {
        return exi1.ad;
    }

    static exo d(exi exi1)
    {
        return exi1.Z;
    }

    static exx e(exi exi1)
    {
        return exi1.ah;
    }

    static exw f(exi exi1)
    {
        return exi1.af;
    }

    static ftg g(exi exi1)
    {
        return exi1.Y;
    }

    static void h(exi exi1)
    {
        exi1.a();
    }

    public final void A()
    {
        super.A();
        af.e();
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.a(layoutinflater, viewgroup, bundle);
        viewgroup = (ViewGroup)layoutinflater.findViewById(0x7f11032d);
        Object obj = k();
        Y = new ftg(((android.content.Context) (obj)));
        bundle = new SpotifyLink(g().getString("uri"));
        ag = ViewUri.am.a(bundle.d());
        ac = gad.a(((android.content.Context) (obj)), null);
        a = dja.a(k()).b().b().b(ac).a(true).a(this);
        ac.setOnClickListener(new android.view.View.OnClickListener(bundle) {

            private SpotifyLink a;
            private exi b;

            public final void onClick(View view)
            {
                exi.c(b).a(exi.b(b), a.d());
                exi.f(b).a(exi.d(b).a(), exi.d(b), exi.e(b));
                b.b(exi.b(b));
            }

            
            {
                b = exi.this;
                a = spotifylink;
                super();
            }
        });
        Z = new exo(k(), ai);
        Y.a(Z, 0x7f08046d, 0);
        a.f().setAdapter(Y);
        a.f().setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            private exi a;

            public final void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                i -= exi.a(a).f().getHeaderViewsCount();
                if (exi.g(a).b(i) == 0)
                {
                    i = exi.g(a).a(i, 0);
                    adapterview = (Track)exi.d(a).getItem(i);
                    exi.c(a).a(exi.b(a), adapterview.getUri(), i);
                    if (adapterview.isCurrentTrack())
                    {
                        exi.f(a).d();
                    } else
                    {
                        exi.f(a).a(exi.d(a).a(i), exi.d(a), exi.e(a));
                    }
                    a.b(exi.b(a));
                }
            }

            
            {
                a = exi.this;
                super();
            }
        });
        obj = new FrameLayout(((android.content.Context) (obj)));
        ((ViewGroup) (obj)).setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        ((ViewGroup) (obj)).addView(a.b());
        Object obj1 = ext.a(k(), new android.view.View.OnClickListener() {

            private exi a;

            public final void onClick(View view)
            {
                exi.h(a);
            }

            
            {
                a = exi.this;
                super();
            }
        });
        ((ViewGroup) (obj)).addView(((View) (obj1)));
        aa = LoadingView.a(LayoutInflater.from(k()));
        ((ViewGroup) (obj)).addView(aa);
        ab = (new gaa(k(), ((com.spotify.android.paste.widget.EmptyView) (obj1)), a.b())).a(0x7f08038c, 0x7f08038b).b(0x7f08038f, 0x7f08038d).a();
        a();
        obj1 = ad;
        ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.R, com.spotify.mobile.android.util.ClientEvent.SubEvent.aX);
        clientevent.a("installation_id", ((exv) (obj1)).a.f());
        fop.a(ViewUri.am.a(bundle.d()), com.spotify.mobile.android.util.viewuri.ViewUri.SubView.A, clientevent);
        viewgroup.addView(((View) (obj)));
        return layoutinflater;
    }

    public final void a(Album album)
    {
        if (o())
        {
            ab.b(null);
            String s1;
            if (album.containsImage())
            {
                String s = album.getLargestImage().getImageUrl();
                dmz.a(gjj);
                gji gji1 = gjj.a(k());
                gji1.a(a.d(), s);
                gji1.e(a.c(), s);
            } else
            {
                a.c().setImageDrawable(dff.b(k()));
            }
            s1 = album.getName();
            ((djr)a.a()).a(s1);
            ((djr)a.a()).b(a(0x7f08006a, new Object[] {
                album.getArtistString()
            }).toUpperCase(Locale.getDefault()));
            if (album.getTracks() != null)
            {
                Z.a(album.getTracks().getItems());
                return;
            }
        }
    }

    public final void a(Throwable throwable)
    {
        a(ag);
        Logger.a(throwable, throwable.getMessage(), new Object[0]);
    }

    public final void d()
    {
        super.d();
        af.e();
    }

}
