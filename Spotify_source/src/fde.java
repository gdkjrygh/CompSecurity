// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.SectionHeaderView;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.provider.Metadata;
import com.spotify.mobile.android.spotlets.collection.service.CollectionService;
import com.spotify.mobile.android.spotlets.collection.util.CollectionContains;
import com.spotify.mobile.android.spotlets.playlist.activity.CreateRenamePlaylistActivity;
import com.spotify.mobile.android.spotlets.playlist.util.PlaylistLogger;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import java.util.Locale;

public final class fde extends Fragment
{

    private LoadingView Y;
    private String Z;
    ftg a;
    private String aa;
    private String ab;
    private fsw ac;
    private fsw ad;
    private boolean ae;
    private boolean af;
    private boolean ag;
    private Flags ah;
    private String ai;
    private com.spotify.mobile.android.spotlets.playlist.util.PlaylistLogger.SourceAction aj;
    private long ak;
    private PlaylistLogger al;
    private Resolver am;
    private CollectionContains an;
    private gdd ao;
    private gde ap;
    private android.widget.AdapterView.OnItemClickListener aq;
    private an ar;
    private an as;
    private ListView b;

    public fde()
    {
        ap = new gde() {

            private fde a;

            public final void a()
            {
                fde.a(a);
            }

            
            {
                a = fde.this;
                super();
            }
        };
        aq = new android.widget.AdapterView.OnItemClickListener() {

            private fde a;

            public final void onItemClick(AdapterView adapterview, View view, int i1, long l1)
            {
                int j1 = a.a.b(i1);
                if (j1 == 1)
                {
                    if (fde.d(a))
                    {
                        adapterview = CreateRenamePlaylistActivity.a(a.k(), fde.e(a), fde.f(a), fde.g(a), fde.h(a));
                    } else
                    {
                        adapterview = CreateRenamePlaylistActivity.a(a.k(), fde.e(a), fde.g(a), fde.h(a));
                    }
                    fde.j(a).a("create-new-playlist", null, 0L, fde.i(a), null);
                    a.a(adapterview);
                    a.k().finish();
                } else
                {
                    if (j1 == 0)
                    {
                        CollectionService.a(a.k(), fde.e(a), ViewUri.az.toString(), fde.h(a), com.spotify.mobile.android.spotlets.collection.service.CollectionService.Messaging.c);
                        fde.j(a).a("add-to-collection", null, 0L, fde.i(a), null);
                        a.k().finish();
                        return;
                    }
                    ContentValues contentvalues = new ContentValues();
                    adapterview = (new SpotifyLink(fde.e(a))).c;
                    boolean flag1;
                    if (adapterview == com.spotify.mobile.android.util.SpotifyLink.LinkType.aT)
                    {
                        contentvalues.put("uri", fde.e(a));
                        flag1 = false;
                    } else
                    if (adapterview == com.spotify.mobile.android.util.SpotifyLink.LinkType.c)
                    {
                        contentvalues.put("uri", fde.e(a));
                        flag1 = true;
                    } else
                    {
                        Assertion.a((new StringBuilder("Unknown link type: ")).append(adapterview).toString());
                        return;
                    }
                    adapterview = ((AdapterView) (view.getTag()));
                    if (adapterview instanceof doc)
                    {
                        view = (doc)adapterview;
                        if (view.m())
                        {
                            adapterview = a.m().a();
                            adapterview.a(0x7f1100ff, fde.a(view.a(), fde.e(a), fde.g(a), fde.h(a), fde.k(a), fde.l(a)));
                            adapterview.b();
                            adapterview.c();
                            return;
                        }
                        boolean flag;
                        if (j1 == 2)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        j1 = a.a.a(i1, j1);
                        if (!flag)
                        {
                            i1 = fde.m(a).getCount();
                        } else
                        {
                            i1 = 0;
                        }
                        i1 += j1;
                        if (flag)
                        {
                            fde.j(a).a("add-to-playlist", "recently-changed-playlists", i1, fde.i(a), view.a());
                        } else
                        {
                            PlaylistLogger playlistlogger = fde.j(a);
                            flag2 = fde.d(a);
                            l1 = i1;
                            long l2 = fde.i(a);
                            String s = view.a();
                            if (flag2)
                            {
                                adapterview = PlaylistLogger.b;
                            } else
                            {
                                adapterview = PlaylistLogger.a;
                            }
                            playlistlogger.a(adapterview, "all-playlists", l1, l2, s);
                        }
                        if (view.j() != 0)
                        {
                            fnt.a();
                            adapterview = a;
                            boolean flag2;
                            if (view.j() == 1)
                            {
                                flag2 = true;
                            } else
                            {
                                flag2 = false;
                            }
                            fde.a(adapterview, flag1, flag2, contentvalues, view);
                            return;
                        } else
                        {
                            fde.a(a, contentvalues, view, false);
                            return;
                        }
                    }
                }
            }

            
            {
                a = fde.this;
                super();
            }
        };
        ar = new an() {

            private fde a;

            public final da a(Bundle bundle)
            {
                bundle = Metadata.a(dtu.a(com.spotify.mobile.android.provider.Metadata.PlaylistFilter.e, ""), fde.e(a));
                String s = String.format(Locale.US, "limit=%d", new Object[] {
                    Integer.valueOf(3)
                });
                return new cu(a.k(), bundle, dny.a, s, "recently_changed");
            }

            public final void a()
            {
                fde.m(a).b(null);
            }

            public final void a(Object obj)
            {
                obj = (Cursor)obj;
                fde.m(a).b(((Cursor) (obj)));
                fde.n(a).a(Integer.valueOf(0), ((Cursor) (obj)));
            }

            
            {
                a = fde.this;
                super();
            }
        };
        as = new an() {

            private fde a;

            public final da a(Bundle bundle)
            {
                if (fde.d(a))
                {
                    bundle = Metadata.a(dtl.a(fde.f(a), com.spotify.mobile.android.provider.Metadata.PlaylistFilter.c, ""), fde.e(a));
                    return new cu(a.k(), bundle, dny.a, null, null);
                } else
                {
                    bundle = Metadata.a(dtu.a(com.spotify.mobile.android.provider.Metadata.PlaylistFilter.c, ""), fde.e(a));
                    return new cu(a.k(), bundle, dny.a, null, enj.a(((giq)dmz.a(giq)).b(a.k())).a());
                }
            }

            public final void a()
            {
                fde.o(a).b(null);
            }

            public final void a(Object obj)
            {
                obj = (Cursor)obj;
                fde.o(a).b(((Cursor) (obj)));
                fde.n(a).a(Integer.valueOf(1), ((Cursor) (obj)));
            }

            
            {
                a = fde.this;
                super();
            }
        };
    }

