// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.view.FilterHeaderView;
import com.spotify.mobile.android.ui.view.ShufflePlayHeaderView;
import com.spotify.mobile.android.ui.view.StickyHeaderView;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.internal.provider.SpotifyProvider;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.ArrayList;
import java.util.List;

public final class fdg extends al
    implements fxy
{

    private static final List Y;
    private static final gfp Z;
    private static final ftt aq = new ftt() {

        public final boolean a()
        {
            return true;
        }

        public final boolean b()
        {
            return false;
        }

    };
    private static final String b[] = {
        "name"
    };
    private ListView aa;
    private Parcelable ab;
    private ShufflePlayHeaderView ac;
    private String ad;
    private String ae;
    private String af;
    private gfp ag;
    private FilterHeaderView ah;
    private fts ai;
    private ggl aj;
    private gjf ak;
    private Flags al;
    private FeatureIdentifier am;
    private fos an;
    private fop ao;
    private final fuj ap = new fuj() {

        private fdg a;

        public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
        {
            obj = (dnz)obj;
            fve.a(a.k()).a(((dnz) (obj)).e, ((dnz) (obj)).b).a(ViewUri.al).a(true).a(true).a(true).a(false, null).a(fdg.b(a)).a(fdg.a(a)).a(spotifycontextmenu);
        }

            
            {
                a = fdg.this;
                super();
            }
    };
    private gas ar;
    private an as;
    private an at;
    private android.view.View.OnClickListener au;

    public fdg()
    {
        ag = Z;
        an = (fos)dmz.a(fos);
        ao = (fop)dmz.a(fop);
        ar = new gas() {

            private fdg a;

            public final void a()
            {
            }

            public final void a(gfp gfp1)
            {
                fdg.a(a, gfp1);
                fdg.c(a);
            }

            public final void a(String s)
            {
                fdg.a(a, s);
                fdg.c(a);
            }

            public final void a(boolean flag)
            {
            }

            
            {
                a = fdg.this;
                super();
            }
        };
        as = new an() {

            private fdg a;

            public final da a(Bundle bundle)
            {
                bundle = fdg.a(a);
                bundle = Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/folder-union/").append(Uri.encode(bundle)).toString());
                return new cu(a.k(), bundle, fdg.H(), null, null);
            }

            public final void a()
            {
            }

            public final void a(Object obj)
            {
                obj = (Cursor)obj;
                if (((Cursor) (obj)).moveToFirst())
                {
                    fdg.d(a).b();
                    fdg.b(a, ((Cursor) (obj)).getString(0));
                    a.g().putString("title", fdg.e(a));
                    ((fpe)a.k()).a(a, a.k().getString(0x7f0802df, new Object[] {
                        fdg.e(a)
                    }));
                    ((fpe)a.k()).P_();
                }
            }

            
            {
                a = fdg.this;
                super();
            }
        };
        at = new an() {

            private fdg a;

            public final da a(Bundle bundle)
            {
                bundle = fdg.a(a);
                String s = fdg.k(a);
                bundle = Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/folder-union/").append(Uri.encode(bundle)).append("/tracks?filter=").append(Uri.encode(s)).toString());
                return new cu(a.k(), bundle, dnz.a, null, fdg.l(a).a());
            }

            public final void a()
            {
            }

            public final void a(Object obj)
            {
                Object obj1 = (Cursor)obj;
                fdg.f(a).b(((Cursor) (obj1)));
                fdg.d(a).b();
                if (fdg.g(a) != null && ((Cursor) (obj1)).getCount() > 0)
                {
                    fdg.h(a).onRestoreInstanceState(fdg.g(a));
                    fdg.i(a);
                }
                obj = fdg.j(a);
                int i1 = ((Cursor) (obj1)).getCount();
                obj1 = fdg.b(a);
                boolean flag;
                if (i1 > 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ((ShufflePlayHeaderView) (obj)).a(flag, ((Flags) (obj1)));
            }

            
            {
                a = fdg.this;
                super();
            }
        };
        au = new android.view.View.OnClickListener() {

            private fdg a;

            public final void onClick(View view)
            {
                view = ViewUri.al;
                Object obj = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.U);
                fdg.m(a);
                fop.a(a.k(), view, ((ClientEvent) (obj)));
                obj = dtm.a(fdg.a(a));
                fdg.o(a);
                u u1 = a.k();
                com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview = com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a;
                FeatureIdentifier featureidentifier = FeatureIdentifier.z;
                FeatureIdentifier featureidentifier1 = fdg.n(a);
                fdg.b(a);
                fos.a(u1, view, subview, featureidentifier, featureidentifier1, ((Uri) (obj)));
            }

            
            {
                a = fdg.this;
                super();
            }
        };
    }

    static String[] H()
    {
        return b;
    }

    public static fdg a(String s, String s1, Flags flags)
    {
        Bundle bundle = new Bundle();
        bundle.putString("folder_uri", s);
        bundle.putString("title", s1);
        s = new fdg();
        s.f(bundle);
        fyw.a(s, flags);
        return s;
    }

    static gfp a(fdg fdg1, gfp gfp1)
    {
        fdg1.ag = gfp1;
        return gfp1;
    }

    static String a(fdg fdg1)
    {
        return fdg1.ad;
    }

    static String a(fdg fdg1, String s)
    {
        fdg1.af = s;
        return s;
    }

    static Flags b(fdg fdg1)
    {
        return fdg1.al;
    }

    static String b(fdg fdg1, String s)
    {
        fdg1.ae = s;
        return s;
    }

    static void c(fdg fdg1)
    {
        fdg1.u().b(0x7f11007f, null, fdg1.at);
    }

    static gjf d(fdg fdg1)
    {
        return fdg1.ak;
    }

    static String e(fdg fdg1)
    {
        return fdg1.ae;
    }

    static fts f(fdg fdg1)
    {
        return fdg1.ai;
    }

    static Parcelable g(fdg fdg1)
    {
        return fdg1.ab;
    }

    static ListView h(fdg fdg1)
    {
        return fdg1.aa;
    }

    static Parcelable i(fdg fdg1)
    {
        fdg1.ab = null;
        return null;
    }

    static ShufflePlayHeaderView j(fdg fdg1)
    {
        return fdg1.ac;
    }

    static String k(fdg fdg1)
    {
        return fdg1.af;
    }

    static gfp l(fdg fdg1)
    {
        return fdg1.ag;
    }

    static fop m(fdg fdg1)
    {
        return fdg1.ao;
    }

    static FeatureIdentifier n(fdg fdg1)
    {
        return fdg1.am;
    }

    static fos o(fdg fdg1)
    {
        return fdg1.an;
    }

    public final void A()
    {
        super.A();
        aj.b();
    }

    public final void B()
    {
        super.B();
        ak.c();
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return (new StringBuilder("folder:")).append(ad).append(":tracks").toString();
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        al = fyw.a(this);
        viewgroup = layoutinflater.inflate(0x7f0300d3, viewgroup, false);
        aa = (ListView)viewgroup.findViewById(0x102000a);
        aa.setFastScrollEnabled(true);
        ai = new fts(k(), aq, ap, al);
        a(((android.widget.ListAdapter) (ai)));
        ah = FilterHeaderView.a(layoutinflater, af, Y, ag, ar, aa);
        ah.setBackgroundColor(gcg.b(k(), 0x7f0f0019));
        ac = ShufflePlayHeaderView.a(k(), aa, au);
        aa.addHeaderView(((StickyHeaderView) (ac)).c);
        aa.setOnItemLongClickListener(new fuf(k()));
        return viewgroup;
    }

    public final String a(Context context, Flags flags)
    {
        if (ae == null)
        {
            return context.getString(0x7f0802de);
        } else
        {
            return context.getString(0x7f0802df, new Object[] {
                ae
            });
        }
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        ad = g().getString("folder_uri");
        ae = g().getString("title");
        af = "";
        al = fyw.a(this);
        am = gnl.a(this);
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
            ag = gfp.a(bundle.getString("sort_order"), Y);
            af = bundle.getString("filter");
            ab = bundle.getParcelable("list");
        }
        if (af == null)
        {
            af = "";
        }
        if (ag == null)
        {
            ag = Z;
        }
        a(true);
        aj = ggn.a(k(), ViewUri.al);
        ak = gjf.a(k(), ViewUri.al.toString());
        ak.c(bundle);
    }

    public final void a(ListView listview, View view, int i1, long l1)
    {
        view = dtm.a(ad);
        listview = ViewUri.al;
        if (gex.a(al))
        {
            ClientEvent clientevent = ClientEventFactory.a(view, l1);
            fop.a(k(), listview, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, clientevent);
            an.a(k(), ViewUri.al, FeatureIdentifier.z, am, view, l1, al);
            return;
        } else
        {
            view = ClientEventFactory.b(view, l1);
            fop.a(k(), listview, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, view);
            ac.a();
            return;
        }
    }

    public final void c()
    {
        super.c();
        u().a(0x7f11007d, null, as);
        u().a(0x7f11007f, null, at);
    }

    public final void d()
    {
        super.c();
        u().a(0x7f11007d);
        u().a(0x7f11007f);
    }

    public final void e()
    {
        FilterHeaderView.a(ah);
        super.e();
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putString("sort_order", ag.a());
        bundle.putString("filter", af);
        if (aa != null)
        {
            bundle.putParcelable("list", aa.onSaveInstanceState());
        }
        ak.a(bundle);
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.z;
    }

    public final void z()
    {
        super.z();
        aj.a();
        ak.a();
    }

    static 
    {
        Z = new gfp("name", 0x7f080521);
        ArrayList arraylist = new ArrayList();
        Y = arraylist;
        arraylist.add(Z);
    }
}
