// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.momentsstart;

import aav;
import abf;
import abo;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.momentsstart.model.Moment;
import com.spotify.mobile.android.spotlets.momentsstart.model.MomentContext;
import com.spotify.mobile.android.spotlets.momentsstart.model.MomentCurrentlyPlayingContext;
import com.spotify.mobile.android.spotlets.momentsstart.model.MomentFlags;
import com.spotify.mobile.android.spotlets.momentsstart.model.MomentIntroContext;
import com.spotify.mobile.android.spotlets.momentsstart.model.MomentsStart;
import com.spotify.mobile.android.spotlets.momentsstart.player.MomentPlayerSnapshotCache;
import com.spotify.mobile.android.spotlets.momentsstart.view.MomentHeaderView;
import com.spotify.mobile.android.spotlets.momentsstart.view.MomentImageSwitcher;
import com.spotify.mobile.android.spotlets.momentsstart.view.MomentMenuView;
import com.spotify.mobile.android.spotlets.momentsstart.view.MomentOverlayView;
import com.spotify.mobile.android.spotlets.momentsstart.view.MomentView;
import com.spotify.mobile.android.spotlets.momentsstart.view.MomentsVerticalView;
import com.spotify.mobile.android.spotlets.momentsstart.view.PlayButtonOverlayView;
import com.spotify.mobile.android.spotlets.videoplayer.FullScreenSwitchHelper;
import com.spotify.mobile.android.ui.NavigationItem;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.stuff.ContentViewManager;
import com.spotify.mobile.android.ui.view.ContentFrameLayout;
import com.spotify.mobile.android.util.ClientInfo;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import ctz;
import dmx;
import dmz;
import dwh;
import eda;
import edb;
import euf;
import eug;
import euh;
import eui;
import euj;
import euk;
import eul;
import eum;
import eun;
import eup;
import euv;
import euw;
import euz;
import evb;
import evd;
import evj;
import evk;
import fop;
import fot;
import fpe;
import fxy;
import fyw;
import fyx;
import gaa;
import gcf;
import gcz;
import gfv;
import ggi;
import ggl;
import ggn;
import gin;
import gio;
import gip;
import giq;
import gjf;
import gkl;
import gms;
import gnl;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import km;
import me;

