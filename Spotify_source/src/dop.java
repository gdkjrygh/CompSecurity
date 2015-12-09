// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.spotify.android.glue.organisms.header.GlueCoverArtHeaderView;
import com.spotify.android.glue.organisms.header.GlueLargeHeaderView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.HeaderView;
import com.spotify.android.paste.widget.StickyRecyclerView;
import com.spotify.android.paste.widget.TextHeaderView;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.porcelain.PorcelainAdapter;
import com.spotify.mobile.android.porcelain.PorcelainPage;
import com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate;
import com.spotify.mobile.android.porcelain.metrics.PorcelainMetricsLogger;
import com.spotify.mobile.android.porcelain.subitem.PorcelainIcon;
import com.spotify.mobile.android.porcelain.subitem.PorcelainImage;
import com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink;
import com.spotify.mobile.android.spotlets.common.datasource.CosmosError;
import com.spotify.mobile.android.ui.ActionBarManager;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.music.MainActivity;
import com.spotify.music.spotlets.FeatureIdentifier;
import com.spotify.music.spotlets.common.AbstractContentFragment;
import com.squareup.picasso.Picasso;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public abstract class dop extends AbstractContentFragment
    implements doo, dsy, fyx
{

    public PorcelainAdapter Y;
    drr Z;
    public Resolver a;
    private final Class aa;
    private dpx ag;
    private epd ah;
    private int ai;
    private eou aj;
    private don ak;
    private dou al;
    private View am;
    private dsw an;
    private dsw ao;
    private dsv ap;
    private int aq;
    private Parcelable ar;
    private Parcelable as[];
    private final Set at = new HashSet(Maps.b(2));
    private PorcelainMetricsLogger au;
    private boolean av;
    PorcelainPage b;

    protected dop(Class class1)
    {
        ag = new dpx() {

            private dop b;

            public final void a(PorcelainNavigationLink porcelainnavigationlink, int i, int j)
            {
                b.a(porcelainnavigationlink, i, j);
            }

            public final void a(drz drz, int i)
            {
                Object obj;
                drr drr1;
                Iterable iterable;
                String s;
                cur cur1;
                obj = b;
                drr1 = ((dop) (obj)).Z;
                iterable = ((dps)ctz.a(((dop) (obj)).Y.d())).getPlayables();
                s = ((dop) (obj)).v_().toString();
                cur1 = ImmutableMap.i();
                cur1.a("context_description", ((dop) (obj)).J());
                obj = ((dop) (obj)).b;
                if (obj == null) goto _L2; else goto _L1
_L1:
                obj = ((PorcelainPage) (obj)).getHeader();
                if (obj == null) goto _L2; else goto _L3
_L3:
                obj = ((com.spotify.mobile.android.porcelain.PorcelainPage.PorcelainPageHeader) (obj)).getImage();
                if (obj == null) goto _L2; else goto _L4
_L4:
                obj = ((PorcelainImage) (obj)).getUrl();
_L6:
                if (obj != null)
                {
                    cur1.a("image_url", obj);
                }
                drr1.a(iterable, drz, s, cur1.a());
                return;
_L2:
                obj = null;
                if (true) goto _L6; else goto _L5
_L5:
            }

            
            {
                b = dop.this;
                super();
            }
        };
        ah = new epd() {

            private dop a;

            protected final int a()
            {
                return dop.a(a);
            }

            protected final void a(int i)
            {
                dop.c(a);
            }

            protected final boolean b()
            {
                dot dot1 = a.K();
                return dot1 != null && !TextUtils.isEmpty(dot1.getNextDataSet()) && !dop.b(a).contains(dot1.getId());
            }

            
            {
                a = dop.this;
                super();
            }
        };
        aq = -1;
        aa = (Class)ctz.a(class1);
    }

    private void L()
    {
        dsv dsv1 = ap;
        dsv1.a(false);
        dsv1.e = dii.a;
        dsv1.a.a(null);
        dsv1.a.b(null);
        if (dsv1.f != null)
        {
            dsv1.f.a(dsv1.e);
            dsv1.f = null;
        }
        d(true);
    }

    private boolean M()
    {
        return b.getSpaces().size() > 1;
    }

    private String N()
    {
        return a(k(), fyw.a(this));
    }

    private void O()
    {
label0:
        {
            if (!(k() instanceof fpe))
            {
                break label0;
            }
            if (ap != null)
            {
                boolean flag;
                if (ap.e != dii.a)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    break label0;
                }
            }
            ((fpe)k()).a(this, J());
        }
    }

    static int a(dop dop1)
    {
        return dop1.ai;
    }

    static void a(dop dop1, Parcelable parcelable)
    {
        PorcelainPage porcelainpage = dop1.b;
        if (porcelainpage != null)
        {
            dot dot1 = dop1.K();
            dop1.b(porcelainpage.append(dop1.a(parcelable)));
            parcelable = dop1.K();
            if (dot1 != null && parcelable != null && dot1.getSpace().getViews().getItemCount() != parcelable.getSpace().getViews().getItemCount())
            {
                dop1.a(parcelable.getSpace(), true);
            }
        }
    }

    private void a(doz doz1, boolean flag)
    {
        int i = Y.b();
        Y.a(a(doz1));
        if (flag)
        {
            Y.b(i, Y.b() - i);
            return;
        } else
        {
            Y.c();
            return;
        }
    }

    static Set b(dop dop1)
    {
        return dop1.at;
    }

    private void b(PorcelainPage porcelainpage)
    {
        b = porcelainpage;
        super.ae = a(b);
    }

    static void c(dop dop1)
    {
        Object obj = dop1.K();
        if (obj != null)
        {
            String s = ((dot) (obj)).getId();
            obj = ((dot) (obj)).getNextDataSet();
            if (!TextUtils.isEmpty(((CharSequence) (obj))) && !dop1.at.contains(s))
            {
                dop1.at.add(s);
                dop1.aj.a(RequestBuilder.get(((String) (obj))).build(), 30000L).a(dop1. new eqn(s, ((String) (obj))) {

                    private String a;
                    private String b;
                    private dop c;

                    public final void a(Object obj1)
                    {
                        obj1 = (CosmosError)obj1;
                        dop.b(c).remove(a);
                        Logger.c("Request to %s failed: %s", new Object[] {
                            b, obj1
                        });
                    }

                    public final void b(Object obj1)
                    {
                        obj1 = (Parcelable)obj1;
                        dop.b(c).remove(a);
                        dop.a(c, ((Parcelable) (obj1)));
                    }

            
            {
                c = dop.this;
                a = s;
                b = s1;
                super();
            }
                });
            }
        }
    }

    static String d(dop dop1)
    {
        return dop1.N();
    }

    private void d(int i)
    {
        List list = b.getSpaces();
        if (i >= list.size())
        {
            Assertion.b(String.format(Locale.US, "Invalid index: %d (size: %d)", new Object[] {
                Integer.valueOf(i), Integer.valueOf(list.size())
            }));
            return;
        } else
        {
            a(((dot)list.get(i)).getSpace(), false);
            return;
        }
    }

    private void d(boolean flag)
    {
        if (am != null)
        {
            View view = am;
            int i;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public final void A()
    {
        super.A();
        ap.a(false);
    }

    public final void B()
    {
        aj.a();
        a.destroy();
        drr drr1 = Z;
        drr1.a.unregisterPlayerStateObserver(drr1.d);
        super.B();
    }

    public abstract SpotifyIcon G();

    public abstract Request H();

    public final String I()
    {
        return v_().toString();
    }

    final String J()
    {
        Object obj = b;
        if (obj != null)
        {
            obj = ((PorcelainPage) (obj)).getTitle();
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                return ((String) (obj));
            }
        }
        return N();
    }

    public final dot K()
    {
        PorcelainPage porcelainpage = b;
        int i = Math.max(0, aq);
        if (porcelainpage != null && i < porcelainpage.getSpaces().size())
        {
            return (dot)porcelainpage.getSpaces().get(i);
        } else
        {
            return null;
        }
    }

    protected abstract Parcelable a(PorcelainPage porcelainpage);

    public com.spotify.mobile.android.porcelain.PorcelainPage.PorcelainPageHeader a(com.spotify.mobile.android.porcelain.PorcelainPage.PorcelainPageHeader porcelainpageheader)
    {
        return new dst(porcelainpageheader) {

            private dop a;

            public final CharSequence getTitle()
            {
                CharSequence charsequence = super.getTitle();
                if (charsequence != null)
                {
                    return charsequence;
                } else
                {
                    return dop.d(a);
                }
            }

            
            {
                a = dop.this;
                super(porcelainpageheader);
            }
        };
    }

    protected abstract PorcelainPage a(Parcelable parcelable);

    public final Flags a()
    {
        return fyw.a(this);
    }

    public dip a(StickyRecyclerView stickyrecyclerview, com.spotify.mobile.android.porcelain.PorcelainPage.PorcelainPageHeader porcelainpageheader)
    {
        if (porcelainpageheader == null || !ggi.a(k())) goto _L2; else goto _L1
_L1:
        dsv dsv1;
        Object obj1;
        int i;
        d(false);
        Object obj;
        String s;
        Object obj2;
        if (M())
        {
            obj = ao;
        } else
        {
            obj = null;
        }
        dsv1 = ap;
        s = J();
        porcelainpageheader = a(porcelainpageheader);
        obj1 = dsv1.a();
        obj2 = porcelainpageheader.getImage();
        if (obj2 != null)
        {
            CharSequence charsequence = porcelainpageheader.getTitle();
            CharSequence charsequence2 = porcelainpageheader.getSubtitle();
            if (dgn.a(dsv1.a()))
            {
                stickyrecyclerview = new GlueCoverArtHeaderView(dsv1.a());
                dsv1.c.b().a(stickyrecyclerview.c(), ((PorcelainImage) (obj2)), com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate.ImageSize.c, com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate.IconSize.d);
                obj2 = dej.b(stickyrecyclerview);
                if (!TextUtils.isEmpty(charsequence) || !TextUtils.isEmpty(charsequence2))
                {
                    ((dep) (obj2)).a(charsequence);
                    ((dep) (obj2)).b(charsequence2);
                } else
                {
                    ((dep) (obj2)).a(null);
                    ((dep) (obj2)).b(null);
                }
                stickyrecyclerview.a(((del) (obj2)));
            } else
            {
                stickyrecyclerview = new HeaderView(dsv1.a());
                dsv1.c.b().a(stickyrecyclerview.b(), ((PorcelainImage) (obj2)), com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate.ImageSize.c, com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate.IconSize.d);
                if (!TextUtils.isEmpty(charsequence) || !TextUtils.isEmpty(charsequence2))
                {
                    stickyrecyclerview.a(charsequence);
                    stickyrecyclerview.b(charsequence2);
                } else
                {
                    stickyrecyclerview.a(null);
                    stickyrecyclerview.b(null);
                }
            }
        } else
        {
            CharSequence charsequence1 = porcelainpageheader.getTitle();
            CharSequence charsequence3 = porcelainpageheader.getSubtitle();
            if (dgn.a(dsv1.a()))
            {
                stickyrecyclerview = new GlueLargeHeaderView(dsv1.a());
                dep dep1 = dej.b(stickyrecyclerview);
                if (!TextUtils.isEmpty(charsequence1) || !TextUtils.isEmpty(charsequence3))
                {
                    dep1.a(charsequence1);
                    dep1.b(charsequence3);
                } else
                {
                    dep1.a(null);
                    dep1.b(null);
                }
                stickyrecyclerview.a(dep1);
            } else
            {
                stickyrecyclerview = new TextHeaderView(dsv1.a());
                if (!TextUtils.isEmpty(charsequence1) || !TextUtils.isEmpty(charsequence3))
                {
                    stickyrecyclerview.a(charsequence1);
                    stickyrecyclerview.b(charsequence3);
                } else
                {
                    stickyrecyclerview.a(null);
                    stickyrecyclerview.b(null);
                }
            }
        }
        obj1 = new dip(((android.content.Context) (obj1)), stickyrecyclerview);
        ((dip) (obj1)).b();
        if (obj == null)
        {
            i = 0;
        } else
        {
            stickyrecyclerview = ((dsw) (obj)).a;
            ggp.b(stickyrecyclerview);
            ((dip) (obj1)).b(stickyrecyclerview);
            i = ((dsw) (obj)).a.getResources().getDimensionPixelSize(0x7f0c014c);
        }
        stickyrecyclerview = porcelainpageheader.getStyle();
        dsv._cls5.a[stickyrecyclerview.ordinal()];
        JVM INSTR tableswitch 1 1: default 240
    //                   1 814;
           goto _L3 _L4
_L3:
        obj = porcelainpageheader.getButton();
        if (obj != null)
        {
            stickyrecyclerview = gad.a(dsv1.a(), ((ViewGroup) (obj1)), ((drv) (obj)).getIcon().mIcon, ((drv) (obj)).getText());
            ((dip) (obj1)).a(stickyrecyclerview);
            obj = ((drv) (obj)).getLink();
            if (obj != null)
            {
                stickyrecyclerview.setOnClickListener(new dsv._cls4(dsv1, ((PorcelainNavigationLink) (obj))));
            }
            ((dip) (obj1)).a(stickyrecyclerview);
        }
        stickyrecyclerview = porcelainpageheader.getBackground();
        int j;
        if (porcelainpageheader.getImage() != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (dgn.a(dsv1.a()))
        {
            ((gft)dmz.a(gft)).a().a(stickyrecyclerview).a(gft.a(((dip) (obj1)).a(), new dsv._cls3(((dip) (obj1)))));
        } else
        {
            stickyrecyclerview = ((gft)dmz.a(gft)).a().a(stickyrecyclerview);
            if (i != 0)
            {
                stickyrecyclerview.a(dgf.a);
            } else
            {
                ((dip) (obj1)).a(gcg.b(dsv1.a(), 0x7f0f0038));
            }
            stickyrecyclerview.a(((dip) (obj1)).a(), null);
        }
        dsv1.a.a(((View) (obj1)));
        stickyrecyclerview = ((dip) (obj1)).c();
        porcelainpageheader = ((dip) (obj1)).d();
        obj = dsv1.a;
        if (stickyrecyclerview == null)
        {
            stickyrecyclerview = porcelainpageheader;
        }
        ((StickyRecyclerView) (obj)).b(stickyrecyclerview);
        ctz.b(dsv1.b.o(), "Fragment must be added");
        stickyrecyclerview = dsv1.b.k();
        if (stickyrecyclerview instanceof MainActivity)
        {
            dsv1.e = new dsv._cls2((MainActivity)stickyrecyclerview, dsv1.b);
        } else
        {
            dsv1.e = dii.a;
        }
        ((dip) (obj1)).a(dsv1.e);
        ((dip) (obj1)).a(s);
        ((dip) (obj1)).c(ActionBarManager.a(dsv1.a()));
        dsv1.f = ((dip) (obj1));
        return ((dip) (obj1));
_L4:
        j = ((gcz)dmz.a(gcz)).b();
        dsv1.a.b((j * 5) / 8 + i);
          goto _L3
_L2:
        L();
        return null;
    }

    public dps a(doz doz1)
    {
        dou dou1 = al;
        Object obj = doz1.getViews();
        if (doz1.shouldAdjustCardGridRows())
        {
            int i = doz1.getDefaultCardGridMaxRows();
            String s;
            java.util.ArrayList arraylist;
            if (i > 0)
            {
                doz1 = dou.a(i);
            } else
            {
                doz1 = dou.a();
            }
            s = ((dps) (obj)).getId();
            arraylist = Lists.a(((dps) (obj)).getItemCount());
            for (i = 0; i < ((dps) (obj)).getItemCount(); i++)
            {
                arraylist.add(((dps) (obj)).getItem(i));
            }

            int l1 = arraylist.size();
            int j = -1;
            i = 0;
            obj = Lists.a(l1);
            int i1 = 0;
            int l = -1;
            int k = 0;
            while (i1 < l1) 
            {
                drf drf1 = (drf)arraylist.get(i1);
                if (drg.a(drf1.getType()))
                {
                    k = doz1.a((dqz)drf1);
                    l++;
                    if (l == 0)
                    {
                        j = i1;
                    }
                    int j1;
                    if (l + 1 == dou1.a || i1 == l1 - 1 && i == 0)
                    {
                        if (i < k || k <= 0)
                        {
                            ((List) (obj)).addAll(arraylist.subList(j, i1 + 1));
                        }
                        l = -1;
                        j = k;
                        byte byte0 = -1;
                        i++;
                        k = l;
                        l = byte0;
                    } else
                    {
                        int k1 = j;
                        j = k;
                        k = k1;
                    }
                } else
                {
                    if (l >= 0 && (i == 0 || k <= 0))
                    {
                        ((List) (obj)).addAll(arraylist.subList(j, i1));
                    }
                    ((List) (obj)).add(drf1);
                    j = 0;
                    i = 0;
                    l = -1;
                    k = -1;
                }
                i1++;
                j1 = j;
                j = k;
                k = j1;
            }
            return dpa.a(s, ((List) (obj)));
        } else
        {
            return ((dps) (obj));
        }
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        a = Cosmos.getResolver(k());
        Z = drr.a(a, v_().toString(), r_(), gnl.a(this));
        aj = eou.a(aa, a, new Handler());
        ai = l().getInteger(0x7f0e0001) << 1;
        a(true);
    }

    protected volatile void a(Parcelable parcelable, View view)
    {
        a(parcelable, (dsz)view);
    }

    protected final void a(Parcelable parcelable, dsz dsz1)
    {
        b((PorcelainPage)ctz.a(a(parcelable)));
        if (a((StickyRecyclerView)dsz1.b, b.getHeader()) != null)
        {
            an = ao;
            dsz1.a.a();
        } else
        {
            an = dsz1.a;
            ao.a();
        }
        an.a(-1);
        if (M())
        {
            parcelable = an;
            Object obj1 = b.getSpaces();
            cuq cuq1 = ImmutableList.h();
            CharSequence charsequence;
            for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); cuq1.c(new dsx(charsequence) {

        private CharSequence a;

        public final CharSequence a()
        {
            return a;
        }

            
            {
                a = charsequence;
                super();
            }
    }))
            {
                dot dot1 = (dot)((Iterator) (obj1)).next();
                charsequence = dot1.getTitle();
                if (dot1.getId() == null)
                {
                    Assertion.b("Missing tabId!");
                }
            }

            parcelable.a(cuq1.a());
            an.c = this;
        } else
        {
            an.a();
            an.c = null;
        }
        O();
        if (!b.getSpaces().isEmpty())
        {
            if (an.b() > 0)
            {
                int k = Math.max(aq, 0);
                int i = k;
                if (k >= an.b())
                {
                    Assertion.b(String.format(Locale.US, "Invalid selected tab: %d (count: %d)", new Object[] {
                        Integer.valueOf(k), Integer.valueOf(an.b())
                    }));
                    i = 0;
                }
                an.a(i);
            } else
            {
                d(0);
            }
        } else
        {
            Assertion.b("Page contained no spaces");
            Y.a(null);
            Y.c();
        }
        k().invalidateOptionsMenu();
        if (ar != null)
        {
            ((StickyRecyclerView)dsz1.b).a().d().a(ar);
            ar = null;
        }
        if (as != null)
        {
            for (int j = 0; j < as.length; j++)
            {
                if (j >= b.getSpaces().size())
                {
                    continue;
                }
                parcelable = Y;
                Object obj = as[j];
                dsz1 = ((dot)b.getSpaces().get(j)).getSpace().getViews();
                if (!(obj instanceof com.spotify.mobile.android.porcelain.PorcelainAdapter.DataSetTagsSavedState))
                {
                    continue;
                }
                obj = ((com.spotify.mobile.android.porcelain.PorcelainAdapter.DataSetTagsSavedState)obj).a;
                for (int l = 0; l < ((SparseArray) (obj)).size(); l++)
                {
                    int i1 = ((SparseArray) (obj)).keyAt(l);
                    if (i1 < dsz1.getItemCount())
                    {
                        drf drf1 = dsz1.getItem(i1);
                        ((PorcelainAdapter) (parcelable)).c.b.a(drf1, (Parcelable)((SparseArray) (obj)).get(i1));
                    }
                }

            }

            as = null;
        }
    }

    public final void a(Menu menu, MenuInflater menuinflater)
    {
        super.a(menu, menuinflater);
        if (b != null)
        {
            menuinflater = b.getHeader();
            if (menuinflater != null && ggi.b(k()))
            {
                menuinflater = menuinflater.getButton();
                if (menuinflater != null && menuinflater.isPreserved())
                {
                    PorcelainNavigationLink porcelainnavigationlink = menuinflater.getLink();
                    if (porcelainnavigationlink != null)
                    {
                        fzr.a(k(), menu, menuinflater.getText(), 0x7f1100e5, menuinflater.getIcon().mIcon, new android.view.View.OnClickListener(porcelainnavigationlink) {

                            private PorcelainNavigationLink a;
                            private dop b;

                            public final void onClick(View view)
                            {
                                b.a(a, -1, -1);
                            }

            
            {
                b = dop.this;
                a = porcelainnavigationlink;
                super();
            }
                        });
                    }
                }
            }
        }
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        if (!av)
        {
            au.a();
            av = true;
        }
    }

    public void a(dor dor1)
    {
    }

    protected final void a(gaa gaa1)
    {
        gaa1.b(0x7f0802a1, 0x7f0802a0);
        gaa1.b(G(), 0x7f0802a1, 0x7f0802a0);
        gaa1.a(0x7f0802ad, 0x7f0802ac);
    }

    public void a(gnn gnn)
    {
        Request request = H();
        aj.a(request, 30000L).a(new eqn(gnn) {

            private gnn a;

            public final volatile void a(Object obj)
            {
                a.a();
            }

            public final void b(Object obj)
            {
                obj = (Parcelable)obj;
                a.a(obj);
            }

            
            {
                a = gnn1;
                super();
            }
        });
    }

    public boolean a(PorcelainNavigationLink porcelainnavigationlink, int i, int j)
    {
        final class _cls8
        {

            static final int a[];

            static 
            {
                a = new int[com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink.Type.values().length];
                try
                {
                    a[com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink.Type.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink.Type.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink.Type.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        don don1;
        Object obj;
        switch (_cls8.a[porcelainnavigationlink.getType().ordinal()])
        {
        default:
            return false;

        case 1: // '\001'
            gms gms1 = gms.a(k(), porcelainnavigationlink.getUri());
            porcelainnavigationlink = porcelainnavigationlink.getTargetTitle();
            if (porcelainnavigationlink == null)
            {
                porcelainnavigationlink = "";
            }
            a(gms1.a((String)porcelainnavigationlink).a);
            return true;

        case 2: // '\002'
            a(new Intent("android.intent.action.VIEW", Uri.parse(porcelainnavigationlink.getUri())));
            return true;

        case 3: // '\003'
            don1 = ak;
            obj = (new SpotifyLink(porcelainnavigationlink.getUri())).c;
            obj = (dpy)don1.b.get(obj);
            break;
        }
        if (obj != null)
        {
            fud.a(don1.e, don1.a, Pair.create(new dom(porcelainnavigationlink), obj));
            return true;
        } else
        {
            return false;
        }
    }

    public dsz c(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (bundle != null)
        {
            aq = bundle.getInt("porcelain.PorcelainFragment.selectedTab", -1);
            ar = bundle.getParcelable("porcelain.PorcelainFragment.layoutState");
            as = bundle.getParcelableArray("porcelain.PorcelainFragment.adapterState");
            av = bundle.getBoolean("porcelain.PorcelainFragment.impression", false);
        }
        layoutinflater = new StickyRecyclerView(k());
        viewgroup = new dsz(k(), layoutinflater);
        bundle = layoutinflater.a();
        Object obj = dqe.a(k());
        ((dqe) (obj)).a(Z);
        obj = ((dqe) (obj)).a();
        ak = new don(k(), this, this, this, dpz.a);
        al = new dou(l());
        au = new dro(k(), this);
        if (au == null)
        {
            au = PorcelainMetricsLogger.a;
        }
        dor dor1 = new dor((byte)0);
        a(dor1);
        dog dog1 = PorcelainAdapter.e();
        dog1.b = ((PorcelainRenderDelegate) (obj));
        dog1.c = ag;
        dog1.a = au;
        dog1.e = dor1.a.a();
        dog1.d = bundle.e();
        Y = dog1.a(k());
        bundle.a();
        bundle.a(Y);
        bundle.a(new dos(k()));
        ao = new dsw(LayoutInflater.from(k()), layoutinflater.a());
        ap = new dsv(((PorcelainRenderDelegate) (obj)), ag, layoutinflater, this);
        O();
        if (ggi.a(k()))
        {
            StickyRecyclerView stickyrecyclerview = (StickyRecyclerView)((dsz) (viewgroup)).b;
            int i = ActionBarManager.a(k());
            int j = dgo.b(k(), 0x1010054);
            stickyrecyclerview.setBackgroundColor(j);
            stickyrecyclerview.a(j);
            stickyrecyclerview.c(i);
            stickyrecyclerview.b();
            am = new View(k());
            dgo.a(am, dgo.a(k()));
            viewgroup.addView(am, 0);
            am.getLayoutParams().height = i;
            am.getLayoutParams().width = -1;
        }
        layoutinflater.a().o();
        bundle.a(ah);
        return viewgroup;
    }

    public void c()
    {
        super.c();
        a.connect();
    }

    public final void c(int i)
    {
        aq = i;
        d(i);
    }

    public View d(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return c(layoutinflater, viewgroup, bundle);
    }

    public void d()
    {
        super.d();
        a.disconnect();
    }

    public final void e()
    {
        super.e();
        ((StickyRecyclerView)((dsz)super.ad).b).a().b(ah);
        L();
        ap = null;
    }

    public void e(Bundle bundle)
    {
        super.e(bundle);
        if (an != null)
        {
            bundle.putInt("porcelain.PorcelainFragment.selectedTab", an.d);
        }
        abd abd1 = ((StickyRecyclerView)((dsz)super.ad).b).a().d();
        if (abd1 != null)
        {
            bundle.putParcelable("porcelain.PorcelainFragment.layoutState", abd1.e());
        }
        if (b != null && Y != null)
        {
            Parcelable aparcelable[] = new Parcelable[b.getSpaces().size()];
            for (int i = 0; i < aparcelable.length; i++)
            {
                PorcelainAdapter porcelainadapter = Y;
                dps dps1 = ((dot)b.getSpaces().get(i)).getSpace().getViews();
                com.spotify.mobile.android.porcelain.PorcelainAdapter.DataSetTagsSavedState datasettagssavedstate = new com.spotify.mobile.android.porcelain.PorcelainAdapter.DataSetTagsSavedState();
                for (int j = 0; j < dps1.getItemCount(); j++)
                {
                    Parcelable parcelable = porcelainadapter.c.b.a(dps1.getItem(j));
                    if (parcelable != null)
                    {
                        datasettagssavedstate.a.put(j, parcelable);
                    }
                }

                aparcelable[i] = datasettagssavedstate;
            }

            bundle.putParcelableArray("porcelain.PorcelainFragment.adapterState", aparcelable);
        }
        bundle.putBoolean("porcelain.PorcelainFragment.impression", av);
    }

    public abstract FeatureIdentifier r_();

    public final void z()
    {
        super.z();
        ap.a(true);
    }
}
