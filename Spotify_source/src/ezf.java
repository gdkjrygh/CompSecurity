// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.mobile.android.ui.NavigationItem;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.stuff.ContentViewManager;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;

public final class ezf extends al
    implements NavigationItem, fxy, gck
{

    private ggl Y;
    private fos Z;
    private gjf aa;
    private ContentViewManager ab;
    private gcj ac;
    private Flags ad;
    private FeatureIdentifier ae;
    private fuj af;
    private an ag;
    private eze b;

    public ezf()
    {
        Z = (fos)dmz.a(fos);
        dmz.a(for);
        af = new fuj() {

            final ezf a;

            public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
            {
                obj = (ezg)obj;
                ((ezg) (obj)).j();
                JVM INSTR tableswitch -1 3: default 44
            //                           -1 135
            //                           0 73
            //                           1 149
            //                           2 220
            //                           3 280;
                   goto _L1 _L2 _L3 _L4 _L5 _L6
_L2:
                break; /* Loop/switch isn't completed */
_L1:
                throw new AssertionError((new StringBuilder("Inbox type not available ")).append(((ezg) (obj)).j()).toString());
_L3:
                fve.a(a.k()).a(((ezg) (obj)).o(), ((ezg) (obj)).l()).a(ViewUri.G).a(true).a(true).a(true).a(false, null).a(ezf.a(a)).a(spotifycontextmenu);
_L8:
                spotifycontextmenu.a(new fui(this, ((ezg) (obj))) {

                    private ezg d;
                    private _cls1 e;

                    protected final volatile Object a()
                    {
                        return d;
                    }

                    protected final void a(Object obj, SpotifyContextMenu spotifycontextmenu)
                    {
                        obj = (ezg)obj;
                        spotifycontextmenu = new fuk(e.a.k(), ViewUri.G, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, spotifycontextmenu);
                        if (((ezg) (obj)).i())
                        {
                            String s = ((ezg) (obj)).g();
                            String s1 = ((ezg) (obj)).f();
                            spotifycontextmenu.a(0x7f11002e, 0x7f08020f, SpotifyIcon.ag).d = new fuk._cls17(spotifycontextmenu, s, s1);
                        }
                        long l = ((ezg) (obj)).b();
                        spotifycontextmenu.a(0x7f110035, 0x7f08022a, SpotifyIcon.ai).d = new fuk._cls26(spotifycontextmenu, l);
                    }

            
            {
                e = _pcls1;
                d = ezg1;
                super();
            }
                });
                return;
_L4:
                fve.a(a.k()).b(((ezg) (obj)).p(), ((ezg) (obj)).m()).a(ViewUri.G).a(true).a().b(false).a(ezf.a(a)).a(spotifycontextmenu);
                continue; /* Loop/switch isn't completed */
_L5:
                fve.a(a.k()).c(((ezg) (obj)).q(), ((ezg) (obj)).n()).a(ViewUri.G).a(false).a(ezf.a(a)).a(spotifycontextmenu);
                continue; /* Loop/switch isn't completed */
_L6:
                fve.a(a.k()).d(((ezg) (obj)).k(), ((ezg) (obj)).a(a.l())).a(ViewUri.G).a(false).a(false).a(ezf.a(a)).a(spotifycontextmenu);
                if (true) goto _L8; else goto _L7
_L7:
            }

            
            {
                a = ezf.this;
                super();
            }
        };
        ag = new an() {

            private ezf a;

            public final da a(Bundle bundle)
            {
                bundle = dtp.b;
                return new cu(a.k(), bundle, ezd.b, null, "time_added");
            }

            public final void a()
            {
                ezf.b(a).b(null);
            }

            public final void a(Object obj)
            {
                obj = (Cursor)obj;
                ezf.b(a).b(((Cursor) (obj)));
                if (((Cursor) (obj)).getCount() == 0)
                {
                    ezf.c(a).d(true);
                } else
                {
                    ezf.c(a).b(null);
                }
                if (!ezf.d(a).d())
                {
                    ezf.d(a).b();
                }
            }

            
            {
                a = ezf.this;
                super();
            }
        };
    }

    static Flags a(ezf ezf1)
    {
        return ezf1.ad;
    }

    public static ezf a(Flags flags)
    {
        ezf ezf1 = new ezf();
        fyw.a(ezf1, flags);
        return ezf1;
    }

    static eze b(ezf ezf1)
    {
        return ezf1.b;
    }

    static ContentViewManager c(ezf ezf1)
    {
        return ezf1.ab;
    }

    static gjf d(ezf ezf1)
    {
        return ezf1.aa;
    }

    public final void A()
    {
        super.A();
        Y.b();
    }

    public final com.spotify.mobile.android.ui.NavigationItem.NavigationGroup A_()
    {
        return com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.k;
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return "inbox";
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = (FrameLayout)layoutinflater.inflate(0x7f030082, viewgroup, false);
        viewgroup = layoutinflater.findViewById(0x102000a);
        ((ListView)viewgroup).setFastScrollEnabled(true);
        b = new eze(k(), af);
        a(((android.widget.ListAdapter) (b)));
        ((ListView)viewgroup).setOnItemLongClickListener(new fuf(k()));
        bundle = (EmptyView)layoutinflater.findViewById(0x7f110348);
        ab = (new gaa(k(), bundle, viewgroup)).b(SpotifyIcon.w, 0x7f08031f, 0x7f08031e).a(0x7f0802ad, 0x7f080320).a();
        ab.b = true;
        return layoutinflater;
    }

    public final String a(Context context, Flags flags)
    {
        return context.getString(0x7f080322);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        ad = fyw.a(this);
        ae = gnl.a(this);
        a(true);
        ac = new gcj(k(), this);
        Y = ggn.a(k(), ViewUri.G);
        aa = gjf.a(k(), "spotify:internal:inbox");
        aa.c(bundle);
    }

    public final void a(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
    }

    public final void a(ListView listview, View view, int i, long l)
    {
        view = (ezg)view.getTag();
        for.a(k(), view.b());
        view.j();
        JVM INSTR tableswitch -1 3: default 64
    //                   -1 150
    //                   0 94
    //                   1 267
    //                   2 328
    //                   3 389;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        throw new AssertionError((new StringBuilder("Inbox type not available ")).append(view.j()).toString());
_L3:
        if (!gex.a(ad)) goto _L8; else goto _L7
_L7:
        if (!view.r()) goto _L10; else goto _L9
_L9:
        listview = dtp.c;
        Z.a(k(), ViewUri.G, FeatureIdentifier.W, ae, listview, view.b(), ad);
_L2:
        return;
_L10:
        dmz.a(ggc);
        ggc.a(k(), 0x7f08057c);
        return;
_L8:
        if (view.r())
        {
            Object obj = k();
            listview = view.p();
            String s = view.m();
            view = view.k();
            obj = gms.a(((Context) (obj)), listview).a(s).a;
            ((Intent) (obj)).putExtra("album_uri", listview);
            ((Intent) (obj)).putExtra("lookup_track_uri", view);
            a(((Intent) (obj)));
            return;
        } else
        {
            dmz.a(ggc);
            ggc.a(k(), 0x7f080575);
            return;
        }
_L4:
        if (view.r())
        {
            a(gms.a(k(), view.k()).a(view.a(l())).a);
            return;
        } else
        {
            dmz.a(ggc);
            ggc.a(k(), 0x7f080575);
            return;
        }
_L5:
        if (view.r())
        {
            a(gms.a(k(), view.k()).a(view.a(l())).a);
            return;
        } else
        {
            dmz.a(ggc);
            ggc.a(k(), 0x7f080576);
            return;
        }
_L6:
        if (view.r())
        {
            a(gms.a(k(), view.k()).a(view.a(l())).a);
            return;
        } else
        {
            dmz.a(ggc);
            ggc.a(k(), 0x7f08057b);
            return;
        }
    }

    public final void c()
    {
        super.c();
        aa.a();
        u().a(0x7f110082, null, ag);
        u().a(0x7f110081, null, ac);
    }

    public final void d()
    {
        super.d();
        aa.c();
        u().a(0x7f110082);
        u().a(0x7f110081);
    }

    public final void d(boolean flag)
    {
        ContentViewManager contentviewmanager = ab;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        contentviewmanager.a(flag);
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        aa.a(bundle);
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.W;
    }

    public final void z()
    {
        super.z();
        Y.a();
    }
}
