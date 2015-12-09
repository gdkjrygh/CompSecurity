// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.prettylist.StickyListView;
import com.spotify.cosmos.android.RxCosmos;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.android.RxTypedResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.spotlets.charts.model.Chart;
import com.spotify.mobile.android.spotlets.charts.model.ChartEntry;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.view.ShufflePlayHeaderView;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import com.spotify.music.spotlets.common.AbstractContentFragment;
import com.squareup.picasso.Picasso;
import java.util.Date;
import java.util.Locale;

public final class emc extends gnp
    implements android.widget.AdapterView.OnItemClickListener, android.widget.AdapterView.OnItemLongClickListener, emk
{

    private String Y;
    private String a;
    private Verified aa;
    private Flags ag;
    private dja ah;
    private ListView ai;
    private eqx aj;
    private gji ak;
    private emf al;
    private View am;
    private fop an;
    private emg ao;
    private final android.view.View.OnClickListener ap = new android.view.View.OnClickListener() {

        private emc a;

        public final void onClick(View view)
        {
            emc.a(a);
            fop.a(a.k(), a.v_(), ClientEventFactory.a("chart", com.spotify.mobile.android.util.ClientEvent.SubEvent.X, null, null));
            view = emc.b(a);
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions playoptions;
            boolean flag;
            if (((emg) (view)).j != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ctz.b(flag, "This should be called after the view is ready.");
            playoptions = (new com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder()).playerOptionsOverride(true, false, false).build();
            ((emg) (view)).f.play(((emg) (view)).j, playoptions);
        }

            
            {
                a = emc.this;
                super();
            }
    };
    private final fuj aq = new fuj() {

        private emc a;

        public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
        {
            obj = (ChartEntry)obj;
            emg emg1 = emc.b(a);
            u u1 = a.k();
            if (((ChartEntry) (obj)).playable)
            {
                if (emg1.i.rankType == com.spotify.mobile.android.spotlets.charts.model.Chart.RankType.b)
                {
                    spotifycontextmenu.b = u1.getResources().getQuantityString(0x7f090009, ((ChartEntry) (obj)).rank, new Object[] {
                        Integer.valueOf(((ChartEntry) (obj)).rank)
                    });
                }
                emg1.a.a(spotifycontextmenu, ((ChartEntry) (obj)));
            }
        }

            
            {
                a = emc.this;
                super();
            }
    };
    private String b;

    public emc()
    {
        an = (fop)dmz.a(fop);
    }

    private String L()
    {
        if (b == null)
        {
            b = aa.toString().replace("spotify:", "spotify:app:");
        }
        return b;
    }

    public static emc a(String s, String s1, Flags flags)
    {
        Bundle bundle = new Bundle();
        bundle.putString("title", s1);
        bundle.putString("chart_uri", (String)ctz.a(s));
        s = new emc();
        s.f(bundle);
        fyw.a(s, (Flags)ctz.a(flags));
        return s;
    }

    static fop a(emc emc1)
    {
        return emc1.an;
    }

    static emg b(emc emc1)
    {
        return emc1.ao;
    }

    private void b(String s)
    {
        a = s;
        ((djr)ah.a()).a(s);
        ((fpe)k()).a(this, s);
        ((fpe)k()).P_();
    }

    public final void H()
    {
        ShufflePlayHeaderView.a(new gbv(), am);
    }

    public final String I()
    {
        return aa.toString();
    }

    public final void J()
    {
        super.ab.a();
    }

    public final String a(Context context, Flags flags)
    {
        if (a == null)
        {
            return context.getString(0x7f08016d);
        } else
        {
            return a;
        }
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        Y = (String)ctz.a(g().getString("chart_uri"));
        a = g().getString("title");
        aa = ViewUri.w.a(Y);
        ag = fyw.a(this);
        dmz.a(gjj);
        ak = gjj.a(k());
        a(true);
        if (bundle == null)
        {
            fop.a(k(), aa, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.R, com.spotify.mobile.android.util.ClientEvent.SubEvent.bi));
        }
    }

    protected final void a(Parcelable parcelable, View view)
    {
        parcelable = (Chart)parcelable;
        view = ao;
        view.i = parcelable;
        view.j = PlayerContext.create(((emg) (view)).d, ((Chart) (parcelable)).playerTracks, ((Chart) (parcelable)).playerMetadata);
        android.widget.ImageView imageview;
        String s;
        android.graphics.drawable.Drawable drawable;
        int i;
        if (((Chart) (parcelable)).newEntriesCount > 0)
        {
            ((djr)ah.a()).b(l().getQuantityString(0x7f09000a, ((Chart) (parcelable)).newEntriesCount, new Object[] {
                Integer.valueOf(((Chart) (parcelable)).newEntriesCount)
            }));
            ((djr)ah.a()).a().setVisibility(0);
        } else
        {
            ((djr)ah.a()).a().setVisibility(8);
        }
        view = aj;
        view.a(null);
        view.b(null);
        aj.a(((Chart) (parcelable)).description);
        if (((Chart) (parcelable)).lastUpdated != null)
        {
            view = DateUtils.getRelativeTimeSpanString(((Chart) (parcelable)).lastUpdated.getTime());
            aj.b(k().getString(0x7f08016a, new Object[] {
                view
            }));
        }
        i = l().getDimensionPixelSize(0x7f0c0083);
        view = ak;
        imageview = ah.c();
        s = ((Chart) (parcelable)).imageUrl;
        drawable = dff.e(((gji) (view)).a);
        ((gji) (view)).b.a(s).b(drawable).a(drawable).b(i, i).b().a(imageview, null);
        ak.a(ah.d(), ((Chart) (parcelable)).imageUrl);
        b(((Chart) (parcelable)).title);
        al.b();
        al.a(((Chart) (parcelable)).entries);
    }

    public final void a(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
        boolean flag;
        if (al != null && al.getCount() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (ggi.b(k()) && flag)
        {
            am = fzr.a(k(), menu, ap);
        }
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        b(a(((Context) (k())), ag));
        ao = new emg(this, new RxTypedResolver(new RxResolver(RxCosmos.getRouter(k())), com/spotify/mobile/android/spotlets/charts/model/Chart), L(), (new SpotifyLink(Y)).b(), ((PlayerFactory)dmz.a(com/spotify/mobile/android/cosmos/player/v2/PlayerFactory)).create(super.Z, L(), FeatureIdentifier.h, gnl.a(this)), ag);
        view = ao;
        if (gis.b(view, bundle) && !TextUtils.equals(((emg) (view)).h, ghq.a(Locale.getDefault())))
        {
            ((emg) (view)).a.b();
        }
    }

    public final void a(Chart chart)
    {
        super.ab.a(chart);
    }

    public final void a(SpotifyContextMenu spotifycontextmenu, ChartEntry chartentry)
    {
        fve.a(k()).a(chartentry.uri, chartentry.name).a(aa).a(true).a(true).a(true).a(false, null).a(ag).a(spotifycontextmenu);
    }

    protected final void a(gaa gaa1)
    {
        gaa1.a(0x7f0802ad, 0x7f080167).b(SpotifyIcon.aa, 0x7f0802a1, 0x7f0802a0).b(0x7f08016c, 0x7f08016b);
    }

    protected final void a(gnn gnn1)
    {
        gnn1 = ao;
        Request request = new Request("GET", String.format("hm://chartview/v1/chart/%s/android?locale=%s", new Object[] {
            ((emg) (gnn1)).e, ghq.a(Locale.getDefault())
        }));
        if (((emg) (gnn1)).c != null)
        {
            ((emg) (gnn1)).c.unsubscribe();
        }
        gnn1.c = ((emg) (gnn1)).b.resolve(request).a(((dup)dmz.a(dup)).c()).a(new emg._cls1(gnn1));
    }

    public final void a(String s)
    {
        emf emf1 = al;
        if (!TextUtils.equals(s, emf1.a))
        {
            emf1.a = s;
            emf1.notifyDataSetChanged();
        }
    }

    public final void c()
    {
        super.c();
        emg emg1 = ao;
        emg1.f.registerPlayerStateObserver(emg1);
    }

    protected final View d(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = k();
        ag = fyw.a(this);
        aj = new eqx(k());
        al = new emf(k(), ag, aq);
        int i;
        if (ggi.b(k()))
        {
            ah = dja.b(j()).b().b().a(aj).a(this);
        } else
        {
            am = gad.a(layoutinflater, null);
            am.setOnClickListener(ap);
            ah = dja.a(j()).b().b().a(true).a(aj).b(am).a(this);
        }
        layoutinflater = k();
        i = layoutinflater.getResources().getDimensionPixelSize(0x7f0c009d);
        viewgroup = new ShapeDrawable(new emj(i));
        viewgroup.getPaint().setColor(gcg.b(layoutinflater, 0x7f0f00c2));
        viewgroup.setBounds(0, 0, i, i);
        ((djr)ah.a()).a().setCompoundDrawables(viewgroup, null, null, null);
        ((djr)ah.a()).a().setCompoundDrawablePadding(l().getDimensionPixelSize(0x7f0c009e));
        ai = ah.e().a();
        ai.setFastScrollEnabled(true);
        ai.setOnItemClickListener(this);
        ai.setOnItemLongClickListener(this);
        ai.setAdapter(al);
        return ah.b();
    }

    public final void d()
    {
        super.d();
        emg emg1 = ao;
        emg1.f.unregisterPlayerStateObserver(emg1);
    }

    public final void e()
    {
        super.e();
        emg emg1 = ao;
        emg1.a = null;
        if (emg1.c != null)
        {
            emg1.c.unsubscribe();
        }
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        emg emg1 = ao;
        emg1.h = ghq.a(Locale.getDefault());
        gis.a(emg1, bundle);
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
label0:
        {
            adapterview = (ChartEntry)view.getTag();
            view = ao;
            int j = ai.getHeaderViewsCount();
            boolean flag;
            if (((emg) (view)).j != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ctz.b(flag, "This should be called after the view is ready.");
            if (((ChartEntry) (adapterview)).playable)
            {
                if (gex.a(((emg) (view)).g))
                {
                    com.spotify.mobile.android.cosmos.player.v2.PlayOptions playoptions = (new com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder()).skipToIndex(0, i - j).build();
                    ((emg) (view)).f.play(((emg) (view)).j, playoptions);
                } else
                {
                    ((emg) (view)).a.H();
                }
            }
            if (((ChartEntry) (adapterview)).playable)
            {
                if (!gex.a(ag))
                {
                    break label0;
                }
                fop.a(k(), aa, ClientEventFactory.a("chart", com.spotify.mobile.android.util.ClientEvent.SubEvent.ah, ((ChartEntry) (adapterview)).uri, Long.valueOf(l)));
            }
            return;
        }
        fop.a(k(), aa, ClientEventFactory.a("chart", com.spotify.mobile.android.util.ClientEvent.SubEvent.ai, ((ChartEntry) (adapterview)).uri, Long.valueOf(l)));
    }

    public final boolean onItemLongClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (ChartEntry)adapterview.getAdapter().getItem(i);
        fud.a(k(), aq, adapterview);
        return true;
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.h;
    }

    public final Verified v_()
    {
        return aa;
    }
}
