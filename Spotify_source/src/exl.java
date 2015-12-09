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
import com.spotify.mobile.android.spotlets.openaccess.model.Artist;
import com.spotify.mobile.android.spotlets.openaccess.model.Image;
import com.spotify.mobile.android.spotlets.openaccess.model.TopTracks;
import com.spotify.mobile.android.spotlets.openaccess.model.Track;
import com.spotify.mobile.android.ui.stuff.ContentViewManager;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import java.util.HashMap;

public final class exl extends exg
    implements exn
{

    private static final exp aj = new exp() {

        public final boolean a()
        {
            return true;
        }

        public final boolean b()
        {
            return false;
        }

    };
    private exo Y;
    private ftg Z;
    private dja a;
    private LoadingView aa;
    private ContentViewManager ab;
    private boolean ac;
    private Button ad;
    private exw ae;
    private Verified af;
    private exv ag;
    private gdy ah;
    private exx ai;
    private exm b;

    public exl()
    {
        ae = (exw)dmz.a(exw);
        ag = (exv)dmz.a(exv);
        ah = (gdy)dmz.a(gdy);
        ai = new exx() {

            private exl a;

            public final void a(Track track, float f1)
            {
                track.setProgress(f1);
                exz.a(exl.a(a).f(), track, f1);
            }

            
            {
                a = exl.this;
                super();
            }
        };
    }

    static dja a(exl exl1)
    {
        return exl1.a;
    }

    public static exl a(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("uri", s);
        s = new exl();
        s.f(bundle);
        return s;
    }

    private void a()
    {
        if (ah.a())
        {
            ab.a(false);
            ab.c(false);
            ab.a(aa);
            a.b().setVisibility(8);
            if (b == null)
            {
                b = new exm(k().getApplicationContext(), this);
            }
            ac = false;
            Object obj = new SpotifyLink(g().getString("uri"));
            exm exm1 = b;
            obj = ((SpotifyLink) (obj)).b();
            exm1.a.a((new StringBuilder("/v1/artists/")).append(((String) (obj))).toString(), new HashMap(), new exm._cls1(exm1));
            HashMap hashmap = new HashMap();
            hashmap.put("country", "US");
            exm1.a.a((new StringBuilder("/v1/artists/")).append(((String) (obj))).append("/top-tracks").toString(), hashmap, new exm._cls2(exm1));
            return;
        } else
        {
            ab.c(false);
            ab.a(true);
            return;
        }
    }

    static Verified b(exl exl1)
    {
        return exl1.af;
    }

    static exv c(exl exl1)
    {
        return exl1.ag;
    }

    static exo d(exl exl1)
    {
        return exl1.Y;
    }

    static exx e(exl exl1)
    {
        return exl1.ai;
    }

    static exw f(exl exl1)
    {
        return exl1.ae;
    }

    static ftg g(exl exl1)
    {
        return exl1.Z;
    }

    static void h(exl exl1)
    {
        exl1.a();
    }

    public final void A()
    {
        super.A();
        ae.e();
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.a(layoutinflater, viewgroup, bundle);
        viewgroup = (ViewGroup)layoutinflater.findViewById(0x7f11032d);
        Object obj = k();
        Y = new exo(k(), aj);
        Z = new ftg(((android.content.Context) (obj)));
        Z.a(Y, 0x7f08034c, 0);
        bundle = new SpotifyLink(g().getString("uri"));
        af = ViewUri.an.a(bundle.d());
        ad = gad.a(((android.content.Context) (obj)), null);
        a = dja.a(k()).b().a().b(ad).a(true).a(this);
        ad.setOnClickListener(new android.view.View.OnClickListener(bundle) {

            private SpotifyLink a;
            private exl b;

            public final void onClick(View view)
            {
                exl.c(b).a(exl.b(b), a.d());
                exl.f(b).a(exl.d(b).a(), exl.d(b), exl.e(b));
                b.b(exl.b(b));
            }

            
            {
                b = exl.this;
                a = spotifylink;
                super();
            }
        });
        a.f().setAdapter(Z);
        a.f().setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            private exl a;

            public final void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                i -= exl.a(a).f().getHeaderViewsCount();
                if (exl.g(a).b(i) == 0)
                {
                    i = exl.g(a).a(i, 0);
                    adapterview = (Track)exl.d(a).getItem(i);
                    exl.c(a).a(exl.b(a), adapterview.getUri(), i);
                    if (adapterview.isCurrentTrack())
                    {
                        exl.f(a).d();
                    } else
                    {
                        exl.f(a).a(exl.d(a).a(i), exl.d(a), exl.e(a));
                    }
                    a.b(exl.b(a));
                }
            }

            
            {
                a = exl.this;
                super();
            }
        });
        obj = new FrameLayout(((android.content.Context) (obj)));
        ((ViewGroup) (obj)).setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        ((ViewGroup) (obj)).addView(a.b());
        Object obj1 = ext.a(k(), new android.view.View.OnClickListener() {

            private exl a;

            public final void onClick(View view)
            {
                exl.h(a);
            }

            
            {
                a = exl.this;
                super();
            }
        });
        ((ViewGroup) (obj)).addView(((View) (obj1)));
        aa = LoadingView.a(LayoutInflater.from(k()));
        ((ViewGroup) (obj)).addView(aa);
        ab = (new gaa(k(), ((com.spotify.android.paste.widget.EmptyView) (obj1)), a.b())).a(0x7f08038c, 0x7f08038b).b(0x7f08038f, 0x7f08038d).a();
        a();
        obj1 = ag;
        ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.R, com.spotify.mobile.android.util.ClientEvent.SubEvent.aW);
        clientevent.a("installation_id", ((exv) (obj1)).a.f());
        fop.a(ViewUri.an.a(bundle.d()), com.spotify.mobile.android.util.viewuri.ViewUri.SubView.A, clientevent);
        viewgroup.addView(((View) (obj)));
        return layoutinflater;
    }

    public final void a(Artist artist)
    {
        if (!o())
        {
            return;
        }
        if (ac)
        {
            ab.b(null);
        } else
        {
            ac = true;
        }
        if (artist.containsImage())
        {
            String s = artist.getLargestImage().getImageUrl();
            dmz.a(gjj);
            gji gji1 = gjj.a(k());
            gji1.a(a.d(), s);
            gji1.c(a.c(), s);
        } else
        {
            a.c().setImageDrawable(dff.a(k()));
        }
        ((djq)a.a()).a(artist.getName());
    }

    public final void a(TopTracks toptracks)
    {
        if (!o())
        {
            return;
        }
        if (ac)
        {
            ab.b(null);
        } else
        {
            ac = true;
        }
        Y.a(toptracks.getTracks());
    }

    public final void a(Throwable throwable)
    {
        a(af);
        Logger.a(throwable, throwable.getMessage(), new Object[0]);
    }

    public final void b(Throwable throwable)
    {
        a(af);
        Logger.a(throwable, throwable.getMessage(), new Object[0]);
    }

    public final void d()
    {
        super.d();
        ae.e();
    }

}
