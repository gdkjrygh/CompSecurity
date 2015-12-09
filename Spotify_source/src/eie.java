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
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.stuff.ContentViewManager;
import com.spotify.mobile.android.ui.view.ContentFrameLayout;
import com.spotify.mobile.android.util.logging.Logger;

public abstract class eie extends Fragment
    implements eda, fxy
{

    protected ContentViewManager Y;
    protected Flags Z;
    eja a;
    protected gji aa;
    private ContentFrameLayout ab;
    private RxTypedResolver ac;
    private hfg ad;
    protected ArtistModel b;

    public eie()
    {
    }

    static void a(eie eie1, ArtistModel artistmodel)
    {
        eie1.b(artistmodel);
    }

    private void b(ArtistModel artistmodel)
    {
        a(artistmodel);
        Y.b(null);
    }

    public void A()
    {
        super.A();
        edb.a(k()).b(this);
    }

    public final Fragment F()
    {
        return this;
    }

    protected abstract View H();

    protected void J()
    {
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        ab = new ContentFrameLayout(k());
        ab.a(H());
        Y = (new gaa(k(), ab.a, ab.c)).a(0x7f0802ad, 0x7f0802ac).b(0x7f0802a1, 0x7f0802a0).a();
        return ab;
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        a = ejh.b(g().getString("artist_uri"));
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
            b = (ArtistModel)bundle.getParcelable("artist_model");
        }
        bundle = g();
        if (b == null && bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
            b = (ArtistModel)bundle.getParcelable("artist_model");
        }
        dmz.a(gjj);
        aa = gjj.a(k());
        ac = new RxTypedResolver(new RxResolver(RxCosmos.getRouter(k())), com/spotify/mobile/android/spotlets/artist/model/ArtistModel);
    }

    public void a(SessionState sessionstate)
    {
        if (sessionstate.j)
        {
            if (b == null)
            {
                Y.a(ab.b);
                if (ad != null)
                {
                    ad.unsubscribe();
                }
                ad = ac.resolve(new Request("GET", a.d())).a(((dup)dmz.a(dup)).c()).a(new hfb() {

                    private eie a;

                    public final void onCompleted()
                    {
                    }

                    public final void onError(Throwable throwable)
                    {
                        Logger.b(throwable, "Failed to load artist's biography", new Object[0]);
                        a.Y.c(true);
                    }

                    public final void onNext(Object obj)
                    {
                        obj = (ArtistModel)obj;
                        a.b = ((ArtistModel) (obj));
                        eie.a(a, ((ArtistModel) (obj)));
                    }

            
            {
                a = eie.this;
                super();
            }
                });
                return;
            } else
            {
                b(b);
                return;
            }
        } else
        {
            Y.a(true);
            return;
        }
    }

    protected abstract void a(ArtistModel artistmodel);

    protected final void a(String s)
    {
        if (s != null && k() != null)
        {
            ((fpe)k()).a(this, s);
        }
    }

    public void e()
    {
        J();
        if (ad != null)
        {
            ad.unsubscribe();
        }
        super.e();
    }

    public void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putParcelable("artist_model", b);
    }

    public void z()
    {
        super.z();
        edb.a(k()).a(this);
    }
}
