// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ToggleButton;
import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import com.spotify.android.paste.widget.SectionHeaderView;
import com.spotify.android.paste.widget.prettylist.StickyListView;
import com.spotify.mobile.android.spotlets.artist.adapters.ArtistSectionedListAdapter;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel;
import com.spotify.mobile.android.spotlets.artist.model.Image;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.view.ShufflePlayHeaderView;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.List;

public final class ejz
{

    final Context a;
    protected final eiz b;
    protected final Flags c;
    public ListView d;
    public ejl e;
    protected View f;
    protected fos g;
    public View h;
    public ArtistSectionedListAdapter i;
    public eka j;
    public Verified k;
    FeatureIdentifier l;
    public String m;
    public final android.view.View.OnClickListener n = new android.view.View.OnClickListener() {

        private ejz a;

        public final void onClick(View view)
        {
            ejz ejz1 = a;
            ejr ejr1 = (ejr)view.getTag();
            if (ejr1 == null)
            {
                if (!(view instanceof SectionHeaderView))
                {
                    Assertion.b("onItemClick called with a null tag item for the view");
                }
                return;
            } else
            {
                ejr1.a(ejz1. new ejs() {

                    private ejz a;

                    public final void a()
                    {
                        fop.a(a.a, a.k, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, ClientEventFactory.a("artist", com.spotify.mobile.android.util.ClientEvent.SubEvent.bc, a.b.b(), null));
                        a.a.startActivity(gms.a(a.a, a.b.b()).a(ejz.a(a)).a);
                    }

                    public final void a(ejq ejq1)
                    {
                        fop.a(a.a, a.k, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, ClientEventFactory.a("artist", com.spotify.mobile.android.util.ClientEvent.SubEvent.be, a.b.b(), null));
                        ejz.a(a).putInt("concert_id", ejq1.a);
                        ejq1 = a.a;
                        Context context = a.a;
                        eiz eiz1 = a.b;
                        ejq1.startActivity(gms.a(context, (new StringBuilder()).append(eiz1.c()).append(":concert").toString()).a(ejz.a(a)).a);
                    }

                    public final void a(ejt ejt1)
                    {
                        fop.a(a.a, a.k, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, ClientEventFactory.a("artist", com.spotify.mobile.android.util.ClientEvent.SubEvent.bf, a.b.b(), null));
                        a.a.startActivity((new Intent("android.intent.action.VIEW")).setData(Uri.parse(ejt1.a)));
                    }

                    public final void a(eju eju1)
                    {
                        fop.a(a.a, a.k, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, ClientEventFactory.a("artist", com.spotify.mobile.android.util.ClientEvent.SubEvent.au, a.b.b(), null));
                        if (eju1.a.equals("viewall"))
                        {
                            eju1 = a.b;
                            Context context = a.a;
                            Bundle bundle = a.c();
                            eju1 = (new eje(((eja) (eju1)).b)).a(context, bundle);
                        } else
                        {
                            eju1 = gms.a(a.a, eju1.a).a(ejz.a(a)).a;
                        }
                        a.a.startActivity(eju1);
                    }

                    public final void a(ejw ejw1)
                    {
                        ejw1 = gms.a(a.a, ejw1.a).a(ejz.a(a)).a;
                        a.a.startActivity(ejw1);
                    }

                    public final void a(ejx ejx1)
                    {
                        Uri uri = dth.b(a.b.c());
                        if (gex.a(a.c))
                        {
                            fos.a(a.a, a.k, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, FeatureIdentifier.K, a.l, uri, ejx1.a(), a.c);
                            fop.a(a.a, a.k, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, ClientEventFactory.a(uri, ejx1.a()));
                            return;
                        } else
                        {
                            fop.a(a.a, a.k, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, ClientEventFactory.b(uri, ejx1.a()));
                            ShufflePlayHeaderView.a(new gbv(), a.f);
                            return;
                        }
                    }

                    public final void a(ejy ejy1)
                    {
                        ejz.a(a, ejy1.a);
                    }

                    public final void b()
                    {
                        fop.a(a.a, a.k, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, ClientEventFactory.a("artist", com.spotify.mobile.android.util.ClientEvent.SubEvent.bd, a.b.b(), null));
                        a.a.startActivity(gms.a(a.a, (new ejb(((eja) (a.b)).b)).c()).a(ejz.a(a)).a);
                    }

            
            {
                a = ejz.this;
                super();
            }
                });
                return;
            }
        }

            
            {
                a = ejz.this;
                super();
            }
    };
    private Fragment o;
    private dja p;
    private ArtistModel q;
    private final gbf r;
    private gji s;
    private boolean t;
    private android.view.View.OnClickListener u;

