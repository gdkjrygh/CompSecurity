// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.google.common.base.Optional;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.spotlets.collection.service.CollectionService;
import com.spotify.mobile.android.spotlets.collection.util.CollectionState;
import com.spotify.mobile.android.spotlets.phoenixalbum.model.AlbumModel;
import com.spotify.mobile.android.ui.adapter.AlbumsAdapter;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.view.DownloadHeaderView;
import com.spotify.mobile.android.ui.view.ShufflePlayHeaderView;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;

public class eyz extends fzu
{

    private static final com.spotify.mobile.android.ui.adapter.AlbumsAdapter.Options G = new com.spotify.mobile.android.ui.adapter.AlbumsAdapter.Options() {

        public final com.spotify.mobile.android.ui.adapter.AlbumsAdapter.Options.ArtistViewType a()
        {
            return com.spotify.mobile.android.ui.adapter.AlbumsAdapter.Options.ArtistViewType.a;
        }

        public final boolean b()
        {
            return false;
        }

    };
    private static final ftt H = new ftt() {

        public final boolean a()
        {
            return false;
        }

        public final boolean b()
        {
            return false;
        }

    };
    private String A;
    private ggl B;
    private fop C;
    private fos D;
    private final fuj E = new fuj() {

        private eyz a;

        public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
        {
            obj = (dnz)obj;
            fve.a(((fzv) (a)).p).a(((dnz) (obj)).e, ((dnz) (obj)).b).a(eyz.b(a)).a(false).a(true).a(true).a(false, null).a(eyz.a(a)).a(spotifycontextmenu);
        }

            
            {
                a = eyz.this;
                super();
            }
    };
    private final fuj F = new fuj() {

        private eyz a;

        public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
        {
            obj = (dnv)obj;
            fve.a(((fzv) (a)).p).b(((dnv) (obj)).a(), ((dnv) (obj)).h()).a(eyz.b(a)).a(true).a().b(false).a(eyz.c(a)).a(spotifycontextmenu);
        }

            
            {
                a = eyz.this;
                super();
            }
    };
    private gap I;
    private final JsonCallbackReceiver J = new JsonCallbackReceiver(new Handler(), com/spotify/mobile/android/spotlets/phoenixalbum/model/AlbumModel) {

        private eyz a;

        protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
        {
            Logger.b(throwable, "Exception when fetching Hermes content: %s", new Object[] {
                errorcause.name()
            });
        }

        protected final void onResolved(Response response, Object obj)
        {
            response = (AlbumModel)obj;
            if (((AlbumModel) (response)).releaseWindow != null && ((AlbumModel) (response)).releaseWindow.windowed)
            {
                eyz.g(a).b(new int[] {
                    1
                });
                response = eyz.h(a);
                if (((ezb) (response)).b != null)
                {
                    ((ezb) (response)).b.setEnabled(false);
                }
                if (((ezb) (response)).k != null)
                {
                    ((ezb) (response)).k.setEnabled(false);
                }
            }
        }

            
            {
                a = eyz.this;
                super(handler, class1);
            }
    };
    private evs K;
    private evr L;
    private ewi M;
    private an N;
    private ggf O;
    Optional a;
    ezb b;
    TextView c;
    am d;
    ftg e;
    String f;
    String g;
    boolean h;
    FeatureIdentifier i;
    evv j;
    ewh k;
    an l;
    private final Uri r;
    private final evx s = new evx();
    private final Optional t;
    private gge u;
    private DownloadHeaderView v;
    private fts w;
    private AlbumsAdapter x;
    private int y;
    private final Verified z;

