// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import com.spotify.music.spotlets.common.AbstractContentFragment;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import com.spotify.music.spotlets.radio.model.SavedStationsModel;
import java.util.Locale;

public final class enb extends AbstractContentFragment
{

    public static final String a;
    private String Y;
    private emr Z;
    private Flags aa;
    private gcv ag;
    private final android.view.View.OnClickListener ah = new android.view.View.OnClickListener() {

        private enb a;

        public final void onClick(View view)
        {
            view = gms.a(a.k(), ViewUri.T.toString()).a;
            view.putExtra("start_radio", true);
            view.putExtra("close_search_on_click", true);
            a.k().startActivity(view);
        }

            
            {
                a = enb.this;
                super();
            }
    };
    private gou b;

    public enb()
    {
    }

    private void H()
    {
        a(false);
        b(false);
    }

    public static enb a(Flags flags)
    {
        enb enb1 = new enb();
        enb1.f(new Bundle());
        fyw.a(enb1, flags);
        return enb1;
    }

    static String a(enb enb1)
    {
        return enb1.Y;
    }

    static String a(enb enb1, String s)
    {
        enb1.Y = s;
        return s;
    }

    static emr b(enb enb1)
    {
        return enb1.Z;
    }

    static gnn c(enb enb1)
    {
        return ((AbstractContentFragment) (enb1)).ab;
    }

    static Flags d(enb enb1)
    {
        return enb1.aa;
    }

    static gnn e(enb enb1)
    {
        return ((AbstractContentFragment) (enb1)).ab;
    }

    static gnn f(enb enb1)
    {
        return ((AbstractContentFragment) (enb1)).ab;
    }

    public final void B()
    {
        super.B();
        ag.b.destroy();
    }

    public final String I()
    {
        return a;
    }

    public final String a(Context context, Flags flags)
    {
        return context.getString(0x7f0801a9);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        aa = fyw.a(this);
        if (bundle != null)
        {
            Y = bundle.getString("playing-station-seed");
        }
        ag = new gcv(Cosmos.getResolver(k())) {

            private enb c;

            protected final void a(PlayerState playerstate)
            {
                enb.a(c, gpl.c(playerstate.entityUri()));
                enb.b(c).a(enb.a(c));
            }

            protected final boolean a(PlayerState playerstate, PlayerState playerstate1)
            {
                return b(playerstate, playerstate1);
            }

            
            {
                c = enb.this;
                super(resolver);
            }
        };
    }

    protected final void a(Parcelable parcelable, View view)
    {
        parcelable = (SavedStationsModel)parcelable;
        view = Z;
        view.c = ((SavedStationsModel) (parcelable)).a;
        view.c();
        if (((SavedStationsModel) (parcelable)).a.length != 0)
        {
            H();
        }
    }

    public final void a(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
        Object obj = k();
        Object obj1 = ViewUri.bm;
        if (!fzr.a(((Context) (obj))))
        {
            String s = ((Context) (obj)).getString(0x7f0801ab);
            menu = menu.add(0, 0x7f110005, 0, s);
            ji.a(menu, 2);
            menuinflater = ((Context) (obj)).getResources();
            Button button = dgp.e(((Context) (obj)));
            button.setText(s.toUpperCase(Locale.getDefault()));
            button.setOnClickListener(new fzr._cls7(((Context) (obj)), ((Verified) (obj1))));
            obj = new FrameLayout(((Context) (obj)));
            ((FrameLayout) (obj)).setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
            obj1 = new android.widget.FrameLayout.LayoutParams(-2, -2);
            int i = menuinflater.getDimensionPixelSize(0x7f0c0075);
            ((android.widget.FrameLayout.LayoutParams) (obj1)).setMargins(i, 0, i, 0);
            button.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
            ((FrameLayout) (obj)).addView(button);
            ji.a(menu, ((View) (obj)));
        }
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        view = dgp.b(k(), null);
        view.setText(b(0x7f0801ab));
        super.ac.a(view);
        view.setOnClickListener(ah);
        b = new gou(k().getApplicationContext(), new gpi() {

            private enb a;

            public final void a(RadioStationsModel radiostationsmodel)
            {
                if (enb.c(a) == null) goto _L2; else goto _L1
_L1:
                SavedStationsModel savedstationsmodel;
                Object obj;
                boolean flag;
                if (radiostationsmodel == null || radiostationsmodel.recommendedStations.length == 0 && radiostationsmodel.genreStations.length == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag) goto _L2; else goto _L3
_L3:
                obj = null;
                if (!gpl.b(enb.d(a)) || radiostationsmodel.savedStations.length <= 0 && radiostationsmodel.clusterStations.length <= 0) goto _L5; else goto _L4
_L4:
                savedstationsmodel = new SavedStationsModel(radiostationsmodel.savedStations);
_L7:
                enb.e(a).a(savedstationsmodel);
_L2:
                return;
_L5:
                savedstationsmodel = obj;
                if (!gpl.b(enb.d(a)))
                {
                    savedstationsmodel = obj;
                    if (radiostationsmodel.savedStations.length > 0)
                    {
                        savedstationsmodel = new SavedStationsModel(radiostationsmodel.savedStations);
                    }
                }
                if (true) goto _L7; else goto _L6
_L6:
            }

            public final void a(gpg gpg)
            {
            }

            public final void p()
            {
                enb.f(a).a();
            }

            
            {
                a = enb.this;
                super();
            }
        });
    }

    protected final void a(EmptyView emptyview, com.spotify.mobile.android.ui.stuff.ContentViewManager.ContentState contentstate)
    {
        if (contentstate == com.spotify.mobile.android.ui.stuff.ContentViewManager.ContentState.d)
        {
            if (ggi.b(k()))
            {
                a(true);
                b(true);
                emptyview.e().setVisibility(8);
                return;
            } else
            {
                H();
                emptyview.e().setVisibility(0);
                return;
            }
        } else
        {
            emptyview.e().setVisibility(8);
            H();
            return;
        }
    }

    protected final void a(gaa gaa1)
    {
        gaa1.a(0x7f0802ad, 0x7f0802ac).b(SpotifyIcon.K, 0x7f0801ac, 0x7f0801aa).b(0x7f0805f6, 0x7f0805f5);
    }

    protected final void a(gnn gnn)
    {
        b.a();
    }

    public final void c()
    {
        super.c();
        if (b != null)
        {
            b.a();
        }
        ag.a();
    }

    protected final View d(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        Z = new emr(k(), "root", aa);
        Z.a(Y);
        layoutinflater = new RecyclerView(k(), null);
        k().getApplicationContext();
        layoutinflater.a(new LinearLayoutManager(1));
        layoutinflater.a(Z);
        return layoutinflater;
    }

    public final void d()
    {
        super.d();
        if (b != null)
        {
            b.b();
        }
        ag.b();
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putString("playing-station-seed", Y);
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.q;
    }

    public final Verified v_()
    {
        return ViewUri.bm;
    }

    static 
    {
        a = ViewUri.bm.toString();
    }
}
