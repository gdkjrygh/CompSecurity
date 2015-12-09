// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.google.common.base.Optional;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.android.paste.widget.prettylist.StickyListView;
import com.spotify.cosmos.android.RxCosmos;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.spotlets.collection.adapter.AlbumsWithTracksAdapter;
import com.spotify.mobile.android.spotlets.follow.FollowManager;
import com.spotify.mobile.android.spotlets.follow.RxFollowersCountResolver;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.view.DownloadHeaderView;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.ui.view.ShufflePlayHeaderView;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.MainActivity;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.List;

public final class enh extends al
    implements dod, fon, fxy
{

    private static final String Y[] = {
        "name", "uri", "offline_state", "sync_progress", "is_available", "is_radio_available", "albums_in_collection_count", "tracks_in_collection_count", "image_large_uri", "is_followed"
    };
    private String Z;
    private int aA;
    private int aB;
    private ggl aC;
    private Verified aD;
    private fop aE;
    private fos aF;
    private for aG;
    private gdd aH;
    private gjf aI;
    private Flags aJ;
    private FeatureIdentifier aK;
    private Optional aL;
    private boolean aM;
    private ewi aN;
    private ewh aO;
    private gap aP;
    private gck aQ;
    private android.view.View.OnClickListener aR;
    private an aS;
    private hfb aT;
    private Runnable aU;
    private esp aV;
    private an aW;
    private String aa;
    private String ab;
    private String ac;
    private boolean ad;
    private boolean ae;
    private boolean af;
    private ftg ag;
    private AlbumsWithTracksAdapter ah;
    private Cursor ai;
    private EmptyView aj;
    private DownloadHeaderView ak;
    private View al;
    private LoadingView am;
    private View an;
    private dja ao;
    private Parcelable ap;
    private gbv aq;
    private boolean ar;
    private Handler as;
    private ToggleButton at;
    private boolean au;
    private eso av;
    private RxFollowersCountResolver aw;
    private hfg ax;
    private gcj ay;
    private int az;
    FollowManager b;

    public enh()
    {
        aE = (fop)dmz.a(fop);
        aF = (fos)dmz.a(fos);
        aG = (for)dmz.a(for);
        aN = new ewi() {

            private enh a;

            public final ListView a()
            {
                return enh.a(a).f();
            }

            public final ViewGroup b()
            {
                return enh.a(a).e();
            }

            public final DownloadHeaderView c()
            {
                return enh.b(a);
            }

            
            {
                a = enh.this;
                super();
            }
        };
        aP = new gap() {

            private enh a;

            public final void a(boolean flag)
            {
                if (enh.k(a).b())
                {
                    ((ewa)enh.k(a).c()).a();
                }
                enh.m(a);
                for.a(a.k(), dti.a(enh.l(a)), flag);
                if (enh.n(a) != null)
                {
                    enh.n(a).b();
                }
            }

            
            {
                a = enh.this;
                super();
            }
        };
        aQ = new gck() {

            private enh a;

            public final void d(boolean flag)
            {
                enh.a(a, flag);
                enh.o(a);
                if (flag && enh.i(a) != null)
                {
                    if (enh.p(a) != null)
                    {
                        enh.p(a).unsubscribe();
                    }
                    enh.a(a, enh.r(a).a(enh.i(a)).a(((dup)dmz.a(dup)).c()).a(enh.q(a)));
                }
                ((fpe)a.k()).P_();
            }

            
            {
                a = enh.this;
                super();
            }
        };
        aR = new android.view.View.OnClickListener() {

            private enh a;

            public final void onClick(View view)
            {
                enh.h(a);
                fop.a(a.k(), enh.f(a), ClientEventFactory.a("artist", com.spotify.mobile.android.util.ClientEvent.SubEvent.X, null, null));
                view = dti.b(enh.l(a));
                enh.t(a);
                u u1 = a.k();
                Verified verified = enh.f(a);
                com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview = com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a;
                FeatureIdentifier featureidentifier = FeatureIdentifier.l;
                FeatureIdentifier featureidentifier1 = enh.s(a);
                enh.j(a);
                fos.a(u1, verified, subview, featureidentifier, featureidentifier1, view);
            }

            
            {
                a = enh.this;
                super();
            }
        };
        aS = new an() {

            private enh a;

            public final da a(Bundle bundle)
            {
                bundle = dti.a(enh.l(a));
                return new cu(a.k(), bundle, enh.H(), null, null);
            }

            public final void a()
            {
            }

            public final void a(Object obj)
            {
                Cursor cursor = (Cursor)obj;
                enh.u(a).a(Integer.valueOf(0), cursor);
                if (!cursor.moveToFirst() || !duc.a(cursor))
                {
                    return;
                }
                enh.a(a, cursor);
                boolean flag = TextUtils.isEmpty(enh.i(a));
                enh.a(a, gcw.a(cursor, 0, enh.d(a)));
                enh.b(a, cursor.getString(1));
                enh.c(a, cursor.getString(8));
                if (enh.a(a) != null)
                {
                    Uri uri = dto.a(enh.v(a));
                    dmz.a(gjj);
                    gji gji1 = gjj.a(a.k());
                    gji1.a(enh.a(a).d(), uri);
                    ImageView imageview = enh.a(a).c();
                    gve gve = enh.a(a).g();
                    if (dgn.a(imageview.getContext()))
                    {
                        obj = null;
                    } else
                    {
                        obj = dfo.a();
                    }
                    gji1.a(imageview, uri, dff.a(gji1.a), ((dfv) (obj)), gve);
                    enh.a(a).c().setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                }
                if (flag)
                {
                    enh.w(a);
                }
                enh.a(a, cursor.getInt(2));
                enh.b(a, cursor.getInt(3));
                enh.c(cursor.getInt(6));
                enh.c(a, cursor.getInt(7));
                enh.x(a);
                enh.b(a, gcw.a(cursor, 5));
                a.g().putString("title", enh.d(a));
                if (enh.a(a) == null)
                {
                    ((fpe)a.k()).a(a, enh.d(a));
                } else
                {
                    obj = enh.d(a);
                    ((djr)enh.a(a).a()).a(((CharSequence) (obj)));
                }
                enh.a(a, a.b.a(enh.i(a)));
                if (enh.y(a) != null)
                {
                    enh.c(a, enh.y(a).d);
                } else
                {
                    enh.c(a, gcw.a(cursor, 9));
                    if (enh.p(a) != null)
                    {
                        enh.p(a).unsubscribe();
                    }
                    enh.a(a, enh.r(a).a(enh.i(a)).a(((dup)dmz.a(dup)).c()).a(enh.q(a)));
                }
                a.b.a(enh.i(a), enh.z(a));
                enh.o(a);
                enh.d(a, gcw.a(cursor, 4));
                ((fpe)a.k()).P_();
                enh.A(a);
            }

            
            {
                a = enh.this;
                super();
            }
        };
        aT = new hfb() {

            private enh a;

            public final void onCompleted()
            {
            }

            public final void onError(Throwable throwable)
            {
                Logger.b(throwable, "Failed to get followed count for %s", new Object[] {
                    enh.i(a)
                });
            }

            public final void onNext(Object obj)
            {
                obj = (com.spotify.mobile.android.spotlets.follow.RxFollowersCountResolver.Count)obj;
                enh.a(a, a.b.a(enh.i(a)));
                if (enh.y(a) == null)
                {
                    enh.a(a, new eso(enh.i(a), ((com.spotify.mobile.android.spotlets.follow.RxFollowersCountResolver.Count) (obj)).getFollowersCount(), ((com.spotify.mobile.android.spotlets.follow.RxFollowersCountResolver.Count) (obj)).getFollowingCount(), enh.g(a)));
                } else
                {
                    enh.y(a).c = ((com.spotify.mobile.android.spotlets.follow.RxFollowersCountResolver.Count) (obj)).getFollowersCount();
                    enh.y(a).b = ((com.spotify.mobile.android.spotlets.follow.RxFollowersCountResolver.Count) (obj)).getFollowingCount();
                }
                a.b.a(enh.y(a));
            }

            
            {
                a = enh.this;
                super();
            }
        };
        aU = new Runnable() {

            private enh a;

            public final void run()
            {
                enh.o(a);
            }

            
            {
                a = enh.this;
                super();
            }
        };
        aV = new esp() {

            private enh a;

            public final void a(eso eso1)
            {
                enh.a(a, eso1);
                enh.c(a, enh.y(a).d);
                enh.C(a).post(enh.B(a));
            }

            
            {
                a = enh.this;
                super();
            }
        };
        aW = new an() {

            private enh a;

            public final da a(Bundle bundle)
            {
                bundle = dti.b(enh.l(a));
                return new cu(a.k(), bundle, dnz.a, null, "album_name");
            }

            public final void a()
            {
            }

            public final void a(Object obj)
            {
                Cursor cursor = (Cursor)obj;
                if (duc.a(cursor))
                {
                    AlbumsWithTracksAdapter albumswithtracksadapter = enh.D(a);
                    albumswithtracksadapter.a.clear();
                    albumswithtracksadapter.b.clear();
                    albumswithtracksadapter.d = cursor;
                    if (cursor == null || !cursor.moveToFirst())
                    {
                        albumswithtracksadapter.notifyDataSetInvalidated();
                    } else
                    {
                        obj = null;
                        int i1 = 0;
                        while (i1 < cursor.getCount()) 
                        {
                            dnz dnz1 = new dnz();
                            dnz1.a(cursor, albumswithtracksadapter.c);
                            boolean flag;
                            if (!TextUtils.equals(((CharSequence) (obj)), dnz1.f))
                            {
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                            if (i1 > 0 && flag)
                            {
                                albumswithtracksadapter.a.add(albumswithtracksadapter.a.get(albumswithtracksadapter.a.size() - 1));
                                albumswithtracksadapter.b.add(com.spotify.mobile.android.spotlets.collection.adapter.AlbumsWithTracksAdapter.Type.c);
                            }
                            if (flag)
                            {
                                albumswithtracksadapter.a.add(new emo(dnz1));
                                albumswithtracksadapter.b.add(com.spotify.mobile.android.spotlets.collection.adapter.AlbumsWithTracksAdapter.Type.b);
                            }
                            albumswithtracksadapter.a.add(dnz1);
                            albumswithtracksadapter.b.add(com.spotify.mobile.android.spotlets.collection.adapter.AlbumsWithTracksAdapter.Type.a);
                            obj = dnz1.f;
                            cursor.moveToNext();
                            i1++;
                        }
                        albumswithtracksadapter.notifyDataSetChanged();
                    }
                    enh.w(a);
                    enh.E(a).d(0);
                    ((fpe)a.k()).P_();
                    if (enh.F(a) != null && cursor.getCount() > 0)
                    {
                        a.z_().onRestoreInstanceState(enh.F(a));
                        enh.G(a);
                    }
                    enh.u(a).a(Integer.valueOf(1), cursor);
                }
            }

            
            {
                a = enh.this;
                super();
            }
        };
    }

    static void A(enh enh1)
    {
        enh1.K();
    }

    static Runnable B(enh enh1)
    {
        return enh1.aU;
    }

    static Handler C(enh enh1)
    {
        return enh1.as;
    }

    static AlbumsWithTracksAdapter D(enh enh1)
    {
        return enh1.ah;
    }

    static ftg E(enh enh1)
    {
        return enh1.ag;
    }

    static Parcelable F(enh enh1)
    {
        return enh1.ap;
    }

    static Parcelable G(enh enh1)
    {
        enh1.ap = null;
        return null;
    }

    static String[] H()
    {
        return Y;
    }

    private ToggleButton J()
    {
        at = (ToggleButton)LayoutInflater.from(k()).inflate(0x7f0300c8, null);
        at.setOnClickListener(new android.view.View.OnClickListener() {

            private enh a;

            public final void onClick(View view)
            {
                enh.h(a);
                Object obj = a.k();
                Verified verified = enh.f(a);
                boolean flag;
                if (enh.g(a))
                {
                    view = com.spotify.mobile.android.util.ClientEvent.SubEvent.bJ;
                } else
                {
                    view = com.spotify.mobile.android.util.ClientEvent.SubEvent.bI;
                }
                fop.a(((Context) (obj)), verified, ClientEventFactory.a("artist", view, null, null));
                view = a.b;
                obj = enh.i(a);
                if (!enh.g(a))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                enh.j(a);
                view.a(((String) (obj)), flag);
            }

            
            {
                a = enh.this;
                super();
            }
        });
        return at;
    }

    private void K()
    {
        boolean flag = false;
        int i1;
        if (ah != null && ah.getCount() > 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = az;
        }
        ak.a(i1, aA);
        if (aO != null && !com.spotify.mobile.android.provider.Metadata.OfflineSync.a(i1))
        {
            aO.b();
        }
    }

    private void L()
    {
        Object obj;
        if (!au && af)
        {
            boolean flag = fiy.a(aJ);
            obj = k();
            String s1;
            int i1;
            if (flag)
            {
                i1 = 0x7f0803c2;
            } else
            {
                i1 = 0x7f0803c1;
            }
            obj = ((u) (obj)).getString(i1, new Object[] {
                Z
            });
        } else
        {
            obj = k().getString(0x7f0803bf, new Object[] {
                Z
            });
        }
        s1 = ((String) (obj));
        if (ah != null)
        {
            s1 = ((String) (obj));
            if (aB > ah.getCount())
            {
                s1 = k().getString(0x7f0803c0, new Object[] {
                    Z
                });
            }
        }
        aj.b(s1);
    }

    static int a(enh enh1, int i1)
    {
        enh1.az = i1;
        return i1;
    }

    static Cursor a(enh enh1, Cursor cursor)
    {
        enh1.ai = cursor;
        return cursor;
    }

    static dja a(enh enh1)
    {
        return enh1.ao;
    }

    public static enh a(String s1, String s2, Flags flags)
    {
        Bundle bundle = new Bundle();
        bundle.putString("artist_collection_uri", s1);
        bundle.putString("title", s2);
        bundle.putBoolean("is_sub_fragment", false);
        s1 = new enh();
        s1.f(bundle);
        fyw.a(s1, flags);
        return s1;
    }

    static eso a(enh enh1, eso eso1)
    {
        enh1.av = eso1;
        return eso1;
    }

    static hfg a(enh enh1, hfg hfg1)
    {
        enh1.ax = hfg1;
        return hfg1;
    }

    static String a(enh enh1, String s1)
    {
        enh1.Z = s1;
        return s1;
    }

    static boolean a(enh enh1, boolean flag)
    {
        enh1.af = flag;
        return flag;
    }

    static int b(enh enh1, int i1)
    {
        enh1.aA = i1;
        return i1;
    }

    static DownloadHeaderView b(enh enh1)
    {
        return enh1.ak;
    }

    static String b(enh enh1, String s1)
    {
        enh1.aa = s1;
        return s1;
    }

    static boolean b(enh enh1, boolean flag)
    {
        enh1.ad = flag;
        return flag;
    }

    static int c(int i1)
    {
        return i1;
    }

    static int c(enh enh1, int i1)
    {
        enh1.aB = i1;
        return i1;
    }

    static LoadingView c(enh enh1)
    {
        return enh1.am;
    }

    static String c(enh enh1, String s1)
    {
        enh1.ac = s1;
        return s1;
    }

    static boolean c(enh enh1, boolean flag)
    {
        enh1.au = flag;
        return flag;
    }

    static String d(enh enh1)
    {
        return enh1.Z;
    }

    static boolean d(enh enh1, boolean flag)
    {
        enh1.ae = flag;
        return flag;
    }

    static ToggleButton e(enh enh1)
    {
        return enh1.at;
    }

    static Verified f(enh enh1)
    {
        return enh1.aD;
    }

    static boolean g(enh enh1)
    {
        return enh1.au;
    }

    static fop h(enh enh1)
    {
        return enh1.aE;
    }

    static String i(enh enh1)
    {
        return enh1.aa;
    }

    static Flags j(enh enh1)
    {
        return enh1.aJ;
    }

    static Optional k(enh enh1)
    {
        return enh1.aL;
    }

    static String l(enh enh1)
    {
        return enh1.ab;
    }

    static for m(enh enh1)
    {
        return enh1.aG;
    }

    static ewh n(enh enh1)
    {
        return enh1.aO;
    }

    static void o(enh enh1)
    {
        enh1.L();
        if (enh1.ao != null)
        {
            boolean flag1 = gbx.a(enh1.Z);
            ToggleButton togglebutton = enh1.at;
            int i1;
            boolean flag;
            if (enh1.au)
            {
                i1 = 0x7f0800c5;
            } else
            {
                i1 = 0x7f0800c4;
            }
            togglebutton.setText(i1);
            enh1.at.setChecked(enh1.au);
            togglebutton = enh1.at;
            if (enh1.af && enh1.av != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            togglebutton.setEnabled(flag);
            if (!flag1 && enh1.av != null)
            {
                i1 = enh1.av.c;
                ((djr)enh1.ao.a()).a().setVisibility(0);
                ((djr)enh1.ao.a()).b(enh1.l().getQuantityString(0x7f090001, i1, new Object[] {
                    Integer.valueOf(i1)
                }));
            } else
            {
                ((djr)enh1.ao.a()).a().setVisibility(8);
            }
            enh1.ao.e().a().requestLayout();
        }
        ((fpe)enh1.k()).P_();
    }

    static hfg p(enh enh1)
    {
        return enh1.ax;
    }

    static hfb q(enh enh1)
    {
        return enh1.aT;
    }

    static RxFollowersCountResolver r(enh enh1)
    {
        return enh1.aw;
    }

    static FeatureIdentifier s(enh enh1)
    {
        return enh1.aK;
    }

    static fos t(enh enh1)
    {
        return enh1.aF;
    }

    static gdd u(enh enh1)
    {
        return enh1.aH;
    }

    static String v(enh enh1)
    {
        return enh1.ac;
    }

    static void w(enh enh1)
    {
_L2:
        return;
        if (enh1.ah.d == null || !duc.a(enh1.ah.d) || enh1.ai == null || !duc.a(enh1.ai)) goto _L2; else goto _L1
_L1:
        if (enh1.am.d())
        {
            enh1.am.b();
            if (enh1.ao != null)
            {
                enh1.as.post(enh1. new Runnable() {

                    private enh a;

                    public final void run()
                    {
                        if (!gex.a(enh.j(a)))
                        {
                            enh.a(a).b(false);
                            return;
                        } else
                        {
                            enh.a(a).a(false);
                            return;
                        }
                    }

            
            {
                a = enh.this;
                super();
            }
                });
            }
        }
        boolean flag;
        if (enh1.ah.getCount() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        enh1.ag.b(new int[] {
            1
        });
        if (enh1.al != null)
        {
            enh1.al.setEnabled(false);
        }
        if (enh1.ao != null)
        {
            enh1.as.post(enh1. new Runnable() {

                private enh a;

                public final void run()
                {
                    enh.a(a).b(true);
                }

            
            {
                a = enh.this;
                super();
            }
            });
        }
_L4:
        enh1.K();
        if (!enh1.am.d())
        {
            enh1.an.setVisibility(0);
        }
        if (enh1.aO != null)
        {
            enh1.aO.b(flag);
            return;
        }
        if (true) goto _L2; else goto _L3
_L3:
        enh1.ag.a(new int[] {
            1
        });
        if (enh1.al != null)
        {
            enh1.al.setEnabled(true);
        }
          goto _L4
        if (true) goto _L2; else goto _L5
_L5:
    }

    static void x(enh enh1)
    {
        enh1.L();
    }

    static eso y(enh enh1)
    {
        return enh1.av;
    }

    static esp z(enh enh1)
    {
        return enh1.aV;
    }

    public final void A()
    {
        super.A();
        aC.b();
    }

    public final void B()
    {
        super.B();
        as.removeCallbacks(aU);
        if (aa != null)
        {
            b.b(aa, aV);
        }
        if (ax != null)
        {
            ax.unsubscribe();
        }
        if (aO != null)
        {
            aO.a();
        }
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return (new StringBuilder("collection:artist:")).append(ab).toString();
    }

    public final Uri a()
    {
        return Uri.parse(ab);
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        aJ = fyw.a(this);
        int i1;
        if (!ar)
        {
            viewgroup = (MainActivity)k();
            ewi ewi;
            Verified verified;
            Flags flags;
            if (ggi.b(viewgroup))
            {
                ao = dja.b(viewgroup).b().b(J(), 0).a(this);
            } else
            {
                al = gad.a(k(), null);
                al.setOnClickListener(aR);
                bundle = dja.a(viewgroup);
                if (dgn.a(viewgroup))
                {
                    i1 = 0;
                } else
                {
                    i1 = 1;
                }
                ao = bundle.a(i1).b(J(), 0).a(true).b(al).a(this);
            }
            ao.a(dgo.b(viewgroup, 0x7f0101c6));
            ((djr)ao.a()).a(Z);
            an = ao.b();
            viewgroup = ao.e().a();
        } else
        {
            an = layoutinflater.inflate(0x7f0300ce, viewgroup, false);
            viewgroup = (ListView)an.findViewById(0x102000a);
        }
        bundle = new FrameLayout(k());
        bundle.setBackgroundColor(dgo.b(k(), 0x1010054));
        bundle.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        bundle.addView(an);
        viewgroup.setFastScrollEnabled(true);
        an.setVisibility(4);
        am = LoadingView.a(layoutinflater, k(), an);
        bundle.addView(am);
        if (!ar)
        {
            at.setVisibility(4);
            am.a = new gax() {

                private enh a;

                public final void a()
                {
                    if (!enh.c(a).d() && !gbx.a(enh.d(a)))
                    {
                        enh.e(a).setVisibility(0);
                        return;
                    } else
                    {
                        enh.e(a).setVisibility(8);
                        return;
                    }
                }

                public final long b()
                {
                    return 0L;
                }

            
            {
                a = enh.this;
                super();
            }
            };
        }
        ah = new AlbumsWithTracksAdapter(k(), gex.a(aJ), aD, aJ);
        aj = eoo.a(k(), 0x7f0803bf);
        aj.b(k().getString(0x7f0803bf, new Object[] {
            Z
        }));
        ag = new ftg(k());
        layoutinflater = k();
        if (fiy.a(aJ))
        {
            i1 = 0x7f08018e;
        } else
        {
            i1 = 0x7f08018d;
        }
        layoutinflater = layoutinflater.getString(i1);
        ag.a(ah, layoutinflater, 0);
        ag.a(new ftm(aj, false), null, 1);
        ag.a(new int[] {
            1, 0
        });
        ak = (DownloadHeaderView)gaw.a(k());
        ak.c = aP;
        ak.d = aL;
        viewgroup.addHeaderView(ak, null, false);
        viewgroup.setAdapter(ag);
        viewgroup.setOnItemLongClickListener(new fuf(k()));
        aI.a();
        am.a();
        u().a(0x7f110070, null, aS);
        u().a(0x7f110072, null, aW);
        u().a(0x7f110071, null, ay);
        layoutinflater = k();
        viewgroup = ((giq)dmz.a(giq)).b(layoutinflater);
        ewi = aN;
        verified = aD;
        flags = aJ;
        new ewg();
        aO = new ewh(layoutinflater, ewi, viewgroup, verified, flags);
        aO.a(aM);
        return bundle;
    }

    public final String a(Context context, Flags flags)
    {
        if (Z == null)
        {
            return context.getString(0x7f0800c3);
        } else
        {
            return Z;
        }
    }

    public final void a(Bundle bundle)
    {
        boolean flag1 = true;
        super.a(bundle);
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
            if (bundle.containsKey("list"))
            {
                ap = bundle.getParcelable("list");
            }
        }
        Bundle bundle1 = g();
        ab = bundle1.getString("artist_collection_uri");
        Z = bundle1.getString("title");
        ar = bundle1.getBoolean("is_sub_fragment");
        aJ = fyw.a(this);
        aK = gnl.a(this);
        aD = ViewUri.bq.a(ab);
        aC = ggn.a(k(), aD);
        aH = new gdd(2, new gde() {

            public final void a()
            {
            }

        });
        boolean flag;
        if (!ar)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
        aq = new gbv();
        as = new Handler();
        b = (FollowManager)dmz.a(com/spotify/mobile/android/spotlets/follow/FollowManager);
        aw = new RxFollowersCountResolver(new RxResolver(RxCosmos.getRouter(k())));
        ay = new gcj(k(), aQ);
        aI = gjf.a(k(), aD.toString());
        aI.c(bundle);
        aL = ewb.a(k(), aJ, aD);
        if (bundle == null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        aM = flag;
    }

    public final void a(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
        b(menu);
    }

    public final void a(ListView listview, View view, int i1, long l1)
    {
        i1 -= listview.getHeaderViewsCount();
        if (i1 >= 0)
        {
            i1 = ag.b(i1);
            switch (i1)
            {
            default:
                throw new AssertionError((new StringBuilder("Unexpected section ")).append(i1).toString());

            case 0: // '\0'
                listview = ((ListView) (view.getTag()));
                break;
            }
            if (listview instanceof emo)
            {
                listview = (emo)listview;
                fop.a(k(), aD, ClientEventFactory.a("artist", com.spotify.mobile.android.util.ClientEvent.SubEvent.as, listview.b(), Long.valueOf(l1)));
                a(gms.a(k(), listview.b()).a(listview.a()).a);
                return;
            }
            if (listview instanceof doe)
            {
                listview = (doe)listview;
                view = dti.b(ab);
                if (gex.a(aJ))
                {
                    fop.a(k(), aD, ClientEventFactory.a("artist", com.spotify.mobile.android.util.ClientEvent.SubEvent.ah, listview.e(), Long.valueOf(l1)));
                    fos.a(k(), aD, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, FeatureIdentifier.l, aK, view, l1, aJ);
                    return;
                }
                fop.a(k(), aD, ClientEventFactory.a("artist", com.spotify.mobile.android.util.ClientEvent.SubEvent.ai, listview.e(), Long.valueOf(l1)));
                if (al instanceof ShufflePlayHeaderView)
                {
                    ((ShufflePlayHeaderView)al).a();
                    return;
                } else
                {
                    ShufflePlayHeaderView.a(aq, al);
                    return;
                }
            }
        }
    }

    public final void b(Menu menu)
    {
        int i1;
        if (ah != null && ah.getCount() > 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (o() && aa != null)
        {
            if (ao != null)
            {
                ao.a(menu, k());
            }
            if (ggi.b(k()) && i1 != 0)
            {
                al = fzr.a(k(), menu, aD, FeatureIdentifier.l, aK, dti.b(ab));
            }
            if (i1 != 0)
            {
                u u1 = k();
                Verified verified = aD;
                Uri uri = dti.a(ab);
                com.spotify.mobile.android.util.SpotifyLink.LinkType linktype = (new SpotifyLink(ab)).c;
                fzt.a(u1, menu, verified, uri, az, aA, aL);
            }
            if (af && aa != null && !gbx.a(Z) && av != null)
            {
                u u2 = k();
                Verified verified1 = aD;
                String s1 = aa;
                boolean flag = au;
                if (!fzt.a(u2))
                {
                    if (flag)
                    {
                        i1 = 0x7f0803a8;
                    } else
                    {
                        i1 = 0x7f0803a6;
                    }
                    menu.add(0, 0x7f1100d9, 0, i1).setOnMenuItemClickListener(new fzt._cls7(u2, verified1, flag, s1));
                }
            }
            if (aa != null && !gbx.a(Z) && ae)
            {
                fzt.a(k(), menu, aD, aa, Z);
            }
            fzr.a(k(), menu, aD, a(k(), aJ), "", ac, aa);
            if (ad)
            {
                fzr.a(k(), menu, aD, aa, Z, aJ);
            }
        }
    }

    public final void c()
    {
        super.c();
        u().a(0x7f110070, null, aS);
        u().a(0x7f110072, null, aW);
        u().a(0x7f110071, null, ay);
    }

    public final void d()
    {
        super.d();
        u().a(0x7f110070);
        u().a(0x7f110072);
        u().a(0x7f110071);
        if (aO != null)
        {
            aO.b(false);
        }
    }

    public final void e()
    {
        aI.c();
        super.e();
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        if (z_() != null)
        {
            bundle.putParcelable("list", z_().onSaveInstanceState());
        }
        aI.a(bundle);
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.l;
    }

    public final void z()
    {
        super.z();
        aC.a();
    }

}