    public eyz(Context context, ViewGroup viewgroup, Fragment fragment, am am1, String s1, FeatureIdentifier featureidentifier, Flags flags, 
            boolean flag)
    {
        super(context, viewgroup, flags);
        a = Optional.e();
        y = -1;
        C = (fop)dmz.a(fop);
        D = (fos)dmz.a(fos);
        I = new gap() {

            private eyz a;

            public final void a(boolean flag1)
            {
                eyz.d(a).a(flag1);
                if (eyz.e(a).b())
                {
                    ((ewa)eyz.e(a).c()).a();
                }
                if (eyz.f(a) != null)
                {
                    eyz.f(a).b();
                }
            }

            
            {
                a = eyz.this;
                super();
            }
        };
        K = new evs() {

            private eyz a;

            public final void a()
            {
                eyz.i(a).a();
                if (eyz.f(a) != null)
                {
                    eyz.f(a).b(false);
                }
                eyz.h(a).a(gcg.b(((fzv) (a)).p, 0x7f0f010f));
            }

            public final void a(int i1, int j1)
            {
                eyz.i(a).a(i1, j1);
                if (eyz.f(a) != null && !com.spotify.mobile.android.provider.Metadata.OfflineSync.a(i1))
                {
                    eyz.f(a).b();
                }
                eyz.h(a).a(dgo.b(((fzv) (a)).p, 0x7f0101c6));
            }

            
            {
                a = eyz.this;
                super();
            }
        };
        L = new evr() {

            private eyz a;

            public final void a(boolean flag1)
            {
                dmz.a(for);
                for.a(((fzv) (a)).p, dti.c(eyz.j(a)), flag1);
            }

            public final void b(boolean flag1)
            {
                eyz.a(a, flag1);
            }

            
            {
                a = eyz.this;
                super();
            }
        };
        M = new ewi() {

            private eyz a;

            public final ListView a()
            {
                return ((fzu) (a)).n;
            }

            public final ViewGroup b()
            {
                return ((fzu) (a)).n;
            }

            public final DownloadHeaderView c()
            {
                return eyz.i(a);
            }

            
            {
                a = eyz.this;
                super();
            }
        };
        N = new an() {

            private eyz a;

            public final da a(Bundle bundle)
            {
                return new cu(((fzv) (a)).p, eyz.m(a), dnz.a, null, null);
            }

            public final void a()
            {
                eyz.k(a).b(null);
            }

            public final void a(Object obj)
            {
                obj = (Cursor)obj;
                eyz.k(a).b(((Cursor) (obj)));
                if (obj == null || ((Cursor) (obj)).getCount() <= 0) goto _L2; else goto _L1
_L1:
                eyz.a(a, ((Cursor) (obj)));
                if (eyz.l(a) == null) goto _L4; else goto _L3
_L3:
                eyz.n(a).a(eyz.m(a), eyz.l(a), "");
_L2:
                if (eyz.r(a) != -1)
                {
                    ((fzu) (a)).n.setSelection(eyz.r(a));
                }
                return;
_L4:
                if (eyz.o(a))
                {
                    if (gex.a(eyz.p(a)))
                    {
                        ggp.a(((fzu) (a)).n, eyz.a(a, 0));
                    } else
                    {
                        obj = eyz.h(a);
                        ((ezb) (obj)).e.a().onClick(((ezb) (obj)).b);
                    }
                    eyz.q(a);
                }
                if (true) goto _L2; else goto _L5
_L5:
            }

            
            {
                a = eyz.this;
                super();
            }
        };
        l = new an() {

            private eyz a;

            public final da a(Bundle bundle)
            {
                bundle = dth.c(eyz.t(a));
                return new cu(((fzv) (a)).p, bundle, dnw.a, "LIMIT=3", null);
            }

            public final void a()
            {
                eyz.s(a).b(null);
            }

            public final void a(Object obj)
            {
                obj = (Cursor)obj;
                eyz.s(a).b(((Cursor) (obj)));
                eyz.g(a).d(3);
                if (eyz.r(a) != -1)
                {
                    ((fzu) (a)).n.setSelection(eyz.r(a));
                }
            }

            
            {
                a = eyz.this;
                super();
            }
        };
        O = new ggf() {

            private eyz a;

            public final void a()
            {
                eyz.u(a);
                eyz.b(a, -1);
            }

            public final void a(int i1)
            {
                eyz.u(a);
                ListView listview = ((fzu) (a)).n;
                if (listview != null)
                {
                    eyz.b(a, i1);
                    listview.setSelection(eyz.r(a));
                    if (eyz.o(a))
                    {
                        ggp.a(listview, eyz.a(a, i1));
                        eyz.q(a);
                        return;
                    }
                }
            }

            
            {
                a = eyz.this;
                super();
            }
        };
        new evw();
        j = evw.a(flags, K, L);
        A = s1;
        r = dtg.b(A);
        b = new ezb(context, fragment, new eza(this));
        z = ViewUri.am.a(A);
        B = ggn.a(context, z);
        i = featureidentifier;
        d = am1;
        u = new gge(context, d, 0x7f110060, O);
        c = (TextView)c().inflate(0x7f03004f, super.n, false);
        w = new fts(context, H, E, m);
        x = new AlbumsAdapter(context, G, F);
        e = new ftg(super.p);
        viewgroup = new ftr(super.p);
        e.e = viewgroup;
        viewgroup = new eim(context, context.getString(0x7f08006c));
        e.a(viewgroup, null, 1);
        e.a(new int[] {
            1
        });
        a = Optional.b(Cosmos.getResolver(context));
        ((Resolver)a.c()).get(String.format("hm://album/v1/album-app/album/%s/android", new Object[] {
            (new SpotifyLink(A)).b()
        }), J);
        if (!gex.a(m))
        {
            e.a(w, 0x7f08046d, 2);
        } else
        {
            e.a(w, null, 2);
        }
        e.a(x, null, 3);
        e.a(new ftm(c, false), null, 4);
        t = ewb.a(context, m, z);
        v = (DownloadHeaderView)gaw.a(super.p);
        v.c = I;
        v.d = t;
        super.n.addHeaderView(v, null, false);
        super.o = e;
        super.n.setAdapter(super.o);
        am1.a(0x7f110061, null, N);
        context = fragment.k();
        viewgroup = ((giq)dmz.a(giq)).b(context);
        fragment = M;
        am1 = z;
        s1 = m;
        new ewg();
        k = new ewh(context, fragment, viewgroup, am1, s1);
        k.a(flag);
    }

