// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel;
import com.spotify.mobile.android.spotlets.artist.util.Playlists;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.view.FilterHeaderView;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.List;

public final class eii extends eie
{

    private ListView ab;
    private String ac;
    private FilterHeaderView ad;
    private eip ae;
    private ftg af;
    private Flags ag;
    private List ah;
    private android.view.View.OnClickListener ai;
    private gas aj;

    public eii()
    {
        ai = new android.view.View.OnClickListener() {

            private eii a;

            public final void onClick(View view)
            {
                view = (eju)view.getTag();
                view = gms.a(a.k(), ((eju) (view)).a).a;
                a.k().startActivity(view);
            }

            
            {
                a = eii.this;
                super();
            }
        };
        aj = new gas() {

            private eii a;

            public final void a()
            {
            }

            public final void a(gfp gfp1)
            {
                if (eii.a(a) != null)
                {
                    eip eip1 = eii.a(a);
                    eip1.a = (gfp)ctz.a(gfp1);
                    eip1.a();
                }
            }

            public final void a(String s)
            {
                if (eii.a(a) != null)
                {
                    eii.a(a).a(s);
                }
            }

            public final void a(boolean flag)
            {
            }

            
            {
                a = eii.this;
                super();
            }
        };
    }

    static eip a(eii eii1)
    {
        return eii1.ae;
    }

    public final void A()
    {
        super.A();
        dmz.a(gcm);
    }

    protected final View H()
    {
        View view = LayoutInflater.from(k()).inflate(0x7f0300d3, null);
        ab = (ListView)view.findViewById(0x102000a);
        ab.setOnCreateContextMenuListener(this);
        ad = FilterHeaderView.a(LayoutInflater.from(k()), "", ah, Playlists.a, aj, ab);
        ad.setBackgroundColor(gcg.b(k(), 0x7f0f0019));
        ad.a(0x7f0802f3);
        ad.a(ViewUri.an.a(super.a.c()), "playlists");
        a(ab);
        return view;
    }

    public final String I()
    {
        return (new StringBuilder("playlists:")).append(super.a).toString();
    }

    protected final void J()
    {
        FilterHeaderView.a(ad);
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        ag = fyw.a(this);
        return super.a(layoutinflater, viewgroup, bundle);
    }

    public final String a(Context context, Flags flags)
    {
        if (ac == null)
        {
            return context.getString(0x7f0800c3);
        } else
        {
            return ac;
        }
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        ac = g().getString("artist_name");
        ah = ImmutableList.a(Playlists.b, Playlists.a);
    }

    protected final void a(ArtistModel artistmodel)
    {
        com.spotify.mobile.android.util.viewuri.Verified verified = ViewUri.an.a(artistmodel.uri);
        ejn ejn1 = new ejn(k(), ai);
        ae = new eip(k(), artistmodel.playlists, verified, false, ejn1, ag);
        af = new ftg(k());
        af.a(ae, k().getString(0x7f0800cd), 0);
        af.d(0);
        ab.setAdapter(af);
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.O;
    }

    public final void z()
    {
        super.z();
        if (ac != null)
        {
            ((fpe)k()).a(this, ac);
        }
    }
}