public class MomentsStartFragment extends Fragment
    implements com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver, NavigationItem, eda, euk, fot, fxy, fyx
{

    private static final MomentIntroContext ac = new MomentIntroContext();
    private static gip ad = gip.b("moments_start_last_player_state_changed_at");
    private static final gip ae = gip.b("moments_start_snapshots");
    private static final long af;
    PlayButtonOverlayView Y;
    MomentMenuView Z;
    MomentsVerticalView a;
    private eun aA;
    private dwh aB;
    private Flags aC;
    private boolean aD;
    private boolean aE;
    private FullScreenSwitchHelper aF;
    private boolean aG;
    private final eum aH = new eum() {

        final MomentsStartFragment a;

        public final void a(MomentsStart momentsstart, int ai1[])
        {
            if (!a.o())
            {
                return;
            } else
            {
                a.a(momentsstart, ai1);
                MomentsStartFragment.b(a).fetchState(new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver(this) {

                    private _cls1 a;

                    public final void onPlayerStateReceived(PlayerState playerstate)
                    {
                        if (a.a.L())
                        {
                            MomentsStartFragment.a(a.a, playerstate);
                        }
                        MomentsStartFragment.a(a.a).b(null);
                    }

            
            {
                a = _pcls1;
                super();
            }
                });
                return;
            }
        }

        public final void a(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
        {
            Logger.b(throwable, "Exception when fetching Hermes content: %s", new Object[] {
                errorcause.name()
            });
            MomentsStartFragment.a(a).c(true);
        }

            
            {
                a = MomentsStartFragment.this;
                super();
            }
    };
    private final evj aI = new evj() {

        private int a;
        private int b;
        private MomentsStartFragment c;

        public final void a(int i1)
        {
            c.c(i1);
            MomentsStartFragment.a(c, false);
        }

        public final void a(int i1, int j1)
        {
            Button button = c.Z.a;
            if (a == 0)
            {
                a = c.Z.a.getHeight();
            }
            if (a > 0 && button.getAlpha() > 0.0F)
            {
                int k1 = a;
                float f1 = j1;
                f1 = Math.max(0.0F, ((float)k1 - Math.abs(f1)) / (float)k1);
                button.setAlpha(f1);
                c.aa.a.setAlpha(f1);
            }
            if (b != -1 && b != i1)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            if (j1 != 0 && !MomentsStartFragment.h(c))
            {
                c.c(i1);
                if (MomentsStartFragment.f(c) != null)
                {
                    Object obj1 = (Moment)MomentsStartFragment.f(c).moments.get(i1);
                    MomentsStartFragment momentsstartfragment = c;
                    Object obj = ((Moment) (obj1)).icon;
                    obj1 = ((Moment) (obj1)).name;
                    momentsstartfragment.b.a.setCompoundDrawablesWithIntrinsicBounds(0, ((com.spotify.mobile.android.spotlets.momentsstart.model.Moment.Icon) (obj)).mResId, 0, 0);
                    momentsstartfragment.b.a.setText(((CharSequence) (obj1)));
                    obj = momentsstartfragment.ab.obtainMessage(2);
                    momentsstartfragment.ab.sendMessage(((Message) (obj)));
                }
            }
            b = i1;
        }

        public final void b(int i1)
        {
            if (i1 == 1)
            {
                MomentsStartFragment.i(c);
                return;
            }
            if (i1 == 0)
            {
                if (MomentsStartFragment.h(c))
                {
                    a(c.a.u());
                }
                if (!c.K())
                {
                    c.d(false);
                }
                c.J();
                return;
            } else
            {
                MomentsStartFragment.j(c).c();
                c.Z.animate().cancel();
                c.aa.animate().cancel();
                return;
            }
        }

            
            {
                c = MomentsStartFragment.this;
                super();
                b = -1;
            }
    };
    private abf aJ;
    private evd aK;
    private final evk aL = new evk() {

        private MomentsStartFragment a;

        public final void a()
        {
            if (MomentsStartFragment.f(a) != null)
            {
                int i1 = a.a.u();
                Moment moment = (Moment)MomentsStartFragment.f(a).moments.get(i1);
                Object obj = moment.contexts;
                i1 = a.a.e(i1);
                obj = (MomentContext)((List) (obj)).get(i1);
                MomentsStartFragment.l(a).a(moment.requestId, moment.id, i1, ((MomentContext) (obj)).uri, "click", "play");
            }
            a.d(true);
        }

            
            {
                a = MomentsStartFragment.this;
                super();
            }
    };
    MomentHeaderView aa;
    final Handler ab = new Handler(new android.os.Handler.Callback() {

        private MomentsStartFragment a;

        private void a(Message message)
        {
            message = MomentsStartFragment.c(a).obtainMessage(message.what);
            MomentsStartFragment.c(a).sendMessageDelayed(message, 100L);
        }

        public final boolean handleMessage(Message message)
        {
            float f1;
            boolean flag2;
            boolean flag3;
            flag3 = false;
            flag2 = false;
            f1 = 1.0F;
            message.what;
            JVM INSTR tableswitch 1 3: default 40
        //                       1 219
        //                       2 413
        //                       3 42;
               goto _L1 _L2 _L3 _L4
_L1:
            return true;
_L4:
            if (!MomentsStartFragment.c(a).hasMessages(3))
            {
                if (MomentsStartFragment.d(a))
                {
                    a(message);
                    return true;
                }
                if (MomentsStartFragment.e(a) != null)
                {
                    boolean flag = flag2;
                    if (MomentsStartFragment.e(a).isPlaying())
                    {
                        flag = flag2;
                        if (!MomentsStartFragment.e(a).isPaused())
                        {
                            flag = true;
                        }
                    }
                    ViewPropertyAnimator viewpropertyanimator = a.a.animate().setDuration(300L);
                    if (!flag)
                    {
                        f1 = 0.6F;
                    }
                    viewpropertyanimator.alpha(f1);
                    if (!a.L())
                    {
                        a(message);
                        return true;
                    }
                    if (MomentsStartFragment.f(a).flags.playButtonCta)
                    {
                        if (flag)
                        {
                            a.Y.dismiss(300L);
                            return true;
                        } else
                        {
                            a.Y.a();
                            return true;
                        }
                    }
                }
            }
            continue; /* Loop/switch isn't completed */
_L2:
            if (!MomentsStartFragment.c(a).hasMessages(1))
            {
                boolean flag1 = flag3;
                if (MomentsStartFragment.e(a) != null)
                {
                    flag1 = flag3;
                    if (MomentsStartFragment.e(a).isPlaying())
                    {
                        flag1 = flag3;
                        if (!MomentsStartFragment.e(a).isPaused())
                        {
                            flag1 = true;
                        }
                    }
                }
                if (a.L() && MomentsStartFragment.f(a).flags.playButtonCta && a.b.b && !flag1)
                {
                    a.Y.a();
                }
                a.a.animate().setDuration(400L).alpha(1.0F);
                message = a.b;
                km.q(message).a(400L).a(0.0F).a(((MomentOverlayView) (message)).c).d();
                if (a.a.f() == 0)
                {
                    MomentsStartFragment.g(a);
                    return true;
                }
            }
            if (true) goto _L1; else goto _L3
_L3:
            a.a.animate().setDuration(200L).alpha(0.1F);
            message = a.b;
            message.b = true;
            message.animate().setDuration(200L).alpha(1.0F).start();
            if (a.L() && MomentsStartFragment.f(a).flags.playButtonCta)
            {
                a.Y.setVisibility(8);
                return true;
            }
            if (true) goto _L1; else goto _L5
_L5:
        }

            
            {
                a = MomentsStartFragment.this;
                super();
            }
    });
    private ContentFrameLayout ag;
    private ContentViewManager ah;
    private ggl ai;
    private gjf aj;
    private Resolver ak;
    private eug al;
    private Player am;
    private euz an;
    private evb ao;
    private MomentPlayerSnapshotCache ap;
    private PlayerState aq;
    private PlayerState ar;
    private euw as;
    private boolean at;
    private boolean au;
    private MomentImageSwitcher av;
    private gin aw;
    private gkl ax;
    private MomentsStart ay;
    private eul az;
    MomentOverlayView b;

    public MomentsStartFragment()
    {
        gcf gcf1 = gcf.a;
        ax = (gkl)dmz.a(gkl);
        aJ = new abf() {

            private MomentsStartFragment a;

            public final void a(RecyclerView recyclerview, int i1)
            {
                if (i1 == 1)
                {
                    MomentsStartFragment.i(a);
                }
                recyclerview = (MomentView)recyclerview;
                int j1 = recyclerview.u();
                if (recyclerview.w())
                {
                    if (j1 == 1 && i1 == 0 || j1 > 1 && i1 == 2)
                    {
                        a.a(recyclerview);
                    }
                } else
                if (i1 == 2)
                {
                    a.a.d(a.a.u(), j1);
                }
                if (i1 == 0 && !recyclerview.w())
                {
                    a.Z.b();
                    a.aa.a();
                    a.d(false);
                    return;
                } else
                {
                    MomentsStartFragment.j(a).c();
                    return;
                }
            }

            
            {
                a = MomentsStartFragment.this;
                super();
            }
        };
        aK = new evd() {

            private MomentsStartFragment a;

            public final void a()
            {
                a.a.setVisibility(0);
                boolean flag;
                if (MomentsStartFragment.k(a) != null && MomentsStartFragment.k(a).isPlaying() && !MomentsStartFragment.k(a).isPaused())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (a.L() && MomentsStartFragment.f(a).flags.playButtonCta && !flag)
                {
                    a.Y.setVisibility(0);
                }
            }

            public final void a(int i1)
            {
                MomentsStartFragment.a(a, true);
                a.a.b(i1);
                a.Z.a();
            }

            public final void b()
            {
                a.a.setVisibility(4);
                if (a.L() && MomentsStartFragment.f(a).flags.playButtonCta)
                {
                    a.Y.setVisibility(8);
                }
            }

            
            {
                a = MomentsStartFragment.this;
                super();
            }
        };
    }

    private boolean M()
    {
        return b.b || ab.hasMessages(2);
    }

    private void N()
    {
        Z.b();
        aa.a();
    }

    private void O()
    {
        if (ar == null)
        {
            aG = true;
        } else
        {
            aG = false;
            if (ar.isPlaying() && !ar.isPaused() && (!aB.c() || ((ConnectManager)aB.f()).i()))
            {
                int i1 = a.u();
                MomentView momentview = P();
                if (momentview != null)
                {
                    int j1 = momentview.u();
                    if (!TextUtils.equals(((MomentContext)((Moment)ay.moments.get(i1)).contexts.get(j1)).uri, aq.entityUri()))
                    {
                        d(true);
                        return;
                    }
                }
            }
        }
    }

    private MomentView P()
    {
        return d(a.u());
    }

    public static MomentsStartFragment a(Flags flags, String s)
    {
        MomentsStartFragment momentsstartfragment = new MomentsStartFragment();
        Bundle bundle = new Bundle();
        bundle.putString("user_name", s);
        momentsstartfragment.f(bundle);
        fyw.a(momentsstartfragment, flags);
        return momentsstartfragment;
    }

    static ContentViewManager a(MomentsStartFragment momentsstartfragment)
    {
        return momentsstartfragment.ah;
    }

    private void a(int i1, int j1, boolean flag)
    {
        MomentView momentview = d(i1);
        a.d(i1, j1);
        euh.a(aw, eul.a, a.t.c);
        dmz.a(com/spotify/mobile/android/spotlets/momentsstart/MomentsStartFragment, com/spotify/mobile/android/spotlets/momentsstart/model/MomentContext, (dmx)((Moment)ay.moments.get(i1)).contexts.get(j1));
        if (momentview != null && momentview.f() == 0)
        {
            if (momentview.w())
            {
                ap.clear();
                momentview.v();
            } else
            {
                momentview.b(j1);
                J();
            }
        }
        if (a.f() == 0)
        {
            a.a(i1);
        }
        at = flag;
    }

    private void a(int i1, MomentContext momentcontext)
    {
        Moment moment;
        MomentView momentview;
        moment = (Moment)ay.moments.get(i1);
        momentview = d(i1);
        if (!moment.hasIntroContext() && !moment.hasCurrentlyPlayingContext()) goto _L2; else goto _L1
_L1:
        if (momentcontext != null)
        {
            ((Moment)ay.moments.get(i1)).contexts.set(0, momentcontext);
        } else
        {
            ((Moment)ay.moments.get(i1)).contexts.remove(0);
        }
_L8:
        if (momentview != null)
        {
            momentview.c().c();
        }
        if (!K()) goto _L4; else goto _L3
_L3:
        Z.a.setAlpha(0.0F);
        aa.a.setAlpha(0.0F);
        a.animate().cancel();
        a.setAlpha(1.0F);
        a.u = true;
        al.a(null, null, 0, null, "intro");
_L6:
        return;
_L2:
        if (momentcontext != null)
        {
            ((Moment)ay.moments.get(i1)).contexts.add(0, momentcontext);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (momentview == null) goto _L6; else goto _L5
_L5:
        a(momentview);
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void a(PlayerState playerstate)
    {
        Object obj;
        obj = null;
        int i1;
        if (!playerstate.isPlaying())
        {
            i1 = 1;
        } else
        {
            if (gcf.a() - aw.a(ad, 0L) > af)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (playerstate.isPaused() && i1 != 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
        }
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        i1 = ay.suggestedMomentItem;
        if (ay.flags.playButtonCta)
        {
            playerstate = null;
        } else
        {
            playerstate = ac;
        }
        a(i1, ((MomentContext) (playerstate)));
        a(i1, 0, false);
_L4:
        return;
_L2:
        String s = playerstate.entityUri();
        int l1 = aw.a(eul.c, ay.suggestedMomentItem);
        int i2 = ay.suggestedMomentItem;
        int j1 = 0;
label0:
        do
        {
label1:
            {
                Pair pair = obj;
                if (j1 < 2)
                {
                    int j2 = (new int[] {
                        l1, i2
                    })[j1];
                    int k2 = ((Moment)ay.moments.get(j2)).indexOfMomentContextByUri(s);
                    if (k2 == -1)
                    {
                        break label1;
                    }
                    pair = Pair.create(Integer.valueOf(j2), Integer.valueOf(k2));
                }
                if (pair != null)
                {
                    a(((Integer)pair.first).intValue(), ((Integer)pair.second).intValue(), false);
                    return;
                }
                break label0;
            }
            j1++;
        } while (true);
        playerstate = MomentCurrentlyPlayingContext.createFromPlayerState(k(), playerstate);
        if (playerstate != null)
        {
            int k1 = ay.suggestedMomentItem;
            a(k1, ((MomentContext) (playerstate)));
            euh.a(aw, eul.b, playerstate);
            a(k1, 0, true);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void a(MomentsStartFragment momentsstartfragment, PlayerState playerstate)
    {
        momentsstartfragment.a(playerstate);
    }

    static boolean a(MomentsStartFragment momentsstartfragment, boolean flag)
    {
        momentsstartfragment.at = flag;
        return flag;
    }

    static Player b(MomentsStartFragment momentsstartfragment)
    {
        return momentsstartfragment.am;
    }

    static Handler c(MomentsStartFragment momentsstartfragment)
    {
        return momentsstartfragment.ab;
    }

    private MomentView d(int i1)
    {
        abo abo1 = a.c(i1);
        if (abo1 != null)
        {
            return (MomentView)abo1.a;
        } else
        {
            return null;
        }
    }

    static boolean d(MomentsStartFragment momentsstartfragment)
    {
        return momentsstartfragment.M();
    }

    static PlayerState e(MomentsStartFragment momentsstartfragment)
    {
        return momentsstartfragment.ar;
    }

    static MomentsStart f(MomentsStartFragment momentsstartfragment)
    {
        return momentsstartfragment.ay;
    }

    static void g(MomentsStartFragment momentsstartfragment)
    {
        momentsstartfragment.N();
    }

    static boolean h(MomentsStartFragment momentsstartfragment)
    {
        return momentsstartfragment.at;
    }

    static boolean i(MomentsStartFragment momentsstartfragment)
    {
        momentsstartfragment.au = true;
        return true;
    }

    static euz j(MomentsStartFragment momentsstartfragment)
    {
        return momentsstartfragment.an;
    }

    static PlayerState k(MomentsStartFragment momentsstartfragment)
    {
        return momentsstartfragment.aq;
    }

    public static eug l(MomentsStartFragment momentsstartfragment)
    {
        return momentsstartfragment.al;
    }

    public final void A()
    {
        super.A();
        edb.a(k()).b(this);
        ai.b();
    }

    public final com.spotify.mobile.android.ui.NavigationItem.NavigationGroup A_()
    {
        return com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.c;
    }

    public final void B()
    {
        super.B();
        ab.removeCallbacksAndMessages(null);
        ao.evictAll();
        av.removeAllViews();
        ak.destroy();
        dmz.c(com/spotify/mobile/android/spotlets/momentsstart/MomentsStartFragment, com/spotify/mobile/android/spotlets/momentsstart/model/MomentContext);
    }

    public final boolean C_()
    {
        if (Z.c())
        {
            Z.a();
            return true;
        } else
        {
            return false;
        }
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return "moments_start";
    }

    final void J()
    {
        Message message = ab.obtainMessage(1);
        ab.sendMessageDelayed(message, 250L);
        if (!M())
        {
            N();
        }
    }

    public final boolean K()
    {
        return ay != null && ((Moment)ay.moments.get(ay.suggestedMomentItem)).hasIntroContext();
    }

    public final boolean L()
    {
        return ay != null;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        aC = fyw.a(this);
        layoutinflater = layoutinflater.inflate(0x7f030087, ag, false);
        a = (MomentsVerticalView)layoutinflater.findViewById(0x7f11037d);
        viewgroup = a;
        viewgroup.t = new eui(ap, this, this, aA);
        viewgroup.a(((MomentsVerticalView) (viewgroup)).t);
        a.v = aI;
        viewgroup = a;
        bundle = aJ;
        ((MomentsVerticalView) (viewgroup)).t.d = bundle;
        av = (MomentImageSwitcher)layoutinflater.findViewById(0x7f1102ac);
        av.setImageResource(0x7f02005f);
        b = (MomentOverlayView)layoutinflater.findViewById(0x7f11037f);
        Z = (MomentMenuView)layoutinflater.findViewById(0x7f110380);
        Z.f = aK;
        Y = (PlayButtonOverlayView)layoutinflater.findViewById(0x7f11037e);
        Y.a = aL;
        aa = (MomentHeaderView)layoutinflater.findViewById(0x7f110381);
        aa.a.setText(0x7f08035d);
        viewgroup = k();
        bundle = (gcz)dmz.a(gcz);
        int j1 = gfv.c(viewgroup);
        boolean flag = gfv.b(viewgroup);
        int l1 = bundle.b();
        int i2 = bundle.c();
        MomentImageSwitcher momentimageswitcher;
        MomentOverlayView momentoverlayview;
        PlayButtonOverlayView playbuttonoverlayview;
        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = j1;
        }
        if (flag)
        {
            ((android.view.ViewGroup.MarginLayoutParams)aa.getLayoutParams()).topMargin = j1;
            ((android.view.ViewGroup.MarginLayoutParams)Y.getLayoutParams()).topMargin = j1;
            ((android.view.ViewGroup.MarginLayoutParams)b.getLayoutParams()).topMargin = j1;
        }
        if (!aD)
        {
            j1 = l().getDimensionPixelSize(0x7f0c002d);
            ((android.view.ViewGroup.MarginLayoutParams)Y.getLayoutParams()).bottomMargin = j1;
            ((android.view.ViewGroup.MarginLayoutParams)b.getLayoutParams()).bottomMargin = j1;
        } else
        {
            int k1 = l().getDimensionPixelSize(0x7f0c0017);
            Y.setTranslationX((float)(-k1) / 2.0F);
        }
        bundle = a;
        momentimageswitcher = av;
        momentoverlayview = b;
        playbuttonoverlayview = Y;
        for (j1 = 0; j1 < 4; j1++)
        {
            View view = (new View[] {
                bundle, momentimageswitcher, momentoverlayview, playbuttonoverlayview
            })[j1];
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
            view.getLayoutParams().width = l1;
            view.getLayoutParams().height = i2 - i1 - marginlayoutparams.topMargin - marginlayoutparams.bottomMargin;
        }

        ag = new ContentFrameLayout(viewgroup);
        ag.a(layoutinflater);
        layoutinflater = (new gaa(viewgroup, ag.a, ag.c)).a(0x7f0802ad, 0x7f0802ac).b(0x7f0802a1, 0x7f0802a0);
        layoutinflater.a = new euf(this, (byte)0);
        ah = layoutinflater.a();
        return ag;
    }

    public final Flags a()
    {
        return aC;
    }

    public final String a(Context context, Flags flags)
    {
        return " ";
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        u u = k();
        aC = fyw.a(this);
        g().getString("user_name");
        ak = Cosmos.getResolver(k());
        ai = ggn.a(u, ViewUri.j);
        dmz.a(fop);
        gcf gcf1 = gcf.a;
        al = new eug(u);
        aj = gjf.a(k(), ViewUri.j.toString());
        aj.c(bundle);
        aj.a();
        aw = ((giq)dmz.a(giq)).b(k());
        ao = new evb();
        ap = (MomentPlayerSnapshotCache)euh.a(aw, ae, com/spotify/mobile/android/spotlets/momentsstart/player/MomentPlayerSnapshotCache, null);
        if (ap == null)
        {
            ap = new MomentPlayerSnapshotCache();
        }
        aB = new dwh(k());
        am = ((PlayerFactory)dmz.a(com/spotify/mobile/android/cosmos/player/v2/PlayerFactory)).create(ak, ViewUri.j.toString(), FeatureIdentifier.E, gnl.a(this));
        an = new euz(k(), am, ao, ap, aB, aC);
        az = new eul((new android.net.Uri.Builder()).scheme("hm").authority("intro").path("/v1/startpage").appendQueryParameter("client-locale", Locale.getDefault().toString()).appendQueryParameter("client-timezone", TimeZone.getDefault().getID()).appendQueryParameter("client-version", ((ClientInfo)dmz.a(com/spotify/mobile/android/util/ClientInfo)).a.versionName).appendQueryParameter("client-platform", "android").toString(), aw);
        az.g = aH;
        aA = new eun(u, ak, u(), aC);
        ((fpe)u).a(this);
        aD = ggi.b(u);
        aF = FullScreenSwitchHelper.a(bundle);
        aF.a(u, FeatureIdentifier.E);
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        if (bundle != null)
        {
            view = (SavedState)bundle.getParcelable("saved_state");
            ap = ((SavedState) (view)).e;
            Y.setVisibility(((SavedState) (view)).c);
            a.setAlpha(((SavedState) (view)).a);
            if (((SavedState) (view)).d != null)
            {
                a(((SavedState) (view)).d, (int[])euh.a(aw, eul.a, [I, new int[((SavedState) (view)).d.moments.size()]));
                c(((SavedState) (view)).b);
                a.a(((SavedState) (view)).b);
                dmz.a(com/spotify/mobile/android/spotlets/momentsstart/MomentsStartFragment, com/spotify/mobile/android/spotlets/momentsstart/model/MomentContext, (dmx)((Moment)((SavedState) (view)).d.moments.get(((SavedState) (view)).b)).contexts.get(a.e(((SavedState) (view)).b)));
                ah.b(null);
            }
            O();
        }
    }

    public final void a(SessionState sessionstate)
    {
        boolean flag = sessionstate.j;
        if (flag && ay == null)
        {
            ah.a(ag.b);
            eul eul1 = az;
            sessionstate = sessionstate.c;
            ak.resolve(RequestBuilder.get(eul1.e).setHermesCacheIdentifier(sessionstate).build(), eul1.h);
            return;
        }
        sessionstate = ah;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        sessionstate.a(flag);
    }

    public final void a(MomentContext momentcontext, int i1)
    {
        MomentView momentview = P();
        if (i1 != momentview.u()) goto _L2; else goto _L1
_L1:
        if (an.b() != null && ay != null)
        {
            int j1 = a.u();
            int k1 = ((Moment)ay.moments.get(j1)).indexOfMomentContextByUri(an.b().entityUri());
            if (k1 != -1)
            {
                a.d(j1, k1);
                dmz.a(com/spotify/mobile/android/spotlets/momentsstart/MomentsStartFragment, com/spotify/mobile/android/spotlets/momentsstart/model/MomentContext, (dmx)((Moment)ay.moments.get(j1)).contexts.get(k1));
                euh.a(aw, eul.a, a.t.c);
            }
        }
        a(gms.a(k(), momentcontext.uri).a("").a);
_L4:
        al.a(momentview.v.requestId, momentview.v.id, i1, momentcontext.uri, "hit", "navigate-forward");
        return;
_L2:
        if (i1 >= 0)
        {
            momentview.b(i1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(MomentsStart momentsstart, int ai1[])
    {
        ay = (MomentsStart)ctz.a(momentsstart);
        Object obj = a;
        momentsstart = ay.moments;
        obj = ((MomentsVerticalView) (obj)).t;
        ((eui) (obj)).a(momentsstart);
        obj.c = (int[])ctz.a(ai1);
        ((eui) (obj)).c();
        momentsstart = Z;
        momentsstart.d = ay.moments;
        ((MomentMenuView) (momentsstart)).h.c();
        if (an != null)
        {
            an.a = ay.flags.prefetch;
        }
        if (aj.e())
        {
            aj.b();
        }
    }

    public final void a(MomentView momentview)
    {
        Z.b();
        aa.a();
        a.u = false;
        boolean flag;
        if (momentview.w())
        {
            momentview.v.contexts.remove(0);
            momentview.t.e(0);
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            al.a(null, null, 0, null, "swipe", "discard-intro");
        }
    }

    public final void c()
    {
        super.c();
        aB.a();
        ak.connect();
        an.d.registerPlayerStateObserver(this);
        aE = false;
        if (L())
        {
            an.a = ay.flags.prefetch;
        }
    }

    public final void c(int i1)
    {
        MomentMenuView momentmenuview = Z;
        ctz.a(i1, momentmenuview.d.size());
        if (momentmenuview.e != i1)
        {
            momentmenuview.a.setText(((Moment)momentmenuview.d.get(i1)).name);
            momentmenuview.h.c(i1);
            if (momentmenuview.e != -1)
            {
                momentmenuview.h.c(momentmenuview.e);
            }
            momentmenuview.e = i1;
        }
        if (ay != null)
        {
            i1 = ((Moment)ay.moments.get(i1)).background.mResId;
            av.setImageResource(i1);
        }
    }

    public final void d()
    {
        super.d();
        an.d.unregisterPlayerStateObserver(this);
        ak.disconnect();
        aB.b();
        eun eun1 = aA;
        for (Iterator iterator = eun1.a.values().iterator(); iterator.hasNext(); ((eup)iterator.next()).a()) { }
        eun1.a.clear();
    }

    public final boolean d(boolean flag)
    {
        aE = true;
        if (ay != null)
        {
            int i1 = a.u();
            Object obj1 = (Moment)ay.moments.get(i1);
            Object obj = ((Moment) (obj1)).contexts;
            int j1 = a.e(i1);
            MomentContext momentcontext1 = (MomentContext)((List) (obj)).get(j1);
            MomentContext momentcontext;
            if (j1 - 1 >= 0)
            {
                momentcontext = (MomentContext)((List) (obj)).get(j1 - 1);
            } else
            {
                momentcontext = null;
            }
            if (j1 + 1 < ((List) (obj)).size())
            {
                obj = (MomentContext)((List) (obj)).get(j1 + 1);
            } else
            {
                obj = null;
            }
            if (flag || !momentcontext1.equals(dmz.b(com/spotify/mobile/android/spotlets/momentsstart/MomentsStartFragment, com/spotify/mobile/android/spotlets/momentsstart/model/MomentContext)))
            {
                if (as != null)
                {
                    euw euw1 = as;
                    if (euw1 instanceof euv)
                    {
                        ((euv)euw1).x();
                    }
                }
                aw.b().a(eul.c, i1).b();
                al.a(((Moment) (obj1)).requestId, ((Moment) (obj1)).id, j1, momentcontext1.uri, "item");
                if (au)
                {
                    au = false;
                    al.a(((Moment) (obj1)).requestId, ((Moment) (obj1)).id, j1, momentcontext1.uri, "swipe", "navigate");
                }
                obj1 = P();
                long l1;
                if (obj1 != null)
                {
                    euw euw2 = (euw)((MomentView) (obj1)).c(j1);
                    obj1 = euw2;
                    if (euw2 instanceof euv)
                    {
                        Object obj2 = (euv)euw2;
                        ax.a(((euv) (obj2)).j);
                        obj1 = ax;
                        obj2 = ((euv) (obj2)).j;
                        ((gkl) (obj1)).a();
                        obj1 = euw2;
                    }
                } else
                {
                    obj1 = null;
                }
                as = ((euw) (obj1));
                obj1 = an;
                if (flag)
                {
                    l1 = 0L;
                } else
                {
                    l1 = 500L;
                }
                ((euz) (obj1)).a(momentcontext1, momentcontext, ((MomentContext) (obj)), l1);
                euh.a(aw, eul.a, a.t.c);
                return true;
            }
        }
        return false;
    }

    public final void e()
    {
        super.e();
        if (aj.e())
        {
            aj.c();
        }
        euh.a(aw, ae, ap);
        ay = null;
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putParcelable("saved_state", new SavedState(a.getAlpha(), a.u(), Y.getVisibility(), ay, ap));
        aF.a(bundle, k(), an.b());
        aj.a(bundle);
    }

    public void onPlayerStateReceived(PlayerState playerstate)
    {
label0:
        {
label1:
            {
                boolean flag1 = false;
                ctz.a(playerstate);
                aF.a = PlayerTrackUtil.isVideo(playerstate.track());
                boolean flag;
                boolean flag2;
                if (ar == null || ar.isPlaying() != playerstate.isPlaying() || ar.isPaused() != playerstate.isPaused())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!K() && flag)
                {
                    ar = playerstate;
                    ab.sendMessage(ab.obtainMessage(3));
                }
                if (!L() || !MomentCurrentlyPlayingContext.canCreateFromPlayerState(playerstate))
                {
                    break label0;
                }
                if (aq != null)
                {
                    flag = flag1;
                    if (TextUtils.equals(aq.entityUri(), playerstate.entityUri()))
                    {
                        break label1;
                    }
                }
                flag = true;
            }
            flag2 = TextUtils.equals("com.spotify.gaia", playerstate.playOrigin().featureIdentifier());
            if (flag && (flag2 || !aE))
            {
                a(playerstate);
            }
            aw.b().a(ad, gcf.a()).b();
            aq = playerstate;
        }
        if (aG)
        {
            O();
        }
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.E;
    }

    public final void z()
    {
        super.z();
        edb.a(k()).a(this);
        ai.a();
        MomentView momentview = P();
        if (momentview != null)
        {
            momentview.c().c();
        }
    }

    static 
    {
        af = TimeUnit.HOURS.toMillis(2L);
    }

    private class SavedState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel, (byte)0);
            }

            public final volatile Object[] newArray(int i1)
            {
                return new SavedState[i1];
            }

        };
        public final float a;
        public final int b;
        public final int c;
        public final MomentsStart d;
        public final MomentPlayerSnapshotCache e;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            parcel.writeFloat(a);
            parcel.writeInt(b);
            parcel.writeInt(c);
            parcel.writeParcelable(d, i1);
            parcel.writeParcelable(e, i1);
        }


        public SavedState(float f1, int i1, int j1, MomentsStart momentsstart, MomentPlayerSnapshotCache momentplayersnapshotcache)
        {
            a = f1;
            b = i1;
            c = j1;
            d = momentsstart;
            e = momentplayersnapshotcache;
        }

        private SavedState(Parcel parcel)
        {
            a = parcel.readFloat();
            b = parcel.readInt();
            c = parcel.readInt();
            d = (MomentsStart)parcel.readParcelable(com/spotify/mobile/android/spotlets/momentsstart/model/MomentsStart.getClassLoader());
            e = (MomentPlayerSnapshotCache)parcel.readParcelable(com/spotify/mobile/android/spotlets/momentsstart/player/MomentPlayerSnapshotCache.getClassLoader());
        }

        SavedState(Parcel parcel, byte byte0)
        {
            this(parcel);
        }
    }

}