    private void F()
    {
        if (af && ag && Y.d())
        {
            Y.b();
        }
    }

    private View a(String s, SpotifyIcon spotifyicon)
    {
        ddi ddi1 = dds.a(k(), b);
        ddi1.a(true);
        ddi1.a(s);
        s = new dfz(k(), spotifyicon);
        s.a(dgo.c(k(), 0x7f0101c7));
        ddi1.d().setImageDrawable(s);
        ddi1.d().setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        return ddi1.a();
    }

    public static fde a(String s, String s1, Flags flags, String s2, com.spotify.mobile.android.spotlets.playlist.util.PlaylistLogger.SourceAction sourceaction)
    {
        return a(null, s, s1, flags, s2, sourceaction);
    }

    public static fde a(String s, String s1, String s2, Flags flags, String s3, com.spotify.mobile.android.spotlets.playlist.util.PlaylistLogger.SourceAction sourceaction)
    {
        Bundle bundle = new Bundle();
        bundle.putString("folder_uri", s);
        bundle.putString("item_uri", s1);
        bundle.putString("default_name", s2);
        bundle.putString("view_uri", s3);
        bundle.putSerializable("source_action", sourceaction);
        s = new fde();
        s.f(bundle);
        fyw.a(s, flags);
        return s;
    }

    static void a(fde fde1)
    {
        fde1.a.b(new int[] {
            1
        });
        if (fde1.ad.getCount() >= 8 && fde1.ac.getCount() > 0)
        {
            fde1.a.b(new int[] {
                2, 3
            });
            fde1.a.d(2);
        } else
        {
            fde1.a.a(new int[] {
                2, 3
            });
        }
        fde1.ak = fde1.ad.getCount() + fde1.ac.getCount();
        fde1.a.d(4);
        fde1.ag = true;
        fde1.F();
    }

    static void a(fde fde1, ContentValues contentvalues, doc doc1, boolean flag)
    {
        android.net.Uri uri = dtt.a(dtt.b(doc1.a()), flag);
        fde1.k().getContentResolver().insert(uri, contentvalues);
        ((ggc)dmz.a(ggc)).d(fde1.k(), doc1.b());
        fde1.k().finish();
    }

    static void a(fde fde1, com.spotify.mobile.android.util.ClientEvent.SubEvent subevent)
    {
        dmz.a(fop);
        fop.a(fde1.k(), ViewUri.az, ClientEventFactory.a("duplicates-popup", subevent, null, null));
    }

    static void a(fde fde1, boolean flag, boolean flag1, ContentValues contentvalues, doc doc1)
    {
        TextView textview;
        int i1;
        int j1;
        int k1;
        int l1;
        if (flag)
        {
            j1 = 0x7f08005d;
            k1 = 0x7f08005f;
            l1 = 0x7f080061;
            i1 = 0x7f08005b;
        } else
        {
            j1 = 0x7f08005e;
            k1 = 0x7f080060;
            l1 = 0x7f080062;
            i1 = 0x7f08005c;
        }
        textview = dgp.a(fde1.k(), null);
        dgo.a(fde1.k(), textview, 0x7f0b0142);
        textview.setText(i1);
        (new dfj(fde1.k(), 0x7f0b017f)).a(k1, fde1. new android.content.DialogInterface.OnClickListener(flag, flag1, contentvalues, doc1) {

            private boolean a;
            private boolean b;
            private ContentValues c;
            private doc d;
            private fde e;

            public final void onClick(DialogInterface dialoginterface, int i2)
            {
                fde.a(e, com.spotify.mobile.android.util.ClientEvent.SubEvent.Q);
                if (a && b)
                {
                    fde.a(e, c, d, true);
                    return;
                } else
                {
                    e.k().finish();
                    return;
                }
            }

            
            {
                e = fde.this;
                a = flag;
                b = flag1;
                c = contentvalues;
                d = doc1;
                super();
            }
        }).b(j1, fde1. new android.content.DialogInterface.OnClickListener(contentvalues, doc1) {

            private ContentValues a;
            private doc b;
            private fde c;

            public final void onClick(DialogInterface dialoginterface, int i2)
            {
                fde.a(c, com.spotify.mobile.android.util.ClientEvent.SubEvent.P);
                fde.a(c, a, b, false);
            }

            
            {
                c = fde.this;
                a = contentvalues;
                b = doc1;
                super();
            }
        }).a(textview).a(l1).b().show();
    }

