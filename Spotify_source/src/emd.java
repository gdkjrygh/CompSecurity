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
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import com.spotify.music.spotlets.common.AbstractContentFragment;
import java.util.Locale;

public final class emd extends gnp
    implements eml
{

    private Verified Y;
    private String a;
    private fop aa;
    private PorcelainAdapter ag;
    private emh ah;
    private final dpx ai = new dpx() {

        private emd b;

        public final void a(PorcelainNavigationLink porcelainnavigationlink, int i, int j)
        {
            emd.a(b);
            fop.a(b.k(), b.v_(), ClientEventFactory.a("charts-block", com.spotify.mobile.android.util.ClientEvent.SubEvent.bj, porcelainnavigationlink.getUri(), null));
            emh emh1 = emd.b(b);
            String s = porcelainnavigationlink.getUri();
            porcelainnavigationlink = porcelainnavigationlink.getTargetTitle();
            emh1.a.a(s, porcelainnavigationlink);
        }

        public final void a(drz drz, int i)
        {
        }

            
            {
                b = emd.this;
                super();
            }
    };
    private String b;

    public emd()
    {
        aa = (fop)dmz.a(fop);
    }

    public static emd a(String s, String s1, Flags flags)
    {
        Bundle bundle = new Bundle();
        bundle.putString("title", s1);
        bundle.putString("block_uri", (String)ctz.a(s));
        s = new emd();
        s.f(bundle);
        fyw.a(s, (Flags)ctz.a(flags));
        return s;
    }

    static fop a(emd emd1)
    {
        return emd1.aa;
    }

    static emh b(emd emd1)
    {
        return emd1.ah;
    }

    public final void H()
    {
        super.ab.a();
    }

    public final String I()
    {
        return Y.toString();
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
        a = g().getString("title");
        b = g().getString("block_uri");
        Y = ViewUri.v.a(b);
        if (bundle == null)
        {
            fop.a(k(), Y, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.R, com.spotify.mobile.android.util.ClientEvent.SubEvent.bg));
        }
    }

    protected final volatile void a(Parcelable parcelable, View view)
    {
        parcelable = (ChartsBlock)parcelable;
        ag.a(dpa.a("items", ((ChartsBlock) (parcelable)).items));
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        ah = new emh(this, new RxTypedResolver(new RxResolver(RxCosmos.getRouter(k())), com/spotify/mobile/android/spotlets/charts/model/ChartsBlock), (new SpotifyLink(b)).b());
        view = ah;
        if (gis.b(view, bundle) && !TextUtils.equals(((emh) (view)).e, ghq.a(Locale.getDefault())))
        {
            ((emh) (view)).a.b();
        }
    }

    public final void a(ChartsBlock chartsblock)
    {
        super.ab.a(chartsblock);
    }

    protected final void a(gaa gaa1)
    {
        gaa1.a(0x7f0802ad, 0x7f080167).b(SpotifyIcon.aa, 0x7f0802a1, 0x7f0802a0).b(0x7f08016c, 0x7f08016b);
    }

    protected final void a(gnn gnn1)
    {
        gnn1 = ah;
        Request request = new Request("GET", String.format("hm://chartview/v1/charts/%s/android?locale=%s", new Object[] {
            ((emh) (gnn1)).d, ghq.a(Locale.getDefault())
        }));
        if (((emh) (gnn1)).c != null)
        {
            ((emh) (gnn1)).c.unsubscribe();
        }
        gnn1.c = ((emh) (gnn1)).b.resolve(request).a(((dup)dmz.a(dup)).c()).a(new emh._cls1(gnn1));
    }

    public final void a(String s, String s1)
    {
        a(gms.a(k(), s).a(s1).a);
    }

    protected final View d(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = PorcelainAdapter.e();
        layoutinflater.c = ai;
        ag = layoutinflater.a(k());
        layoutinflater = new RecyclerView(k());
        layoutinflater.setId(0x7f110398);
        layoutinflater.a(new dos(k()));
        layoutinflater.a(ag);
        return layoutinflater;
    }

    public final void e()
    {
        super.e();
        emh emh1 = ah;
        emh1.a = null;
        if (emh1.c != null)
        {
            emh1.c.unsubscribe();
        }
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        emh emh1 = ah;
        emh1.e = ghq.a(Locale.getDefault());
        gis.a(emh1, bundle);
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.g;
    }

    public final Verified v_()
    {
        return Y;
    }
}
