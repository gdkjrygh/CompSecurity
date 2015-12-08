// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.spotlets.collection.adapter.HeaderableAdapter;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.Verified;

public abstract class emz extends Fragment
    implements fxy
{

    gin Y;
    Flags Z;
    Resolver a;
    private Player aa;
    private ggl ab;
    private gjf ac;
    private boolean ad;
    Verified b;

    public emz(Verified verified)
    {
        b = verified;
    }

    public void A()
    {
        super.A();
        ab.b();
    }

    public final Fragment F()
    {
        return this;
    }

    protected abstract epf H();

    protected abstract HeaderableAdapter J();

    protected abstract epg K();

    protected final void O()
    {
        if (ac.e())
        {
            ac.b();
        }
    }

    protected final void P()
    {
        ((fpe)k()).a(this, a(k(), Z));
        ((fpe)k()).P_();
    }

    protected final void Q()
    {
        ad = true;
        H().b(K());
    }

    protected final void R()
    {
        if (ad)
        {
            ad = false;
            return;
        } else
        {
            J().a(true);
            return;
        }
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        Z = fyw.a(this);
        ac.a();
        return super.a(layoutinflater, viewgroup, bundle);
    }

    protected abstract com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver a();

    public void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
        }
        Z = fyw.a(this);
        a = Cosmos.getResolver(k());
        aa = ((PlayerFactory)dmz.a(com/spotify/mobile/android/cosmos/player/v2/PlayerFactory)).create(a, b.toString(), u_(), gnl.a(this));
        ab = ggn.a(k(), b);
        Y = ((giq)dmz.a(giq)).b(k());
        dmz.a(fop);
        ac = gjf.a(k(), b.toString());
        ac.c(bundle);
    }

    protected final void a(ClientEvent clientevent)
    {
        fop.a(k(), b, clientevent);
    }

    public void c()
    {
        super.c();
        a.connect();
        H().b(K());
        aa.registerPlayerStateObserver(a());
    }

    public void d()
    {
        super.d();
        a.disconnect();
        H().a();
        aa.unregisterPlayerStateObserver(a());
    }

    public void e()
    {
        super.e();
        if (ac.e())
        {
            ac.c();
        }
    }

    public void e(Bundle bundle)
    {
        super.e(bundle);
        ac.a(bundle);
    }

    public final void z()
    {
        super.z();
        ab.a();
        P();
    }
}