    private boolean a()
    {
        return aa != null;
    }

    static boolean b(fde fde1)
    {
        fde1.af = true;
        return true;
    }

    static void c(fde fde1)
    {
        fde1.F();
    }

    static boolean d(fde fde1)
    {
        return fde1.a();
    }

    static String e(fde fde1)
    {
        return fde1.Z;
    }

    static String f(fde fde1)
    {
        return fde1.aa;
    }

    static String g(fde fde1)
    {
        return fde1.ab;
    }

    static Flags h(fde fde1)
    {
        return fde1.ah;
    }

    static long i(fde fde1)
    {
        return fde1.ak;
    }

    static PlaylistLogger j(fde fde1)
    {
        return fde1.al;
    }

    static String k(fde fde1)
    {
        return fde1.ai;
    }

    static com.spotify.mobile.android.spotlets.playlist.util.PlaylistLogger.SourceAction l(fde fde1)
    {
        return fde1.aj;
    }

    static fsw m(fde fde1)
    {
        return fde1.ac;
    }

    static gdd n(fde fde1)
    {
        return fde1.ao;
    }

    static fsw o(fde fde1)
    {
        return fde1.ad;
    }

    public final void B()
    {
        super.B();
        am.destroy();
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        boolean flag = true;
        viewgroup = (ViewGroup)layoutinflater.inflate(0x7f030074, viewgroup, false);
        b = (ListView)viewgroup.findViewById(0x102000a);
        b.setBackgroundColor(dgo.b(k(), 0x7f0101b2));
        b.setVisibility(4);
        Y = LoadingView.a(layoutinflater, k(), b);
        Y.a();
        viewgroup.addView(Y);
        boolean flag1;
        if (!a() && ((Boolean)ah.a(fys.I)).booleanValue())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ae = flag1;
        a = new ftg(k());
        if (fdo.a(ah) && !a())
        {
            af = false;
            int i1;
            if (fiy.a(ah))
            {
                i1 = 0x7f0802e6;
            } else
            {
                i1 = 0x7f0802e5;
            }
            layoutinflater = b(i1);
            a.a(new ftm(a(((String) (layoutinflater)), SpotifyIcon.H), true), null, 0);
            a.b(new int[] {
                0
            });
            an.a(Z, new eol() {

                private fde a;

                public final void a(String s)
                {
                    a.a.a(new int[] {
                        0
                    });
                    fde.b(a);
                    fde.c(a);
                }

                public final void a(String s, boolean flag2)
                {
                    if (flag2)
                    {
                        a.a.a(new int[] {
                            0
                        });
                    }
                    fde.b(a);
                    fde.c(a);
                }

            
            {
                a = fde.this;
                super();
            }
            });
        } else
        {
            af = true;
        }
        a.a(new ftm(a(b(0x7f0802e7), SpotifyIcon.aj), true), null, 1);
        ac = new fsw(k());
        a.a(ac, 0x7f080064, 2);
        layoutinflater = new SectionHeaderView(k());
        layoutinflater.a(k().getString(0x7f080063));
        layoutinflater.b(true);
        a.a(new ftm(layoutinflater), null, 3);
        ad = new fsw(k());
        a.a(ad, null, 4);
        b.setAdapter(a);
        b.setOnItemClickListener(aq);
        i1 = ((flag) ? 1 : 0);
        if (ae)
        {
            i1 = 2;
        }
        ao = new gdd(i1, ap);
        u().a(0x7f11005d, null, as);
        if (ae)
        {
            u().a(0x7f11005c, null, ar);
        }
        return viewgroup;
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        am = Cosmos.getResolver(k());
        if (an == null)
        {
            an = new CollectionContains(am);
        }
        aa = g().getString("folder_uri");
        Z = g().getString("item_uri");
        ab = g().getString("default_name");
        ai = g().getString("view_uri");
        aj = (com.spotify.mobile.android.spotlets.playlist.util.PlaylistLogger.SourceAction)g().getSerializable("source_action");
        ah = fyw.a(this);
        bundle = k();
        dmz.a(fop);
        al = new PlaylistLogger(bundle, Z, ai, aj);
    }
}
