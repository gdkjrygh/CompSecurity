// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.recentlyplayed.RecentlyPlayedItem;
import com.spotify.mobile.android.spotlets.recentlyplayed.RecentlyPlayedItems;
import com.spotify.mobile.android.ui.NavigationItem;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.List;

public final class ene extends Fragment
    implements NavigationItem, fxy
{

    private Resolver Y;
    private Player Z;
    private ggl a;
    private ListView aa;
    private Parcelable ab;
    private ftg ac;
    private fdp ad;
    private fop ae;
    private epf af;
    private final epg ag = new epg() {

        final ene a;

        public final void a(Object obj)
        {
            obj = (RecentlyPlayedItems)obj;
            if (a.o())
            {
                List list = ((RecentlyPlayedItems) (obj)).items;
                if (!list.isEmpty() || ((RecentlyPlayedItems) (obj)).loaded)
                {
                    ene.a(a).a(list);
                    ene.b(a).a(new int[] {
                        2
                    });
                    if (ene.c(a) != null && !list.isEmpty())
                    {
                        ene.d(a).post(new Runnable(this) {

                            private _cls1 a;

                            public final void run()
                            {
                                ene.d(a.a).onRestoreInstanceState(ene.c(a.a));
                                ene.e(a.a);
                            }

            
            {
                a = _pcls1;
                super();
            }
                        });
                    }
                    if (list.isEmpty())
                    {
                        ene.b(a).b(new int[] {
                            1
                        });
                    } else
                    {
                        ene.b(a).a(new int[] {
                            1
                        });
                    }
                    ene.b(a).d(0);
                }
            }
        }

        public final void a(String s)
        {
            Logger.c(s, new Object[] {
                "mDataLoaderObserver.onError()"
            });
        }

            
            {
                a = ene.this;
                super();
            }
    };
    private final com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver ah = new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver() {

        private ene a;

        public final void onPlayerStateReceived(PlayerState playerstate)
        {
            ene.a(a).a(playerstate.entityUri());
        }

            
            {
                a = ene.this;
                super();
            }
    };
    private android.widget.AdapterView.OnItemClickListener ai;
    private Flags b;

    public ene()
    {
        ae = (fop)dmz.a(fop);
        ai = new android.widget.AdapterView.OnItemClickListener() {

            private ene a;

            public final void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                int j = ene.b(a).b(i);
                j;
                JVM INSTR tableswitch 0 0: default 32
            //                           0 86;
                   goto _L1 _L2
_L1:
                Assertion.a((new StringBuilder("Section ")).append(j).append(" is unhandled.").toString());
_L4:
                adapterview = null;
_L7:
                if (adapterview != null)
                {
                    ene.f(a);
                    fop.a(a.k(), ViewUri.bj, adapterview);
                }
                return;
_L2:
                adapterview = ((AdapterView) (view.getTag()));
                if (!(adapterview instanceof RecentlyPlayedItem)) goto _L4; else goto _L3
_L3:
                view = (RecentlyPlayedItem)adapterview;
                if (!((RecentlyPlayedItem) (view)).available) goto _L6; else goto _L5
_L5:
                adapterview = ((RecentlyPlayedItem) (view)).navigationLink;
                if (((RecentlyPlayedItem) (view)).type == com.spotify.mobile.android.spotlets.recentlyplayed.RecentlyPlayedItem.Type.e)
                {
                    adapterview = gpl.b(gpl.c(((RecentlyPlayedItem) (view)).navigationLink));
                }
                a.a(gms.a(a.k(), adapterview).a);
                l = ene.b(a).a(i, 0);
                adapterview = ClientEventFactory.a("", com.spotify.mobile.android.util.ClientEvent.SubEvent.L, ((RecentlyPlayedItem) (view)).link, Long.valueOf(l));
                  goto _L7
_L6:
                final class _cls4
                {

                    static final int a[];

                    static 
                    {
                        a = new int[com.spotify.mobile.android.spotlets.recentlyplayed.RecentlyPlayedItem.Type.values().length];
                        try
                        {
                            a[com.spotify.mobile.android.spotlets.recentlyplayed.RecentlyPlayedItem.Type.c.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            a[com.spotify.mobile.android.spotlets.recentlyplayed.RecentlyPlayedItem.Type.a.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            a[com.spotify.mobile.android.spotlets.recentlyplayed.RecentlyPlayedItem.Type.b.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                switch (_cls4.a[((RecentlyPlayedItem) (view)).type.ordinal()])
                {
                default:
                    dmz.a(ggc);
                    ggc.a(a.k(), 0x7f08057a);
                    adapterview = null;
                    break;

                case 1: // '\001'
                    dmz.a(ggc);
                    ggc.a(a.k(), 0x7f08057b);
                    adapterview = null;
                    break;

                case 2: // '\002'
                    dmz.a(ggc);
                    ggc.a(a.k(), 0x7f080575);
                    adapterview = null;
                    break;

                case 3: // '\003'
                    dmz.a(ggc);
                    ggc.a(a.k(), 0x7f080576);
                    adapterview = null;
                    break;
                }
                if (true) goto _L7; else goto _L8
_L8:
            }

            
            {
                a = ene.this;
                super();
            }
        };
    }

    public static ene a(Flags flags)
    {
        Bundle bundle = new Bundle();
        ene ene1 = new ene();
        ene1.f(bundle);
        fyw.a(ene1, flags);
        return ene1;
    }

    static fdp a(ene ene1)
    {
        return ene1.ad;
    }

    static ftg b(ene ene1)
    {
        return ene1.ac;
    }

    static Parcelable c(ene ene1)
    {
        return ene1.ab;
    }

    static ListView d(ene ene1)
    {
        return ene1.aa;
    }

    static Parcelable e(ene ene1)
    {
        ene1.ab = null;
        return null;
    }

    static fop f(ene ene1)
    {
        return ene1.ae;
    }

    public final void A()
    {
        super.A();
        a.b();
    }

    public final com.spotify.mobile.android.ui.NavigationItem.NavigationGroup A_()
    {
        return com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.a;
    }

    public final void B()
    {
        super.B();
        Y.destroy();
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return "recently_played";
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        b = fyw.a(this);
        layoutinflater = layoutinflater.inflate(0x7f0300ce, viewgroup, false);
        aa = (ListView)layoutinflater.findViewById(0x102000a);
        ad = new fdp(k(), ViewUri.bj, b);
        ac = new ftg(k());
        ac.a(ad, null, 0);
        ac.a(new ftm(eoo.a(k(), 0x7f0803ce), false), null, 1);
        viewgroup = LoadingView.a(LayoutInflater.from(k()));
        viewgroup.a();
        int i = l().getDimensionPixelSize(0x7f0c00a2);
        viewgroup.setPadding(viewgroup.getPaddingLeft(), i, viewgroup.getPaddingRight(), viewgroup.getPaddingBottom());
        ac.a(new ftm(viewgroup), null, 2);
        ac.a(new int[] {
            0, 1
        });
        aa.setAdapter(ac);
        aa.setOnItemClickListener(ai);
        aa.setOnItemLongClickListener(new fuf(k()));
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
        }
        af.a(bundle, ag);
        af.b(ag);
        return layoutinflater;
    }

    public final String a(Context context, Flags flags)
    {
        return context.getString(0x7f0801a5);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
            if (bundle.containsKey("list"))
            {
                ab = bundle.getParcelable("list");
            }
        }
        b = fyw.a(this);
        a = ggn.a(k(), ViewUri.bx);
        Y = Cosmos.getResolver(k());
        Z = ((PlayerFactory)dmz.a(com/spotify/mobile/android/cosmos/player/v2/PlayerFactory)).create(Y, ViewUri.bx.toString(), FeatureIdentifier.S, gnl.a(this));
        a(false);
        if (af == null)
        {
            af = new fdq(k(), Y, 30, fiy.b(b), gpl.a(b));
        }
    }

    public final void c()
    {
        super.c();
        Y.connect();
        af.b(ag);
        Z.registerPlayerStateObserver(ah);
    }

    public final void d()
    {
        super.d();
        af.a();
        Y.disconnect();
        Z.unregisterPlayerStateObserver(ah);
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        if (aa != null)
        {
            bundle.putParcelable("list", aa.onSaveInstanceState());
        }
        af.a(bundle);
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.S;
    }

    public final void z()
    {
        super.z();
        a.a();
    }
}
