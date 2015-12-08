// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.mobile.android.spotlets.playlist.activity.CreateRenamePlaylistActivity;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.view.FilterHeaderView;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class fdf extends al
    implements fon, foo, fxy
{

    private static final String Y[] = {
        "name", "folder_all_tracks_uri"
    };
    private static final List Z;
    private static final gfp aa;
    private Flags ab;
    private String ac;
    private String ad;
    private String ae;
    private boolean af;
    private ListView ag;
    private Parcelable ah;
    private ddi ai;
    private FilterHeaderView aj;
    private LoadingView ak;
    private ftf al;
    private EmptyView am;
    private String an;
    private gfp ao;
    private int ap;
    private ggl aq;
    private fuj ar;
    private gas as;
    private an at;
    private an au;
    fom b;

    public fdf()
    {
        ao = aa;
        ap = -1;
        ar = new fuj() {

            private fdf a;

            public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
            {
                obj = (dny)obj;
                fve.a(a.k()).a(((doc) (obj))).a(ViewUri.ak.a(fdf.b(a))).a(true).a(true).a(fdf.a(a)).a(spotifycontextmenu);
            }

            
            {
                a = fdf.this;
                super();
            }
        };
        as = new gas() {

            private fdf a;

            public final void a()
            {
            }

            public final void a(gfp gfp1)
            {
                fdf.a(a, gfp1);
                fdf.c(a);
            }

            public final void a(String s)
            {
                fdf.a(a, s);
                fdf.c(a);
            }

            public final void a(boolean flag)
            {
            }

            
            {
                a = fdf.this;
                super();
            }
        };
        at = new an() {

            private fdf a;

            public final da a(Bundle bundle)
            {
                bundle = dtl.a(fdf.b(a));
                return new cu(a.k(), bundle, fdf.H(), null, null);
            }

            public final void a()
            {
            }

            public final void a(Object obj)
            {
                obj = (Cursor)obj;
                if (((Cursor) (obj)).moveToFirst())
                {
                    fdf.b(a, ((Cursor) (obj)).getString(0));
                    fdf.c(a, ((Cursor) (obj)).getString(1));
                    a.g().putString("title", fdf.d(a));
                    fdf.e(a);
                }
            }

            
            {
                a = fdf.this;
                super();
            }
        };
        au = new an() {

            private fdf a;

            public final da a(Bundle bundle)
            {
                bundle = fdf.b(a);
                String s = fdf.o(a);
                bundle = dtl.a(bundle, com.spotify.mobile.android.provider.Metadata.PlaylistFilter.a, s);
                return new cu(a.k(), bundle, dny.a, null, fdf.p(a).a());
            }

            public final void a()
            {
            }

            public final void a(Object obj)
            {
                byte byte0;
                byte byte1;
                byte1 = 8;
                byte0 = 1;
                obj = (Cursor)obj;
                if (!duc.a(((Cursor) (obj)))) goto _L2; else goto _L1
_L1:
                if (a.b != null && a.b.b() && duc.a(((Cursor) (obj))) && ((Cursor) (obj)).moveToFirst())
                {
                    a.b.a(((Cursor) (obj)).getString(3), ((Cursor) (obj)).getString(1), true);
                }
                fdf.f(a).b(((Cursor) (obj)));
                fdf.g(a).b();
                Object obj1;
                int i1;
                if (((Cursor) (obj)).getCount() != 0 || fdf.h(a).b())
                {
                    byte0 = 0;
                }
                obj1 = fdf.i(a);
                if (byte0 != 0)
                {
                    i1 = 0;
                } else
                {
                    i1 = 8;
                }
                ((EmptyView) (obj1)).setVisibility(i1);
                obj1 = fdf.j(a);
                if (byte0 != 0)
                {
                    byte0 = byte1;
                } else
                {
                    byte0 = 0;
                }
                ((ListView) (obj1)).setVisibility(byte0);
                if (((Cursor) (obj)).getCount() <= 0) goto _L2; else goto _L3
_L3:
                if (fdf.k(a) == -1) goto _L5; else goto _L4
_L4:
                fdf.j(a).smoothScrollToPosition(fdf.k(a));
                fdf.l(a);
_L7:
                fdf.n(a);
_L2:
                return;
_L5:
                if (fdf.m(a) != null)
                {
                    fdf.j(a).onRestoreInstanceState(fdf.m(a));
                }
                if (true) goto _L7; else goto _L6
_L6:
            }

            
            {
                a = fdf.this;
                super();
            }
        };
    }

    static String[] H()
    {
        return Y;
    }

    private void J()
    {
        Object obj = null;
        String s = obj;
        if (!af)
        {
            s = obj;
            if (b.a())
            {
                s = b.a;
            }
        }
        if (TextUtils.isEmpty(s))
        {
            s = a(k(), ab);
        }
        ((fpe)k()).a(this, s);
        ((fpe)k()).P_();
    }

    private static Intent a(Context context, String s, String s1, String s2, String s3, int i1)
    {
        context = gms.a(context, s).a(s1).a;
        context.putExtra("folder_uri", s);
        context.putExtra("title", s1);
        context.putExtra("selected_index", i1);
        context.putExtra("sub_fragment_uri", s2);
        context.putExtra("sub_fragment_name", s3);
        return context;
    }

    static Flags a(fdf fdf1)
    {
        return fdf1.ab;
    }

    public static fdf a(String s, String s1, boolean flag, Flags flags)
    {
        Bundle bundle = new Bundle();
        bundle.putString("folder_uri", s);
        bundle.putString("title", s1);
        bundle.putBoolean("is_sub_fragment", flag);
        s = new fdf();
        s.f(bundle);
        fyw.a(s, flags);
        return s;
    }

    static gfp a(fdf fdf1, gfp gfp1)
    {
        fdf1.ao = gfp1;
        return gfp1;
    }

    static String a(fdf fdf1, String s)
    {
        fdf1.an = s;
        return s;
    }

    static String b(fdf fdf1)
    {
        return fdf1.ac;
    }

    static String b(fdf fdf1, String s)
    {
        fdf1.ae = s;
        return s;
    }

    public static boolean b(Intent intent)
    {
        return intent.hasExtra("folder_uri");
    }

    static String c(fdf fdf1, String s)
    {
        fdf1.ad = s;
        return s;
    }

    static void c(fdf fdf1)
    {
        fdf1.u().b(0x7f11007e, null, fdf1.au);
    }

    static String d(fdf fdf1)
    {
        return fdf1.ae;
    }

    static void e(fdf fdf1)
    {
        fdf1.J();
    }

    static ftf f(fdf fdf1)
    {
        return fdf1.al;
    }

    static LoadingView g(fdf fdf1)
    {
        return fdf1.ak;
    }

    static FilterHeaderView h(fdf fdf1)
    {
        return fdf1.aj;
    }

    static EmptyView i(fdf fdf1)
    {
        return fdf1.am;
    }

    static ListView j(fdf fdf1)
    {
        return fdf1.ag;
    }

    static int k(fdf fdf1)
    {
        return fdf1.ap;
    }

    static int l(fdf fdf1)
    {
        fdf1.ap = -1;
        return -1;
    }

    static Parcelable m(fdf fdf1)
    {
        return fdf1.ah;
    }

    static Parcelable n(fdf fdf1)
    {
        fdf1.ah = null;
        return null;
    }

    static String o(fdf fdf1)
    {
        return fdf1.an;
    }

    static gfp p(fdf fdf1)
    {
        return fdf1.ao;
    }

    public final void A()
    {
        super.A();
        aq.b();
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return (new StringBuilder("folder:")).append(ac).toString();
    }

    public final Fragment a(String s, String s1)
    {
        s = new SpotifyLink(s);
        new foe();
        return foe.a(s, s1, ab, FeatureIdentifier.A).F();
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        ab = fyw.a(this);
        viewgroup = (ViewGroup)layoutinflater.inflate(0x7f0300d3, viewgroup, false);
        ag = (ListView)viewgroup.findViewById(0x102000a);
        bundle = (ViewGroup)ag.getParent();
        ag.setFastScrollEnabled(true);
        ag.setVisibility(4);
        al = new ftf(k(), ar);
        ai = dds.a(k(), null);
        ai.a(true);
        ai.a(b(0x7f0802f5));
        ImageView imageview = ai.d();
        imageview.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        dfz dfz1 = new dfz(k(), SpotifyIcon.ac);
        dfz1.a(dgo.b(k(), 0x7f0101c7));
        imageview.setImageDrawable(dfz1);
        aj = FilterHeaderView.a(layoutinflater, an, Z, ao, as, ag);
        aj.setBackgroundColor(gcg.b(k(), 0x7f0f0019));
        ag.addHeaderView(ai.a());
        a(((android.widget.ListAdapter) (al)));
        ak = LoadingView.a(LayoutInflater.from(k()));
        bundle.addView(ak);
        am = new EmptyView(k());
        am.b().setSingleLine(false);
        am.b().setEllipsize(null);
        am.a(k().getString(0x7f0803dc));
        if (!ggi.b(k()))
        {
            layoutinflater = new dfz(k(), SpotifyIcon.G, k().getResources().getDimensionPixelSize(0x7f0c00d8));
            layoutinflater.a(dgo.b(k(), 0x7f0101ca));
            am.a(layoutinflater);
        }
        layoutinflater = dgp.b(k(), viewgroup);
        layoutinflater.setId(0x7f110022);
        layoutinflater.setText(l().getString(0x7f0803db).toUpperCase(Locale.getDefault()));
        layoutinflater.setSingleLine(true);
        am.a(layoutinflater);
        layoutinflater.setOnClickListener(new android.view.View.OnClickListener() {

            private fdf a;

            public final void onClick(View view)
            {
                view = CreateRenamePlaylistActivity.b(a.k(), fdf.b(a), fdf.a(a));
                a.k().startActivity(view);
            }

            
            {
                a = fdf.this;
                super();
            }
        });
        am.setVisibility(8);
        bundle.addView(am);
        ag.setOnItemLongClickListener(new fuf(k()));
        ak.a();
        return viewgroup;
    }

    public final String a(Context context, Flags flags)
    {
        if (g().getString("title") == null)
        {
            return context.getString(0x7f0802dd);
        } else
        {
            return g().getString("title");
        }
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        Bundle bundle1 = g();
        ac = bundle1.getString("folder_uri");
        ae = bundle1.getString("title");
        af = bundle1.getBoolean("is_sub_fragment");
        ap = bundle1.getInt("selected_index", -1);
        ab = fyw.a(this);
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
            ao = gfp.a(bundle.getString("sort_order"), Z);
            an = bundle.getString("filter");
            ah = bundle.getParcelable("list");
        }
        if (an == null)
        {
            an = "";
        }
        if (ao == null)
        {
            ao = aa;
        }
        boolean flag;
        if (!af)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
        bundle = ViewUri.ak.a(ac);
        aq = ggn.a(k(), bundle);
    }

    public final void a(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
        b(menu);
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        if (!af)
        {
            b = new fom(this, this, y());
            b.a(bundle);
        }
    }

    public final void a(ListView listview, View view, int i1, long l1)
    {
        if (!ggi.a(view, ai.a())) goto _L2; else goto _L1
_L1:
        if (ad == null) goto _L4; else goto _L3
_L3:
        if (!af) goto _L6; else goto _L5
_L5:
        a(a(((Context) (k())), ac, ae, ad, ae, -1));
_L4:
        return;
_L6:
        if (b.a())
        {
            b.a(ad, ae, false);
            return;
        } else
        {
            a(gms.a(k(), ad).a(ae).a);
            return;
        }
_L2:
        if (!ggi.a(view, aj))
        {
            listview = ((ListView) (view.getTag()));
            if (listview instanceof doc)
            {
                listview = (doc)listview;
                if (listview.t() && !TextUtils.isEmpty(listview.a()))
                {
                    if (af)
                    {
                        a(a(((Context) (k())), ac, ae, listview.a(), listview.b(), i1));
                        return;
                    }
                    if (b.a())
                    {
                        b.a(listview.a(), listview.b(), false);
                        return;
                    } else
                    {
                        a(gms.a(k(), listview.a()).a(listview.b()).a);
                        return;
                    }
                } else
                {
                    dmz.a(ggc);
                    ggc.a(k(), 0x7f08057b);
                    return;
                }
            }
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    public final void a(String s)
    {
        if (s != null)
        {
            if ((new SpotifyLink(s)).c == com.spotify.mobile.android.util.SpotifyLink.LinkType.U)
            {
                ai.a().setActivated(true);
                al.a(null);
            } else
            {
                ai.a().setActivated(false);
                al.a(s);
            }
        } else
        {
            ai.a().setActivated(false);
            al.a(null);
        }
        J();
    }

    public final void b(Menu menu)
    {
        if (!af)
        {
            fzr.a(k(), menu, ViewUri.ak.a(ac), ac, ab);
        }
    }

    public final void c()
    {
        super.c();
        u().a(0x7f11007d, null, at);
        u().a(0x7f11007e, null, au);
    }

    public final void d()
    {
        super.d();
        u().a(0x7f11007d);
        u().a(0x7f11007e);
    }

    public final void e()
    {
        FilterHeaderView.a(aj);
        super.e();
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putString("sort_order", ao.a());
        bundle.putString("filter", an);
        if (ag != null)
        {
            bundle.putParcelable("list", ag.onSaveInstanceState());
        }
        if (b != null)
        {
            b.b(bundle);
        }
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.A;
    }

    public final void z()
    {
        super.z();
        aq.a();
    }

    static 
    {
        aa = new gfp("", 0x7f08051f, false);
        ArrayList arraylist = new ArrayList();
        Z = arraylist;
        arraylist.add(new gfp("name", 0x7f080521));
        Z.add(aa);
    }
}
