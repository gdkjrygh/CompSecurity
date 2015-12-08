// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
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
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ToggleButton;
import com.google.common.base.Optional;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.android.paste.widget.prettylist.StickyListView;
import com.spotify.mobile.android.spotlets.collection.adapter.AlbumTracksAdapter;
import com.spotify.mobile.android.spotlets.collection.service.CollectionService;
import com.spotify.mobile.android.spotlets.collection.util.CollectionState;
import com.spotify.mobile.android.ui.activity.CoverImageActivity;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.view.DownloadHeaderView;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.ui.view.ShufflePlayHeaderView;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.MainActivity;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.List;
import java.util.Locale;

public final class enf extends al
    implements dod, fon, fxy
{

    private static final String b[] = {
        "name", "uri", "offline_state", "sync_progress", "can_undownload", "is_available", "is_radio_available", "tracks_in_collection_count", "is_complete_in_collection", "artist_name", 
        "artist_uri", "is_artist_browsable", "image_large_uri", "year", "artist_image_uri", "is_queueable"
    };
    private String Y;
    private String Z;
    private gcj aA;
    private boolean aB;
    private int aC;
    private int aD;
    private ggl aE;
    private Verified aF;
    private fop aG;
    private fos aH;
    private for aI;
    private gdd aJ;
    private final fuj aK = new fuj() {

        private enf a;

        public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
        {
            obj = (doe)obj;
            fve.a(a.k()).a(((doe) (obj)).e(), ((doe) (obj)).j()).a(enf.b(a)).a(false).a(false).a(true).a(false, null).a(enf.a(a)).a(spotifycontextmenu);
        }

            
            {
                a = enf.this;
                super();
            }
    };
    private gbg aL;
    private Flags aM;
    private FeatureIdentifier aN;
    private Optional aO;
    private ewi aP;
    private ewh aQ;
    private boolean aR;
    private android.view.View.OnClickListener aS;
    private gck aT;
    private gap aU;
    private an aV;
    private an aW;
    private String aa;
    private String ab;
    private String ac;
    private String ad;
    private String ae;
    private boolean af;
    private boolean ag;
    private boolean ah;
    private boolean ai;
    private CollectionState aj;
    private int ak;
    private ftg al;
    private AlbumTracksAdapter am;
    private Cursor an;
    private View ao;
    private DownloadHeaderView ap;
    private LoadingView aq;
    private EmptyView ar;
    private View as;
    private Parcelable at;
    private dja au;
    private gbv av;
    private boolean aw;
    private Handler ax;
    private ToggleButton ay;
    private boolean az;

    public enf()
    {
        aG = (fop)dmz.a(fop);
        aH = (fos)dmz.a(fos);
        aI = (for)dmz.a(for);
        aP = new ewi() {

            private enf a;

            public final ListView a()
            {
                return enf.c(a).f();
            }

            public final ViewGroup b()
            {
                return enf.c(a).e();
            }

            public final DownloadHeaderView c()
            {
                return enf.d(a);
            }

            
            {
                a = enf.this;
                super();
            }
        };
        aS = new android.view.View.OnClickListener() {

            private enf a;

            public final void onClick(View view)
            {
                enf.e(a);
                fop.a(a.k(), enf.b(a), ClientEventFactory.a("album", com.spotify.mobile.android.util.ClientEvent.SubEvent.X, null, null));
                view = dti.d(enf.f(a));
                enf.h(a);
                u u1 = a.k();
                Verified verified = enf.b(a);
                com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview = com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a;
                FeatureIdentifier featureidentifier = FeatureIdentifier.j;
                FeatureIdentifier featureidentifier1 = enf.g(a);
                enf.a(a);
                fos.a(u1, verified, subview, featureidentifier, featureidentifier1, view);
            }

            
            {
                a = enf.this;
                super();
            }
        };
        aT = new gck() {

            private enf a;

            public final void d(boolean flag)
            {
                enf.a(a, flag);
                enf.i(a);
                ((fpe)a.k()).P_();
            }

            
            {
                a = enf.this;
                super();
            }
        };
        aU = new gap() {

            private enf a;

            public final void a(boolean flag)
            {
                if (enf.m(a).b())
                {
                    ((ewa)enf.m(a).c()).a();
                }
                enf.n(a);
                for.a(a.k(), dti.c(enf.f(a)), flag);
                if (enf.o(a) != null)
                {
                    enf.o(a).b();
                }
            }

            
            {
                a = enf.this;
                super();
            }
        };
        aV = new an() {

            private enf a;

            public final da a(Bundle bundle)
            {
                bundle = dti.c(enf.f(a));
                return new cu(a.k(), bundle, enf.H(), null, null);
            }

            public final void a()
            {
            }

            public final void a(Object obj)
            {
                obj = (Cursor)obj;
                enf.p(a).a(Integer.valueOf(0), ((Cursor) (obj)));
                if (!((Cursor) (obj)).moveToFirst() || !duc.a(((Cursor) (obj))))
                {
                    return;
                }
                enf.a(a, ((Cursor) (obj)));
                boolean flag = TextUtils.isEmpty(enf.q(a));
                enf.a(a, gcw.a(((Cursor) (obj)), 0, enf.r(a)));
                enf.b(a, ((Cursor) (obj)).getString(1));
                enf.c(a, ((Cursor) (obj)).getString(9));
                enf.d(a, ((Cursor) (obj)).getString(10));
                enf.b(a, gcw.a(((Cursor) (obj)), 15));
                dmz.a(gjj);
                gji gji1 = gjj.a(a.k());
                enf.e(a, ((Cursor) (obj)).getString(12));
                if (enf.c(a) != null)
                {
                    Uri uri = dto.a(enf.s(a));
                    gji1.a(enf.c(a).d(), uri);
                    gji1.e(enf.c(a).c(), uri);
                    enf.c(a).c().setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                    CoverImageActivity.a(a.k(), enf.c(a).c(), uri);
                    ImageView imageview = enf.t(a).d();
                    if (imageview.getVisibility() == 0)
                    {
                        gji1.e(imageview, uri);
                    }
                }
                if (flag)
                {
                    enf.u(a);
                }
                if (enf.c(a) != null)
                {
                    ((djr)enf.c(a).a()).b(a.k().getString(0x7f08006a, new Object[] {
                        enf.k(a)
                    }).toUpperCase(Locale.getDefault()));
                    enf.v(a).c(enf.k(a).toUpperCase(Locale.getDefault()));
                    enf.v(a).a(gcw.a(((Cursor) (obj)), 13, ""));
                    String s2 = ((Cursor) (obj)).getString(14);
                    ImageView imageview1 = enf.v(a).b;
                    if (!TextUtils.equals(enf.w(a), s2) || !TextUtils.isEmpty(s2) && imageview1.getDrawable() == null)
                    {
                        enf.f(a, s2);
                        gji1.c(imageview1, dto.a(s2));
                    }
                }
                enf.a(a, ((Cursor) (obj)).getInt(7));
                flag = gcw.a(((Cursor) (obj)), 8);
                enf.a(a, CollectionState.a(enf.a(a), enf.x(a), flag));
                enf.i(a);
                enf.y(a);
                enf.b(a, ((Cursor) (obj)).getInt(2));
                enf.c(a, ((Cursor) (obj)).getInt(3));
                enf.c(a, gcw.a(((Cursor) (obj)), 4));
                enf.d(a, gcw.a(((Cursor) (obj)), 6));
                a.g().putString("title", enf.r(a));
                if (enf.c(a) == null)
                {
                    ((fpe)a.k()).a(a, enf.r(a));
                } else
                {
                    String s1 = enf.r(a);
                    ((djr)enf.c(a).a()).a(s1);
                }
                enf.e(a, gcw.a(((Cursor) (obj)), 5));
                enf.f(a, gcw.a(((Cursor) (obj)), 11));
                if (!gbx.a(enf.k(a)) && enf.z(a))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (enf.c(a) != null)
                {
                    enf.v(a).a(flag);
                }
                ((fpe)a.k()).P_();
                enf.A(a);
            }

            
            {
                a = enf.this;
                super();
            }
        };
        aW = new an() {

            private enf a;

            public final da a(Bundle bundle)
            {
                bundle = dti.d(enf.f(a));
                return new cu(a.k(), bundle, dnz.a, null, "album_name");
            }

            public final void a()
            {
            }

            public final void a(Object obj)
            {
                obj = (Cursor)obj;
                if (duc.a(((Cursor) (obj))))
                {
                    AlbumTracksAdapter albumtracksadapter = enf.B(a);
                    albumtracksadapter.a.clear();
                    albumtracksadapter.b = ((Cursor) (obj));
                    if (obj == null || !((Cursor) (obj)).moveToFirst())
                    {
                        albumtracksadapter.notifyDataSetInvalidated();
                    } else
                    {
                        do
                        {
                            dnz dnz1 = new dnz();
                            dnz1.a(((Cursor) (obj)), albumtracksadapter.c);
                            albumtracksadapter.a.add(dnz1);
                        } while (((Cursor) (obj)).moveToNext());
                        albumtracksadapter.notifyDataSetChanged();
                    }
                    if (enf.c(a) != null)
                    {
                        enf.b(a, ((Cursor) (obj)));
                    }
                    enf.u(a);
                    enf.C(a).d(0);
                    ((fpe)a.k()).P_();
                    if (enf.D(a) != null && ((Cursor) (obj)).getCount() > 0)
                    {
                        a.z_().onRestoreInstanceState(enf.D(a));
                        enf.E(a);
                    }
                    enf.p(a).a(Integer.valueOf(1), ((Cursor) (obj)));
                }
            }

            
            {
                a = enf.this;
                super();
            }
        };
    }

    static void A(enf enf1)
    {
        enf1.L();
    }

    static AlbumTracksAdapter B(enf enf1)
    {
        return enf1.am;
    }

    static ftg C(enf enf1)
    {
        return enf1.al;
    }

    static Parcelable D(enf enf1)
    {
        return enf1.at;
    }

    static Parcelable E(enf enf1)
    {
        enf1.at = null;
        return null;
    }

    static String[] H()
    {
        return b;
    }

    private ToggleButton J()
    {
        ay = (ToggleButton)LayoutInflater.from(k()).inflate(0x7f0300c8, null);
        ay.setVisibility(0);
        ay.setOnClickListener(new android.view.View.OnClickListener() {

            private enf a;

            public final void onClick(View view)
            {
                enf.j(a);
            }

            
            {
                a = enf.this;
                super();
            }
        });
        return ay;
    }

    private gbg K()
    {
        aL = new gbg(k());
        android.view.View.OnClickListener onclicklistener = new android.view.View.OnClickListener() {

            private enf a;

            public final void onClick(View view)
            {
                enf.e(a);
                fop.a(a.k(), enf.b(a), ClientEventFactory.a("album", com.spotify.mobile.android.util.ClientEvent.SubEvent.ar, null, null));
                view = gms.a(a.k(), enf.l(a)).a(enf.k(a)).a;
                a.k().startActivity(view);
            }

            
            {
                a = enf.this;
                super();
            }
        };
        aL.a(onclicklistener);
        aL.b(b(0x7f080069));
        return aL;
    }

    private void L()
    {
        boolean flag = false;
        int i1;
        if (am != null && am.getCount() > 0)
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
            i1 = aC;
        }
        ap.a(i1, aD);
    }

    static int a(enf enf1, int i1)
    {
        enf1.ak = i1;
        return i1;
    }

    static Cursor a(enf enf1, Cursor cursor)
    {
        enf1.an = cursor;
        return cursor;
    }

    static CollectionState a(enf enf1, CollectionState collectionstate)
    {
        enf1.aj = collectionstate;
        return collectionstate;
    }

    static Flags a(enf enf1)
    {
        return enf1.aM;
    }

    public static enf a(String s1, String s2, Flags flags)
    {
        Bundle bundle = new Bundle();
        bundle.putString("collection_album_uri", s1);
        bundle.putString("title", s2);
        bundle.putBoolean("is_sub_fragment", false);
        s1 = new enf();
        s1.f(bundle);
        fyw.a(s1, flags);
        return s1;
    }

    static String a(enf enf1, String s1)
    {
        enf1.Y = s1;
        return s1;
    }

    static boolean a(enf enf1, boolean flag)
    {
        enf1.az = flag;
        return flag;
    }

    static int b(enf enf1, int i1)
    {
        enf1.aC = i1;
        return i1;
    }

    static Verified b(enf enf1)
    {
        return enf1.aF;
    }

    static String b(enf enf1, String s1)
    {
        enf1.Z = s1;
        return s1;
    }

    static void b(enf enf1, Cursor cursor)
    {
        int i1 = 0;
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) 
        {
            i1 += cursor.getInt(19);
        }
        enf1.aL.a(i1);
    }

    static boolean b(enf enf1, boolean flag)
    {
        enf1.aB = flag;
        return flag;
    }

    static int c(enf enf1, int i1)
    {
        enf1.aD = i1;
        return i1;
    }

    static dja c(enf enf1)
    {
        return enf1.au;
    }

    static String c(enf enf1, String s1)
    {
        enf1.aa = s1;
        return s1;
    }

    static boolean c(enf enf1, boolean flag)
    {
        enf1.af = flag;
        return flag;
    }

    static DownloadHeaderView d(enf enf1)
    {
        return enf1.ap;
    }

    static String d(enf enf1, String s1)
    {
        enf1.ab = s1;
        return s1;
    }

    static boolean d(enf enf1, boolean flag)
    {
        enf1.ag = flag;
        return flag;
    }

    static fop e(enf enf1)
    {
        return enf1.aG;
    }

    static String e(enf enf1, String s1)
    {
        enf1.ad = s1;
        return s1;
    }

    static boolean e(enf enf1, boolean flag)
    {
        enf1.ah = flag;
        return flag;
    }

    static String f(enf enf1)
    {
        return enf1.ac;
    }

    static String f(enf enf1, String s1)
    {
        enf1.ae = s1;
        return s1;
    }

    static boolean f(enf enf1, boolean flag)
    {
        enf1.ai = flag;
        return flag;
    }

    static FeatureIdentifier g(enf enf1)
    {
        return enf1.aN;
    }

    static fos h(enf enf1)
    {
        return enf1.aH;
    }

    static void i(enf enf1)
    {
        if (enf1.au == null || enf1.aj == null) goto _L2; else goto _L1
_L1:
        final class _cls6
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

        _cls6.a[enf1.aj.ordinal()];
        JVM INSTR tableswitch 1 3: default 52
    //                   1 53
    //                   2 80
    //                   3 110;
           goto _L2 _L3 _L4 _L5
_L2:
        return;
_L3:
        enf1.ay.setText(0x7f080160);
        enf1.ay.setChecked(false);
        enf1.ay.setEnabled(true);
        return;
_L4:
        enf1.ay.setText(0x7f08015f);
        enf1.ay.setChecked(false);
        enf1.ay.setEnabled(enf1.az);
        return;
_L5:
        enf1.ay.setText(0x7f080161);
        enf1.ay.setChecked(true);
        enf1.ay.setEnabled(true);
        return;
    }

    static void j(enf enf1)
    {
        Verified verified = ViewUri.am.a(enf1.Z);
        switch (_cls6.a[enf1.aj.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            fop.a(enf1.k(), enf1.aF, ClientEventFactory.a("album", com.spotify.mobile.android.util.ClientEvent.SubEvent.O, null, null));
            CollectionService.a(enf1.k(), enf1.Z, verified.toString(), enf1.aM, com.spotify.mobile.android.spotlets.collection.service.CollectionService.Messaging.b);
            return;

        case 2: // '\002'
            fop.a(enf1.k(), enf1.aF, ClientEventFactory.a("album", com.spotify.mobile.android.util.ClientEvent.SubEvent.R, null, null));
            CollectionService.a(enf1.k(), enf1.Z, verified.toString(), enf1.aM, com.spotify.mobile.android.spotlets.collection.service.CollectionService.Messaging.b);
            return;

        case 3: // '\003'
            fop.a(enf1.k(), enf1.aF, ClientEventFactory.a("album", com.spotify.mobile.android.util.ClientEvent.SubEvent.S, null, null));
            break;
        }
        CollectionService.b(enf1.k(), enf1.Z, verified.toString(), enf1.aM, com.spotify.mobile.android.spotlets.collection.service.CollectionService.Messaging.b);
    }

    static String k(enf enf1)
    {
        return enf1.aa;
    }

    static String l(enf enf1)
    {
        return enf1.ab;
    }

    static Optional m(enf enf1)
    {
        return enf1.aO;
    }

    static for n(enf enf1)
    {
        return enf1.aI;
    }

    static ewh o(enf enf1)
    {
        return enf1.aQ;
    }

    static gdd p(enf enf1)
    {
        return enf1.aJ;
    }

    static String q(enf enf1)
    {
        return enf1.Z;
    }

    static String r(enf enf1)
    {
        return enf1.Y;
    }

    static String s(enf enf1)
    {
        return enf1.ad;
    }

    static EmptyView t(enf enf1)
    {
        return enf1.ar;
    }

    static void u(enf enf1)
    {
_L2:
        return;
        if (enf1.am.b == null || !duc.a(enf1.am.b) || enf1.an == null || !duc.a(enf1.an)) goto _L2; else goto _L1
_L1:
        if (enf1.aq.d())
        {
            enf1.aq.b();
            if (enf1.au != null)
            {
                enf1.ax.post(enf1. new Runnable() {

                    private enf a;

                    public final void run()
                    {
                        if (gex.a(enf.a(a)))
                        {
                            enf.c(a).a(false);
                            return;
                        } else
                        {
                            enf.c(a).b(false);
                            return;
                        }
                    }

            
            {
                a = enf.this;
                super();
            }
                });
            }
        }
        boolean flag;
        if (enf1.am.getCount() > 0)
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
        enf1.al.b(new int[] {
            1
        });
        if (enf1.ao != null)
        {
            enf1.ao.setEnabled(false);
        }
        if (enf1.au != null)
        {
            enf1.ax.post(enf1. new Runnable() {

                private enf a;

                public final void run()
                {
                    enf.c(a).b(true);
                }

            
            {
                a = enf.this;
                super();
            }
            });
        }
_L4:
        enf1.L();
        if (!enf1.aq.d())
        {
            enf1.as.setVisibility(0);
        }
        if (enf1.aQ != null)
        {
            enf1.aQ.b(flag);
            return;
        }
        if (true) goto _L2; else goto _L3
_L3:
        enf1.al.a(new int[] {
            1
        });
        if (enf1.ao != null)
        {
            enf1.ao.setEnabled(true);
        }
          goto _L4
        if (true) goto _L2; else goto _L5
_L5:
    }

    static gbg v(enf enf1)
    {
        return enf1.aL;
    }

    static String w(enf enf1)
    {
        return enf1.ae;
    }

    static int x(enf enf1)
    {
        return enf1.ak;
    }

    static void y(enf enf1)
    {
        Object obj = "";
        if (enf1.aj == CollectionState.c)
        {
            boolean flag = fiy.a(enf1.aM);
            obj = enf1.k();
            Object obj1;
            int i1;
            if (flag)
            {
                i1 = 0x7f0803bd;
            } else
            {
                i1 = 0x7f0803bc;
            }
            obj = ((u) (obj)).getString(i1, new Object[] {
                enf1.Y
            });
        }
        obj1 = obj;
        if (enf1.am != null)
        {
            obj1 = obj;
            if (enf1.ak > enf1.am.getCount())
            {
                obj1 = enf1.k().getString(0x7f0803bb, new Object[] {
                    enf1.Y
                });
            }
        }
        enf1.ar.b(((CharSequence) (obj1)));
    }

    static boolean z(enf enf1)
    {
        return enf1.ai;
    }

    public final void A()
    {
        super.A();
        aE.b();
    }

    public final void B()
    {
        super.B();
        if (aQ != null)
        {
            aQ.a();
        }
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return (new StringBuilder("collection:album:")).append(ac).toString();
    }

    public final Uri a()
    {
        return Uri.parse(ac);
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        aM = fyw.a(this);
        if (!aw)
        {
            viewgroup = (MainActivity)k();
            ewi ewi;
            Verified verified;
            Flags flags;
            if (ggi.b(viewgroup))
            {
                au = dja.b(viewgroup).b().b(J(), 0).a(K()).a(this);
            } else
            {
                ao = gad.a(k(), null);
                ao.setOnClickListener(aS);
                au = dja.a(viewgroup).b().b(J(), 0).a(K()).b(ao).a(this);
            }
            au.a(dgo.b(viewgroup, 0x7f0101c6));
            ((djr)au.a()).a(Y);
            as = au.b();
            viewgroup = au.e().a();
        } else
        {
            as = layoutinflater.inflate(0x7f0300ce, viewgroup, false);
            viewgroup = (ListView)as.findViewById(0x102000a);
        }
        bundle = new FrameLayout(k());
        bundle.setBackgroundColor(dgo.b(k(), 0x1010054));
        bundle.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        bundle.addView(as);
        viewgroup.setFastScrollEnabled(true);
        as.setVisibility(4);
        aq = LoadingView.a(layoutinflater, k(), as);
        bundle.addView(aq);
        ar = eoo.a(k(), 0x7f0803bb);
        ar.b(k().getString(0x7f0803bb, new Object[] {
            Y
        }));
        am = new AlbumTracksAdapter(k(), gex.a(aM), aK);
        am.c = b(0x7f0803e1);
        al = new ftg(k());
        if (!gex.a(aM))
        {
            al.a(am, 0x7f08046d, 0);
        } else
        {
            al.a(am, null, 0);
        }
        al.a(new ftm(ar, false), null, 1);
        al.a(new int[] {
            1, 0
        });
        ap = (DownloadHeaderView)gaw.a(k());
        ap.c = aU;
        ap.d = aO;
        viewgroup.addHeaderView(ap, null, false);
        viewgroup.setAdapter(al);
        viewgroup.setOnItemLongClickListener(new android.widget.AdapterView.OnItemLongClickListener() {

            private enf a;

            public final boolean onItemLongClick(AdapterView adapterview, View view, int i1, long l1)
            {
                adapterview = (fxh)view.getTag(0x7f110041);
                if (adapterview != null)
                {
                    adapterview.a(a.k());
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                a = enf.this;
                super();
            }
        });
        aq.a();
        layoutinflater = k();
        viewgroup = ((giq)dmz.a(giq)).b(layoutinflater);
        ewi = aP;
        verified = aF;
        flags = aM;
        new ewg();
        aQ = new ewh(layoutinflater, ewi, viewgroup, verified, flags);
        aQ.a(aR);
        return bundle;
    }

    public final String a(Context context, Flags flags)
    {
        if (Y == null)
        {
            return context.getString(0x7f08006d);
        } else
        {
            return Y;
        }
    }

    public final void a(Bundle bundle)
    {
        boolean flag1 = true;
        super.a(bundle);
        aM = fyw.a(this);
        aN = gnl.a(this);
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
            if (bundle.containsKey("list"))
            {
                at = bundle.getParcelable("list");
            }
        }
        Bundle bundle1 = g();
        ac = bundle1.getString("collection_album_uri");
        Y = bundle1.getString("title");
        aw = bundle1.getBoolean("is_sub_fragment");
        aF = ViewUri.bp.a(ac);
        aE = ggn.a(k(), aF);
        aJ = new gdd(2, new gde() {

            public final void a()
            {
            }

        });
        boolean flag;
        if (!aw)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
        av = new gbv();
        ax = new Handler();
        aA = new gcj(k(), aT);
        aO = ewb.a(k(), aM, aF);
        if (bundle == null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        aR = flag;
    }

    public final void a(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
        b(menu);
    }

    public final void a(ListView listview, View view, int i1, long l1)
    {
        i1 -= listview.getHeaderViewsCount();
        if (i1 < 0)
        {
            return;
        }
        switch (al.b(i1))
        {
        default:
            return;

        case 0: // '\0'
            listview = dti.d(ac);
            break;
        }
        view = (doe)view.getTag();
        if (gex.a(aM))
        {
            fop.a(k(), aF, ClientEventFactory.a("album", com.spotify.mobile.android.util.ClientEvent.SubEvent.ah, view.e(), Long.valueOf(l1)));
            fos.a(k(), aF, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, FeatureIdentifier.j, aN, listview, l1, aM);
            return;
        }
        fop.a(k(), aF, ClientEventFactory.a("album", com.spotify.mobile.android.util.ClientEvent.SubEvent.ai, view.e(), Long.valueOf(l1)));
        if (ao instanceof ShufflePlayHeaderView)
        {
            ((ShufflePlayHeaderView)ao).a();
            return;
        } else
        {
            ShufflePlayHeaderView.a(av, ao);
            return;
        }
    }

    public final void b(Menu menu)
    {
        boolean flag;
        if (am != null && am.getCount() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (o() && Z != null)
        {
            if (ggi.b(k()) && flag)
            {
                ao = fzr.a(k(), menu, aF, FeatureIdentifier.j, aN, dti.d(ac));
            }
            fzt.a(k(), menu, aF, aj, az, Z, aM);
            if (flag && (com.spotify.mobile.android.provider.Metadata.OfflineSync.a(aC) || af))
            {
                u u1 = k();
                Verified verified = aF;
                Uri uri = dti.c(ac);
                com.spotify.mobile.android.util.SpotifyLink.LinkType linktype = (new SpotifyLink(ac)).c;
                fzt.a(u1, menu, verified, uri, aC, aD, aO);
            }
            if (aB && flag)
            {
                fzt.a(k(), menu, aF, ac, aM);
            }
            if (ah)
            {
                u u2 = k();
                Verified verified1 = aF;
                String s1 = Z;
                String s2 = Y;
                if (!fzt.a(u2))
                {
                    fzt.a(u2, menu, verified1, 0x7f1100d3, 0x7f08039f, com.spotify.mobile.android.util.ClientEvent.Event.q, s1, s2);
                }
            }
            if (ab != null && !gbx.a(aa) && ai)
            {
                fzt.a(k(), menu, aF, ab, aa);
            }
            fzr.a(k(), menu, aF, a(k(), aM), "", ad, Z);
            if (ag)
            {
                fzr.a(k(), menu, aF, Z, Y, aM);
            }
        }
    }

    public final void c()
    {
        super.c();
        u().a(0x7f11006b, null, aV);
        u().a(0x7f11006d, null, aW);
        u().a(0x7f11006c, null, aA);
    }

    public final void d()
    {
        super.d();
        u().a(0x7f11006b);
        u().a(0x7f11006d);
        u().a(0x7f11006c);
        if (aQ != null)
        {
            aQ.b(false);
        }
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        if (z_() != null)
        {
            bundle.putParcelable("list", z_().onSaveInstanceState());
        }
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.j;
    }

    public final void z()
    {
        super.z();
        aE.a();
    }

}