    static int a(eyz eyz1, int i1)
    {
        int k1 = eyz1.e.e(2);
        int j1;
        if (eyz1.e.a(2))
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        return j1 + (k1 + i1) + ((fzu) (eyz1)).n.getHeaderViewsCount();
    }

    static Flags a(eyz eyz1)
    {
        return eyz1.m;
    }

    static void a(eyz eyz1, Cursor cursor)
    {
        int i1 = 0;
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) 
        {
            i1 += cursor.getInt(19);
        }
        eyz1.b.g.a(i1);
    }

    static void a(eyz eyz1, ListView listview)
    {
        eyz1.a(listview);
    }

    static void a(eyz eyz1, boolean flag)
    {
        if (flag)
        {
            CollectionService.a(((fzv) (eyz1)).p, eyz1.A, ViewUri.am.a(eyz1.A).toString(), eyz1.m, com.spotify.mobile.android.spotlets.collection.service.CollectionService.Messaging.b);
            return;
        } else
        {
            CollectionService.b(((fzv) (eyz1)).p, eyz1.A, ViewUri.am.a(eyz1.A).toString(), eyz1.m, com.spotify.mobile.android.spotlets.collection.service.CollectionService.Messaging.b);
            return;
        }
    }

    static int b(eyz eyz1, int i1)
    {
        eyz1.y = i1;
        return i1;
    }

    static Verified b(eyz eyz1)
    {
        return eyz1.z;
    }

    static Flags c(eyz eyz1)
    {
        return eyz1.m;
    }

    static evv d(eyz eyz1)
    {
        return eyz1.j;
    }

    static Optional e(eyz eyz1)
    {
        return eyz1.t;
    }

    static ewh f(eyz eyz1)
    {
        return eyz1.k;
    }

    static ftg g(eyz eyz1)
    {
        return eyz1.e;
    }

    static ezb h(eyz eyz1)
    {
        return eyz1.b;
    }

    static DownloadHeaderView i(eyz eyz1)
    {
        return eyz1.v;
    }

    static String j(eyz eyz1)
    {
        return eyz1.A;
    }

    static fts k(eyz eyz1)
    {
        return eyz1.w;
    }

    static String l(eyz eyz1)
    {
        return eyz1.g;
    }

    static Uri m(eyz eyz1)
    {
        return eyz1.r;
    }

    static gge n(eyz eyz1)
    {
        return eyz1.u;
    }

    static boolean o(eyz eyz1)
    {
        return eyz1.h;
    }

    static Flags p(eyz eyz1)
    {
        return eyz1.m;
    }

    static boolean q(eyz eyz1)
    {
        eyz1.h = false;
        return false;
    }

    static int r(eyz eyz1)
    {
        return eyz1.y;
    }

    static AlbumsAdapter s(eyz eyz1)
    {
        return eyz1.x;
    }

    static String t(eyz eyz1)
    {
        return eyz1.f;
    }

    static String u(eyz eyz1)
    {
        eyz1.g = null;
        return null;
    }

    static fop v(eyz eyz1)
    {
        return eyz1.C;
    }

    static Flags w(eyz eyz1)
    {
        return eyz1.m;
    }

    static fos x(eyz eyz1)
    {
        return eyz1.D;
    }

    public final void a()
    {
        super.a();
        B.a();
        s.a(j);
        evx.a(super.p, s);
    }

    public final void a(View view, int i1, long l1)
    {
        Context context = super.p;
        if (context != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((i1 -= super.n.getHeaderViewsCount()) < 0) goto _L1; else goto _L3
_L3:
        switch (e.b(i1))
        {
        default:
            Assertion.b((new StringBuilder("Unknown section ID ")).append(e.b(i1)).toString());
            return;

        case -2147483648: 
            break;

        case 2: // '\002'
            if (!gex.a(m))
            {
                view = b;
                if (((ezb) (view)).b != null)
                {
                    ShufflePlayHeaderView.a(((ezb) (view)).j, ((ezb) (view)).b);
                }
                if (((ezb) (view)).k != null)
                {
                    ShufflePlayHeaderView.a(((ezb) (view)).j, ((ezb) (view)).k);
                }
                fop.a(context, z, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, ClientEventFactory.b(r, l1));
                return;
            } else
            {
                fos.a(context, z, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, FeatureIdentifier.R, i, r, l1, m);
                fop.a(context, z, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, ClientEventFactory.a(r, l1));
                return;
            }

        case 3: // '\003'
            view = (dnv)view.getTag();
            break; /* Loop/switch isn't completed */
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (view.i())
        {
            context.startActivity(gms.a(context, view.a()).a(view.h()).a);
            return;
        } else
        {
            dmz.a(ggc);
            ggc.a(context, 0x7f080575);
            return;
        }
    }

    public final boolean a(View view)
    {
        view = ((View) (view.getTag(0x7f110041)));
        if (view instanceof fxh)
        {
            ((fxh)view).a(super.p);
            return true;
        } else
        {
            return false;
        }
    }

    public final void b()
    {
        super.b();
        B.b();
        s.b(j);
        evx.b(super.p, s);
    }

    static 
    {
        eyz.getSimpleName();
    }

    // Unreferenced inner class eyz$5

/* anonymous class */
    final class _cls5
    {

        static final int a[];

        static 
        {
            a = new int[CollectionState.values().length];
            try
            {
                a[CollectionState.c.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[CollectionState.b.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[CollectionState.a.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
