// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.EditText;
import android.widget.ListView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.spotlets.eventshub.locationsearch.model.Locations;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.stuff.ContentViewManager;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class esa extends al
    implements android.widget.AbsListView.OnScrollListener, esd, fxy
{

    public static final String b;
    esc Y;
    private fgq Z;
    private ContentViewManager aa;
    private ery ab;
    private LoadingView ac;
    private Resolver ad;
    private fhb ae;

    public esa()
    {
        ae = new fhb() {

            private esa a;

            public final void a(String s)
            {
                esc esc1 = a.Y;
                if (esc1.g == null)
                {
                    esc1.g = esc1.e.a(new hgo(TimeUnit.MILLISECONDS, ((dup)dmz.a(dup)).b())).a(esc1.f).a(esc1.h);
                }
                esc1.e.onNext(s);
            }

            public final void a(boolean flag)
            {
            }

            public final void b(String s)
            {
                esc esc1 = a.Y;
                esc1.j = s;
                if (!TextUtils.isEmpty(esc1.j))
                {
                    esc1.a.L();
                    esc1.a.J();
                    esc1.b.a(esc1.l, s);
                }
            }

            
            {
                a = esa.this;
                super();
            }
        };
    }

    public static esa H()
    {
        return new esa();
    }

    public final void A()
    {
        super.A();
        Z.b(ae);
    }

    public final void B()
    {
        super.B();
        esc esc1 = Y;
        if (esc1.g != null)
        {
            esc1.g.unsubscribe();
        }
        if (!esc1.i && !TextUtils.isEmpty(esc1.j))
        {
            esb esb1 = esc1.d;
            String s = esc1.j;
            int i = esc1.k.getLocations().size();
            if (!TextUtils.isEmpty(s))
            {
                ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.dG);
                clientevent.a("query", s);
                clientevent.a("count", Integer.toString(i));
                dmz.a(fop);
                fop.a(esb1.a, ViewUri.R, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.Z, clientevent);
            }
        }
        ad.destroy();
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return b;
    }

    public final void J()
    {
        View view = y();
        if (view != null)
        {
            ggp.a(view);
        }
    }

    public final void K()
    {
        ((fpe)k()).R_().c();
    }

    public final void L()
    {
        if (!o())
        {
            return;
        } else
        {
            aa.a(ac);
            return;
        }
    }

    public final void M()
    {
        if (!o())
        {
            return;
        } else
        {
            aa.b(null);
            aa.d(true);
            return;
        }
    }

    public final void N()
    {
        if (!o())
        {
            return;
        } else
        {
            aa.b(null);
            aa.c(true);
            return;
        }
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = (ViewGroup)layoutinflater.inflate(0x7f0300d2, viewgroup, false);
        ac = LoadingView.a(layoutinflater);
        viewgroup.addView(ac);
        return viewgroup;
    }

    public final String a(Context context, Flags flags)
    {
        return "";
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        bundle = k().getApplicationContext();
        ad = Cosmos.getResolver(bundle);
        Y = new esc(this, new erv(ad, new Handler()), new erz(bundle), new esb(bundle));
        s();
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        Z = new fgq((rf)k());
        Z.a(0x7f0801b2);
        Z.a(true);
        ab = new ery(k());
        a(((android.widget.ListAdapter) (ab)));
        aa = (new gaa(k(), (EmptyView)view.findViewById(0x7f110348), z_())).b(SpotifyIcon.N, 0x7f0801b4, 0x7f0801b3).b(0x7f0801b1, 0x7f0801b0).a();
        z_().setOnScrollListener(this);
    }

    public final void a(ListView listview, View view, int i, long l)
    {
        super.a(listview, view, i, l);
        listview = Y;
        view = (com.spotify.mobile.android.spotlets.eventshub.locationsearch.model.Locations.Location)view.getTag();
        listview.i = true;
        i = ((esc) (listview)).k.getLocations().indexOf(view);
        int j = ((esc) (listview)).k.getLocations().size();
        ((esc) (listview)).c.a.b().a(erz.b, view.getGeoHash()).a(erz.c, view.getLocationName()).a();
        esb esb1 = ((esc) (listview)).d;
        String s = ((esc) (listview)).j;
        if (view != null)
        {
            ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.dH);
            clientevent.a("query", s);
            clientevent.a("name", view.getLocationName());
            clientevent.a("geohash", view.getGeoHash());
            clientevent.a("rank", String.valueOf(i));
            clientevent.a("count", String.valueOf(j));
            dmz.a(fop);
            fop.a(esb1.a, ViewUri.R, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.Z, clientevent);
        }
        ((esc) (listview)).a.K();
    }

    public final void a(Locations locations)
    {
        if (!o())
        {
            return;
        } else
        {
            aa.b(null);
            ab.clear();
            ab.addAll(locations.getLocations());
            return;
        }
    }

    public final void c()
    {
        super.c();
        ad.connect();
    }

    public final void d()
    {
        super.d();
        ad.disconnect();
    }

    public final void e()
    {
        super.e();
        Z.d();
    }

    public final void onScroll(AbsListView abslistview, int i, int j, int k)
    {
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (i == 1)
        {
            Y.a.J();
        }
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.aE;
    }

    public final void z()
    {
        super.z();
        Z.a(ae);
        esc esc1 = Y;
        if (!TextUtils.isEmpty(esc1.j))
        {
            esc1.a();
        }
        if (TextUtils.isEmpty(Z.b()))
        {
            Object obj = Z;
            ((fgq) (obj)).b.requestFocus();
            obj = ((fgq) (obj)).b;
            ((View) (obj)).postDelayed(new ggp._cls1(((View) (obj))), 100L);
        }
    }

    static 
    {
        b = ViewUri.R.toString();
    }
}
