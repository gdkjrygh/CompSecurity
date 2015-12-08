// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.cosmos.android.RxCosmos;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.android.RxTypedResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.porcelain.PorcelainAdapter;
import com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink;
import com.spotify.mobile.android.spotlets.charts.model.ChartsBlock;
import com.spotify.mobile.android.spotlets.charts.model.ChartsBlockItem;
import com.spotify.mobile.android.spotlets.charts.model.ChartsOverview;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import com.spotify.music.spotlets.common.AbstractContentFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class eme extends gnp
    implements emm
{

    private emi Y;
    private fop a;
    private final dpx aa = new dpx() {

        private eme b;

        public final void a(PorcelainNavigationLink porcelainnavigationlink, int i, int j)
        {
            Object obj;
            String s;
            if (SpotifyLink.a(porcelainnavigationlink.getUri(), new com.spotify.mobile.android.util.SpotifyLink.LinkType[] {
        com.spotify.mobile.android.util.SpotifyLink.LinkType.r
    }))
            {
                obj = com.spotify.mobile.android.util.ClientEvent.SubEvent.bj;
            } else
            {
                obj = com.spotify.mobile.android.util.ClientEvent.SubEvent.bk;
            }
            eme.a(b);
            fop.a(b.k(), b.v_(), ClientEventFactory.a("charts-overview", ((com.spotify.mobile.android.util.ClientEvent.SubEvent) (obj)), porcelainnavigationlink.getUri(), null));
            obj = eme.b(b);
            s = porcelainnavigationlink.getUri();
            porcelainnavigationlink = porcelainnavigationlink.getTargetTitle();
            ((emi) (obj)).a.a(s, porcelainnavigationlink);
        }

        public final void a(drz drz, int i)
        {
        }

            
            {
                b = eme.this;
                super();
            }
    };
    private PorcelainAdapter b;

    public eme()
    {
        a = (fop)dmz.a(fop);
    }

    public static eme a(Flags flags)
    {
        eme eme1 = new eme();
        fyw.a(eme1, (Flags)ctz.a(flags));
        return eme1;
    }

    static fop a(eme eme1)
    {
        return eme1.a;
    }

    static emi b(eme eme1)
    {
        return eme1.Y;
    }

    public final void H()
    {
        super.ab.a();
    }

    public final String I()
    {
        return ViewUri.u.toString();
    }

    public final String a(Context context, Flags flags)
    {
        return context.getString(0x7f08016d);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle == null)
        {
            fop.a(k(), ViewUri.u, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.R, com.spotify.mobile.android.util.ClientEvent.SubEvent.bh));
        }
    }

    protected final void a(Parcelable parcelable, View view)
    {
        view = (ChartsOverview)parcelable;
        parcelable = new ArrayList();
        ChartsBlock chartsblock;
        for (view = ((ChartsOverview) (view)).blocks.iterator(); view.hasNext(); parcelable.addAll(chartsblock.items))
        {
            chartsblock = (ChartsBlock)view.next();
            for (Iterator iterator = chartsblock.items.iterator(); iterator.hasNext(); ((ChartsBlockItem)iterator.next()).updateTitle(k())) { }
            if (chartsblock.type == com.spotify.mobile.android.spotlets.charts.model.ChartsBlock.Type.a)
            {
                dpg dpg1 = new dpg();
                dpg1.a = k().getString(0x7f08016e);
                parcelable.add(dpg1.b());
            }
        }

        b.a(dpa.a("items", parcelable));
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        Y = new emi(this, new RxTypedResolver(new RxResolver(RxCosmos.getRouter(k())), com/spotify/mobile/android/spotlets/charts/model/ChartsOverview));
        view = Y;
        if (gis.b(view, bundle) && !TextUtils.equals(((emi) (view)).d, ghq.a(Locale.getDefault())))
        {
            ((emi) (view)).a.b();
        }
    }

    public final void a(ChartsOverview chartsoverview)
    {
        super.ab.a(chartsoverview);
    }

    protected final void a(gaa gaa1)
    {
        gaa1.a(0x7f0802ad, 0x7f080167).b(SpotifyIcon.aa, 0x7f0802a1, 0x7f0802a0).b(0x7f08016c, 0x7f08016b);
    }

    protected final void a(gnn gnn1)
    {
        gnn1 = Y;
        Request request = new Request("GET", String.format("hm://chartview/v1/overview/android?locale=%s", new Object[] {
            ghq.a(Locale.getDefault())
        }));
        if (((emi) (gnn1)).c != null)
        {
            ((emi) (gnn1)).c.unsubscribe();
        }
        gnn1.c = ((emi) (gnn1)).b.resolve(request).a(((dup)dmz.a(dup)).c()).a(new emi._cls1(gnn1));
    }

    public final void a(String s, String s1)
    {
        a(gms.a(k(), s).a(s1).a);
    }

    protected final View d(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = PorcelainAdapter.e();
        layoutinflater.c = aa;
        b = layoutinflater.a(k());
        layoutinflater = k();
        viewgroup = new RecyclerView(layoutinflater);
        viewgroup.setId(0x7f110398);
        viewgroup.a(new dos(layoutinflater));
        viewgroup.a(b);
        return viewgroup;
    }

    public final void e()
    {
        super.e();
        emi emi1 = Y;
        emi1.a = null;
        if (emi1.c != null)
        {
            emi1.c.unsubscribe();
        }
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        emi emi1 = Y;
        emi1.d = ghq.a(Locale.getDefault());
        gis.a(emi1, bundle);
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.f;
    }

    public final Verified v_()
    {
        return ViewUri.u;
    }
}
