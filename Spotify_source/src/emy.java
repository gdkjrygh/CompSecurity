// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.SectionHeaderView;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.provider.PaymentState;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.recentlyplayed.RecentlyPlayedItem;
import com.spotify.mobile.android.spotlets.recentlyplayed.RecentlyPlayedItems;
import com.spotify.mobile.android.spotlets.tinkerbell.BannerItem;
import com.spotify.mobile.android.spotlets.tinkerbell.BannerView;
import com.spotify.mobile.android.ui.NavigationItem;
import com.spotify.mobile.android.ui.activity.upsell.PremiumSignupActivity;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class emy extends Fragment
    implements NavigationItem, fxy
{

    private Flags Y;
    private ListView Z;
    private ggl a;
    private LoadingView aa;
    private Parcelable ab;
    private ftg ac;
    private fdp ad;
    private fop ae;
    private epf af;
    private Resolver ag;
    private Player ah;
    private BannerView ai;
    private epg aj;
    private eda ak;
    private com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver al;
    private android.widget.AdapterView.OnItemClickListener am;
    private gjf b;

    public emy()
    {
        ae = (fop)dmz.a(fop);
        aj = new epg() {

            final emy a;

            public final void a(Object obj)
            {
                obj = (RecentlyPlayedItems)obj;
                if (a.o() && obj != null && !fzp.b(emy.a(a)))
                {
                    List list = ((RecentlyPlayedItems) (obj)).items;
                    boolean flag = ((RecentlyPlayedItems) (obj)).loaded;
                    if (!list.isEmpty() || ((RecentlyPlayedItems) (obj)).loaded)
                    {
                        emy.b(a).a(((RecentlyPlayedItems) (obj)).items);
                        emy.c(a).a(new int[] {
                            8
                        });
                        if (emy.d(a).e())
                        {
                            emy.d(a).b();
                        }
                        emy.f(a).post(new Runnable(this, list) {

                            private List a;
                            private _cls1 b;

                            public final void run()
                            {
                                if (emy.e(b.a) != null && !a.isEmpty())
                                {
                                    emy.f(b.a).onRestoreInstanceState(emy.e(b.a));
                                    emy.g(b.a);
                                }
                            }

            
            {
                b = _pcls1;
                a = list;
                super();
            }
                        });
                        if (emy.h(a).d())
                        {
                            emy.h(a).b();
                        }
                        if (list.isEmpty())
                        {
                            emy.c(a).b(new int[] {
                                7
                            });
                        } else
                        {
                            emy.c(a).a(new int[] {
                                7
                            });
                        }
                        emy.c(a).d(6);
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
                a = emy.this;
                super();
            }
        };
        ak = new eda() {

            private emy a;

            public final void a(SessionState sessionstate)
            {
                if (sessionstate == null) goto _L2; else goto _L1
_L1:
                sessionstate = new geo(emy.i(a), sessionstate.l, ((giq)dmz.a(giq)).b(a.k()), ViewUri.bj);
                if (((geo) (sessionstate)).c.b == null) goto _L4; else goto _L3
_L3:
                boolean flag = false;
_L6:
                Object obj;
                if (flag)
                {
                    obj = emy.a(a);
                    if (((geo) (sessionstate)).d != null)
                    {
                        break; /* Loop/switch isn't completed */
                    }
                    Assertion.a("mPaymentState shouldn't be null. Call shouldShowBanner() before this method");
                }
_L2:
                return;
_L4:
                if (((geo) (sessionstate)).d == null)
                {
                    flag = false;
                    continue; /* Loop/switch isn't completed */
                }
                if (!((geo) (sessionstate)).d.a())
                {
                    PaymentState paymentstate = ((geo) (sessionstate)).d;
                    ((geo) (sessionstate)).e.b().a(geo.a).a(geo.b).b();
                    flag = false;
                    continue; /* Loop/switch isn't completed */
                }
                if (((geo) (sessionstate)).e.f(geo.a))
                {
                    long l = ((geo) (sessionstate)).e.b(geo.a);
                    if (System.currentTimeMillis() - l < TimeUnit.HOURS.toMillis(24L))
                    {
                        flag = false;
                        continue; /* Loop/switch isn't completed */
                    }
                    if (((geo) (sessionstate)).d.equals(new PaymentState(((geo) (sessionstate)).e.c(geo.b))))
                    {
                        PaymentState paymentstate1 = ((geo) (sessionstate)).d;
                        flag = false;
                        continue; /* Loop/switch isn't completed */
                    }
                }
                PaymentState paymentstate2 = ((geo) (sessionstate)).d;
                flag = true;
                if (true) goto _L6; else goto _L5
_L5:
                Context context = ((geo) (sessionstate)).c.getContext();
                fqz fqz1 = PremiumSignupActivity.a(context);
                fqz1.c = geo.a(((geo) (sessionstate)).d);
                fqz1.a = ((Flags) (obj));
                obj = fqz1.a();
                ((geo) (sessionstate)).c.a(new BannerItem(0x7f110014, context.getString(0x7f0803b8), context.getString(0x7f0803b7), context.getString(0x7f0803b6), ((Intent) (obj)), gcg.b(context, 0x7f0f0095)));
                geo.a(context, ((geo) (sessionstate)).f, ((geo) (sessionstate)).d, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.f));
                return;
            }

            
            {
                a = emy.this;
                super();
            }
        };
        al = new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver() {

            private emy a;

            public final void onPlayerStateReceived(PlayerState playerstate)
            {
                emy.b(a).a(playerstate.entityUri());
            }

            
            {
                a = emy.this;
                super();
            }
        };
        am = new android.widget.AdapterView.OnItemClickListener() {

            private emy a;

            public final void onItemClick(AdapterView adapterview, View view, int k, long l)
            {
                int i1 = emy.c(a).b(k);
                i1;
                JVM INSTR tableswitch 0 9: default 68
            //                           0 93
            //                           1 228
            //                           2 191
            //                           3 265
            //                           4 302
            //                           5 68
            //                           6 338
            //                           7 592
            //                           8 592
            //                           9 154;
                   goto _L1 _L2 _L3 _L4 _L5 _L6 _L1 _L7 _L8 _L8 _L9
_L1:
                throw new AssertionError((new StringBuilder("Unexpected section ")).append(i1).toString());
_L2:
                a.a(gms.a(a.k(), enj.b).a);
                adapterview = ClientEventFactory.a("flat", com.spotify.mobile.android.util.ClientEvent.SubEvent.aP, null, null);
_L11:
                if (adapterview != null)
                {
                    emy.j(a);
                    fop.a(a.k(), ViewUri.bj, adapterview);
                }
                return;
_L9:
                a.a(gms.a(a.k(), enb.a).a);
                adapterview = ClientEventFactory.a("flat", com.spotify.mobile.android.util.ClientEvent.SubEvent.aQ, null, null);
                continue; /* Loop/switch isn't completed */
_L4:
                a.a(gms.a(a.k(), eng.a).a);
                adapterview = ClientEventFactory.a("flat", com.spotify.mobile.android.util.ClientEvent.SubEvent.aO, null, null);
                continue; /* Loop/switch isn't completed */
_L3:
                a.a(gms.a(a.k(), enk.b).a);
                adapterview = ClientEventFactory.a("flat", com.spotify.mobile.android.util.ClientEvent.SubEvent.aU, null, null);
                continue; /* Loop/switch isn't completed */
_L5:
                a.a(gms.a(a.k(), eni.a).a);
                adapterview = ClientEventFactory.a("flat", com.spotify.mobile.android.util.ClientEvent.SubEvent.aN, null, null);
                continue; /* Loop/switch isn't completed */
_L6:
                a.a(gms.a(a.k(), "spotify:internal:collection:shows").a);
                adapterview = ClientEventFactory.a("flat", com.spotify.mobile.android.util.ClientEvent.SubEvent.aR, null, null);
                continue; /* Loop/switch isn't completed */
_L7:
                adapterview = ((AdapterView) (view.getTag()));
                if (adapterview instanceof RecentlyPlayedItem)
                {
                    view = (RecentlyPlayedItem)adapterview;
                    if (((RecentlyPlayedItem) (view)).available)
                    {
                        if (gpl.e(((RecentlyPlayedItem) (view)).navigationLink))
                        {
                            adapterview = gpl.b(gpl.c(((RecentlyPlayedItem) (view)).navigationLink));
                        } else
                        {
                            adapterview = ((RecentlyPlayedItem) (view)).navigationLink;
                        }
                        adapterview = gms.a(a.k(), adapterview).a;
                        adapterview.putExtra("referer", ViewUri.bj);
                        a.a(adapterview);
                        l = emy.c(a).a(k, 6);
                        adapterview = ClientEventFactory.a("flat", com.spotify.mobile.android.util.ClientEvent.SubEvent.L, ((RecentlyPlayedItem) (view)).link, Long.valueOf(l));
                    } else
                    {
                        final class _cls5
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

                        switch (_cls5.a[((RecentlyPlayedItem) (view)).type.ordinal()])
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
                        if (false)
                        {
                        }
                    }
                } else
                {
                    adapterview = null;
                }
                continue; /* Loop/switch isn't completed */
_L8:
                adapterview = null;
                if (true) goto _L11; else goto _L10
_L10:
            }

            
            {
                a = emy.this;
                super();
            }
        };
    }

    static Flags a(emy emy1)
    {
        return emy1.Y;
    }

    public static emy a(Flags flags)
    {
        Bundle bundle = new Bundle();
        emy emy1 = new emy();
        emy1.f(bundle);
        fyw.a(emy1, flags);
        return emy1;
    }

    static fdp b(emy emy1)
    {
        return emy1.ad;
    }

    static ftg c(emy emy1)
    {
        return emy1.ac;
    }

    static gjf d(emy emy1)
    {
        return emy1.b;
    }

    static Parcelable e(emy emy1)
    {
        return emy1.ab;
    }

    static ListView f(emy emy1)
    {
        return emy1.Z;
    }

    static Parcelable g(emy emy1)
    {
        emy1.ab = null;
        return null;
    }

    static LoadingView h(emy emy1)
    {
        return emy1.aa;
    }

    static BannerView i(emy emy1)
    {
        return emy1.ai;
    }

    static fop j(emy emy1)
    {
        return emy1.ae;
    }

    public final void A()
    {
        edb.a(k()).b(ak);
        super.A();
        a.b();
    }

    public final com.spotify.mobile.android.ui.NavigationItem.NavigationGroup A_()
    {
        return com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.j;
    }

    public final void B()
    {
        super.B();
        ag.destroy();
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return "collection";
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        Y = fyw.a(this);
        viewgroup = (ViewGroup)layoutinflater.inflate(0x7f0300d0, viewgroup, false);
        Z = (ListView)viewgroup.findViewById(0x102000a);
        ad = new fdp(k(), ViewUri.bj, Y);
        ac = new ftg(k());
        ac.a(new ftm(eor.a(k(), SpotifyIcon.E, 0x7f0801a4), true), null, 0);
        if (gpl.a(Y))
        {
            ac.a(new ftm(eor.a(k(), SpotifyIcon.K, 0x7f0801a9), true), null, 9);
        }
        ac.a(new ftm(eor.a(k(), SpotifyIcon.ac, 0x7f0801a8), true), null, 1);
        ac.a(new ftm(eor.a(k(), SpotifyIcon.b, 0x7f0801a2), true), null, 2);
        ac.a(new ftm(eor.a(k(), SpotifyIcon.d, 0x7f0801a3), true), null, 3);
        if (fiy.a(Y))
        {
            ac.a(new ftm(eor.a(k(), SpotifyIcon.aX, 0x7f0801a7), true), null, 4);
        }
        Object obj = new SectionHeaderView(k());
        ((SectionHeaderView) (obj)).a(b(0x7f0801a5));
        ((SectionHeaderView) (obj)).b(true);
        ac.a(new ftm(((View) (obj)), false), null, 5);
        ac.a(ad, null, 6);
        ac.a(new ftm(eoo.a(k(), 0x7f0803ce), false), null, 7);
        obj = LoadingView.a(LayoutInflater.from(k()));
        int k = l().getDimensionPixelSize(0x7f0c00a2);
        ((LoadingView) (obj)).setPadding(((LoadingView) (obj)).getPaddingLeft(), k, ((LoadingView) (obj)).getPaddingRight(), ((LoadingView) (obj)).getPaddingBottom());
        ac.a(new ftm(((View) (obj))), null, 8);
        if (fzp.b(Y))
        {
            ac.a(new int[] {
                5
            });
        }
        ac.a(new int[] {
            6, 7
        });
        Z.setAdapter(ac);
        Z.setOnItemClickListener(am);
        Z.setOnItemLongClickListener(new fuf(k()));
        aa = LoadingView.a(layoutinflater, k(), Z);
        if (ab != null && !fzp.b(Y))
        {
            viewgroup.addView(aa);
            aa.a();
            Z.setVisibility(4);
        }
        b.a();
        if (!fzp.b(Y))
        {
            ((LoadingView) (obj)).a();
        }
        af.a(bundle, aj);
        af.b(aj);
        ai = (BannerView)viewgroup.findViewById(0x7f110403);
        return viewgroup;
    }

    public final String a(Context context, Flags flags)
    {
        int k;
        if (fiy.a(flags))
        {
            k = 0x7f0801ae;
        } else
        {
            k = 0x7f0801ad;
        }
        return context.getString(k);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        a(true);
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
            if (bundle.containsKey("list"))
            {
                ab = bundle.getParcelable("list");
            }
        }
        Y = fyw.a(this);
        a = ggn.a(k(), ViewUri.bj);
        b = gjf.a(k(), ViewUri.bj.toString());
        b.c(bundle);
        ag = Cosmos.getResolver(k());
        ah = ((PlayerFactory)dmz.a(com/spotify/mobile/android/cosmos/player/v2/PlayerFactory)).create(ag, ViewUri.bj.toString(), FeatureIdentifier.i, gnl.a(this));
        if (af == null)
        {
            af = new fdq(k(), ag, 30, fiy.b(Y), gpl.a(Y));
        }
    }

    public final void c()
    {
        super.c();
        ag.connect();
        af.b(aj);
        ah.registerPlayerStateObserver(al);
    }

    public final void d()
    {
        super.d();
        af.a();
        ag.disconnect();
        ah.unregisterPlayerStateObserver(al);
    }

    public final void e()
    {
        super.e();
        if (b.e())
        {
            b.c();
        }
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        b.a(bundle);
        if (Z != null)
        {
            bundle.putParcelable("list", Z.onSaveInstanceState());
        }
        af.a(bundle);
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.i;
    }

    public final void z()
    {
        super.z();
        a.a();
        edb.a(k()).a(ak);
    }
}