    public ejz(Context context, Fragment fragment, eiz eiz1, FeatureIdentifier featureidentifier, Flags flags, boolean flag)
    {
        g = (fos)dmz.a(fos);
        dmz.a(fop);
        u = new android.view.View.OnClickListener() {

            private ejz a;

            public final void onClick(View view)
            {
                fop.a(a.a, a.k, ClientEventFactory.a("artist", com.spotify.mobile.android.util.ClientEvent.SubEvent.X, null, null));
                view = dth.b(a.b.c());
                fos.a(a.a, a.k, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, FeatureIdentifier.K, a.l, view);
            }

            
            {
                a = ejz.this;
                super();
            }
        };
        a = context;
        o = fragment;
        b = eiz1;
        c = flags;
        t = flag;
        l = featureidentifier;
        r = new gbf(context);
        k = ViewUri.an.a(b.c());
        dmz.a(gjj);
        s = gjj.a(context);
    }

    static Bundle a(ejz ejz1)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("artist_model", ejz1.q);
        return bundle;
    }

    static void a(ejz ejz1, com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ReleaseType releasetype)
    {
        eiz eiz1 = ejz1.b;
        Context context = ejz1.a;
        Bundle bundle = ejz1.c();
        releasetype = (new ejg(((eja) (eiz1)).b, releasetype)).a(context, bundle);
        ejz1.a.startActivity(releasetype);
    }

    private void d()
    {
        if (f != null && q != null)
        {
            View view = f;
            boolean flag;
            if (!q.topTracks.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setEnabled(flag);
        }
    }

    public final void a()
    {
        e = new ejl(a, j);
        if (!t)
        {
            if (ggi.b(a))
            {
                p = dja.b(a).b().b().a(o);
            } else
            {
                f = gad.a(a, null);
                f.setOnClickListener(u);
                djd djd1 = dja.a(a);
                int i1;
                if (dgn.a(a))
                {
                    i1 = 0;
                } else
                {
                    i1 = 1;
                }
                p = djd1.a(i1).b(e.a, 1).b(f).a(true).a(o);
            }
            p.c().setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            d = p.e().a();
            h = p.b();
            return;
        } else
        {
            h = LayoutInflater.from(a).inflate(0x7f0300ce, null);
            d = (ListView)h.findViewById(0x102000a);
            return;
        }
    }

    public final void a(View view)
    {
        f = view;
        d();
    }

    public final void a(ArtistModel artistmodel)
    {
        q = artistmodel;
        if (!t)
        {
            Object obj = artistmodel.getInfoSafe().portraits;
            if (((List) (obj)).size() != 0)
            {
                Object obj1 = dto.a(((Image)((List) (obj)).get(0)).uri);
                s.a(p.d(), ((Uri) (obj1)));
                com.spotify.mobile.android.spotlets.artist.adapters.ArtistSectionedListAdapter.Section asection[];
                Object obj2;
                Object obj3;
                Object obj4;
                String s1;
                int i1;
                int j1;
                if (dgn.a(a))
                {
                    obj = null;
                } else
                if (artistmodel.getInfoSafe().verified)
                {
                    obj = r;
                } else
                {
                    obj = dfo.a();
                }
                obj2 = s;
                obj3 = p.c();
                obj4 = p.g();
                ((gji) (obj2)).a(((ImageView) (obj3)), ((Uri) (obj1)), dff.a(((gji) (obj2)).a), ((dfv) (obj)), ((gve) (obj4)));
                if (((com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ArtistGallery)artistmodel.gallery.a(com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ArtistGallery.EMPTY_GALLERY)).images.size() > 0)
                {
                    p.c().setOnClickListener(new android.view.View.OnClickListener(artistmodel) {

                        private ArtistModel a;
                        private ejz b;

                        public final void onClick(View view)
                        {
                            view = b.a;
                            Context context = b.a;
                            eiz eiz1 = ejh.a(a.uri);
                            view.startActivity(gms.a(context, (new StringBuilder()).append(eiz1.c()).append(":gallery").toString()).a);
                        }

            
            {
                b = ejz.this;
                a = artistmodel;
                super();
            }
                    });
                    p.c().setContentDescription(a.getString(0x7f080348));
                }
            } else
            {
                p.c().setImageDrawable(dff.a(a));
            }
        }
        d();
        if (q.monthlyListeners.b() && !t)
        {
            i1 = Integer.parseInt((String)ctz.a(((com.spotify.mobile.android.spotlets.artist.model.ArtistModel.MonthlyListeners)q.monthlyListeners.c()).mListenerCount));
            ((djr)p.a()).b(a.getResources().getQuantityString(0x7f09000f, i1, new Object[] {
                Integer.valueOf(i1)
            }));
        }
        i = new ArtistSectionedListAdapter(a, n, c);
        obj = i;
        obj1 = new eik(((ftg) (obj)).d, artistmodel.uri, ((ArtistSectionedListAdapter) (obj)).a, ((ArtistSectionedListAdapter) (obj)).b);
        obj2 = ViewUri.an.a(artistmodel.uri);
        obj3 = artistmodel.customMessage;
        if (((Optional) (obj3)).b())
        {
            obj3 = ((com.spotify.mobile.android.spotlets.artist.model.ArtistModel.CustomMessage)((Optional) (obj3)).c()).bodyText;
            if (!TextUtils.isEmpty(((CharSequence) (obj3))))
            {
                ((ArtistSectionedListAdapter) (obj)).a(new eim(((ftg) (obj)).d, ((String) (obj3))), com.spotify.mobile.android.spotlets.artist.adapters.ArtistSectionedListAdapter.Section.a);
            }
        }
        obj3 = artistmodel.latestRelease;
        if (((Optional) (obj3)).b())
        {
            obj3 = Lists.a(new com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Release[] {
                (com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Release)((Optional) (obj3)).c()
            });
            obj4 = ((eik) (obj1)).b;
            s1 = ((eik) (obj1)).c;
            ((ArtistSectionedListAdapter) (obj)).a((new eiv(((eix) (obj4)).a, s1, ((List) (obj3)), ((eix) (obj4)).b, ((eix) (obj4)).c)).a(), com.spotify.mobile.android.spotlets.artist.adapters.ArtistSectionedListAdapter.Section.b);
        }
        obj3 = artistmodel.topTracks;
        if (!((List) (obj3)).isEmpty())
        {
            obj.c = new eir(((ftg) (obj)).d, ((List) (obj3)), ((Verified) (obj2)), ((ArtistSectionedListAdapter) (obj)).a, ((ArtistSectionedListAdapter) (obj)).b);
            ((ArtistSectionedListAdapter) (obj)).a(((ArtistSectionedListAdapter) (obj)).c, com.spotify.mobile.android.spotlets.artist.adapters.ArtistSectionedListAdapter.Section.c);
        }
        obj3 = ((ArtistSectionedListAdapter) (obj)).b;
        ((ftg) (obj)).a(new eiq(((eik) (obj1)).a, artistmodel.uri, artistmodel.getInfoSafe().getDefaultPortraitUri(), artistmodel.getInfoSafe().name, ((Flags) (obj3))), null, com.spotify.mobile.android.spotlets.artist.adapters.ArtistSectionedListAdapter.Section.d.ordinal());
        obj3 = artistmodel.relatedArtists;
        if (!((List) (obj3)).isEmpty())
        {
            ((ArtistSectionedListAdapter) (obj)).a(new eis(((ftg) (obj)).d, TextUtils.join(", ", ((Iterable) (obj3))), new ejv(), ((ArtistSectionedListAdapter) (obj)).a), com.spotify.mobile.android.spotlets.artist.adapters.ArtistSectionedListAdapter.Section.e);
        }
        obj3 = artistmodel.upcomingConcerts;
        if (!((List) (obj3)).isEmpty())
        {
            ((ArtistSectionedListAdapter) (obj)).a(new eil(((ftg) (obj)).d, ((List) (obj3)), ((ArtistSectionedListAdapter) (obj)).a), com.spotify.mobile.android.spotlets.artist.adapters.ArtistSectionedListAdapter.Section.f);
        }
        ((ArtistSectionedListAdapter) (obj)).a(com.spotify.mobile.android.spotlets.artist.adapters.ArtistSectionedListAdapter.ReleasesSection.a, artistmodel, ((eik) (obj1)));
        if (gex.a(((ArtistSectionedListAdapter) (obj)).b))
        {
            ((ArtistSectionedListAdapter) (obj)).a(com.spotify.mobile.android.spotlets.artist.adapters.ArtistSectionedListAdapter.ReleasesSection.b, artistmodel, ((eik) (obj1)));
        }
        ((ArtistSectionedListAdapter) (obj)).a(com.spotify.mobile.android.spotlets.artist.adapters.ArtistSectionedListAdapter.ReleasesSection.c, artistmodel, ((eik) (obj1)));
        obj3 = artistmodel.playlists;
        if (!((List) (obj3)).isEmpty())
        {
            ((ArtistSectionedListAdapter) (obj)).a(new eip(((ftg) (obj)).d, ((List) (obj3)), ((Verified) (obj2)), true, ((ArtistSectionedListAdapter) (obj)).a, ((ArtistSectionedListAdapter) (obj)).b), com.spotify.mobile.android.spotlets.artist.adapters.ArtistSectionedListAdapter.Section.j);
        }
        ((ArtistSectionedListAdapter) (obj)).a(com.spotify.mobile.android.spotlets.artist.adapters.ArtistSectionedListAdapter.ReleasesSection.d, artistmodel, ((eik) (obj1)));
        obj1 = artistmodel.biography;
        if (((Optional) (obj1)).b())
        {
            obj1 = Html.fromHtml((String)((Optional) (obj1)).c()).toString();
            ((ArtistSectionedListAdapter) (obj)).a(new eis(((ftg) (obj)).d, ((String) (obj1)), new ejp(), ((ArtistSectionedListAdapter) (obj)).a), com.spotify.mobile.android.spotlets.artist.adapters.ArtistSectionedListAdapter.Section.l);
        }
        obj1 = artistmodel.merchandise;
        if (((Optional) (obj1)).b())
        {
            ((ArtistSectionedListAdapter) (obj)).a(new eio(((ftg) (obj)).d, (List)((Optional) (obj1)).c(), ((ArtistSectionedListAdapter) (obj)).a), com.spotify.mobile.android.spotlets.artist.adapters.ArtistSectionedListAdapter.Section.m);
        }
        asection = com.spotify.mobile.android.spotlets.artist.adapters.ArtistSectionedListAdapter.Section.values();
        j1 = asection.length;
        for (i1 = 0; i1 < j1; i1++)
        {
            obj2 = asection[i1];
            if (((ArtistSectionedListAdapter) (obj)).c(((com.spotify.mobile.android.spotlets.artist.adapters.ArtistSectionedListAdapter.Section) (obj2)).ordinal()))
            {
                ((ArtistSectionedListAdapter) (obj)).d(((com.spotify.mobile.android.spotlets.artist.adapters.ArtistSectionedListAdapter.Section) (obj2)).ordinal());
            }
        }

        i.a(m);
        if (!t)
        {
            artistmodel = artistmodel.getInfoSafe().name;
            ((djr)p.a()).a(artistmodel);
        }
        d.setAdapter(i);
    }

    public final void a(boolean flag, int i1, int j1)
    {
        ejl ejl1 = e;
        ejl1.a.setVisibility(0);
        ejl1.a.setChecked(flag);
        if (q != null && !q.monthlyListeners.b() && !t)
        {
            djr djr1 = (djr)p.a();
            Object obj = a;
            cvp.a(obj);
            String s1 = ((Context) (obj)).getResources().getQuantityString(0x7f090001, i1, new Object[] {
                Integer.valueOf(i1)
            });
            String s2 = ((Context) (obj)).getResources().getString(0x7f0800c6, new Object[] {
                Integer.valueOf(j1)
            });
            obj = s1;
            if (j1 != 0)
            {
                obj = ctw.a(" \u2022 ").a(s1, s2, new Object[0]);
            }
            djr1.b(((CharSequence) (obj)));
        }
    }

    public final void b()
    {
        u.onClick(f);
    }

    final Bundle c()
    {
        Bundle bundle = new Bundle();
        if (q != null)
        {
            bundle.putString("artist_name", q.getInfoSafe().name);
        }
        return bundle;
    }
}
