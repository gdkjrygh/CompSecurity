// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.cosmos.android.RxCosmos;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.android.RxTypedResolver;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel;
import com.spotify.mobile.android.ui.stuff.ContentViewManager;
import com.spotify.mobile.android.ui.view.ContentFrameLayout;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;

public abstract class eia extends Fragment
    implements ekb, fxy, gjn
{

    private ContentFrameLayout Y;
    private ContentViewManager Z;
    private ggl a;
    private Verified aa;
    private eja ab;
    private eiy ac;
    private gjf b;

    public eia()
    {
    }

    public final void A()
    {
        super.A();
        a.b();
    }

    public final Fragment F()
    {
        return this;
    }

    public final void H()
    {
        Z.a(Y.b);
    }

    public final String I()
    {
        return aa.toString();
    }

    public final void J()
    {
        Z.c(true);
    }

    public final void K()
    {
        Z.a(true);
    }

    protected abstract View a(LayoutInflater layoutinflater, ViewGroup viewgroup);

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        b = gjf.a(k(), aa.toString());
        b.c(bundle);
        b.a();
        a = ggn.a(k(), aa);
        Y = new ContentFrameLayout(k());
        Y.a(a(layoutinflater, ((ViewGroup) (Y))));
        Z = (new gaa(k(), Y.a, Y.c)).a(0x7f0802ad, 0x7f0802ac).b(0x7f0802a1, 0x7f0802a0).a();
        return Y;
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        ab = ejh.b(g().getString("artist_uri"));
        aa = ViewUri.an.a(ab.c());
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        view = g();
        eiy eiy1;
        if (view != null)
        {
            view.setClassLoader(eia.getClassLoader());
            view = (ArtistModel)view.getParcelable("artist_model");
        } else
        {
            view = null;
        }
        ac = new eiy(this, new RxTypedResolver(new RxResolver(RxCosmos.getRouter(k())), com/spotify/mobile/android/spotlets/artist/model/ArtistModel), ((edf)dmz.a(edf)).a, ab.b);
        eiy1 = ac;
        gis.b(eiy1, bundle);
        if (eiy1.f == null && view != null)
        {
            eiy1.f = view;
        }
        if (eiy1.f != null)
        {
            eiy1.a.a(eiy1.f);
        }
        eiy1.d.a(eiy1.c.a(eiy1.h));
    }

    public final void a(ArtistModel artistmodel)
    {
        if (b.e())
        {
            b.b();
        }
        Z.b(null);
        b(artistmodel);
    }

    protected abstract void b(ArtistModel artistmodel);

    public final void e()
    {
        super.e();
        eiy eiy1 = ac;
        eiy1.a = null;
        eiy1.d.unsubscribe();
        b.c();
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        b.a(bundle);
        gis.a(ac, bundle);
    }

    public final Verified v_()
    {
        return aa;
    }

    public final void z()
    {
        super.z();
        a.a();
    }
}
